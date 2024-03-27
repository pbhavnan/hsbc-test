package com.hsbc.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
/**
 * 
 * @author Pankaj Bhavnani
 * This class is the class for reading file.
 *
 */
public class FileReaderService {

	public String getFileContent() throws IOException {
		System.out.println("Reading input file input.txt from src/main/resources/");	
		return Files.readString(Path.of("src/main/resources/input.txt"));
	}

}
