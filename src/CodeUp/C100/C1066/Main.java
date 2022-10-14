package CodeUp.C100.C1066;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        String[] str = s.split(" ");

        for(int i=0; i<str.length; i++){
            if(Integer.parseInt(str[i])%2==0){
                System.out.println("even");
            }
            else
                System.out.println("odd");
        }


    }
}