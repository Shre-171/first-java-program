
package javaapplication4;

import java.util.Scanner;

public class primenumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A VALUE :");
        int num=sc.nextInt();
        boolean isPrime=true;
        for(int i=2;i<num;i++){
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.print(num+" IS A PRIME NUMBER\t");
        }
        else{
            System.out.print(num+" IS A NOT A PRIME NUMBER\t");
        }
    }
    
}
