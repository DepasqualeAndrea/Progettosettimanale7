package Progetto.Settimanale7.ProgettoSettimanale.rilevatoriFumo;

import java.util.ArrayList;

import Progetto.Settimanale7.ProgettoSettimanale.centroDiControllo.AllarmNotificationProxy;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RilevatoreDiFumo {
	private String id;
	private double latitudine;
	private double longitudine;
	private int lvlSmoke;
	private ArrayList<AllarmNotificationProxy> sonde;

	public RilevatoreDiFumo(String id, double latitudine, double longitudine) {
		this.id = id;
		this.latitudine = latitudine;
		this.longitudine = longitudine;
		this.sonde = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "RilevatoreDiFumo [id=" + id + ", latitudine=" + latitudine + ", longitudine=" + longitudine + "]";
	}

	public void setLvlSmoke(int livello) {
		this.lvlSmoke = livello;
		if (livello > 5) {
			sendAllarm();
		}
	}

	public void sendAllarm() {
		for (AllarmNotificationProxy k : sonde) {
			k.update(id, latitudine, longitudine, lvlSmoke);
		}
	}

	public void addControll(AllarmNotificationProxy sondaI) {
		sonde.add(sondaI);
	}

}
