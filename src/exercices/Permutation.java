
package exercices;

import java.util.Scanner;
public class Permutation {
 Scanner s=new Scanner(System.in);
 
 public void permut(){
     System.out.print("Entrez x:");
     int x=s.nextInt();
     System.out.print("Entrez y:");
     int y=s.nextInt();
     int z;
     System.out.println("Avant permutation:x : "+x+" y : "+y);
     z=x;
     x=y;
     y=z;
     System.out.println("Apres permutation:x : "+x+" y : "+y);
     
     
 }
    
    
}
