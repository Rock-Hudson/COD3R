package logica;

import java.util.*;
/***
 * Faça um algoritmo que:
a) Obtenha o valor para a variável HT (horas trabalhadas no mês);
b) Obtenha o valor para a variável VH (valor hora trabalhada):
c) Obtenha o valor para a variável PD (percentual de desconto);
d) Calcule o salário bruto => SB = HT * VH;
e) Calcule o total de desconto => TD = (PD/100)*SB;
f) Calcule o salário líquido => SL = SB – TD;
g) Apresente os valores de: Horas trabalhadas, Salário Bruto, Desconto, Salário
Liquido.
 */
public class Desafio4_CalculosSalario {
	
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("Insira quantas horas você trabalhou no mês: ");
	double horasTrabalhadas = input.nextDouble();
	
	System.out.println("Insira o valor da sua hora de trabalho: ");
	double valorHoraTrabalhada = input.nextDouble();
	
	System.out.println("Insira o percentual de desconto: ");
	double percentualDesconto = input.nextDouble();
	
	double salarioBruto = horasTrabalhadas * valorHoraTrabalhada;
	
	double totalDesconto = (percentualDesconto/100) * salarioBruto;
	
	double salarioLiquido = salarioBruto - totalDesconto;
	
	System.out.println("Calculo realizado com sucesso!!! \nTotal de Horas trabalhadas: " + horasTrabalhadas
			+ "\nSalario Bruto:" + salarioBruto
			+ "\nTotal desconto: " + totalDesconto
			+ "\nSalário Líquido: " + salarioLiquido);
		
		
	}
	
	
}
