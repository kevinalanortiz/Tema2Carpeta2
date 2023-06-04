package TDA;

public class Circulo {

	private float radio;
	
	public Circulo() {}
	public Circulo(float radio) {
		
		this.radio=radio;
	}
	
	public float getRadio() {
		return radio;
	}
	
	public void setRadio(float radio) {
		this.radio = radio;
	}

	public float Perimetro() {
		
		return (float) (2*(Math.PI*radio));
	}

	public float Area() {
		float raiz;
		
		raiz=(float) Math.pow(radio,2);
		return (float) (Math.PI*raiz);
	}
}
