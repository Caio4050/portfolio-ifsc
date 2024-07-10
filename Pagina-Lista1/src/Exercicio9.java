//9)
package lista04;
import java.util.Scanner;
public class Exercicio9 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n1;
      double n3;
      String cl;
      do{
          System.out.println("Digite o cpf: ");
          n1 = input.nextInt();
          System.out.println("Renda mensal: ");
          n3 = input.nextDouble();
          System.out.println("Informe a classe de renda: ");
          cl = input.next();
          switch(cl){
              case "A":
                  System.out.println("Isento");
                  System.out.println(n3);
                  break;
              case "B":
                  System.out.println("5%");
                  System.out.println(n3-n3*0.05);
                  break;
              case "C":
                  System.out.println("10%");
                  System.out.println(n3-n3*0.1);
                  break;
              case "D":
                  System.out.println("15%");
                  System.out.println(n3-n3*0.15);
                  break;
              case "E":
                  System.out.println("20%");
                  System.out.println(n3-n3*0.2);
                  break;
              default:
                  System.out.println("Codigo invalido");
          }
      }while(n1!=00);
    }
}
