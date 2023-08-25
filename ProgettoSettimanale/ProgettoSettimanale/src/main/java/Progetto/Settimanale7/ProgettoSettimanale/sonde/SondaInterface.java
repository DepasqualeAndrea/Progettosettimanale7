package Progetto.Settimanale7.ProgettoSettimanale.sonde;

public interface SondaInterface {

	public void update(String id, double latitudine, double longitudine, int lvlSmoke);

	public void allarmNotification(String id, double latitudine, double longitudine, int lvlSmoke);
}
