package projetoCRUDbasico.atividade;

import javax.swing.*;
import java.util.Scanner;

public class Primeira {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x = 0;
        int sum = 0;

        for(; ;) {

            System.out.print("Informe um número: ");
            x = ler.nextInt();


             if (x == 0) {
                  System.out.println("Soma: " + sum);
                  break;
            } else if (x != 0) {
                sum = sum + x;
             }
        }
    }
}
