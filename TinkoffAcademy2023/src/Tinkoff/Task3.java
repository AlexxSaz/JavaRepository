package Tinkoff;

import java.util.*;

public class Task3 {

	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		Task3 task3 = new Task3();
		int n = inScanner.nextInt();
		int m = inScanner.nextInt();
		int k = inScanner.nextInt();
		List<telescope> telescopes = new ArrayList<telescope>();
		for (int i = 0; i < n; i++) {
			telescopes.add(task3.new telescope(i + 1, inScanner.nextInt()));
		}
		int counter = 0;
		for (int i = 0; i < m; i++) {
			int first = inScanner.nextInt();
			int second = inScanner.nextInt();
			telescope firstTele = telescopes.stream().filter(t -> t.id == first).findFirst().orElse(null);
			telescope secondTele = telescopes.stream().filter(t -> t.id == second).findFirst().orElse(null);
			if (firstTele.regim != secondTele.regim) {
				counter++;
			}
		}
		inScanner.close();
		System.out.print(counter);
	}

	class telescope {
		private int id;
		private int regim;

		public int getId() {
			return id;
		}

		public int getRegim() {
			return regim;
		}

		public telescope(int id, int regim) {
			this.id = id;
			this.regim = regim;
		}
	}
}
