import java.util.Scanner;
public class Ex6{
    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);

        int nt;

        System.out.println("informe uma nota; ");
        nt = scanner.nextInt();

        while(nt > 10 || nt < 0){
            System.out.println("essa nota n é valida.");
            System.out.println("informe uma nota; ");
            nt = scanner.nextInt();
        }
    }
}