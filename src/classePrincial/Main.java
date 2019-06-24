
package classePrincial;

import implementacaoDasListasLigadas.MinhaLista;
import java.util.Scanner;
import objetos.EmpresaOnibus;


public class Main {

    
    public static void main(String[] args) {
        
       /* MinhaLista<String> letra = new MinhaLista<String>();
        
        letra.add("A");
        letra.add("B");
        letra.add("C");*/
        
        
        MinhaLista<EmpresaOnibus> minha = new MinhaLista<EmpresaOnibus>();
        Scanner ler = new Scanner(System.in);
        
        int op = 0;
        while(op != -1){
            op = ler.nextInt();
            switch(op){
                case 1: //Cadastrar empresa
                   break;
                    
                case 2: //cadastrar onibus
                   break;
                
                case 3: //cadastrar passageiros
                   break;
           
                case 4: //imprimir Informacoes da Empresa e dos Onibus  
                   break;
                    
                case 5: //imprimir Informacoes dos dos Onibus e dos Passageiros ordenados pela idade
                   break;
                
                default:
                   System.out.println("Opcao Invalida");
                   break;       
        }
        
        }
         
    }
    
}
