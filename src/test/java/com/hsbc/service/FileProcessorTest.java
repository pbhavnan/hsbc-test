package com.hsbc.service;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.MockedConstruction;
import org.mockito.Mockito;

public class FileProcessorTest {
	
	@Test
	public void testReverseLines() throws IOException {
	
			FileProcessor fileProcessor = new FileProcessor();
			Assertions.assertEquals(List.of("CBA"),fileProcessor.reverseLines(Stream.of("ABC")));
			Assertions.assertEquals(List.of("CBA","ZYX"),fileProcessor.reverseLines(Stream.of("ABC","XYZ")));
				
			
			

	}

	@Test
	public void testFileProcessor() throws IOException {
		try (MockedConstruction<FileReaderService> mock = Mockito.mockConstruction(FileReaderService.class,(fileReader,context)-> {
			when(fileReader.getFileContent()).thenReturn("ABC");
		});
				MockedConstruction<FileWriterService> mockedFileWriter = Mockito
						.mockConstruction(FileWriterService.class);) {
			
			FileProcessor fileProcessor = new FileProcessor();
			fileProcessor.processFile();
		}
		assertTrue(true);
	}

}
