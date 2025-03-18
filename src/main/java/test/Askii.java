package test;

import java.io.*;

public class Askii {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();
        char askii =  S.charAt(0);
        int i = (int) askii;

        bw.write(String.valueOf(i));

        bw.flush();
        br.close();
        bw.close();
    }
}
