public class Klasse{
	int stufe;
	char klasse;
	
	// ab hier setter
	public void setNewKlasse(int pStufe, char pKlasse) {
		stufe = pStufe;
		klasse = pKlasse;
	}
	
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
	
	public String toString() {
		return ("" + stufe + klasse);
	}
}
