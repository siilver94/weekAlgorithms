package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2751 {
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
	
	public static void main(String[] args) throws IOException {
		Scan sc = new Scan();
		int len = sc.nextInt();
		int[] arr = new int[len];
		
		for (int i = 0; i < len; i++) {
			arr[i] = sc.nextInt();
		}
		
		quickSort(arr, 0, len-1);
		
		StringBuffer sb = new StringBuffer();
		
        for (int i = 0; i < len; i++) 
        	sb.append((i == len -1) ? arr[i]:arr[i] + " ");  
            
        System.out.println(sb.toString());
	}
	
	public static void quickSort(int[] arr, int low, int high) {
		int middle = (high + low) / 2;
		int pivot = arr[middle];
		
		int i = low, j = high;
		int temp;
		
		while(i <= j) {
			while(arr[i] < pivot)
				i++;
			while(arr[j] > pivot)
				j--;
			
			if (i <= j) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		
		if (low < j)
			quickSort(arr, low, j);
		if (high > i)
			quickSort(arr, i, high);
	}
}