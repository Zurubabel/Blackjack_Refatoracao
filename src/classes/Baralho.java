package classes;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Baralho {

	
	private List<Carta> cartasNoBaralho = new LinkedList<>();
	private List<Carta> cartasForaDoBaralho = new LinkedList<>();
	
	public Baralho() {
		for(int i = 1; i < 14; i++) {
			this.cartasNoBaralho.add(new Carta(Naipe.COPAS, Face.retornarNovaFace(i)));
			this.cartasNoBaralho.add(new Carta(Naipe.ESPADAS, Face.retornarNovaFace(i)));
			this.cartasNoBaralho.add(new Carta(Naipe.OUROS, Face.retornarNovaFace(i)));
			this.cartasNoBaralho.add(new Carta(Naipe.PAUS, Face.retornarNovaFace(i)));
		}
	}
	
	public Carta retornarCartaAleatoria() {
		Random r = new Random();
		// Depois faça a verificação se ainda tem cartas no baralho
		int index = r.nextInt(cartasNoBaralho.size());
		Carta retorno = cartasNoBaralho.get(index);
		cartasNoBaralho.remove(index);
		
		return retorno;
		
	}
	
	public void adicionarCartaForaDoBaralho(Carta carta) {
		this.cartasForaDoBaralho.add(carta);
	}
}
