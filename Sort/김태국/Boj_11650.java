package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Boj_11650 {
	public static void main(String[] args) throws IOException {
		Scan sc = new Scan();
		int n = sc.nextInt();
		Integer[][] parameter = new Integer[n][2];
		
		for (int i = 0; i < n; i++) {
			parameter[i][0] = sc.nextInt();
			parameter[i][1] = sc.nextInt();
		}
		
		final Comparator<Integer[]> comp = ((a1, a2) -> {
			if (a1[0] > a2[0]) {
				return 1;
			} else if (a1[0] < a2[0]) {
				return -1;
			} else {
				if (a1[1] > a2[1])
					return 1;
				else if (a1[1] < a2[1])
					return -1;
				
				return 0;
			}
		});
		
		StringBuilder sb = new StringBuilder();
		
		Arrays.stream(parameter).sorted(comp).forEach((arg) -> sb.append(arg[0] + " " + arg[1] + "\n"));
		
		System.out.println(sb.toString());
	}
	
	static class Scan {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int nextInt() throws IOException {
			if (st == null || !st.hasMoreTokens()) {
				st = new StringTokenizer(in.readLine());
			}
			return Integer.parseInt(st.nextToken());
		}
	}
}
