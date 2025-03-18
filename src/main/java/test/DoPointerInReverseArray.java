package test;

import java.io.*;

public class DoPointerInReverseArray {
        public static void main(String args[]) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            String[] nums = br.readLine().split(" ");
            int N = Integer.parseInt(nums[0]);
            int M = Integer.parseInt(nums[1]);

            int[] basket = new int[N];
            for (int i = 0; i < basket.length; i++) {
                basket[i] = i + 1;
            }

            for (int x = 0; x < M; x++) {
                String[] reverseInput = br.readLine().split(" ");
                int i = Integer.parseInt(reverseInput[0]);
                int j = Integer.parseInt(reverseInput[1]);


                /** 양쪽에서 한쪽은 더하고 한쪽은 줄여서 중복을 없애기 S */
                int start = i -1;
                int end = j -1;
                while (start < end) {
                    int temp = basket[start];
                    basket[start] = basket[end];
                    basket[end] = temp;
                    start ++;
                    end --;
                }
                /** 양쪽에서 한쪽은 더하고 한쪽은 줄여서 중복을 없애기 E */
            }
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < basket.length; i++) {
                sb.append(String.valueOf(basket[i]));
                if (i != basket.length - 1) {
                    sb.append(" ");
                }
            }
            bw.write(sb.toString());
            bw.flush();
            br.close();
            bw.close();
        }
    }

