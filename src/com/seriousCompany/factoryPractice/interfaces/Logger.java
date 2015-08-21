package com.seriousCompany.factoryPractice.interfaces;

public interface Logger {
	public void trace(String message);
	public void debug(String message);
	public void error(String message);
	public void info(String message);
	public void setLevel(int level);
}
