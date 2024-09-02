package org.testing.utilities;

import org.apache.log4j.xml.DOMConfigurator;

import java.io.File;

import org.apache.log4j.Logger;

public class LogCapture {

//	private static Logger log = Logger.getLogger(LogCapture.class);
//
//    // Static block to configure the logger as soon as the class is loaded
//    static {
//        DOMConfigurator.configure("../YouTubeAutomationFramework/layout.xml");
//    }
// // Clear the log file at the start of the test run
//    public static void clearLog() {
//        File logFile = new File("../YouTubeAutomationFramework/Application.Log");
//        if (logFile.exists()) {
//            logFile.delete();
//        }
//    }
//
//    // Log message without deleting the log file
//    public static void takeLog(String className, String msg) {
//        Logger classLogger = Logger.getLogger(className);  // Obtain a logger for the specific class
//        classLogger.info(msg);
//    }

//	private static Logger log;
//
//    // Initialize logger
//    public static void initializeLogger() {
//        DOMConfigurator.configure("../YouTubeAutomationFramework/layout.xml");
//        log = Logger.getLogger(LogCapture.class);
//    }
//
//    // Log message without deleting the log file
//    public static void takeLog(String className, String msg) {
//        if (log == null) {
//            log = Logger.getLogger(className);
//        }
//        log.info(msg);
//    }
//
//    // Clear the log file at the start of the test run
//    public static void clearLog() {
//        File logFile = new File("../YouTubeAutomationFramework/Application.Log");
//        if (logFile.exists()) {
//            logFile.delete();
//        }
//        initializeLogger();
//    }

	private static Logger log;

	// Static block to configure the logger as soon as the class is loaded
	static {
		DOMConfigurator.configure("../GUIAutomation/layout.xml");
		log = Logger.getLogger(LogCapture.class);
	}

	// Initialize logger
	public static void initializeLogger() {
		DOMConfigurator.configure("../GUIAutomation/layout.xml");
		log = Logger.getLogger(LogCapture.class);
	}

	public static void takeLog(String className, String msg) {
		log.info("[" + className + "] " + msg); // Add class name to log entry
	}

	public static void clearLog() {
		File logFile = new File("/GUIAutomation/Application.Log");
		if (logFile.exists()) {
			logFile.delete();
		}
	}
}
