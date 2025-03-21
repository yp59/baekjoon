package test;

import java.io.*;
import java.util.Arrays;

public class baekjoon9063 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] x = new int[N];
        int[] y = new int[N];

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            x[i] = Integer.parseInt(input[0]);
            y[i] = Integer.parseInt(input[1]);
        }

        int maxX = Arrays.stream(x).max().getAsInt();
        int minx = Arrays.stream(x).min().getAsInt();
        int maxy = Arrays.stream(y).max().getAsInt();
        int miny = Arrays.stream(y).min().getAsInt();
        bw.write(String.valueOf((maxX - minx) * (maxy - miny)));

        bw.flush();
        br.close();
        bw.close();
    }
}
