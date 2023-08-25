package Progetto.Settimanale7.ProgettoSettimanale.centroDiControllo;

import Progetto.Settimanale7.ProgettoSettimanale.sonde.SondaInterface;

public class Proxy implements SondaInterface {

	@Override
	public void allarmNotification(String id, double latitudine, double longitudine, int lvlSmoke) {
		System.out.println("http://host/alarm?idsonda=" + id + "&lat=" + latitudine + "&lon=" + longitudine
				+ "&smokelevel=" + lvlSmoke);
	}

}
