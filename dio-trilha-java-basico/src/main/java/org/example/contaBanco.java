package org.example;

import java.math.BigDecimal;

public class contaBanco {
    String nome;
    int numeroConta;
    String agencia;
    BigDecimal saldo;

    public contaBanco(String nome, int numeroConta, String agencia, BigDecimal saldo) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
    }
    public void Saudacao() {
        System.out.println("Olá " + nome +
                " obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + " conta " + numeroConta +"\n" +"e seu saldo de R$" + saldo
                +" já está disponível para saque." );

    }

    @Override
    public String toString() {
        return "contaTerminal{" +
                "nome='" + nome + '\'' +
                ", numero=" + numeroConta +
                ", agencia='" + agencia + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
