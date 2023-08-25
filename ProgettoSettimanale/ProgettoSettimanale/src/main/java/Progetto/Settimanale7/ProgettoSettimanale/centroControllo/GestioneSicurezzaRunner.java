package Progetto.Settimanale7.ProgettoSettimanale.centroControllo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import Progetto.Settimanale7.ProgettoSettimanale.rilevatoriFumo.RilevatoreDiFumo;
import Progetto.Settimanale7.ProgettoSettimanale.rilevatoriFumo.RilevatoreFactory;

@Component
public class GestioneSicurezzaRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		RilevatoreFactory rvf = new RilevatoreFactory();
		RilevatoreDiFumo rilevatore = rvf.creaRilevatore("001", 41.2, 45.2);
		System.out.println(rilevatore);
		
	 
		
		
		
	}
}
