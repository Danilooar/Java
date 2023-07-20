import java.util.Scanner;

public class Dsemana {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        String Dia = null;

        if (x == 1) {
            Dia = "Domingo";
        } else if (x == 2) {
            Dia = "Segunda";
        } else if (x == 3) {
            Dia = "Terça";
        } else if (x == 4) {
            Dia = "Quarta";
        } else if (x == 5) {
            Dia = "Quinta";
        } else if (x == 6) {
            Dia = "Sexta";
        } else if (x == 7) {
            Dia = "Sabado";
        }
else {
    Dia = "Valor invalido";
        }

        System.out.println("Dia da semana: " + Dia);

        sc.close();
    }
}