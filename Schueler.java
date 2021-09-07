public class Schueler{
	String vorName;
	String nachName;
	int alter;
	Addresse wohnort;
	Klasse klasse;

	public Schueler(String pVorName, String pNachName, int pAlter, Addresse pWohnort, Klasse pKlasse) {
		vorName = pVorName;
		nachName = pNachName;
		alter = pAlter;
		wohnort = pWohnort;
		klasse = pKlasse;
	}
	
	//ab hier setter 
	public void setVorName(String pVorName) {
		vorName = pVorName;
	}
	
	public void setNachname(String pNachName) {
		nachName = pNachName;
	}
	
	public void setPlz(int pPlz) {
		wohnort.setPlz(pPlz);
	}
	
	public void setStrasse(String pStrasse) {
		wohnort.setStrasse(pStrasse);;
	}
	
	public void setHausnummer(int pHausnummer) {
		wohnort.setHausnummer(pHausnummer);
	}
	
	public void setAddresszusatz(char pAddresszusatz) {
		wohnort.setAddresszusatz(pAddresszusatz);;
	}
	
	public void setStufe(int pStufe) {
		klasse.setStufe(pStufe);
	}
	
	public void setKlasse(char pKlasse) {
		klasse.setKlasse(pKlasse);
	}
	
	// ab hier getter
	public String getVorName() {
		return vorName;
	}
	
	public String getNachName() {
		return nachName;
	}
	
	public String getName() {
		return (vorName + " " + nachName);
	}
	
	public String getAddresse() {
		return wohnort.toString();
	}
	
	public int getPlz() {
		return wohnort.getPlz();
	}
	
	public int getHausNummer() {
		return wohnort.getHausnummer();
	}
	
	public char getAddresszusatz() {
		return wohnort.getAddresszusatz();
	}
	
	public int getStufe() {
		return klasse.getStufe();
	}
	
	public int getKlasse() {
		return klasse.getStufe();
	}
	
	public String toString() {
		return (klasse.toString() + " " + vorName + " " + nachName + " " + alter + " " + wohnort.toString());
	} 
}
