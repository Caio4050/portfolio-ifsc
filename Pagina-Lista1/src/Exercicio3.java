//03)
package lista04;
import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int r = 0;

      int n1;
      do {
         ++r;
         System.out.println("Digite a idade: ");
         n1 = input.nextInt();
         String n = input.nextLine();
         System.out.println("Digite o nome: ");
         n = input.nextLine();
         System.out.println("Digite o sexo: ");
         String s = input.nextLine();
      } while(n1 != 0);

      System.out.println("Numero de repeticoes: " + r);
   }
}