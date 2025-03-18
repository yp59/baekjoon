package test;

import java.io.*;

public class baekjoon1316 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < N; i++) {
            String S = br.readLine();
            if (isGroupWord(S)) {
                count++;
            }
        }

        bw.write(String.valueOf(count));

        bw.flush();
        br.close();
        bw.close();
    }

    public static boolean isGroupWord(String S) {
        boolean[] moonza = new boolean[26];
        char prev = S.charAt(0);
        moonza[S.charAt(0) - 'a'] = true;

        for (int i = 1; i < S.length(); i++) {
            char curr = S.charAt(i);

            if (curr != prev) {
                if (moonza[curr - 'a']) {
                    return false;
                }
                moonza[curr - 'a'] = true;
            }
            prev = curr;
        }
        return true;
    }
}
