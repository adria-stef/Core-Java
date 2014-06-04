package com.hackbulgaria.corejava.redusedfilepathtdd;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ReducedFilePathTestCase {

    private ReducedFilePath reducedFilePath = new ReducedFilePath();
    @Before
    public void setUp() throws Exception {
        this.reducedFilePath = reducedFilePath;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void removeSlashesTest() {
        assertEquals("/", reducedFilePath.reduceFilePath("/"));
        
        assertEquals("/etc/wtf", reducedFilePath.reduceFilePath("/etc//wtf/"));
        
        assertEquals("/", reducedFilePath.reduceFilePath("///////"));
    }
    

    @Test
    public void removeDoubleDotTest() {
        assertEquals("/", reducedFilePath.reduceFilePath("/srv/../"));
        
        assertEquals("/", reducedFilePath.reduceFilePath("/etc/../etc/../etc/../"));
    }

    @Test
    public void removeSingleDotTest() {
        assertEquals("/srv", reducedFilePath.reduceFilePath("/srv/./././././"));
    }
    
    @Test
    public void standartTest() {

        assertEquals("/home/radorado/code/hackbulgaria/", 
                reducedFilePath.reduceFilePath("/home//radorado/code/./hackbulgaria/week0/../"));
        
        assertEquals("/srv/www/htdocs/wtf", 
                reducedFilePath.reduceFilePath("/srv/www/htdocs/wtf/"));
        
        assertEquals("/srv/www/htdocs/wtf", 
                reducedFilePath.reduceFilePath("/srv/www/htdocs/wtf"));
        
        assertEquals("/", 
                reducedFilePath.reduceFilePath("/../"));
        
    }

}
