package sty;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        System.out.println("***第一题***");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum+=i;
        }
        System.out.println(sum);
        System.out.println("***第二题***");
        int cout = 0;
        String s = null;
        System.out.println("   1  2  3  4  5  6  7  8  9");
        for (int i = 1; i <10 ; i++) {
            System.out.print(i+"  ");
            for (int j = 1; j <10; j++) {
                cout = i * j;
                if (cout<10){
                    s=cout+" ";
                }
                else{
                    s=cout+"";
                }
                System.out.print(s+" ");
            }
            System.out.println();
        }
        System.out.println("***第三题***");
        for (int i = 1; i <= 100 ; i++) {
            if (i%2==1){
                System.out.print(i+" ");
            }
            if (i%20==0){
                System.out.println();
            }
        }
        System.out.println("***第四题***");
        int sum2= 0;
        int count=0;
        for (int i = 101; i <= 200; i++) {
            boolean flag = true;
            for(int j = 2; j < i; j++){
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if (flag==true) {
                if(count!=0 & (count++)%10==0) {
                    System.out.println();
                }
                System.out.print(i+" ");
                sum2+=i;
            }
        }
        System.out.println("\n素数和为："+sum2);
    }
}
