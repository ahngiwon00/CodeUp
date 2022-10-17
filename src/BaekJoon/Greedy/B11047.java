package BaekJoon.Greedy;


import java.io.IOException;

import java.util.Scanner;

public class B11047 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String[] str= sc.nextLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);

        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        int count=0;

        for (int i = a-1; i >= 0; i--) {
            count+=b/arr[i];
            b = b % arr[i];
        }
        System.out.println(count);
    }
}
//동전