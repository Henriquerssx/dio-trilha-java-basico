package org.example;

import java.math.BigDecimal;
import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos cadastrar sua conta no nosso banco ");
        String[] etiquetas = {"nome:", "número da conta: ", "agencia: ", "saldo:"};

        String[] dados = new String[etiquetas.length];
        System.out.println("Preencha o formulario: ");
        for (int i = 0; i < etiquetas.length; i++) {
            System.out.println(etiquetas[i]);
            dados[i] = sc.nextLine();
        }
        sc.close();
       contaBanco usuario1 = new contaBanco(
               dados[0],
              Integer.parseInt(dados[1]),
               dados[2],
               new BigDecimal(dados[3]));

        usuario1.Saudacao();

    }
}
