
package exgithubaf;
import java.util.Scanner;


public class Exgithubaf {

    
    public static void main(String[] args) {
       Scanner ler = new Scanner (System.in);
        int mes;
        System.out.println("digite um numero entre 0 e 12");
        mes = ler.nextInt();
        mostrarMes(mes);
        
        
    }
    public static void mostrarMes(int a){
        switch (a){
        case 1:
        System.out.println("Janeiro");
        case 2:
        System.out.println("Fevereiro");
        case 3:
        System.out.println("Março");
        case 4:
        System.out.println("Abril");
        case 5:
        System.out.println("Maio");
        case 6:
        System.out.println("Junho");
        case 7:
        System.out.println("Julho");
        case 8:
        System.out.println("Agosto");
        case 9:
        System.out.println("Setembro");
        case 10:
        System.out.println("Outubro");
        case 11:
        System.out.println("Novembro");
        case 12:
        System.out.println("Dezembro");
        
        
      
    }
    
    
}
    
}

