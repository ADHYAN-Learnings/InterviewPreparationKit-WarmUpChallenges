package org.adhyan.hackerrank.warmupChallenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

class Result1 {
	 public static int countingValleys(int steps, String path) {
		 int sum = 0;
		 int prev = 0;
		 int count = 0;
		 for(int i=0;i<steps;i++) {
			 sum += path.charAt(i)=='U' ? 1 : -1; 
			 if(prev==-1 && sum==0) {
				 count++;
			 }
			 prev = sum;
		 }
	   return count;
	 }
}

public class CountingValleys {
	

	 /* After executing the code.Provide the input in this format
	  *  12
      * DDUUDDUDUUUD
	  */ 
	 public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        int steps = Integer.parseInt(bufferedReader.readLine().trim());
	        String path = bufferedReader.readLine();
	        int result = Result1.countingValleys(steps, path);
	        System.out.println("Result : "+result);

	   }
}
