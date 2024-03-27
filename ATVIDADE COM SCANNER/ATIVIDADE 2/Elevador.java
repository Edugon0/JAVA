// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.Scanner;

/**
 * 
 */
public class Elevador
{

    /**
     * 
     */
    static public void main(String[] args)
    {
        Scanner entrada =  new Scanner(System.in);
        int total;
        int capacidade;
        int presentes;
        int atual;
        int ultimo_andar;
        int resultado;
        System.out.print("Quantos andares tem o predio:");
        total = entrada.nextInt();
        System.out.print("O maximo de pessoas no elevador:");
        capacidade = entrada.nextInt();
        System.out.print("Quantas pessoas tem no elevador no momento:");
        presentes = entrada.nextInt();
        System.out.print("Qual é a andar atual do elevador:");
        atual = entrada.nextInt();
        resultado = total - atual;
        System.out.println("Quantos andares falta para chegar no terrio:" + resultado);
    }
}
