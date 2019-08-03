
package exercices;
import java.util.Scanner;
public class Rectangle {
    Scanner s =new Scanner(System.in);
    public void rect(){
        System.out.print("Entrez la largeur:");
        int l=s.nextInt();
        System.out.print("Entrez la hauteur:");
        int h=s.nextInt();
    
        System.out.print("Surface('s/S') ou perimetre('p/P'):");
        char x=s.next().charAt(0);
       if(l>0&&h>0){
        switch(x){
        case 'S' :
        case 's' : System.out.println("la surface est: "+h*l);break;
        case 'p' :
        case 'P' : System.out.println("le perimetre est: "+2*(l+h));break;
        default : System.out.println("ereur");
        }
 
       }
       else
           System.out.println("Ereur:Vous avez introduit une largeur ou une longeure negative!");
       
      
    }
}
