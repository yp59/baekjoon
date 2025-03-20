package test;

import java.io.*;

public class baekjoon2869 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int V = Integer.parseInt(input[2]);

        int count = 0;

        count = (int)Math.ceil(((double) (V - B) / (A - B)));

        bw.write(String.valueOf(count));

        bw.flush();
        br.close();
        bw.close();
    }
}
