package org.adhyan.hackerrank.warmupChallenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.stream.LongStream;

class Result4 {

    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static long repeatedString(String s, long n) {
    	
    	long length = s.length();
    	long quotient = (long)(n/length);
    	long remainder = (long)(n%length);
    	return (s.chars().filter(ch->ch=='a').count()*quotient)+s.substring(0,(int)remainder).chars().filter(ch->ch=='a').count();
    }

}

public class RepeatedString {

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    
    /* Here I have the harcoded the value of String and long.
     *      
     */
        String s = "aba";
        long n = 10;
        
        
		 long result = Result4.repeatedString(s, n);         
        System.out.println("Result : "+result); 
        
        bufferedReader.close();
     
    }
}
