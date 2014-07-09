package com.hackbulgaria.javacore.structureddata;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLStreamException;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.codehaus.jettison.mapped.MappedNamespaceConvention;
import org.codehaus.jettison.mapped.MappedXMLStreamReader;
import org.codehaus.jettison.mapped.MappedXMLStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException, JSONException, XMLStreamException {

        Student adi = new Student(1, "Adriana Stefanova");
        Student random = new Student(2, "Random Guy");

        List<Student> enrolledStudents = new ArrayList<>();
        enrolledStudents.add(adi);
        enrolledStudents.add(random);

        CoreJavaCourse coreJavaCourse = new CoreJavaCourse(enrolledStudents, 3, "Core-Java");

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(CoreJavaCourse.class, Student.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            Path path = Paths.get("E:\\Adii\\Documents\\CoreJava\\notes\\temp.txt");
            File file = path.toFile();

            marshaller.marshal(coreJavaCourse, file);

            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            CoreJavaCourse newCoreJavaCourse = (CoreJavaCourse) unmarshaller.unmarshal(file);
            // System.out.println(newCoreJavaCourse.toString());

            MappedNamespaceConvention mappedNamespaceConvention = new MappedNamespaceConvention();

            Path pathWriter = Paths.get("E:\\Adii\\Documents\\CoreJava\\notes\\writer.txt");
            File fileW = pathWriter.toFile();

            FileWriter fileWriter = new FileWriter(fileW);
            MappedXMLStreamWriter mappedXMLStreamWriter = new MappedXMLStreamWriter(mappedNamespaceConvention,
                    fileWriter);

            marshaller.marshal(coreJavaCourse, mappedXMLStreamWriter);

            String read = Utils.readFrom(pathWriter);
            JSONObject obj = new JSONObject(read);
            MappedXMLStreamReader mappedXMLStreamReader = new MappedXMLStreamReader(obj);
            CoreJavaCourse newerCoreJavaCourse = (CoreJavaCourse) unmarshaller.unmarshal(mappedXMLStreamReader);
            System.out.println(newerCoreJavaCourse);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
