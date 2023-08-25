package Progetto.Settimanale7.ProgettoSettimanale.rilevatoriFumo;

public class RilevatoreFactory {
	public RilevatoreDiFumo creaRilevatore(String id, double longitudine, double latitudine) {
		return new RilevatoreDiFumo(id, longitudine, latitudine);
	}
}
