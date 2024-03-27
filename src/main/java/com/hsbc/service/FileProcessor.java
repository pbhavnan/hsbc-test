package com.hsbc.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 * 
 * @author Pankaj Bhavnani
 * This class is the class for processing file.
 *
 */
public class FileProcessor {

	public void processFile() {
		try {
			System.out.println("Processing file now.");
			FileReaderService fileReader =  new FileReaderService();
			String fileContent = fileReader.getFileContent();
			 
			Stream<String> lines = fileContent.lines();
			List<String> reversedLines = this.reverseLines(lines);
			String reversedContent =String.join("\n",reversedLines);
			System.out.println("Reversed content is "+reversedContent);
			FileWriterService fileWriterService = new FileWriterService();
			fileWriterService.writeToFile(reversedContent);
				
			System.out.println("Processing files completed.");
			
		} catch (Exception e) {
			System.out.println("Exception in processing file");
			e.printStackTrace();
		}
		
				
				
		
	}

	 List<String> reverseLines(Stream<String> lines) {
		 System.out.println("Reversing content now.");
		 return lines.map(line -> new StringBuilder(line).reverse().toString()).collect(Collectors.toList());
			
	}


}
