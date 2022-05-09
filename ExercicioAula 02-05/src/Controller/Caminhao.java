package Controller;

import java.util.Random;

import model.Veiculo;

public class Caminhao extends Veiculo implements ControlaMovimentacaoVeiculo {
	int eixos;
	int cargaMaxima;
	
	


@Override
	public String toString() {
		return "Caminhao [eixos=" + eixos + ", cargaMaxima=" + cargaMaxima + ", placa=" + placa + ", marca=" + marca
				+ ", modelo=" + modelo + ", cor=" + cor + ", velocidadeMaxima=" + velocidadeMaxima + "]";
	}
public int getEixos() {
		return eixos;
	}
	public void setEixos(int eixos) {
		this.eixos = eixos;
	}
	public int getCargaMaxima() {
		return cargaMaxima;
	}
	public void setCargaMaxima(int cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}
public void inicioMovimentacao() {
	
	System.out.println("O caminhao Iniciou a movimentacao");

	}
	public void movimentaVeiculo() {
		Random random = new Random();
		int carga = random.nextInt(2000)+1000;
		int deslocamento = random.nextInt(2500)+500;
		int frete = random.nextInt(3000)+2000;
		
		System.out.println("A carga do caminhao pesa "+carga+" kg");
		System.out.println("O caminhao percorrera "+deslocamento+" KM");
		System.out.println("O valor do frete para o caminhao custara R$"+frete);
	 }
}