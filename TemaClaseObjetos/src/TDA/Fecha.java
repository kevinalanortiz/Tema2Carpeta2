package TDA;

public class Fecha {

	private byte dia;
	private byte mes;
	private short año;
	
	public Fecha () {}
	
	public Fecha (byte dia,byte mes,short año) {
		
		this.dia=dia;
		this.mes=mes;
		this.año=año;
	}

	public byte getDia() {
		return dia;
	}

	public void setDia(byte dia) {
		this.dia = dia;
	}

	public byte getMes() {
		return mes;
	}

	public void setMes(byte mes) {
		this.mes = mes;
	}

	public short getAño() {
		return año;
	}

	public void setAño(short año) {
		this.año = año;
	}
	
	public String toString () {
		return dia+" del "+mes+" del año: "+año;
	}
}
