package Progetto.Settimanale7.ProgettoSettimanale.centroDiControllo;

public class CentroDiControllo implements AllarmNotificationProxy {

	private Proxy alert;

	public CentroDiControllo() {
		this.alert = new Proxy();
	}

	@Override
	public void update(String id, double latitudine, double longitudine, int lvlSmoke) {
		alert.allarmNotification(id, latitudine, longitudine, lvlSmoke);
	}
}
