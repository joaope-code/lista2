import java.util.Scanner;

public class Exercicio12_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escreva o quanto você ganha por hora");
        double sala = scan.nextDouble();
        System.out.println("Quantas horas você trabalhou?");
        double hora = scan.nextDouble();
        double valueOne = hora * sala;
        double irOne = valueOne*0.05, irtwo =valueOne*0.10;



        if (valueOne<=900){
            System.out.println("Você está isento de imposto");
        }else if (valueOne<1500 ){
            System.out.println("O seu salário bruto vai ser de "+valueOne);
            System.out.println("Você pagará "+irOne+ " de imposto de renda");
            System.out.println("Você precisará pagar "+valueOne*0.10+" de INSS");
            System.out.println("Você receberá "+ valueOne*0.11+"FGTS");
            System.out.println("Você o total de descontos vai ser de "+(irOne+irtwo));
            System.out.println("O salário liquido vai ser de "+(valueOne - (irOne+irtwo)));

        }else if (valueOne<=2500){
            System.out.println("O valor bruto vai ser de "+valueOne);
            System.out.println("Você pagará "+irtwo+" de imposto renda");
            System.out.println("Você pagará "+irtwo+" de INSS");
            System.out.println("Você receberá "+valueOne*0.11);
            System.out.println("O total de descontos vai ser de " + (irtwo*2));
            System.out.println("O salário liquido vai ser de "+ (valueOne+valueOne*0.20));
        }else if (){

        }
    }
}
