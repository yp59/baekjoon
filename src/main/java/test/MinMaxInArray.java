package test;

import java.io.*;
import java.util.Arrays;

public class MinMaxInArray {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] nums = br.readLine().split(" ");

        int[] arrays = new int[N];
        for (int i = 0; i < N; i++) {
            arrays[i] = Integer.parseInt(nums[i]);
        }
//        int min = arrays[0];
//        int max = arrays[0];
//        for (int array : arrays) {
//            if (array < min) {
//                min = array;
//            }
//            if (array > max) {
//                max = array;
//            }
//        }
        int min = Arrays.stream(arrays).min().getAsInt();
        int max = Arrays.stream(arrays).max().getAsInt();

        bw.write(String.valueOf(min));
        bw.write(" ");
        bw.write(String.valueOf(max));

        bw.flush();
        br.close();
        bw.close();
    }
}
