package com.hackbulgaria.javacore.exam1;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DateLogger extends Logger {

    DateLogger() {
        LEVEL = 3;
    }

    DateLogger(int LEVEL) {
        this.LEVEL = LEVEL;
    }

    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    //get current date time with Date()
    Date date = new Date();

    
    @Override
    public void log(String currentMessage) {
        if (this.getLEVEL() < 3) {
            return;
        } else {
            System.out.println(currentMessage + " " + date.toString());
        }
    }

    @Override
    public void log(int currentLEVEL, String currentMessage) throws InvalidLogLevelException {
        if(currentLEVEL < 1) {
            throw new InvalidLogLevelException();
        }

        try {
            if (currentLEVEL > LEVEL) {
                return;
            } else {
               System.out.println(currentMessage + " " + date.toString());
            }
        } catch (InvalidLogLevelException e){
            e.printStackTrace();
        }
        
    }

    public static void main(String[] args) {
     
        DateLogger logger = new DateLogger(3);
        
        logger.log(2, "2 - should get logged");
        logger.log(5, "5 - should not get logged");
        logger.log(3, "3 - should get logged");
        logger.log("should get logged, default level = 3");
        
        logger.setLEVEL(2);
        logger.log("should not get logged, 2 < 3");
        
        logger.log(0, "should throw exception");
    }
}
