import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroConta = sc.nextInt();

        sc.nextLine();

        String nomeTitular = sc.nextLine();
        double Saldo = sc.nextDouble();



     System.out.println("Informações: " );
     System.out.printf("Conta:%d %n Titular:%s %n Saldo:R$ %.2f",numeroConta,nomeTitular,Saldo);

     sc.close();
    }
}
