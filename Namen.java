import java.util.Random;

public class Namen{
	Random zufall = new Random();
	String[] vornameF = {"Svenja", "Stefanie", "Leonie", "Teresa", "Johanna"};
	String[] vornameM = {"Felix", "Stefan", "Theodor", "Phillip", "Max"};
	String[] nachname = {"Mueller", "Mayer", "Schmitz", "Schulz", "Weber"};
	
	// wenn mit 1 gecallt gibt es einen weiblichen vornamen zuruek, mit 2 einen maennlichen
	public String newName(int gender) {
		if (gender == 1) {
			return vornameF[zufall.nextInt(vornameF.length)];
		}else if (gender == 2) {
			return vornameM[zufall.nextInt(vornameM.length)];
		}else {
			throw new RuntimeException("unknown Gender");
		}
	}
	
	public String newNachname() {
		return nachname[zufall.nextInt(nachname.length)];
	}
}