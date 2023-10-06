import java.util.Scanner;

public class AcessoCofre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String tipodeconta = sc.nextLine();
        String Fisico;


        if (tipodeconta.equalsIgnoreCase("Fisico")) {
            System.out.println(" Tipo: Cofre Fisico");
        }
        if (tipodeconta.equalsIgnoreCase("Fisico")){
            System.out.println("Metodo de abertura: Chave");
        }
        int Senha = sc.nextInt();
        int senhaconfSenha = sc.nextInt();


        if (tipodeconta.equalsIgnoreCase("digital")) {
            System.out.println("Tipo: Cofre Digital");
            System.out.println("Metodo de abertura: Senha");
            if (Senha == senhaconfSenha) {
                System.out.println("Cofre aberto! ");
            }  if (Senha == senhaconfSenha){
                System.out.println("Cofre aberto! ");
            } else if (Senha != senhaconfSenha) {
                System.out.println("Senha incorreta!");
            }

            sc.close();
        }
    }
}
