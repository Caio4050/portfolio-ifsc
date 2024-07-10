//07)
package lista04;
import java.util.Scanner;
public class Exercicio7 {
     public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n1;
      String nome,t,cont;
      do{
          System.out.println("Nome: ");
          nome = input.next();
          System.out.println("Tipo do apartamento: ");
          t = input.next();
          System.out.println("Dias de hospedagem: ");
          n1 = input.nextInt();
          if (n1 ==0){
              System.out.println("Dias invalido");
              break;
          }
          switch(t){
              case "A":
                  System.out.println(nome);
                  System.out.println(t);
                  System.out.println(n1*150);
                  break;
              case "B":
                  System.out.println(nome);
                  System.out.println(t);
                  System.out.println(n1*100);
                  break;
              case "C":
                  System.out.println(nome);
                  System.out.println(t);
                  System.out.println(n1*75);
                  break;
              default:
                  System.out.println("Tipo invalido");
                  }
          System.out.println("Deseja continuar ? S ou N");
          cont = input.next();
          }while("S".equals(cont));
    }   
}
