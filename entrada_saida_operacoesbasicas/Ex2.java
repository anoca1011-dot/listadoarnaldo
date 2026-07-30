import java.util.Scanner;
public class Ex2{
    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);

        double cc;

        System.out.println("informe a temperatura em celsius; ");
        cc = scanner.nextDouble();

        double ff = (cc*1.8)+32;

        System.out.println("sua temperatura em fahrenheit é " +ff);
    }
}