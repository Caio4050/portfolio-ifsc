//8)
package lista04;
import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n1,n2,n3,n4,n5;
      n2 = 0;
      n3 = 0;
      n4 = 0;
      n5 = 0;
      String cont;
      do{
          System.out.println("Informe a idade: ");
          n1 = input.nextInt();
          if(n1<6){
              System.out.println("Isento de pagamento");
              n2++;
          }else if(n1>=6 && n1<=12){
              System.out.println("Bilhete de criança");
              n3++;
          }else if(n1>=13 && n1<=65){
              System.out.println("Bilhete normal");
              n4++;
          }else{
              System.out.println("Bilhete da terceira idade");
              n5++;
          }
          System.out.println("Deseja continuar ? S ou N");
          cont = input.next();
          }while("S".equals(cont));
        System.out.println("Bilhetes infantis vendidos: " + (n2+n3));
        System.out.println("Bilhetes adultos vendidos: " + (n4+n5));
      }
    }
