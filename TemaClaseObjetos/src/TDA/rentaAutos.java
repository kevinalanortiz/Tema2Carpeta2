package TDA;

public class rentaAutos {

	private byte Dias;
	private double KM;
	private char Tipo;
	
	public rentaAutos() {}
	public rentaAutos(double KM,char Tipo, byte Dias) {
		
		this.Dias=Dias;
		this.KM=KM;
		this.Tipo=Tipo;
	}
	public int getDias() {
		return Dias;
	}
	public void setDias(byte dias) {
		Dias = dias;
	}
	public double getKM() {
		return KM;
	}
	public void setKM(double  kM) {
		KM = kM;
	}
	public char getTipo() {
		return Tipo;
	}
	public void setTipo(char tipo) {
		Tipo = tipo;
	}
	
public double detTarifa () {
		double detTarifa=0;
		
		switch (Tipo) {
		case 'P':
		case 'p':
			detTarifa=200;
			break;
		case 'M':
		case 'm':
			detTarifa=350;
			break;
		case 'G':
		case 'g':
			detTarifa=450;
			break;
			default: return 0; 
		}
		
		return detTarifa;
	}

public double CalCosto () { 
	double Costo=0;
	
	
	switch (Tipo) {
	case 'P':
	case 'p':
		Costo=20*KM;
		break;
	case 'M':
	case 'm':
		Costo=30*KM;
		break;
	case 'G':
	case 'g':
		Costo=40*KM;
		break;
		default: Costo=0;
	}
	return Costo;
}

public double CalMonto () {
	double Monto=(detTarifa()*Dias)+CalCosto();
 double Extra=0;
 
 if (KM>10) {

	 Extra=Monto*2.5;
	 Monto+=Extra;
 }
	return Monto;
}

}






