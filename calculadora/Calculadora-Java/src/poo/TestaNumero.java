package poo;

import java.net.SocketPermission;
import java.util.HashMap;
import java.util.Scanner;

public class TestaNumero {
    public static void main(String[] args) {
        Numeros n = new Numeros();
         boolean continuar = true;

        Scanner ler= new Scanner(System.in);

        while(continuar){
        double n1;
        double n2;
        int operacao;

        System.out.println("digite a operação que deseja realizar"
        +                    "\n 1 para a soma"
        +                    "\n 2 para a subtração"
        +                    "\n 3 para a divisão"
        +                    "\n 4 para a multiplicação"
        +                    "\n 5 para sair do programa"       
        );
        operacao = ler.nextInt();
            if(operacao==5){
                continuar = false;
                return;
            }

            System.out.println("digite o primeiro número: ");
            n1 =ler.nextDouble();

            System.out.println("digite o segundo número: ");
            n2 =ler.nextDouble();


            switch (operacao){
             
            case 1:
            imprimeCalculadora(operacao, n.soma(n1, n2), n1, n2);
            break;

            case 2:
            imprimeCalculadora(operacao, n.subtracao(n1, n2), n1, n2);

            break;
            case 3:
            imprimeCalculadora(operacao, n.divisao(n1, n2), n1, n2);

            break;
            case 4:
            imprimeCalculadora(operacao, n.multiplicacao(n1, n2), n1, n2);
                   
            break;
           default:
                break;
                
            }
        }
        ler.close();
    }

    static void imprimeCalculadora(int operacao,double resultado,double n1,double n2){
        HashMap <Integer, String>mapOperacao = new HashMap<>();
        mapOperacao.put(1, "somado");
        mapOperacao.put(2, "subtraido");
        mapOperacao.put(3, "dividido");
        mapOperacao.put(4, "multiplicado");

        System.out.println("\n O resultado de " + n1 + mapOperacao.get(operacao)+" por"+ n2+ " é igual a "+ resultado+"\n");
    }
    
}
