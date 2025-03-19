package test;

import java.io.*;

public class baekjoon2745 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int[] jinsu = new int[26];
        for (int i = 0; i < jinsu.length; i++) {
            jinsu[i] = i + 10;
        }

        int[] number = new int[10];
        for (int i = 0; i < number.length; i++) {
            number[i] = i;
        }
        String N = input[0];
        int B = Integer.parseInt(input[1]);

        int cal = 0;

        for (int i = 0; i < N.length(); i++) {
            char c = N.charAt(i);
            int jalisu = N.length() - (i + 1);
            if ('A' <= c && c <= 'Z') {
                cal += jinsu[c - 'A'] * ((int) Math.pow(B, jalisu));
            } else {
                cal += number[c - '0']* ((int) Math.pow(B, jalisu));
            }
        }
        bw.write(String.valueOf(cal));

        bw.flush();
        br.close();
        bw.close();
    }

}
