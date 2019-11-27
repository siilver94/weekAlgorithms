package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Boj_1181 {
	public static void main(String[] args) throws IOException {
		Scan sc = new Scan();
		TreeSet<String> set = new TreeSet<String>();
		int size = sc.nextInt();
		
		for (int i = 0; i < size; i++)
			set.add(sc.nextString());
		
		StringBuffer sb = new StringBuffer();
		
		set.stream().sorted((o, n) -> {
			if (o.length() > n.length())
				return 1;
			else if (o.length() < n.length())
				return -1;
				
			return o.compareTo(n);
		}).forEach((str) -> {
			sb.append(str + "\n");
		});
		
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
		
		String nextString() throws IOException {
			if (st == null || !st.hasMoreTokens()) {
				st = new StringTokenizer(in.readLine());
			}
			return st.nextToken();
		}
	}
}
