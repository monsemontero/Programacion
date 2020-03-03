public class Libro{
	//Atributos
	private String titulo;
	private String autores;
	private String ISBN;
	private int numPaginas;
	
	//Relacion tipo asociacion
	private Copia copias [ ] = new Copia [10];
	private int indice = 0;
	
	
	public void agregarCopia(String identificador,String fechaRegistro,String punto){
		//Construir la copia
		Copia c = new Copia();
		c.setIdentificador(identificador);
		c.setFechaRegistro(fechaRegistro);
		c.setPunto(punto);
		copias[indice++] = c;
	}
		

	public Libro(){

	}

	//Metodos
	public String getTitulo(){
		return titulo;
	}
	public void setTitulo(String titulo){
		this.titulo=titulo;
	}
	public String getAutores(){
		return autores;
	}
	public void setAutores(String autores){
		this.autores=autores;
	}
	public String getISBN(){
		return ISBN;
	}
	public void setISBN(String ISBN){
		this.ISBN=ISBN;
	}
	public int getNumeroPaginas(){
		return numPaginas;
	}
	public void setNumeroPaginas(int numPaginas){
		this.numPaginas=numPaginas;
	}
}
