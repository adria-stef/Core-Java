package com.hackbulgaria.javacore.workingwithlibraries;

import java.io.File;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

public class SendEmail {

    public static void sendSimpleEmail() throws EmailException {
        Email email = new SimpleEmail();
        email.setHostName("smtp.googlemail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("adriana.stefanova94", "password"));
        email.setSSLOnConnect(true);
        email.setFrom("adriana.stefanova94@gmail.com");
        email.setSubject("TestMail");
        email.setMsg("This is a test mail ... :-)");
        email.addTo("adria.stef@gmail.com");
        email.send();
    }

    public static void sendEmailWithAttachment() throws EmailException {
        // Create the attachment
        // EmailAttachment attachment = new EmailAttachment();
        // attachment.setPath("/WorkingWithLibraries/resources/suarez.gif");
        // attachment.setDisposition(EmailAttachment.ATTACHMENT);
        // attachment.setDescription("Gif of Suarez");
        // attachment.setName("Suarez");

        File attachment = new File("resources/suarez.gif");
        // Create the email message
        MultiPartEmail email = new MultiPartEmail();
        email.setHostName("smtp.googlemail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("adriana.stefanova94", "password"));
        email.setSSLOnConnect(true);
        email.addTo("aesislava@gmail.com", "Dessy Angelova");
        email.setFrom("adriana.stefanova94@gmail.com", "Adiiii");
        email.setSubject("The Suarez incident :D");
        email.setMsg("Now that's an e-mail sent from java. So damn useful :D");
        email.attach(attachment);
        // add the attachment
        // email.attach(attachment);

        // send the email
        email.send();

    }

    public static void main(String[] args) throws EmailException {
        sendEmailWithAttachment();
    }

}
