
package exercices;
import java.util.Scanner;
public class Parite {
    private Scanner s=new Scanner(System.in);
public void Test_Parite(){
      System.out.print("Entrez un nombre entier:");
      int n=s.nextInt();
    if(n>0){
     if(n%2==0)
        System.out.println("nombre positif est Paire");
    else
        System.out.println("nombre  positif est Impaire");
}
    else if(n<0){
        if(n%2==0)
        System.out.println("nombre negatif est Paire");
    else
        System.out.println("nombre negatif est Impaire");
}
    else{
        System.out.println("Le nombre est 0(et il est pair)");

    }
}

}
