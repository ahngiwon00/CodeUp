package BaekJoon.Basics.Math;

import java.util.Scanner;

public class B4375 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



            int num =1;

            for(int j=1; j<=9901; j++){
                if(num%9901==0){
                    System.out.println(j);
                    break;
                }
                num=num*10+1;
            }

    }


}
