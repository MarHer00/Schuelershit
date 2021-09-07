public class Klasse{
	int stufe;
	char klasse;
	
	public void Klasse(int pStufe, char pKlasse) {
		this.stufe = pStufe;
		this.klasse = pKlasse;
	}
	
	// ab hier setter
	public void setStufe(int pStufe) {
		stufe = pStufe;
	}
	
	public void setKlasse(char pKlasse) {
		klasse = pKlasse;
	}
	
	// ab hier getter
	public int getStufe() {
		return stufe;
	}
	
	public char getKlasse() {
		return klasse;
	}
}