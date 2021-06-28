
package javaapplication4;


public class Employee{
    String name,address;
    String yearJoined;
    
    public static void main(String[] args){
        int yearjoined;
        
   
        Employee emp1=new Employee();
        emp1.name= "Robert";
        emp1.yearJoined ="1994";
        emp1.address="64C-WallsStreet";
        
        Employee emp2=new Employee();
        emp2.name= "Sam";
        emp2.yearJoined ="2000";
        emp2.address="68D-WallStreet";
        
        
        Employee emp3=new Employee();
        emp3.name= "John";
        emp3.yearJoined ="1999";
        emp3.address="26B-WallsStreet";
        
        
                
    
        System.out.println("Name: "+emp1.name);
        System.out.println("Year of Joining: "+emp1.yearJoined);
        System.out.println("Address: "+emp1.address);
        
        System.out.println("Name: "+emp2.name);
        System.out.println("Year of Joining: "+emp2.yearJoined);
        System.out.println("Address: "+emp3.address);
        
         System.out.println("Name: "+emp3.name);
        System.out.println("Year of Joining: "+emp3.yearJoined);
        System.out.println("Address: "+emp3.address);
        
        
                
    
    
}
}
