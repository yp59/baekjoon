package test;

import java.io.*;

public class baekjoon3009 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] x = new int[3];
        int[] y = new int[3];

        for (int i = 0; i < 3; i++) {
            String[] input = br.readLine().split(" ");
            x[i] = Integer.parseInt(input[0]);
            y[i] = Integer.parseInt(input[1]);
        }

        if (x[0] == x[1]) {
            bw.write(String.valueOf(x[2])+" ");
        } else if (x[0] == x[2]){
            bw.write(String.valueOf(x[1])+" ");
        } else {
            bw.write(String.valueOf(x[0])+" ");
        }

        if (y[0] == y[1]) {
            bw.write(String.valueOf(y[2]));
        } else if (y[0] == y[2]){
            bw.write(String.valueOf(y[1]));
        } else {
            bw.write(String.valueOf(y[0]));
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
