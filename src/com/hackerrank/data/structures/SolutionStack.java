package com.hackerrank.data.structures;

import java.util.Scanner;
import java.util.Stack;

/*Solves the Stack  problem of Data Structures */

public class SolutionStack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Character> charStack = new Stack<>();
        boolean isBalanced = false;

        while (sc.hasNext()) {
            String input = sc.next();

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (ch == '{' || ch == '[' || ch == '(') {
                    charStack.push(input.charAt(i));
                } else if (ch == '}' || ch == ']' || ch == ')') {
                    if (charStack.isEmpty()) {
                        isBalanced = false;
                    }
                    if (input.charAt(i) == '}') {
                        if (charStack.pop() == '{') {
                            isBalanced = true;
                        } else if (input.charAt(i) == ']') {
                            if (charStack.pop() == '[') {
                                isBalanced = true;
                            }
                        } else if (input.charAt(i) == ')') {
                            if (charStack.pop() == '(') {
                                isBalanced = true;
                            }
                        }
                    }
                }
            }
            if (charStack.empty()) {
                isBalanced = true;
            } else {
                isBalanced = false;
            }

            System.out.println(isBalanced);
        }
        sc.close();
    }
}



