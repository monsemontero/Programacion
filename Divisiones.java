	public void imprimirDivisiones(int x){
		for(int i=5; i>= -5;i--){
			try{
				int res=(x/i);
				System.out.println("El resultado es:", res);
			}catch (AritmeticException e){
				System.out.println("Error, no se puede dividir entre 0");
			}
		}
	}