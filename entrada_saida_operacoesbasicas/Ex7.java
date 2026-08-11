import java.util.Scanner;
public class Ex7{
    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);

        int[] patati = new int[5];
        for(int i = 0; i < 5; i++){
            System.out.println("digite um número");
            patati[i] = scanner.nextInt();
        }
        for(int i = 4; i >= 0; i-- ){
            System.out.println(patati[i]);
        }

    }
}