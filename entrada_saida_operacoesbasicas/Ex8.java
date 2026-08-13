import java.util.Scanner;
public class Ex8{
    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);

         int[] batata = new int[8];
          for(int i = 0; i < 8; i++){
            System.out.println("informe um numero; ");
            batata[i] = scanner.nextInt();
          }

          int mais = batata[0];
          int nmaismais = 0;
          int menos = batata[0];
          int nmenosmenos = 0;

          for(int i=0; i<8; i++){
            if(batata[i] > mais){
              mais = batata[i];
              nmaismais = i;
            }
            if(batata[i] < menos){
              menos = batata[i];
              nmenosmenos = i;
            }
          }

          System.out.println("O maior numero é " + mais + " e está na posição " + nmaismais);
          System.out.println("O menor numero é " + menos + " e está na posição " + nmenosmenos);

    }
}