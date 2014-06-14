package com.hackbulgaria.javacore.exam1;

public class Logger {

    public int LEVEL;
    public String message;
    
    Logger() {
        LEVEL = 3;
    }
    
    Logger(int LEVEL) {
        this.LEVEL = LEVEL;
    }
    
    public int getLEVEL() {
        return LEVEL;
    }

    public void setLEVEL(int newLEVEL) {
        LEVEL = newLEVEL;
    }
    
    public void log(String currentMessage) {
        
        if (this.getLEVEL() < 3) {
            return;
        } else {
           System.out.println(currentMessage);
        }
    }
    
    public void log(int currentLEVEL, String currentMessage) throws InvalidLogLevelException {
        if(currentLEVEL < 1) {
            throw new InvalidLogLevelException();
        }

        try {
            if (currentLEVEL > LEVEL) {
                return;
            } else {
               System.out.println(currentMessage);
            }
        } catch (InvalidLogLevelException e){
            e.printStackTrace();
        }
        
    }
    
    public static void main(String[] args) {
        Logger logger = new Logger(3);
        
        logger.log(2, "2 - should get logged");
        logger.log(5, "5 - should not get logged");
        logger.log(3, "3 - should get logged");
        logger.log("should get logged, default level = 3");
        
        logger.setLEVEL(2);
        logger.log("should not get logged, 2 < 3");
        
        logger.log(0, "should throw exception");
    }
}
