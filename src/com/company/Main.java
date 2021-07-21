package com.company;

import java.util.Scanner;

class impostos {

    public static void main(String[] args) {
        Scanner Scan= new Scanner(System.in);
        System.out.println("Programa dedicado a calcular os descontos na folha de pagamento");
        System.out.println("Digite o quanto voce ganha por hora");
        double valor= Scan.nextDouble();
        System.out.println("Agora digite a quantidade de horas que voce trabalhou no mês");
        double hora= Scan.nextDouble();
        double sal= valor * hora;
        double inss= sal/100*10;
        double sind= sal/100*5;
        double fgts= sal/100*11;
        double saliq= sal-sind-inss;




        if (sal<900){

            System.out.println(" Voce está insento de imposto, sem descontos na folha de pagamento");

        }else if(sal<1500){
            double perce=5;
            double ir= sal/100 * perce;
            double desc= inss+ir+sind;

            System.out.println(" Seu salario bruto é de " +sal);
            System.out.println("Desconto no IR de" +ir);
            System.out.println("Desconto do inss de " +inss);
            System.out.println("Valor do fgts a ser pago pela empresa = " +fgts);
            System.out.println("Valor a ser pago pelo sindicato é de" +sind);
            System.out.println("Total de descontos" +desc);
            System.out.println("Seu salario liquido depois dos descontos é de" +saliq);

        }else if(sal<2500 && sal>1500){

            double perce=10;
            double ir= sal/100 * perce;
            double desc= inss+ir+sind;

            System.out.println(" Seu salario bruto é de =" +sal);
            System.out.println("Desconto no IR10 de " +ir);
            System.out.println("Desconto do inss de " +inss);
            System.out.println("Valor do fgts a ser pago pela empresa = " +fgts);
            System.out.println("Valor a ser pago pelo sindicato é de " +sind);
            System.out.println("Total de descontos" +desc);
            System.out.println("Seu salario liquido depois dos descontos é de " +saliq);

        }else{
            double perce=20;
            double ir= sal/100 * perce;
            double desc= inss+ir+sind;

            System.out.println(" Seu salario bruto é de =" +sal);
            System.out.println("Desconto no IR de =" +ir);
            System.out.println("Desconto do inss de =" +inss);
            System.out.println("Valor do fgts a ser pago pela empresa = " +fgts);
            System.out.println("Valor a ser pago pelo sindicato é de =" +sind);
            System.out.println("Total de descontos= " +desc);
            System.out.println("Seu salario liquido depois dos descontos é de " +saliq);

            System.out.println(" No respectivo mês voce ganhou " +valor+" reais por hora e trabalhou "+hora+ "horas");
        }

    }

}
