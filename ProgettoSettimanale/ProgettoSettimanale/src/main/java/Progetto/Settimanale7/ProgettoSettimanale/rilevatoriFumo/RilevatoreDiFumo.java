package Progetto.Settimanale7.ProgettoSettimanale.rilevatoriFumo;

import java.util.Set;

import Progetto.Settimanale7.ProgettoSettimanale.sonde.SondaInterface;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RilevatoreDiFumo {
	private String id;
	private double latitudine;
	private double longitudine;
	private int lvlSmoke = 0;
	private Set<SondaInterface> sonde;

	public RilevatoreDiFumo(String id, double latitudine, double longitudine) {
		this.id = id;
		this.latitudine = latitudine;
		this.longitudine = longitudine;
	}

	@Override
	public String toString() {
		return "RilevatoreDiFumo [id=" + id + ", latitudine=" + latitudine + ", longitudine=" + longitudine + "]";
	}

	public void setLvlSmoke(int livello) {

		if (this.lvlSmoke > 5) {
			sendAllarm();
		}
	}

	public void sendAllarm() {
		for (SondaInterface k : sonde) {
			k.update(id, latitudine, longitudine, lvlSmoke);
		}
	}

	public void addSonda(SondaInterface sondaI) {
		sonde.add(sondaI);
	}

}
