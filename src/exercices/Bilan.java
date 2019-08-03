
package exercices;
import java.util.Scanner;
public class Bilan {
    private Scanner s=new Scanner(System.in);
    public void montant(){
        System.out .print("Donner n:");
        int n=s.nextInt();
        
        int som=0;
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int i=1; i<=n;i++){
            
        System.out .print("Donner le montant du mois "+i+"(Frs):");
        int mon=s.nextInt();
        
        som=som+mon;
         if(mon>max)
             max=mon;
         if(mon<min)
             min=mon;
            
        }
        System.out.println("La somme mensuelle moyenne recy est:"+som/n);
        System.out.println("Le montant mensuel minimal recu est:"+min);
        System.out.println("Le montent mensuel maximal recu est:"+max);
        
        
        
    }
    
}
