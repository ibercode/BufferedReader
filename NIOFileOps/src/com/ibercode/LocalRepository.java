package com.ibercode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class LocalRepository {

	public void showMovies() throws IOException {
		
		BufferedReader bufferReader = new BufferedReader(new FileReader("C:\\moviesDB.txt"));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("outputLocal.txt")));
		
		Consumer<String> writeLine = line -> {
			try {
				bufferedWriter.write(line);
				bufferedWriter.newLine();
				System.out.println(line);
			} catch (IOException e) {
				e.printStackTrace();
			}
		};
		
		bufferReader.lines()
			.collect(Collectors.toList())
			.stream()
			.forEach(writeLine);
		
		bufferReader.close();
		bufferedWriter.close();
	}
	
}
