public class Schueler{
	String vorName;
	String nachName;
	Addresse wohnort;
	Klasse klasse;
	
	public void Schueler(String pVorName, String pNachName, Addresse pWohnort) {
		vorName = pVorName;
		nachName = pNachName;
		wohnort = pWohnort;
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
	
	public void getKlasse() {
		return klasse.getStufe();
	}
	
	public String toString() {
		return (vorName + " " + nachName + ""\n + wohnort.toString());
	} 
}
