package com.ibercode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

public class URLRepository {

	public void showMovies() throws IOException {

		URL url = new URL("https://drive.google.com/uc?id=1hrvGXw1RDytE1jBB4WmfLCUutlhHjyVm&export=download");

		BufferedReader bufferReader = new BufferedReader(
				new InputStreamReader(url.openStream(), StandardCharsets.UTF_8));

		bufferReader.lines()
			.collect(Collectors.toList())
			.stream()
			.limit(10)
			.forEach(System.out::println);

		bufferReader.close();
	}
}
