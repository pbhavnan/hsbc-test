package com.hsbc.app;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import com.hsbc.service.FileProcessor;
/**
 * 
 * @author Pankaj Bhavnani
 * This class is the main executable class.
 *
 */
public class App {

	public static void main(String[] args) {

		FileProcessor fileProcessor = new FileProcessor();
		fileProcessor.processFile();

	}

}
