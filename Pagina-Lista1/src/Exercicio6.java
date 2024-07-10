//06)
package lista04;
import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n5 = 0;
      int n6 = 0;
      int n1 = 0;
      int n2 = 0;
      int n3 = 0;
      int n4 = 0;

      do {
         ++n1;
         System.out.println("Sua idade: ");
         int i = input.nextInt();
         System.out.println("Sua nota para o filme : ");
         String nota = input.next();
         if ("A".equals(nota)) {
            ++n2;
         }

         if ("D".equals(nota)) {
            n3 += i;
            ++n6;
         }

         if (n1 == 1 || i > n4) {
            n4 = i;
         }

         if (n1 == 1 || i < n5) {
            n5 = i;
         }
      } while(n1 <= 19);

      System.out.println("Notas otimas : " + n2);
      System.out.println("Media da idade das notas ruins: " + n3 / n6);
      System.out.println("Diferen\u00e7a entre a mais velha e mais nova: " + (n4 - n5));
   }
}

