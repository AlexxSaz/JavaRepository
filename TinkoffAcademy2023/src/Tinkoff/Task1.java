package Tinkoff;

import java.util.*;

public class Task1 {

	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		String[] data = inScanner.next().replace('0', '9') .split("\\?");
		inScanner.close();

		System.out.print(checkMessage(data));
	}

	private static String checkMessage(String[] data) {
		for (var d : data) {
			char[] message = d.toCharArray();
			if (message.length > 0) {
				for (int i = 0; i < message.length - 1; i++) {
					if (Character.getNumericValue(message[i]) > Character
							.getNumericValue(message[i + 1])) {
						return "NO";
					}
				}
			}
		}
		return "YES";
	}

}
