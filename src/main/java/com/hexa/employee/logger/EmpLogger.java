package com.hexa.employee.logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class EmpLogger {
	private static Log log = LogFactory.getLog(EmpLogger.class);

	public void logOneString(String string) {
		log.info("string=" + string);
	}
	public void noArgLogger() {
		log.info("Before no arguments called");
	}

	public void noArgLoggerBefore() {
		log.info("Before no arguments called");
	}

	public void noArgLoggerAfter() {
		log.info("After no arguments called");
	}

	public void noArgLoggerAfterReturn(Object retVal) {
		log.info("AfterReturn no arguments called--->" +retVal);
	}

	public void noArgLoggerThrow(Exception ex) {
		log.info("noArgLoggerThrow no arguments called" + ex);
	}

	public void logTwoStrings(String s1, String s2) {
		log.info("string1=" + s1 + ",string2=" + s2);
	}
}
