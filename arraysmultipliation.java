
package javaapplication4;


public class arraysmultipliation {
     public static void main(String[] args){
  int a[][]={{1,4,5},{2,7,7},{1,1,5}};
  int b[][]={{1,4,4},{8,4,3},{1,8,2}};
  int c[][]=new int[3][3];
  
  for(int i=0;i<3;i++){
  for(int j=0;j<3;j++){
      c[i][j]=a[i][j]*b[i][j];
      System.out.print(c[i][j]+" ");
  }
  System.out.println();
      
  }    
    
}
}
