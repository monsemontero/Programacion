public class BibliotecaApp{
	public static void main(String args[]){
		Persona p1 = new Persona();
		p1.setNombre("Bart");
		p1.setFechaNacimiento("20/08/1990");
		p1.setEmail("bart@uv.mx");
		p1.setEnfermedades("Ninguna");

		Socio s1 = new Socio();
		s1.setNombre("Socio1");
		s1.setFechaNacimiento("2/10/1995");
		s1.setEmail("ppppt@uv.mx");
		s1.setEnfermedades("Ninguna");
		s1.setMatricula("s1605884");
		
		Trabajador t1 = new Trabajador();
		t1.setNombre("Monse");
		t1.setFechaNacimiento("12/01/1994");
		t1.setEmail("monse@uv.mx");
		t1.setEnfermedades("Ninguna");
		t1.setNumeroPersonal(59456);
		
		Sede z1 =new Sede();
		z1.setDireccionPostal("av.Xalapa s/n col. centro");
		z1.setCiudad("Xalapa");
		z1.setTelefono("8-42-17-00");
		z1.setRFC("UV-XA");
				
		//Arreglo de tipo de persona
		Persona personas [  ] = new Persona[3];
		personas[0] =p1;
		personas[1] =s1;
		personas[2] =t1; //libro
		
		//personas ptmp = personas[2];
		
		Libro libro1 = new Libro();
		libro1.setTitulo("Estructura de Datos");
		libro1.setAutores("Luis Joyanes");
		libro1.setNumeroPaginas(270);
		libro1.setISBN("1392-4456");

		libro1.agregarCopia("A136-645","21/05/2012","Rojo");
		libro1.agregarCopia("A136-564","5/02/2001","Azul");


		
		System.out.println("\nDatos del libro:");
		System.out.println("Titulo del libro:");
		System.out.println(libro1.getTitulo());
		System.out.println("Autor del libro:");
		System.out.println(libro1.getAutores());

		libro1 = null; //Ref libro1 es nula
	

		//System.out.println(copia2.getLibro().getTitulo());

		/*
		System.out.println("\nID copia:");
		System.out.println(copia1.getIdentificador());
		System.out.println("Fecha de registro:");
		System.out.println(copia1.getFechaRegistro());
		System.out.println("Color del Punto:");
		System.out.println(copia1.getPunto());
		
		
		System.out.println("\nNombre del trabajador:");
		System.out.println(t1.getNombre());
		System.out.println("Fecha de nacimiento del trabajador:");
		System.out.println(t1.getFechaNacimiento());
		System.out.println("email:");
		System.out.println(t1.getEmail());
		System.out.println("Enfermedades:");
		System.out.println(t1.getEnfermedades());
		System.out.println("Numero de personal:");
		System.out.println(t1.getNumeroPersonal());
		
		System.out.println("\nNombre del Socio:");
		System.out.println(s1.getNombre());
		System.out.println("Fecha de nacimiento del trabajador:");
		System.out.println(s1.getFechaNacimiento());
		System.out.println("email:");
		System.out.println(s1.getEmail());
		System.out.println("Enfermedades:");
		System.out.println(s1.getEnfermedades());
		System.out.println("Matricula:");
		System.out.println(s1.getMatricula());
		
		System.out.println("\nSEDE");
		System.out.println("Direccion:");
		System.out.println(z1.getDireccionPostal());
		System.out.println("Ciudad:");
		System.out.println(z1.getCiudad());
		System.out.println("Telefono:");
		System.out.println(z1.getTelefono());
		System.out.println("RFC:");
		System.out.println(z1.getRFC());
		*/		
	}
}