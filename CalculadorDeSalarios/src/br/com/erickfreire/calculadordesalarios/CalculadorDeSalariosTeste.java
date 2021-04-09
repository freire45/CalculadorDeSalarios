package br.com.erickfreire.calculadordesalarios;

import java.util.Scanner;

public class CalculadorDeSalariosTeste {
	public static void main(String[] args) {
		
		String nome = "";
		String nome2 = "";
		String nome3 = "";
		double numeroDeHorasTrabalhadas = 0.0;
		double salarioHora = 0.0;
		int contador = 1;
		
		CalculadorDeSalarios f1 = null;
		CalculadorDeSalarios f2 = null;
		CalculadorDeSalarios f3 = null;
		
	    Scanner entrada = new Scanner(System.in);
	    Scanner entrada2 = new Scanner(System.in);
	    Scanner entrada3 = new Scanner(System.in);
		
		System.out.println("Calculador De Salario");
		
		while(contador < 4) {
			
			if(contador == 1) {
				System.out.print("Informe o nome do funcionario: ");
				nome = entrada.nextLine();
			}
			
			if(contador == 2) {
				System.out.print("Informe o nome do funcionario: ");
				nome2 = entrada2.nextLine();
			}
			
			if(contador == 3) {
				System.out.print("Informe o nome do funcionario: ");
				nome3 = entrada3.nextLine();
			}
			
			
			System.out.print("Informe o número de horas trabalhadas na semana passada: ");
			numeroDeHorasTrabalhadas = entrada.nextDouble();
			
			System.out.print("informe o valor da hora de serviço: ");
			salarioHora = entrada.nextDouble();
			
			if(contador == 1)
		       f1 = new CalculadorDeSalarios(nome, numeroDeHorasTrabalhadas, salarioHora);
			
			if(contador == 2)
			       f2 = new CalculadorDeSalarios(nome2, numeroDeHorasTrabalhadas, salarioHora);
			
			if(contador == 3)
			       f3 = new CalculadorDeSalarios(nome3, numeroDeHorasTrabalhadas, salarioHora);
			
			contador++;
		}
		
		System.out.printf("%n%nFuncionario: %s%n"
				        + "Numero de Horas Trabalhadas: %.2f%n"
				        + "Valor Hora: %.2f%n"
				        + "Salario Bruto Semana Passada: %.2f", f1.getNome(), f1.getNumeroDeHorasTrabalhadas(), f1.getSalarioHora(), f1.salarioBruto());
		
		System.out.printf("%n%nFuncionario: %s%n"
		        + "Numero de Horas Trabalhadas: %.2f%n"
		        + "Valor Hora: %.2f%n"
		        + "Salario Bruto Semana Passada: %.2f", f2.getNome(), f2.getNumeroDeHorasTrabalhadas(), f2.getSalarioHora(), f2.salarioBruto());
		
		System.out.printf("%n%nFuncionario: %s%n"
		        + "Numero de Horas Trabalhadas: %.2f%n"
		        + "Valor Hora: %.2f%n"
		        + "Salario Bruto Semana Passada: %.2f", f3.getNome(), f3.getNumeroDeHorasTrabalhadas(), f3.getSalarioHora(), f3.salarioBruto());
	
		
	}

}
