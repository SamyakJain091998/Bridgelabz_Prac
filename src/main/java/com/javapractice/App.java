package com.javapractice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Hello world!
 *
 */

public class App 
{
	private static final Logger LOG = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        String message = "Hello, World! How are you?";
        LOG.debug(message + " Will be printed on Debug");
        LOG.info(message + " Will be printed on Info");
        LOG.warn(message + " Will be printed on Warn");
        LOG.error(message + " Will be printed on Error");
        LOG.fatal(message + " Will be printed on Fatal");
        LOG.info("Appending string: {}.", message);
        System.out.println(message);

        //OBTAINING THE NAME AND VALUE OF ROOT LOGGER: 
        
//        Logger logger1 = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
//          Logger logger = LogManager.getRootLogger();
//        System.out.println("The root logger1 is : " + logger1);
//          System.out.println("The root logger is : " + logger);
//          System.out.println("Logger is : " + LogManager.getLogger());
    }
}
