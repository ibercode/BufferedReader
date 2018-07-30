package com.ibercode;

import java.io.IOException;

import com.ibercode.LocalRepository;
import com.ibercode.URLRepository;

public class App {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("\nURL MOVIE DATABASE:");
		URLRepository urlRepo = new URLRepository();
		urlRepo.showMovies();
		
		System.out.println("\nLOCAL FILE MOVIE DATABASE:");
		LocalRepository localRepository = new LocalRepository();
		localRepository.showMovies();
	}

}
