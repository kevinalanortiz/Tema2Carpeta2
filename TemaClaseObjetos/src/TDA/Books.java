package TDA;

public class Books {
	
	private String Titulo;
	private Autor Autor;
	private int ISBN;
	private short NumPag;
	
	public Books () {}
	public Books (String Titulo,Autor Autor,int ISBN,short NumPag) {
		
		this.Titulo=Titulo;
		this.Autor=Autor;
		this.ISBN=ISBN;
		this.NumPag=NumPag;
	}
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public Autor getAutor() {
		return Autor;
	}
	public void setAutor(Autor autor) {
		Autor = autor;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public short getNumPag() {
		return NumPag;
	}
	public void setNumPag(short numPag) {
		NumPag = numPag;
	}
	
	public String toString() {
		return "Titulo: "+Titulo+"\nDel autor "+Autor+"\n con ISBN: "+ISBN+"\n Con "+NumPag+" Paginas"; 
	}
		
	
	}
	

