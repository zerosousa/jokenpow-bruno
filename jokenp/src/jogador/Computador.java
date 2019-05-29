package jogador;

import java.util.Random;
import jogador.Jogador;
import joguinho.Escolha;
//import joguinho.Trapaca;

public class Computador extends Jogador {//implements Trapaca{

	
	public Computador(String nomeAdversario) {
		super();
		String nome = this.gerarNome();
		Escolha escolhaComputador = this.escolher();
		this.setNome(nome);
		this.setEscolha(escolhaComputador);
		
	}
	
	protected String gerarNome() {
		return "Computador";
	}

	protected Escolha escolher() {
		Random sorteio = new Random();
		int escolhaSorteio = 1 + sorteio.nextInt(5);
		System.out.println("Adversário = " + escolhaSorteio);
		 
		switch (escolhaSorteio) {
		case 1:
			return Escolha.PEDRA;
		case 2:
			return Escolha.PAPEL;
		case 3:
			return Escolha.TESOURA;
		case 4:
			return Escolha.LAGARTO;
		case 5:
			return Escolha.SPOCK;
		default:
			return null;
		}
	}
	
	
	@Override
	public String getNome() {
		return super.getNome();
	}
	
	//@Override
	//public void trocaEscolha(Escolha escolha) {
		//this.setEscolha(escolha);
	//}
	
}