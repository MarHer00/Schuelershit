import java.util.Random;

public class Schuelerliste{
	Random zufall = new Random();
	List<Integer> zahlenListe = new List<Integer>();
	
	public void start() {
		fillListRandom();
		outputList();
	}
	
	public void fillListRandom(){
		for (int i = 0; i<10; i++)
		zahlenListe.append(zufall.nextInt(200));
	}
	
	public void outputList(){
		zahlenListe.toFirst();
		while(zahlenListe.hasAccess()) {
			System.out.println(zahlenListe.getContent());
			zahlenListe.next();
		}
	}
	
}
