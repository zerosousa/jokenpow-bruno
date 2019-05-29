package joguinho;

import java.util.Scanner;

import jogador.Computador;
import jogador.Jogador;

public class Main {
	
	public static void main(String[] args) {
		
		boolean decisao = true;
		int brunoGanha = 0;
		int comptGanha = 0;
		int jogadas = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Qual a quantidade de adversários?");
			int numeroAdversarios = sc.nextInt();
			String nomeAdversario = "Adversário ";
			
			System.out.println("Qual a quantidade de jogadores?");
			int numeroJogadores = sc.nextInt();
			String nomeJogador = "Jogador ";
			
			jogadas++;
			Jogador jogador = null;
			
			Computador[] computador = new Computador[numeroAdversarios];
			//System.out.println(numeroAdversarios);
			for (int i = 0; i < numeroAdversarios; i++) {
				int numeroDoJogador = i+1;
				//concatena cada "Adversário" com o número até chegar no que foi digitado. 
				//EX: 2 : Adversario1, Adversario 12
				//nomeAdversario = nomeAdversario.concat(Integer.toString(i+1));
				System.out.println(nomeAdversario + " " + numeroDoJogador);
				computador[i] = new Computador (nomeAdversario);
				//System.out.println(computador[i]);
			}
			
			Jogador[] jogadores = new Jogador[numeroAdversarios+1];
			
			for (int i = 0; i < numeroJogadores; i++) {
				int numeroDoJogador = i+1;
				//nomeJogador = nomeJogador.concat(Integer.toString(i+1));
				int jogada;
				System.out.println("Qual a jogada de Jogador? 1 - Pedra, 2 - Papel, 3 - Tesoura, 4 - Lagarto, 5 - Spock");
				jogada = sc.nextInt();
			//	jogadores[i] = computador[i];
				System.out.println(nomeJogador + numeroDoJogador + " escolheu " + jogada);
			
					
			switch(jogada) {
			case 1:
				jogador = new Jogador("Jogador", Escolha.PEDRA);
				break;
			case 2:
				jogador = new Jogador("Jogador", Escolha.PAPEL);
				break;
			case 3:
				jogador = new Jogador("Jogador", Escolha.TESOURA);
				break;
			case 4:
				jogador = new Jogador("Jogador", Escolha.LAGARTO);
				break;
			case 5:
				jogador = new Jogador("Jogador", Escolha.SPOCK);
				break;
			default:
				System.out.println("ERRO");	
			}
			}
			jogadores[numeroAdversarios] = jogador;
			
			Regras regras = new Regras();
			int[] contaEscolhas = regras.calculaEscolhas(jogadores);
	//		Escolha escolhaVencedora = regras.decidirVencedor(contaEscolhas);
			
	//		if (escolhaVencedora != null) {
	//			for (int i = 0; i < numeroAdversarios; i++) {
	//				if (jogadores[i].getEscolha() == escolhaVencedora) {
	//					System.out.println(jogadores[i].getNome() + "VENCEU!");
				//	}
			//	} 
		//	} else {
		//		System.out.println("DEU EMPATE!");
		//	}
				
		System.out.println("Jogar de novo? 1 - Sim, 2 - Não");
		int resposta = sc.nextInt();
		
			if (resposta == 2) {
				decisao = false;		
			} 	
			
		} while (decisao == true);
		sc.close();
				
		int vitorias = brunoGanha;
        int derrotas = comptGanha;
        int empates = jogadas - brunoGanha - comptGanha;
        double porcentVitorias = (vitorias + ((double) empates) / 2) / jogadas;
        
	    // Imprimir relatorio
	        System.out.printf("|  %6s  |  %6s  |  %6s  |  %12s  |  %14s  |\n",
	                "VITÓRIAS", "DERROTAS", "EMPATES", "JOGOS REALIZADOS", "PORCENTAGEM DE VITÓRIAS");
	 
	         System.out.printf("|  %6d  |  %6d  |  %6d  |  %12d  |  %13.2f%%  |\n",
	                vitorias, derrotas, empates, jogadas, porcentVitorias * 100);
	     
	    }
	  
	private static void imprimirGanhador(Jogador ganhador) {
		
		if (ganhador == null) {
			System.out.println("Empate!");
		} else {
			System.out.println("O ganhador é: " + ganhador.getNome());
		}
	}
}