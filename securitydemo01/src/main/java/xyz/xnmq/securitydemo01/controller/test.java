package xyz.xnmq.securitydemo01.controller;

import java.util.Scanner;

/**
 * @Created xnmq
 * @Date 2021/9/11
 * @Description
 */
public class test {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while(scanner.hasNextLong()){
//            long num = scanner.nextLong();
//            long t = num;
//            for (int i = 2; i < t; i++) {
//                while(num % i ==0){
//                    num = num/i;
//                    System.out.println(i + "");
//                }
//
//            }
//        }

        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String next = scanner.next();
            int length = next.length();
            for (int i = 0; i < length; i++) {
                char c = next.charAt(i);
                int i1 = next.indexOf(c);
                int i2 = next.lastIndexOf(c);
                if(i1 == i2){
                    System.out.println("只出现一次的字符：" + c);
                    return;
                }

            }
        }
    }
}
