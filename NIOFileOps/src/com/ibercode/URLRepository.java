package com.ibercode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class URLRepository {

	public void showMovies() throws IOException {

		URL url = new URL("https://ibercode.com/shared/moviesDB.txt");
		
		BufferedReader bufferReader = new BufferedReader(
				new InputStreamReader(url.openStream(), StandardCharsets.UTF_8));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("outputURL.txt")));
		
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
