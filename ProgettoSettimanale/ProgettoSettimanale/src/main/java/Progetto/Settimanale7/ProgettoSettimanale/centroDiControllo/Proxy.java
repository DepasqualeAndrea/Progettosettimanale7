package Progetto.Settimanale7.ProgettoSettimanale.centroDiControllo;

import Progetto.Settimanale7.ProgettoSettimanale.sonde.Warn;

public class Proxy implements Warn {

	@Override
	public void allarmNotification(String id, double latitudine, double longitudine, int lvlSmoke) {
		System.out.println("http://host/alarm?idsonda=" + id + "&lat=" + latitudine + "&lon=" + longitudine
				+ "&smokelevel=" + lvlSmoke);
	}

}
