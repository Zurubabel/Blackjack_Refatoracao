package classes;

public enum Face {
	AS(1),
	DOIS(2),
	TRES(3),
	QUATRO(4),
	CINCO(5),
	SEIS(6),
	SETE(7),
	OITO(8),
	NOVE(9),
	DEZ(10),
	VALETE(11),
	DAMA(12),
	REI(13);
	
	private final int valorFace;
	
	private Face(int valorFace) {
		this.valorFace = valorFace;
	}
	
	public static Face retornarNovaFace(int numero) {
		switch(numero) {
			case 1:
				return Face.AS;
			case 2:
				return Face.DOIS;
			case 3:
				return Face.TRES;
			case 4:
				return Face.QUATRO;
			case 5:
				return Face.CINCO;
			case 6:
				return Face.SEIS;
			case 7:
				return Face.SETE;
			case 8:
				return Face.OITO;
			case 9:
				return Face.NOVE;
			case 10:
				return Face.DEZ;
			case 11:
				return Face.VALETE;
			case 12:
				return Face.DAMA;
			case 13:
				return Face.REI;
			default:
				return Face.AS;
				
		}
	}
	
	public int retornvarValorFace() {
		return valorFace;
	}
} 
