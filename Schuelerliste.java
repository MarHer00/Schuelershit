import java.util.Random;

public class Schuelerliste{
	Random zufall = new Random();
	List<Schueler> schuelerListe = new List<Schueler>();
	
	public void start() {
		fillListRandom();
		outputList();
	}
	
	public void fillListRandom(){
		for (int i = 0; i<10; i++) {
			schuelerListe.append();
		}
	}
	
	public void outputList(){
		schuelerListe.toFirst();
		while(schuelerListe.hasAccess()) {
			System.out.println(schuelerListe.getContent());
			schuelerListe.next();
		}
	}
	
}
