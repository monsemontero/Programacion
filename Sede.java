public class Sede{
	//Atributos
	private String direccionPostal;
	private String ciudad;
	private String telefono;
	private String RFC;
	
	//Relacion
	private Persona personas [ ] = new Persona[10];
	private Prestamo prestamos [ ] = new Prestamo[10];
	private Libro libros[ ] = new Libro [10];
	private int indice = 0;

	public void registrar (Persona persona){
		personas[indice++] = persona;		
	}
	public void prestar (Prestamo prestamo){
		prestamos [ indice++ ] = prestamo;
	}
	public void concretar(Libro libro){
		libros[indice++] = libro;
	}

	//Metodos
	public String getDireccionPostal(){
		return direccionPostal;
	}
	public void setDireccionPostal(String direccionPostal){
		this.direccionPostal = direccionPostal;
	}
	public String getCiudad(){
		return ciudad;
	}
	public void setCiudad(String ciudad){
		this.ciudad=ciudad;
	}
	public String getTelefono(){
		return telefono;
	}
	public void setTelefono(String telefono){
		this.telefono=telefono;
	}
	public String getRFC(){
		return RFC;
	}
	public void setRFC(String RFC){
		this.RFC=RFC;
	}
}