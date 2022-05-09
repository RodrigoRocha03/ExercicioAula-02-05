package Controller;

import java.util.Random;

import model.Veiculo;

public class Motocicleta extends Veiculo implements ControlaMovimentacaoVeiculo {
	int Clindradas;
	
	

@Override
	public String toString() {
		return "Motocicleta [Clindradas=" + Clindradas + ", placa=" + placa + ", marca=" + marca + ", modelo=" + modelo
				+ ", cor=" + cor + ", velocidadeMaxima=" + velocidadeMaxima + "]";
	}
public int getClindradas() {
		return Clindradas;
	}
	public void setClindradas(int clindradas) {
		Clindradas = clindradas;
	}
public void inicioMovimentacao() {
	
	System.out.println("A Motocicleta Iniciou a movimentacao");
	}
	public void movimentaVeiculo() {
		Random random = new Random();
		
		int deslocamento = random.nextInt(80)+20;
		int frete = random.nextInt(50)+30;
		
		
		System.out.println("A motocicleta percorrera "+deslocamento+" KM");
		System.out.println("O valor do frete para a motocicleta custara R$"+frete);
	 }
}
