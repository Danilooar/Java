import javax.swing.*;
import java.util.Scanner;

import static javax.swing.JOptionPane.showConfirmDialog;

public class Iphoone {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);


        String camera;
        String browseInternet;
        String makeCall;

        System.out.println("Informações do Iphone" );
        System.out.println("camera: Zoom, Qualidade em alta resolução, Flash"  );
        System.out.println("browseInternet: exibirPagina, adicionarNovaAba, atualizarPagina" );
        System.out.println("makeCall: ligar, atender, ChamadanoVivaVoz" );

        sc.close();
    }
}
