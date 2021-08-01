package org.adhyan.hackerrank.warmupChallenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

class Result2 {

    public static int jumpingOnClouds(List<Integer> c) {
        
    	int iteration = 0;
    	int count = 0;
    	while(iteration<c.size()) {
    	 if(c.get(iteration)==0) {
    		  count++;
    		  iteration+=((iteration+2)<c.size() && c.get(iteration+2)==0)?2:1;
    	    } else {
    		  iteration++;
    		}
    	}		
     return count-1; 	
    }
}


public class JumpingOnTheClouds {
	
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        /* Input should be in the following format.
         *  7
         *  0 0 1 0 0 1 0
         */

        
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> c = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result2.jumpingOnClouds(c);
        System.out.println(result);

     }
}
