public class Addresse{
	int plz;// Test hinzufuegen ob wirklihc nur 5 stellig
	String strasse;
	int hausnummer;// ggf. neuen Datentyp Hausnummer hinzufuegen, der hausnummer und Addresszusatz vereint
	char addresszusatz = -1;
	
	public void Addresse(int pPlz, String pStrasse, int pHausnummer, char pAddresszusatz) {
		plz = pPlz;
		strasse = pStrasse;
		hausnummer = pHausnummer;
		addresszusatz = pAddresszusatz;
	}
	
	public void Addresse(int pPlz, String pStrasse, int pHausnummer) {
		plz = pPlz;
		strasse = pStrasse;
		hausnummer = pHausnummer;
	}
	
	// ab hier setter
	public void setPlz(int pPlz) {
		plz = pPlz;
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
		if(addresszusatz == -1) {
			return ("" + plz\n + strasse + " " + hausnummer);

		}else {
			return ("" + plz \n + strasse + " " + hausnummer + addresszusatz);
		}
	}
}
