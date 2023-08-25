package Progetto.Settimanale7.ProgettoSettimanale.sonde;

public class Sonda implements SondaInterface {

	@Override
	public void update(String id, double latitudine, double longitudine, int lvlSmoke) {
		allarmNotification(id, latitudine, longitudine, lvlSmoke);
	}

	@Override
	public void allarmNotification(String id, double latitudine, double longitudine, int lvlSmoke) {
		System.out.println("http://host/alarm?idsonda=" + id + "&lat=" + latitudine + "&lon=" + longitudine
				+ "&smokelevel=" + lvlSmoke);
	}
}
