//04)
package lista04;
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Cachorro Quente, 100, 4,00");
      System.out.println("X Salada, 101, 6,00");
      System.out.println("Bauru com ovo, 102, 6,50");
      System.out.println("Refrigerante, 103, 2,00");
      System.out.println("Digite o codigo: ");
      int n1 = input.nextInt();
      System.out.println("Digite a quantidade: ");
      int n2 = input.nextInt();
        switch (n1) {
            case 100:
                System.out.println("Cachorro Quente " + n2 * 4 + " Reais");
                break;
            case 101:
                System.out.println("X Salada " + n2 * 6 + " Reais");
                break;
            case 102:
                System.out.println("Bauru com ovo " + (double)n2 * 6.5 + " Reais");
                break;
            case 103:
                System.out.println("Refrigerante " + n2 * 2 + " Reais");
                break;
            default:
                System.out.println("Codigo invalido");
                break;
        }

   }
}
