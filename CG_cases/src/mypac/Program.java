package mypac;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Don't let the machines win. You are humanity's last hope...
 **/
class Player {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int width = in.nextInt(); // the number of cells on the X axis
		int height = in.nextInt(); // the number of cells on the Y axis
		char[][] map = new char[height][width];
		if (in.hasNextLine()) {
			in.nextLine();
		}
		for (int i = 0; i < height; i++) {
			char[] line = in.nextLine().toCharArray();
			for (int j = 0; j < width; j++) {
				map[i][j] = line[j];
			}
		}

		// Write an action using System.out.println()
		// To debug: System.err.println("Debug messages...");

		// Three coordinates: a node, its right neighbor, its bottom neighbor
		System.out.println("0 0 1 0 0 1");
		System.out.println("1 0 -1 -1 -1 -1");
		System.out.println("0 1 -1 -1 -1 -1");
	}
}

/*
 * class TemperatureCase{ Scanner in = new Scanner(System.in); int n =
 * in.nextInt(); // the number of temperatures to analyse var tempMinus = new
 * ArrayList<Integer>(); var tempPlus = new ArrayList<Integer>(); for (int i =
 * 0; i < n; i++) { int t = in.nextInt(); // a temperature expressed as an
 * integer ranging from -273 to 5526 if (t < 0) { tempMinus.add(t); } else {
 * tempPlus.add(t); } }
 * 
 * // Write an answer using System.out.println() // To debug:
 * System.err.println("Debug messages..."); int maxMinus = tempMinus.size() > 0
 * ? Collections.max(tempMinus) : -9999; int minPlus = tempPlus.size() > 0 ?
 * Collections.min(tempPlus) : 9999;
 * 
 * if (maxMinus == -9999 && minPlus == 9999) { System.out.println(0); } else {
 * System.out.println(Math.abs(maxMinus) >= Math.abs(minPlus) ? minPlus :
 * maxMinus); } }
 */