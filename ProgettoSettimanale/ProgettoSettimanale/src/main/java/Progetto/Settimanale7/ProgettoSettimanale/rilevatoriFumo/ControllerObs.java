package Progetto.Settimanale7.ProgettoSettimanale.rilevatoriFumo;

import Progetto.Settimanale7.ProgettoSettimanale.sonde.SondaInterface;

public interface ControllerObs {

	public void sendAllarm();

	public void addSonda(SondaInterface sondaI);

}
