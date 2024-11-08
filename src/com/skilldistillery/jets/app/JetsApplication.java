package com.skilldistillery.jets.app;

import java.util.Scanner;

public class JetsApplication {

	private AirField airField = new AirField();
	private static Scanner kb;
	
	// NO other fields! No list of jets!
	
	public static void main(String[] args) {
		kb = new Scanner(System.in);
		JetsApplication app = new JetsApplication();
		app.launch();
		
		
		
		
		
		kb.close();
	}

	private void launch() {
		// TODO Auto-generated method stub
		}

	private void displayUserMenu() {
		//TODO sysouts for menu
	}
}
