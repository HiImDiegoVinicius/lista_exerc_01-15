import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite quantos você ganha por hora: ");
        double valorH = input.nextDouble();
        System.out.println("Digite quantas horas você trabalha no mês: ");
        double horasT = input.nextDouble();
        input.close();
        double SalarioB = valorH * horasT;
        double inss = SalarioB * 8 / 100;
        double sindicato = SalarioB * 5 / 100;
        double SalarioL = SalarioB - inss - sindicato;
        System.out.printf("Salário Bruto : R$ %.2f%n",SalarioB);
        System.out.printf("Desconto no Inss : R$ %.2f%n", inss);
        System.out.printf("Mensalidade Sindicato : R$ %.2f%n ", sindicato);
        System.out.printf("Salário Liquido : R$ %.2f%n", SalarioL);
    }
}
