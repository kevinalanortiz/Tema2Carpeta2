package TestClasesObjetos;

import EntradasSalidas.Tools;
import TDA.Fecha;
import TDA.Persona;

public class TestPersona {
	public static void main(String[] args) {
	
		capturaObjetos();
	}
	public static void capturaObjetos() {
		
		String listado=" ";
		int res=0;
		byte contHom=0,contMuj=0,mayor=0;
		Persona aux=new Persona();
		
		do {
		Persona obj=new Persona();
		
		
		obj.setNomPers(Tools.leerString("Nombre"));
		obj.setEdadPers(Tools.LeerByte("Edad"));
		obj.setNacionPers(Tools.leerString("Nacionalidad"));
		obj.setTelPers(Tools.leerLong("Telefono"));
		obj.setGenePers(Tools.leerChar("Hombre o Mujer"));
		obj.setFechaPers(new Fecha(Tools.LeerByte("Dia"),Tools.LeerByte("Mes"),Tools.leershort("Año")));
		//Tools.Salida("Datos Capturados:"+obj.toString());
		listado+="Datos:\n"+obj.toString()+"\n";
		
		if (obj.getGenePers()=='H' || obj.getGenePers()=='h')
			contHom++;
		else
			if (obj.getGenePers()=='M' || obj.getGenePers()=='m')
				contMuj++;
		
		if (obj.getEdadPers()>mayor) {
			mayor=obj.getEdadPers();
			aux=obj;
		} 
		
		res= (int) Tools.seguirSino();
		}
		while (res!=1); 
		byte total=(byte) (contHom+contMuj);
		
		
		Tools.Salida("Lista de Personas:\n"+listado+"Hay "+contHom+" Hombres\n"+contMuj+" Mujeres"
		+"\nFrecuencia de hombres es: " +TestPersona.imprimeFrecuencia(contHom)+"\nla de mujeres es de: "
		+TestPersona.imprimeFrecuencia(contMuj)+"\nEl porcentaje de Hombres es de: "
		+((100*contHom)/total)+"%\nEl porcentaje de Mujeres es de: "+((100*contMuj)/total)+"%"
		+"\nLa persona con Mayor edad es: "+aux.toString());

		
		//Tools.Salida(listado+" el total es "+total+" de hombres "+contHom+" y de mujeres "+contMuj);
	}
	public static String imprimeFrecuencia (byte n) { 
		
		String cad="";
		for (int i=1;i<=n; i++ ) {
			
			cad+="*";
		}
		return cad;
	}
	
}
