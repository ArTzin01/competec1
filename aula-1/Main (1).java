public class Main
{
	public static void main(String[] args) {
	    int minhaIdade = 15;
	    int idadeProf = 22;
	boolean souMaisNovoQueOProfessor = minhaIdade < idadeProf;
	System.out.println(souMaisNovoQueOProfessor);
	
	boolean estaChovendo = true;
	boolean estaRelampejando = true;
	boolean naoVouSairDeCasa = estaRelampejando && estaChovendo;
	
	System.out.println(naoVouSairDeCasa);
	
	    }
}