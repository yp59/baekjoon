package test;

import java.io.*;

public class baekjoon2292 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        if (T == 1) {
            sb.append(String.valueOf(T));
        } else {
            int result = 2;
            while (3 * (result - 1) * result + 1 < T){
                result++;
            }
            sb.append(String.valueOf(result));
        }


        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }
}
