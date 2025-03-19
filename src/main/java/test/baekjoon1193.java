package test;

import java.io.*;

public class baekjoon1193 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        int bunmo = 1;
        int bunja = 1;

        if (x == 1) {
            sb.append(bunja).append("/").append(bunmo);
        } else {
            boolean change = true;
            for (int i = 1; i < x; i++) {
                if (change) { // 분자를 분모에 주기
                    bunmo++;
                    bunja--;
                    if (bunja == 0) {
                        bunja++;
                        change = false;
                    }
                } else { // 분모를 분자에 주기
                    bunmo--;
                    bunja++;
                    if (bunmo == 0) {
                        bunmo++;
                        change = true;
                    }
                }
            }
            sb.append(bunja).append("/").append(bunmo);
        }
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }
}
