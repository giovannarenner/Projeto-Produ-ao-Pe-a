package br.ulbra.classe;


import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class UsaProducao extends Producao {
    public static void main(String[] args) {
        Producao prod = new Producao(0);
        Scanner leia = new Scanner(System.in);
        
        System.out.println(" Digite o nome peça ");
        prod.setPeca(leia.nextLine());
      
        System.out.println(" Digite o tempo em segundos ");
        prod.setSegundos(leia.nextInt());
        
        System.out.println( " segundos: " +prod.segundos);
        

                
        prod.calcularHMS();
        System.out.println(" segundos ");
        
        
        
        System.out.println(prod.toString());
         
        }

    public UsaProducao(int hora) {
        super( hora );
    }
}