package BaekJoon.Greedy;

import java.util.*;

public class B1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for(int x : a)
            System.out.println(x);
        int[] index = new int[n];



    }
}
