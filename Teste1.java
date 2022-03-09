import java.util.Scanner;
 
public class Test {
 
    public static void main(String[] args) {
          int minutos;
        Scanner input = new Scanner(System.in);
        minutos = input.nextInt();
        int K = (minutos * 4 )/2 ;
        System.out.printf("%d minutos\n",K); // Digite aqui o calculo dos minutos
     }  
}