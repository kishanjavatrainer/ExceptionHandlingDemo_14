package com.infotech.client;

import java.io.BufferedReader;
import java.io.IOException;

public class ResorceMgmtWithFinallyTest {

	public static void main(String[] args) throws ClassNotFoundException {

		BufferedReader br = null;
		try {
			String readLine;
			// Instance of FileReader wrapped in a BufferedReader
			br = new BufferedReader(new java.io.FileReader("test.txt"));
			while ((readLine = br.readLine()) != null) {
				System.out.println(readLine);
			}
		} catch (IOException ex) {
			System.out.println("Error while reading file " + ex.getMessage());
		} finally {
			try {
				// Close the stream
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
