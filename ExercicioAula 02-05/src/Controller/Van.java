package Controller;

import java.util.Random;

import model.Veiculo;

public class Van extends Veiculo implements ControlaMovimentacaoVeiculo {
	
@Override
	public String toString() {
		return "Van [placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", cor=" + cor
				+ ", velocidadeMaxima=" + velocidadeMaxima + "]";
	}
public void inicioMovimentacao() {
	
	System.out.println("A Van Iniciou a movimentacao");
	
	}
	public void movimentaVeiculo() {
		Random random = new Random();
		int passageiros = random.nextInt(9)+3;
		int paradas = random.nextInt(9)+3;
		
		
		System.out.println("A van contem "+passageiros+" passageiros");
		System.out.println("A van vai parar "+paradas+" vezes");
		
	 }
}