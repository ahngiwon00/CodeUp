package C1035;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int hexa=Integer.parseInt(s,16);
        String octal=Integer.toOctalString(hexa);
        System.out.println(octal);
    }
}

