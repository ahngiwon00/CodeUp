package CodeUp.C100.C1033;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String s=Integer.toHexString(x);

        System.out.println(s.toUpperCase());
    }
}


