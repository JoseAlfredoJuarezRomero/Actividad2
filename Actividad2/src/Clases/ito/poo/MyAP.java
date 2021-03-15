package Clases.ito.poo;
import java.time.LocalDate;
public class MyAP {
	
	static void run() {
		System.out.println(new Expedientes("Angel","DIVE2155515",LocalDate.of(2001, 04,28),LocalDate.of(2021, 05,12),"gripa","tos","Ambroxol"));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run();	
	}
}


