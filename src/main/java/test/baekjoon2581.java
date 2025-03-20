package test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class baekjoon2581 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        int sum = 0;
        for (int i = M; i <= N; i++) {
            if (i == 2) {
                list.add(i);
                sum += i;
            } else if (i > 2) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        break;
                    }
                    if (j == i - 1) {
                        list.add(i);
                        sum += i;
                    }
                }
            }
        }
        if (sum == 0) {
            bw.write("-1");
        } else {
            bw.write(String.valueOf(sum));
            bw.newLine();
            bw.write(String.valueOf(list.get(0)));
        }


        bw.flush();
        br.close();
        bw.close();
    }
}
