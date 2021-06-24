
package javaapplication4;

import java.util.Scanner;


public class EMPLOYEE2{
   public static void main(String[] args){
       
    
    String name,address;
    int yearjoined;
    float salary;
  
       
     for (int i = 0; i < 3; i++) {
          EMPLOYEE e[]=new EMPLOYEE[3];
            e[i] = new EMPLOYEE();

        System.out.println("Enter " + (i + 1) + " Employee data :");
    Scanner sc=new Scanner(System.in);
    System.out.println("ENTER NAME OF EMPLOYEE : ");
    name=sc.nextLine();
    
    System.out.println("ENTER NAME OF EMPLOYEE'S ADDRESS : ");
    address=sc.nextLine();
    
    System.out.println("ENTER THE YEAR OF JOINING : ");
    yearjoined=sc.nextInt();
    
    System.out.println("ENTER NAME OF EMPLOYEE'S SALARY : ");
    salary=sc.nextFloat();
    
    System.out.println("Employee name = " + name);
    System.out.println("Employee address = " +address );
    System.out.println("Employee year of joining = " + yearjoined);
    System.out.println("Employee salary = " + salary);
    
    }
       
        }
  
    
  
    
    
    
    
    
}

