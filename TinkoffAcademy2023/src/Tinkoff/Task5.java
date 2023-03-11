package Tinkoff;
import java.util.*;

public class Task5 {

	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);

		int n = inScanner.nextInt();
		List<Integer> frequencies = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			frequencies.add(inScanner.nextInt());
		}
		inScanner.close();

		
		var resList = new ArrayList<Integer>();
		Collections.sort(frequencies);
		for (int i = 0; i < n / 2 + 1; i++) {
			int minF = Collections.min(frequencies);
			int result = 0;
			for (int f : frequencies) {
				result += f / minF;
			}
			frequencies.remove(0);
			resList.add(result * minF);
		}

		System.out.println(Collections.max(resList));
	}
}
