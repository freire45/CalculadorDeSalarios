package br.com.erickfreire.calculadordesalarios;

/**
 * Programa em Java que calcula salario
 * @author Erick Freire
 * @version 1 - Criado em 08-04-2021 as 22:52
 */

public class CalculadorDeSalarios {
	private String nome;
	private double numeroDeHorasTrabalhadas;
	private double salarioHora;
	
	
	
	public CalculadorDeSalarios(String nome, double numeroDeHorasTrabalhadas, double salarioHora) {
		super();
		this.nome = nome;
		this.numeroDeHorasTrabalhadas = numeroDeHorasTrabalhadas;
		this.salarioHora = salarioHora;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNumeroDeHorasTrabalhadas() {
		return numeroDeHorasTrabalhadas;
	}
	public void setNumeroDeHorasTrabalhadas(double numeroDeHorasTrabalhadas) {
		this.numeroDeHorasTrabalhadas = numeroDeHorasTrabalhadas;
	}
	public double getSalarioHora() {
		return salarioHora;
	}
	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}
	
	public double salarioBruto() {
		double salariob;
		
		if(numeroDeHorasTrabalhadas == 40) {
			salariob = numeroDeHorasTrabalhadas * salarioHora;
		} else {
			salariob = (salarioHora * 40) + ((numeroDeHorasTrabalhadas - 40) * salarioHora);
		}
		
		return salariob;
	}
	

}
