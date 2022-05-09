package view;

import Controller.Automovel;
import Controller.Caminhao;
import Controller.ControlaMovimentacaoVeiculo;
import Controller.Motocicleta;
import Controller.Van;




public class Principal {
public static void main(String[] args) {
	ControlaMovimentacaoVeiculo cmv = new Automovel();
    Automovel automovel = new Automovel();
    
    automovel.setAno("2010");
    automovel.setCor("branco");
    automovel.setMarca("Ford");
    automovel.setModelo("KA");
    automovel.setPlaca("AFK-2356");
    automovel.setVelocidadeMaxima(200);
    System.out.println(automovel.toString());
	cmv.inicioMovimentacao();
	cmv.movimentaVeiculo();
	
	
	 System.out.println("--------------------------------------------------------------------------");
	ControlaMovimentacaoVeiculo cmv2 = new Caminhao();
    Caminhao caminhao = new Caminhao();
    caminhao.setCargaMaxima(3000);
    caminhao.setEixos(2);
    caminhao.setCor("Preto");
    caminhao.setMarca("Mercedes-benz");
    caminhao.setModelo("LP-321");
    caminhao.setPlaca("AFZ-4729");
    caminhao.setVelocidadeMaxima(200);
    System.out.println(caminhao.toString());
	cmv2.inicioMovimentacao();
	cmv2.movimentaVeiculo();
	
	
	System.out.println("--------------------------------------------------------------------------");
    Motocicleta motocicleta = new Motocicleta();
    ControlaMovimentacaoVeiculo cmv3 = new Motocicleta();
    motocicleta.setClindradas(1923);
    motocicleta.setCor("Laranja");
    motocicleta.setMarca("Harley Davidson");
    motocicleta.setModelo("Low rider S");
    motocicleta.setPlaca("ABZ-8003");
    motocicleta.setVelocidadeMaxima(200);
    System.out.println(motocicleta.toString());
	cmv3.inicioMovimentacao();
	cmv3.movimentaVeiculo();
	

	System.out.println("--------------------------------------------------------------------------");
	ControlaMovimentacaoVeiculo cmv4 = new Van(); 
	Van van = new Van();
    van.setCor("Azul");
	van.setMarca("Wolkswagen");
    van.setModelo("T6");
	van.setPlaca("RTY-9705");
	van.setVelocidadeMaxima(200);
	System.out.println(van.toString());
    cmv4.inicioMovimentacao();
	cmv4.movimentaVeiculo();  
}
}
