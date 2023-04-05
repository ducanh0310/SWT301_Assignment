package org.example;

import java.util.Scanner;

public class Main {
    public static boolean checkSHH(int a){
        int sum = 0;
        for (int i = 1; i < a; i++) {
            if(a%i==0){
                sum+=i;
            }
        }
        if(sum==a){
            return true;
        }
        else{
            return false;
        } 

    }
    public static boolean checkSNT(int n) {
        if (n < 2) {
            return false;
        }
        int a = (int) Math.sqrt(n);
        for (int i = 2; i <= a; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        System.out.println("Nhap so bat ki: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(checkSNT(a)){
            System.out.println(a + " la so nguyen to");
        }
        else System.out.println(a+" khong la so nguyen to");
        if(checkSHH(a)==false) System.out.println(a+" khong la so hoan hao");
        else System.out.println(a+" la so hoan hao");

    }
}

