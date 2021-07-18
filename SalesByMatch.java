package org.adhyan.hackerrank.warmupChallenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

	public static int sockMerchant(int n, List<Integer> ar) {
		
	 int total = ar.stream()
		   .distinct().mapToInt(number-> {
			   int pair = Collections.frequency(ar, number);
			   return pair%2==0?pair:pair-1;
		   }).sum();
		   
		
		return total/2;
	}	
}

public class SalesByMatch {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
   
	/*	Provide the input in following format
		
		9
		10 20 20 10 10 30 50 10 20 */
		
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.sockMerchant(n, ar);

        System.out.println(" Result  :  "+result);
	}
}
