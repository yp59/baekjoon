package test;

import java.util.Stack;

public class Programmerskakao {
    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        Stack<Integer> basket = new Stack<>();
        int result = 0;

        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][moves[i]-1] != 0) {
                    int doll = board[j][moves[i]-1];
                    board[j][moves[i]-1] = 0;

                    if (!basket.isEmpty() && basket.peek() == doll) {
                        basket.pop();
                        result += 2;
                    } else {
                        basket.push(doll);                  
                    }
                    break;
                }
            }
        }

        System.out.println("result = " + result);
    }
}
