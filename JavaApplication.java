/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication;
import java.util.Scanner;

/**
 *
 * @author hp pc
 */
public class JavaApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int choice;
        System.out.println("Pick any : \n 1.HI\n 2.Hey\n 3.Hello");
        Scanner s=  new Scanner(System.in);
        choice = s.nextInt();
        switch(choice)
        {
            case 1 : System.out.println("You said Hi");
            break;
            case 2 : System.out.println("You said Hey");
            break;
            case 3 : System.out.println("You said Hello");
            break;
            default :System.out.println("Invalid Choice");
            
                  
     
        }
    
    }
        // TODO code application logic here
    
    
}
