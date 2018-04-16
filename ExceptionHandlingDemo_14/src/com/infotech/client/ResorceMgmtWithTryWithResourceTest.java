package com.infotech.client;

import java.io.BufferedReader;
import java.io.IOException;

public class ResorceMgmtWithTryWithResourceTest {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new java.io.FileReader("test.txt"));) {
			String readLine;
			// Instance of FileReader wrapped in a BufferedReader
			while ((readLine = br.readLine()) != null) {
				System.out.println(readLine);
			}
		} catch (IOException ex) {
			System.out.println("Error while reading file " + ex.getMessage());
		}
	}
}
