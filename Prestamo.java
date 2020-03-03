public class Prestamo{
	//Atributos
	private String fechaPrestamo;
	private String fechaDevolucion;
	
	//Relaciones
	private Copia copias[ ] = new Copia [10];
	private Socio socio;
	private Trabajador trabajadores [ ] = new Trabajador [10];
	private Sede sede;
	
	private int indiceCopia=0;
	private int indiceTrabajadores =0;

	public Prestamo (Sede sede, Copia copias, Trabajador trabajador, Socio socio){
		this.sede = sede;
		this.copias[indiceCopia++] = copias;
		this.trabajadores [indiceTrabajadores++] = trabajador;
		this.socio= socio;
	}
	public Prestamo(Sede sedes, Copia copias [ ], Trabajador trabajadores , Socio socio){
		this.sede = sede;
		this.copias=copias;
		this.trabajadores [indiceTrabajadores++] = trabajadores;
		this.socio= socio;
	}
	public Prestamo (Sede sede, Copia copia[ ], Trabajador trabajador[ ], Socio socio){
		this.sede = sede;
		this.copias=copias;
		this.trabajadores = trabajadores;
		this.socio= socio;
	}
	/*
	//Metodos
	public String getFechaPrestamo(){
		return fechaPrestamo;
	}
	public void setFechaPrestamo(String fechaPrestamo(){
		this.fechaPrestamo=fechaPrestamo;
	}
	public String getFechaDevolucion(){
		return fechaDevolucion;
	}
	public void setFechaDevolucio(String fechaDevolucion){
		this.fechaDevolucion=fechaDevolucion;
	}
	*/
}
