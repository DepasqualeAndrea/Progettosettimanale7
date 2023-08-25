package Progetto.Settimanale7.ProgettoSettimanale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Progetto.Settimanale7.ProgettoSettimanale.centroDiControllo.CentroDiControllo;
import Progetto.Settimanale7.ProgettoSettimanale.rilevatoriFumo.RilevatoreDiFumo;
import Progetto.Settimanale7.ProgettoSettimanale.rilevatoriFumo.RilevatoreFactory;

@SpringBootApplication
public class ProgettoSettimanaleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProgettoSettimanaleApplication.class, args);
		RilevatoreDiFumo sensore = new RilevatoreDiFumo("002", 41.9, 45.7);
		System.out.println(sensore);
		RilevatoreFactory rvf = new RilevatoreFactory();
		RilevatoreDiFumo rilevatore = rvf.creaRilevatore("001", 41.2, 45.2);
		System.out.println(rilevatore);

		CentroDiControllo control = new CentroDiControllo();
		rilevatore.addSonda(control);
		rilevatore.setLvlSmoke(9);
	}

}
