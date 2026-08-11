import java.util.Scanner;
public class Ex4{
    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);

        int an1;
        int an2;

        System.out.println("informe seu ano de nascimento; ");
        an1 = scanner.nextInt();
        System.out.println("informe o ano atual; ");
        an2 = scanner.nextInt();

        int idd = an2 - an1;

        if (idd > 18 && idd > 60){
            System.out.println("vc é maior de idade e tem direito a desconto. ");
        }else if (idd > 18 && idd < 60){
            System.out.println("vc é maior de idade e nao tem direito a desconto. ");
        }else if (idd < 18 && idd < 12){
            System.out.println("vc é menor de idade e tem direito a desconto. ");
        }else{
            System.out.println("vc é menor de idade e nao tem direito a desconto. ");
        }
    }
}
