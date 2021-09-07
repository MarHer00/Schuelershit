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
			Addresse wohnort = new Addresse();
			wohnort.setAddresse(53721, "Loewenburgstr", 10);
			Klasse myKlasse = new Klasse();
			myKlasse.setNewKlasse(5, 'a');
			schuelerListe.append(new Schueler(Namen.newName(zufall.nextInt(2)+1), Namen.newNachname(), zufall.nextInt(2)+11,  wohnort, myKlasse));// String, String, Int, Addresse, Klasse
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
