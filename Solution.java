import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'sumOfGroup' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts INTEGER k as parameter.
     */

    public static long sumOfGroup(int k) {
    // Return the sum of the elements of the k'th group.
    long sum = 0;
    long j = (long)(Math.pow(k,2) - k + 1);
    for(int i = 0;i < k;i++,j += 2)
        sum += j;
    return sum;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        long answer = Result.sumOfGroup(k);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
