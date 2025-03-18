package test;

import java.io.*;

public class LinearSearchInArray {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] v  = new int[N];

        String[] nums = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            v[i] = Integer.parseInt(nums[i]);
        }
        int x = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int vi : v)    {
            if (vi == x) {
                cnt ++;
            }
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
        br.close();
        bw.close();
    }
}
