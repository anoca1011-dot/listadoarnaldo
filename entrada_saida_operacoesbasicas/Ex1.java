import java.util.Scanner;
public class Ex1{
    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);
        
        double n1;
        double n2;
        double n3;
        double n4;
        
        System.out.println("informe sua nota; ");
        n1 = scanner.nextDouble();
        System.out.println("informe sua nota; ");
        n2 = scanner.nextDouble();
        System.out.println("informe sua nota; ");
        n3 = scanner.nextDouble();
        System.out.println("informe sua nota; ");
        n4 = scanner.nextDouble();

        double media = (n1+n2+n3+n4)/4;

        System.out.println("sou media é: " +media);
    }
}