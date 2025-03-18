package test;

import java.io.*;
import java.util.Arrays;

public class askii1157 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();
        S = S.toUpperCase();

        int[] arrays = new int[26];

        for (int i = 65; i < 91; i++) {
            for (int j = 0; j < S.length(); j++) {
                if (i == (int) S.charAt(j)) {
                    arrays[i-65]++;
                }
            }
        }
        int max = 0;
        char c = '?';

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] > max) {
                max = arrays[i];
                c = (char) (i + 'A');
            } else if (arrays[i] == max) {
                c = '?';
            }
        }

        bw.write(c);

        bw.flush();
        br.close();
        bw.close();

    }
}