package TestClasesObjetos;

import EntradasSalidas.Tools;
import TDA.rentaAutos;

public class TestRentaAutos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CapturaDatos();
	}
public static void CapturaDatos () {
	
	String List="Renta del Auto\n";
	byte res=0;
	
	rentaAutos auto=new rentaAutos();
	do {
	auto.setTipo(Tools.leerChar("Inserte el tipo de auto el cual puede ser:\n [P]equeño\n [M]ediano\n [G]rande"));
	auto.setDias(Tools.LeerByte("Ingrese los dias los cuales rentara el auto"));
	auto.setKM(Tools.leerdouble("Ingrese la distancia que recorrio(KM):"));
	List+="\nSu tipo de auto es: "+auto.getTipo()+"\n"+"Los dias alquilados fueron: "+auto.getDias()+" dias\n"+
	"Su distancia recorrdia fue de: "+auto.getKM()+" KM\n"+"Su tarifa fue de: "+auto.detTarifa()+"$\n"+
	"El costo a pagar por la renta es de: "+auto.CalCosto()+"$\n"+
	"Usted pagara en total: "+auto.CalMonto()+"$\n";
	res= (byte) Tools.seguirSino();
	}
	while (res!=1);
	Tools.Salida("Lista de Datos\n"+List);
}
}
