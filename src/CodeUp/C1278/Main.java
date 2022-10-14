package CodeUp.C1278;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

            int sum = 0;
            int count=0;
            while (n>0) {
                sum += n % 10;
                n = n / 10;
               count++;
            }
        System.out.println(count);

    }
}

