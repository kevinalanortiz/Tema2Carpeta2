package TDA;

public class Persona {
 
	private String NomPers;
	private long TelPers;
	private byte EdadPers;
	private String NacionPers;
	private Fecha FechaPers;
	private char GenePers;

public Persona () {}

public Persona(String NomPers,long TelPers,byte EdadPers,String NacionPers,Fecha FechaPers,char GenePers) {

	this.NomPers=NomPers;
	this.TelPers=TelPers;
	this.EdadPers=EdadPers;
	this.NacionPers=NacionPers;
	this.FechaPers=FechaPers;
	this.GenePers=GenePers;
	}

public String getNomPers() {
	return NomPers;
}

public void setNomPers(String nomPers) {
	NomPers = nomPers;
}

public long getTelPers() {
	return TelPers;
}

public void setTelPers(long telPers) {
	TelPers = telPers;
}

public byte getEdadPers() {
	return EdadPers;
}

public void setEdadPers(byte edadPers) {
	EdadPers = edadPers;
}

public String getNacionPers() {
	return NacionPers;
}

public void setNacionPers(String nacionPers) {
	NacionPers = nacionPers;
}

public Fecha getFechaPers() {
	return FechaPers;
}

public void setFechaPers(Fecha fechaPers) {
	FechaPers = fechaPers;
}

public char getGenePers() {
	return GenePers;
}

public void setGenePers(char genePers) {
	GenePers = genePers;
}
//Generacion del metodo toString

public String toString() {
	return "Persona [Usted se llama: "+NomPers+". Su Numero es: "+TelPers+", con: "+EdadPers+" años"+" Nacionalidad:  "
+NacionPers+" Tu fecha es: "+FechaPers+" y usted es: "+GenePers+"]";
}
	
	
}





