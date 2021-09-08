public class Addresse{
	int plz;// Test hinzufuegen ob wirklihc nur 5 stellig
	String strasse;
	int hausnummer;// ggf. neuen Datentyp Hausnummer hinzufuegen, der hausnummer und Addresszusatz vereint
	char addresszusatz;
	
	public void Addresse() {
		
	}
	
	// ab hier setter
	public void setAddresse(int pPlz, String pStrasse, int pHausnummer, char pAddresszusatz) {
		if (pPlz<10000) {//Postleitzahlen sind niemals 6 stellig, sondern maximal fünfstellig
			plz = pPlz;
		}else {
			throw new RuntimeException("plz too long");
		}
		strasse = pStrasse;
		hausnummer = pHausnummer;
		addresszusatz = pAddresszusatz;
	}
	
	public void setAddresse(int pPlz, String pStrasse, int pHausnummer) {
		if (pPlz<10000) {//Postleitzahlen sind niemals 6 stellig, sondern maximal fünfstellig
			plz = pPlz;
		}else {
			throw new RuntimeException("plz too long");
		}
		strasse = pStrasse;
		hausnummer = pHausnummer;
	}
	
	public void setPlz(int pPlz) {
		if (pPlz<10000) {//Postleitzahlen sind niemals 6 stellig, sondern maximal fünfstellig
			plz = pPlz;
		}else {
			throw new RuntimeException("plz too long");
		}
	}
	
	public void setStrasse(String pStrasse) {
		strasse = pStrasse;
	}
	
	public void setHausnummer(int pHausnummer) {
		hausnummer = pHausnummer;
	}
	
	public void setAddresszusatz(char pAddresszusatz) {
		addresszusatz = pAddresszusatz;
	}
	
	// ab hier getter
	public int getPlz() {
		return plz;
	}
	
	public String getStrasse() {
		return strasse;
	}
	
	public int getHausnummer() {
		return hausnummer;
	}
	
	public char getAddresszusatz() {
		return addresszusatz;
	}
	
	public String toString() {
		if(addresszusatz == '\0') {
			return ("" + plz + " " + strasse + " " + hausnummer);
		}else {
			return ("" + plz + " " + strasse + " " + hausnummer + addresszusatz);
		}
	}
}
