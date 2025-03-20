package test;

import java.io.*;

public class baekjoon11653 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int temp = N;
        boolean x = true;
        if (N != 1) {
            for (int i = 2; i <= N; i++) {
                while (temp % i == 0) {
                    if (x) {
                        x = false;
                    } else {
                        sb.append("\n");
                    }
                    temp = temp / i;
                    sb.append(i);
                }
            }
        }

        bw.write(sb.toString());


        bw.flush();
        br.close();
        bw.close();
    }
}
