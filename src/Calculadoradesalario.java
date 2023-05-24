import java.util.Scanner;
public class Calculadoradesalario {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
    System.out.print("Digite o valor da hora trabalhada: ");
    double ValorHora = entrada.nextDouble();
    System.out.print("Digite a quantidade de horas trabalhadas esse mês: ");
    int horastrabalhadas = entrada.nextInt();
    double salario = ValorHora* horastrabalhadas;
    System.out.println("Seu salario mensal é R$ : "+salario);
    entrada.close();

    }
}
