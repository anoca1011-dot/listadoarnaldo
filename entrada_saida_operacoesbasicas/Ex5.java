import java.util.Scanner;
public class Ex5{
    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);

        int n;

        System.out.println("informe um numero; ");
        n = scanner.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println( n + "X" + i + "=" + n * i);
        }


        }
}