//1)
package lista04;
import java.util.Scanner;
public class Lista04 {
   public Lista04() {
   }

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      int n1;
      int n2;
      do {
         System.out.println("Digite o primeiro numero:");
         n1 = input.nextInt();
         System.out.println("Digite o segundo numero:");
         n2 = input.nextInt();
      } while(n1 != n2);

   }
}
