package Preparation;

/*
 We use the integers a, b, and n to create the following series:

(a + 2^0 x b), (a + 2^0 x b + 2^1 x b), ..., (a + 2^0 x b + ... + )

 You are given q queries in the form of a, b and n. For each query, print the series corresponding to the given a, b and n values as a single line of n space-separated integers.

Input Format
 The first line contains an integer, q, denoting the number of queries.
 Each line i of the q subsequent lines contains three space-separated integers describing the respective a, b and n values for that query.

Constraints
 0 <= q <= 500
 0 <= a,b <=50
 1 <= n <= 15

Output Format
 For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of n space-separated integers.

Sample Input
2
0 2 10
5 3 5

Sample Output
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
 */

import java.io.IOException;
import java.util.Scanner;

public class E07_JavaLoopsII {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int queries = input.nextInt();
        int count = 0;
        int sum = 0;

        while(count < queries){
            int a = input.nextInt();
            int b = input.nextInt();
            int n = input.nextInt();

            for(int i = 0; i < n; i++){
                double exp = Math.pow(2,i) * b;
                sum += exp;
                System.out.print(a + sum + " ");
            }
            System.out.println();
            count++;
            sum = 0;
        }
    }
}
