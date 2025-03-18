package test;

import java.io.*;

public class bufferedReaderExam {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] nums = br.readLine().split(" ");
            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);

            StringBuilder sb = new StringBuilder();
            sb.append("Case #").append(i + 1).append(": ").append(a).append(" + ").append(b).append(" = ").append(a + b);
            bw.write(sb.toString());
            bw.newLine();
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
