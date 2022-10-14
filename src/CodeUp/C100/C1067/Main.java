package CodeUp.C100.C1067;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        if(a<0)
            System.out.println("minus");
        else
            System.out.println("plus");
        if (a%2==0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
}