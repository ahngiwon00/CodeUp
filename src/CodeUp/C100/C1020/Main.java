package CodeUp.C100.C1020;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str= s.split("\\-");
        for(String x : str)
            System.out.print(x);
    }
}

