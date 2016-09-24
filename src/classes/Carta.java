package classes;

public class Carta {

	private Naipe naipe;
	private Face face;
	
	public Carta(Naipe naipe, Face face) {
		this.naipe = naipe;
		this.face = face;
	}
	
	public String retornarNomeNaipe() {
		// Encapsulando o comportamento do naipe
		return this.naipe.retornarNomeNaipe();
	}
	
	public int retornarValorFace() {
		// Encapsulando o comportamento do face
		return this.face.retornvarValorFace();
	}
	
	
	
}
