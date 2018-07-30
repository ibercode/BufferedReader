package com.ibercode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Collectors;

public class LocalRepository {

	public void showMovies() throws IOException {
		
		BufferedReader bufferReader = new BufferedReader(new FileReader("C:\\moviesDB.txt"));
		
		bufferReader.lines()
		.collect(Collectors.toList())
		.stream()
		.limit(10)
		.forEach(System.out::println);
		
		bufferReader.close();
	}

}
