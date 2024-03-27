package com.hsbc.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
/**
 * 
 * @author Pankaj Bhavnani
 * This class is the class for writing file.
 *
 */
public class FileWriterService {

	public void writeToFile(String fileContent) throws IOException {
		System.out.println("Writing output file output.txt with reversed content now in src/main/resources/");
		Files.writeString(Path.of("src/main/resources/output.txt"), fileContent);	
	}

}
