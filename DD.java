import java.util.Scanner;

public class DD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A,B,C,D;

        A= sc.nextInt();
        B= sc.nextInt();
        C= sc.nextInt();
        D= sc.nextInt();
       int Soma = (A * B) - (C * D);

       System.out.println("Diferença = " + Soma);





        sc.close();
    }
}
