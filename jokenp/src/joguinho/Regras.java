package joguinho;

import jogador.Jogador;

public class Regras {

	public Jogador calculaEscolhas(Jogador jogador, Jogador adversario) {
		Resultado resultado = null;
		switch (jogador.getEscolha()) {
		case PEDRA:
			resultado = this.pedraContra(adversario.getEscolha());
			break;
		case PAPEL:
			resultado = this.papelContra(adversario.getEscolha());
			break;
		case TESOURA:
			resultado = this.tesouraContra(adversario.getEscolha());
			break;
		case LAGARTO:
			resultado = this.lagartoContra(adversario.getEscolha());
			break;
		case SPOCK:
			resultado = this.spockContra(adversario.getEscolha());
		default:
			break;
		}
			if (resultado == Resultado.GANHOU) {
				return jogador;

			} else if (resultado == Resultado.PERDEU) {
				return adversario;
				
			} else if (resultado == Resultado.EMPATOU) {
				return null;
			}
		
		return null;
	}

	protected Resultado spockContra(Escolha escolha) {

		Resultado resultado = null;
		switch (escolha) {
		case PAPEL:
			resultado = Resultado.PERDEU;
			break;
		case PEDRA:
			resultado = Resultado.GANHOU;
			break;
		case LAGARTO:
			resultado = Resultado.PERDEU;
			break;
		case TESOURA:
			resultado = Resultado.GANHOU;
			break;
		case SPOCK:
			resultado = Resultado.EMPATOU;
			break;
		default:
			break;
		}
		return resultado;
	}

	protected Resultado lagartoContra(Escolha escolha) {
		

		Resultado resultado = null;
		switch (escolha) {
		case PEDRA:
			resultado = Resultado.PERDEU;
			break;
		case PAPEL:
			resultado = Resultado.GANHOU;
			break;
		case TESOURA:
			resultado = Resultado.PERDEU;
			break;
		case SPOCK:
			resultado = Resultado.GANHOU;
			break;
		case LAGARTO:
			resultado = Resultado.EMPATOU;
			break;
		default:
			break;
		}
		return resultado;
	}

	protected Resultado pedraContra(Escolha escolha) {

		Resultado resultado = null;
		switch (escolha) {
		case PEDRA:
			resultado = Resultado.EMPATOU;
			break;
		case PAPEL:
			resultado = Resultado.PERDEU;
			break;
		case TESOURA:
			resultado = Resultado.GANHOU;
			break;
		case SPOCK:
			resultado = Resultado.PERDEU;
			break;
		case LAGARTO:
			resultado = Resultado.GANHOU;
			break;
		default:
			break;
		}
		return resultado;
	}

	protected Resultado papelContra(Escolha escolha) {

		Resultado resultado = null;
		switch (escolha) {
		case PEDRA:
			resultado = Resultado.GANHOU;
			break;
		case PAPEL:
			resultado = Resultado.EMPATOU;
			break;
		case TESOURA:
			resultado = Resultado.PERDEU;
			break;
		case LAGARTO:
			resultado = Resultado.PERDEU;
			break;
		case SPOCK:
			resultado = Resultado.GANHOU;
			break;
		default:
			break;
		}
		return resultado;
	}

	protected Resultado tesouraContra(Escolha escolha) {

		Resultado resultado = null;
		switch (escolha) {
		case PEDRA:
			resultado = Resultado.PERDEU;
			break;
		case PAPEL:
			resultado = Resultado.GANHOU;
			break;
		case TESOURA:
			resultado = Resultado.EMPATOU;
			break;
		case SPOCK:
			resultado = Resultado.PERDEU;
			break;
		case LAGARTO:
			resultado = Resultado.GANHOU;
			break;
		default:
			break;
		}
		return resultado;
	}

	public int[] calculaEscolhas(Jogador[] jogadores) {
		// TODO Auto-generated method stub
		return null;
	}

	/*public int[] calculaEscolhas(Jogador[] jogadores) {
		int pedra = 0;
		int papel = 0;
		int tesoura = 0;
		int lagarto = 0;
		int spock = 0;
		
		for (int i = 0; i < jogadores.length; i++) {
			if (jogadores[i].getEscolha() == Escolha.PEDRA) {
				pedra++;
			} else if (jogadores[i].getEscolha() == Escolha.PAPEL) {
				papel++;
			} else if (jogadores[i].getEscolha() == Escolha.TESOURA) {
				tesoura++;
			} else if (jogadores[i].getEscolha() == Escolha.LAGARTO) {
				lagarto++;
			} else if (jogadores[i].getEscolha() == Escolha.SPOCK) {
				spock++;
			}
			switch (jogadores[i].getEscolha()) {
			case PEDRA:
				pedra =+ tesoura + lagarto;
				break;
			case PAPEL:
				papel =+ pedra + spock;
				break;
			case TESOURA:
				tesoura =+ papel + lagarto;
				break;
			case LAGARTO:
				lagarto =+ papel + spock;
				break;
			case SPOCK:
				spock =+ pedra + tesoura;
				break;
			default:
				break;
			}
		}
		
		
		return null;
	}*/
}