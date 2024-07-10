//05)
package lista04;
import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double f = 0.0;
      double m = 0.0;
      double k = 0.0;
      int n2 = 0;
      int n4 = 0;

      do {
         System.out.println("Altura: ");
         double a = input.nextDouble();
         System.out.println("Codigo: ");
         int n1 = input.nextInt();
         ++n4;
         if (n1 == 2) {
            ++n2;
            f += a;
         } else if (n1 == 1) {
            m += a;
         } else {
            System.out.println("Codigo invalido");
         }

         if (n4 == 1 || a > k) {
            k = a;
         }
      } while(n4 <= 9);

      System.out.println("Maior altura: " + k);
      System.out.println("Media das mulheres: " + f / (double)n2);
      System.out.println("Media da turma " + (f + m) / 10.0);
   }
}
