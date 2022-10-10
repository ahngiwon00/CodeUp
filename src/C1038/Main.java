package C1038;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        String[] str = s.split(" ");
        long a = Long.parseLong(str[0]);
        long b = Long.parseLong(str[1]);

        System.out.println(a+b);
    }
}

