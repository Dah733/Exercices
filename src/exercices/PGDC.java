
package exercices;
import java.util.Scanner;
public class PGDC {
    Scanner s=new Scanner(System.in);
   public void pgcd(){
       System.out.print("Entrez un nombre positif:");
       int n1=s.nextInt();
       System.out.print("Entrez un nombre positif:");
       int n2=s.nextInt();
       int x=n1;
       int y=n2;
       while(x!=y)
       {
        if(x>y)
            x=x-y;
        else 
            y=y-x;
       }
      System.out.println("Le plus grand diviseur commun de "+n1+" et "+n2+" est: "+x);
      
   }
    
}
