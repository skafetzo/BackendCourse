package com.hackerrank.data.structures;

import java.util.Scanner;
import java.util.Stack;

/*Solves the Stack  problem of Data Structures */

public class SolutionStack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Character> charStack = new Stack<>();

        while (sc.hasNext()) {
            charStack.clear();
            boolean isBalanced = false;
            String input = sc.next();

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (ch == '{' || ch == '[' || ch == '(') {
                    charStack.push(ch);
                    isBalanced = false;
                } else if (!charStack.isEmpty()) {

                    char popped = charStack.pop();
                    switch (ch) {
                        case '}':
                            if (popped == '{') {
                                isBalanced = true;
                                break;
                            }
                        case ']':
                            if (popped == '[') {
                                isBalanced = true;
                                break;
                            }
                        case ')':
                            if (popped == '(') {
                                isBalanced = true;
                                break;
                            }
                    }
                    if (!isBalanced) {
                        break;
                    }
                }else {
                    isBalanced = false;
                    break;
                }
                if ((i == input.length()-1) && !charStack.isEmpty()) {
                    isBalanced = false;
                }
            }


            System.out.println(isBalanced);
        }

        sc.close();

    }

}




