package exercices;
import java.util.Scanner;
public class JavaDegre3 {
    Scanner s=new Scanner(System.in);
    public void javadegre3(){
        System.out.print("Entrez a (int):");
        int a=s.nextInt();
        System.out.print("Entrez b (int):");
        int b=s.nextInt();
                
        System.out.print("Entrez c (int):");
        int c=s.nextInt();
        System.out.print("Entrez x (double):");
        double x=s.nextDouble();
        
        double x2 = x*x;
        double x3 = x*x*x;
        double P = ((a+b)/2)*x3 + (a+b)*(a+b)*x2 + a + b + c;
        System.out.println("La valeut du polynome est :"+P);

        
        
    }
    
}
