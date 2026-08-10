import java.util.Scanner;
public class Ex3{
    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);

        double n;

        System.out.println("informe um numero: ");
        n = scanner.nextDouble();

        if(n<0 && n%2 ==0){
            System.out.println("seu numeroro é negativo e par. ");
        }else if(n<0 && n%2 != 0){
            System.out.println("seu numero é é negativo e impar. ");
        }else if(n>0 && n%2 ==0){
            System.out.println("seu numero é positivo e par. ");
        }else if(n>0 && n%2 != 0){
            System.out.println("seu numero é positivo e impar. ");
        }else{
            System.out.println("seu numero é nulo.");
        }
    }
}
