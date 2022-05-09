package Controller;

import java.util.Random;

import model.Veiculo;

public class Automovel extends Veiculo implements ControlaMovimentacaoVeiculo {
	
	Random random = new Random();
	int portas = random.nextInt(2)+3;
	String ano;
	

	public int getPortas() {
		return portas;
	}
	
     //@Override
	/* public String toString() {
		//return "Automovel [portas=" + portas + ", ano=" + ano + ", " + toString();
    	 return "Automovel [portas=" + portas + ", ano=" + ano + ", "placa=" + placa + \", marca=\" + marca + \", modelo=\" + modelo + \", cor=\" + cor\r\n"
    	 		+ "			//+ \", velocidadeMaxima=\" + velocidadeMaxima + \"]";
	}*/
    
     @Override
	public String toString() {
		return "Automovel [portas=" + portas + ", ano=" + ano + ", placa=" + placa + ", marca=" + marca + ", modelo="
				+ modelo + ", cor=" + cor + ", velocidadeMaxima=" + velocidadeMaxima + "]";
	}
    
	public void setPortas(int portas) {
		this.portas = portas;
	}
	

	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public void inicioMovimentacao() {
		
		System.out.println("O automovel Iniciou a movimentacao");
		 
		
	}
	
	public void movimentaVeiculo() {
		Random random = new Random();
		int tempo100Km = random.nextInt(10)+20;
		int deslocamento = random.nextInt(600)+50;
		int passageiros = random.nextInt(3)+1;
		
		System.out.println("O tempo que automovel levara para atingir 100km sera "+tempo100Km+" segundos");
		System.out.println("O automovel percorrera "+deslocamento+" KM");
		System.out.println("O automovel contem "+passageiros+" passageiros");
	 }
	
}
