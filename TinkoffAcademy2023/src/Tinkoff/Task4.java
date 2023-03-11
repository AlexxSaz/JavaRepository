package Tinkoff;

import java.util.*;

public class Task4 {

	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		Task4 task4 = new Task4();
		int n = inScanner.nextInt();
		List<netFilter> netFilters = new ArrayList<netFilter>();
		var father = task4.new netFilter(1, inScanner.nextInt());
		for (int i = 1; i < n; i++) {
			netFilters.add(task4.new netFilter(i + 1, inScanner.nextInt()));
		}
		for (var f : netFilters) {
			f.setFatherId(inScanner.nextInt());
		}
		for (var f : netFilters) {
			f.setL(inScanner.nextInt());
		}
		inScanner.close();

		for (var f : netFilters) {
			if (f.getL() <= f.getA()) {
				switch (f.getFatherId()) {
				case 1: {
					father.incChildCount();
					break;
				}
				default:
					father.incChildCount();
					netFilters.stream().filter(fil -> fil.getId() <= f.getFatherId()).forEach(nf -> nf.incChildCount());
					break;
				}
			}
		}
		String resultString = father.getChildCount() + " ";
		for (var f : netFilters) {
			resultString += f.getChildCount() + " ";
		}
		System.out.print(resultString.trim());
	}

	class netFilter {
		private int id;
		private int fatherId;
		private int a;
		private int l;
		private int childCount;

		{
			fatherId = 0;
			l = 0;
			childCount = 0;
		}

		public void setFatherId(int fatherId) {
			this.fatherId = fatherId;
		}

		public void setL(int l) {
			this.l = l;
		}

		public void incChildCount() {
			childCount++;
		}

		public int getA() {
			return a;
		}

		public int getFatherId() {
			return fatherId;
		}

		public int getId() {
			return id;
		}

		public int getL() {
			return l;
		}

		public int getChildCount() {
			return childCount;
		}

		public netFilter(int id, int a) {
			this.id = id;
			this.a = a;
		}
	}
}
