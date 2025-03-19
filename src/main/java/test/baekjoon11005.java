package test;

import java.io.*;

public class baekjoon11005 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        char[] alpha = new char[26];

        for (int i = 0; i < alpha.length; i++) {
            alpha[i] = (char) (i+65);
        }

        int N = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);

//        String result = String.valueOf(Integer.toString(N,B)); //10진법을 B진법으로 바꾸는 메소드
//        bw.write(result.toUpperCase());

        StringBuilder sb = new StringBuilder();
        int block = N;
        while (B <= block) {
            int stone = (block % B);
            if (stone >= 10) {
                for (int i = 0; i < alpha.length; i++) {
                    if (alpha[i] == stone + 55) {
                        sb.append((alpha[i]));
                    }
                }
            } else {
                sb.append((stone));
            }
            block = block / B;
        }

        if (block >= 10) {
            for (int i = 0; i < alpha.length; i++) {
                if (alpha[i] == block + 55) {
                    sb.append((alpha[i]));
                }
            }
        } else {
            sb.append((block));
        }
        StringBuilder result = new StringBuilder();
        String str = sb.toString();

        for (int i = 0; i < str.length(); i++) {
            result.append(str.substring(str.length()-(i+1),str.length()-i));
        }

        bw.write(result.toString());
        bw.flush();
        br.close();
        bw.close();
    }
}
