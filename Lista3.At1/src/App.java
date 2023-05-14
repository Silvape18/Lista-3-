import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner teclado = new Scanner(System.in);

       int N1;
       int N2;

        System.out.println("Digite um numero: ");
        N1 = teclado.nextInt(); 
        System.out.println("Digite um outro numero: ");
        N2 = teclado.nextInt();
            scanner.teclado.close();
       

        if( N1 > N2){
            System.out.println("O maior numero é: " + N1);
        } else { System.out.println("O maior numero é: " + N2);
    }

         
    }
}
