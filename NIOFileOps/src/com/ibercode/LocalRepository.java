package com.ibercode;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class LocalRepository {

	public void showMovies() throws IOException {
		
		BufferedReader bufferReader = Files.newBufferedReader(Paths.get("C:\\movies.csv"),StandardCharsets.UTF_8);
		
		bufferReader.lines()
		.collect(Collectors.toList())
		.stream()
		.limit(10)
		.forEach(System.out::println);
	}

}
