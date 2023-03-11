import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse the standard input
 * according to the problem statement.
 **/
class Player {
	static int TX;
	static int TY;

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		TX = in.nextInt();
		TY = in.nextInt();

		// game loop
		while (true) {
			int H = in.nextInt(); // the remaining number of hammer strikes.
			int N = in.nextInt(); // the number of giants which are still present on the map.
			int X = 0;
			int Y = 0;
			for (int i = 0; i < N; i++) {
				X += in.nextInt();
				Y += in.nextInt();
			}
			int Gx = (X + TX) / (N + 1);
			int Gy = (Y + TY) / (N + 1);
			System.err.printf("G coordinates (%d, %d)", Gx, Gy);

			int dY = TY - Gy;
			int dX = TX - Gx;

			String mv = "";

			if (Math.abs(dY)==1 && Math.abs(dX)==1) {
				mv = "STRIKE";
				continue; 
			}
			if (dY > 0) {
				mv += "N";
				TY--;
			}
			if (dY < 0) {
				mv += "S";
				TY++;
			}
			if (dX > 0) {
				mv += "W";
				TX--;
			}
			if (dX < 0) {
				mv += "E";
				TX++;
			}

			System.out.println(mv);
		}
	}
}