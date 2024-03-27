// Crie um programa em Java para calcular a área e o perímetro de um retângulo. 
//Considere os valores para base=3.74 e altura=2.50 do retângulo.

public class Problema_3
{
    public static void main(String[] args)
    {
        double base = 3.74;
        double altura = 2.50;
        double perimetro;
        double area;
        
        perimetro = 2*(base + altura);
        
        area = base * altura;
        
        System.out.println("O perimetro do retangulo é:"+ perimetro);
        System.out.println("O area do retangulo é:"+ area);
        
 
    }
    
}
