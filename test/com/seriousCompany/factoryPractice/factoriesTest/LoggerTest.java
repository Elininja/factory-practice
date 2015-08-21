package com.seriousCompany.factoryPractice.factoriesTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.seriousCompany.factoryPractice.factories.LoggerFactory;
import com.seriousCompany.factoryPractice.implementations.ConsoleLogger;
import com.seriousCompany.factoryPractice.implementations.FileLogger;
import com.seriousCompany.factoryPractice.interfaces.Logger;

public class LoggerTest {

	@Test
	public void testFactoryGenerateConsoleLogger() {
		// TODO: change this once logger factory is a singleton
		LoggerFactory loggerFactory = new LoggerFactory();
		Logger logger = loggerFactory.GetLogger("console");
		assertEquals(logger.getClass(), ConsoleLogger.class);
	}
	
	@Test
	public void testFactoryGenerateFileLogger() {
		// TODO: change this once logger factory is a singleton
		LoggerFactory loggerFactory = new LoggerFactory();
		Logger logger = loggerFactory.GetLogger("/var/log/some_log_file.log");
		assertEquals(logger.getClass(), FileLogger.class);
	}

}
