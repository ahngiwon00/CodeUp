package CodeUp.C100.C1027;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str= s.split("\\.");
        System.out.println(str[2]+"-"+str[1]+"-"+str[0]);
    }
}

