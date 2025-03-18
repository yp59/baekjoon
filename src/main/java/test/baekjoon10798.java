package test;

import java.io.*;

public class baekjoon10798 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[][] arrays = new String[5][15];

        for (int i = 0; i < arrays.length; i++) {
            String[] line = br.readLine().split("");
            for (int j = 0; j < line.length; j++) {
                arrays[i][j] = line[j];
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (arrays[j][i] != null) {
                    sb.append(arrays[j][i]);
                }
            }
        }
        bw.write(sb.toString());


        bw.flush();
        br.close();
        bw.close();
    }
}
