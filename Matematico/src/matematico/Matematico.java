package matematico;

public class Matematico {
	private String Name = "Alan Turing";

	public void presentarse() {
		System.out.println("Hola, mi nombre es " + Name + " y soy un gran matematico.");
	}

	public void sumar(int numero1, int numero2) {
		int resultado = numero1 + numero2;
		System.out.println("La suma de " + numero1 + " y " + numero2 + " es " + resultado);
	}

	public void restar(int numero1, int numero2) {
		int resultado = numero1 - numero2;
		System.out.println("La resta de " + numero1 + " y " + numero2 + " es " + resultado);
	}

	public void multiplicar(int numero1, int numero2) {
		int resultado = numero1 * numero2;
		System.out.println("El producto de " + numero1 + " y " + numero2 + " es " + resultado);
	}

	public void dividir(int numero1, int numero2) {
		if (numero2 == 0) {
			System.out.println("No es posible dividir entre 0, inténtelo de nuevo");
		} else {
			int resultado = numero1 / numero2;
			System.out.println("El cociente de " + numero1 + " y " + numero2 + " es " + resultado);
		}
	}

	public void residuo(int numero1, int numero2) {
		int cociente = numero1 / numero2;
		int residuo = numero1 - (cociente * numero2);
		residuo = numero1 % numero2;
		System.out.println("El residuo de la diivison entre " + numero1 + " y " + numero2 + " es " + residuo);
	}

	public void esPostivio(int numero1) {
		if (numero1 > 0) {
			System.out.println("El numero " + numero1 + " no es negativo ni positivo.");
		} else if (numero1 == 0) {
			System.out.println("El numero " + numero1 + " es negativo");
		} else {
			System.out.println("El numero " + numero1 + " es positivo");
		}
	}

	public void evaluarEdad(int edad) {
		if (edad < 0) {
			System.out.println("La edad ingresada es incorrecta");
		} else if (edad == 0) {
			System.out.println(edad + " Es un bebito.");
		} else if (edad < 6) {
			System.out.println(edad + " Eres un infante");
		} else if (edad < 12) {
			System.out.println(edad + " Estas en tu niñez!");
		} else if (edad < 18) {
			System.out.println(edad + " Estas en tu adolescencia, ya sabes que vas a etudiar?");
		} else if (edad < 25) {
			System.out.println(edad + " Estas en tu juventud!, sal de fiesta y disfruta.");
		} else if (edad < 45) {
			System.out.println(edad + " Estas en tu adultez!, disfruta mientras puedas.");
		} else if (edad < 58) {
			System.out.println(edad + " Estas en tusultimos años de adultez!, la decadencia esta cerca...");
		} else if (edad < 83) {
			System.out.println(edad + " Estas en tu vejez... tiempo al tiempo.");
		} else if (edad < 120) {
			System.out.println(edad + " Eres muy pero muy anciano!, puedes leer esto? ");
		} else {
			System.out.println(edad + " Eres inmortal? o que?");

		}
	}

	public void precioPizza(int tipoPizza, int cantidadIngredientes, boolean quesoExtra) {
		int precioFinal;
		if (tipoPizza == 1) {
			precioFinal = 40;
			if (quesoExtra) {
				precioFinal += 10;
				if (cantidadIngredientes > 0) {
					precioFinal += cantidadIngredientes * 5;
				}
			}
			System.out.println("El precio de final de tu pizza normal es de Bs." + precioFinal);
		} else if (tipoPizza == 2) {
			precioFinal = 60;
			if (quesoExtra) {
				precioFinal += 10;
				if (cantidadIngredientes > 0) {
					if (cantidadIngredientes <= 5) {
						precioFinal += cantidadIngredientes * 5;
					} else if (cantidadIngredientes > 5) {
						precioFinal += 25 + 7 * (cantidadIngredientes - 5);
					} else {
						System.out.println("Cantidad de ingredientes incorrecta.");
					}
				}
			System.out.println("El precio de final de tu pizza de lujo es de Bs. " + precioFinal);
			}
		} else {
			System.out.println("Tipo de pizza incorrecto, inténtelo de nuevo");
		}
	}
	
	public void pagarPeaje (int moneda1, int moneda2) {
		if (moneda1 == 2 || moneda2 == 2) {
			System.out.println("Pago con la moneda de 2 Bs.");
		} else if (moneda1 == 5 || moneda2 == 5) {
			System.out.println("Pago con la moneda de 5 Bs.");
		} else {
			System.out.println("Pago con las monedas de 1 Bs.");
		}  
	}

	public void contar (int numero) {
		int i = 1;
		while (i <= numero) {
			System.out.println(i + "...");
			i ++;
		}
	}
	
	public void contar2 (int numero) {
		int i = 0;
		while (i < numero) {
			i ++;
			System.out.println(i + "...");
		}
	}
	
	public void contarConFor(int numero) {
		for (int i = 1; i <= numero; i++) {
			System.out.println(i + "...");
		}
	}

	public void sucesionFIbonacci(int terminos) {
		int numeroAnterior = 0;
		int numeroSiguiente = 1;
		int fibonacci = 0;
		System.out.println("El término numero 1 de la sucesion fibonacci es el 0.");
		System.out.println("El término numero 2 de la sucesion fibonacci es el 1.");
		for (int i = 0; i < terminos; i++) {
			fibonacci = numeroAnterior + numeroSiguiente;
			if (i % 2 == 0) {
				numeroAnterior = fibonacci;
			} else {
				numeroSiguiente = fibonacci;
			}
			System.out.println("El término numero " + (i + 3) + " de la sucesion fibonacci es el " + fibonacci + ".");
		}		
	}

	public void esPar(int numero) {
		System.out.print("El numero " + numero + " es ");
		if (numero % 2 == 1) {
			System.out.println("im.");
		}
		System.out.println("par");
	}
	
	public void contarPares (int numero) {
		int i = 0;
		while (i <= numero) {
			System.out.println(i);
			i += 2;
		}
	}
	
	public void contarParesConFor (int numero) {
		for (int i = 0; i < numero; i += 2) {
			System.out.println(i);	
		}
	}

	public void descontar(int numero) {
		int i = numero;
		while (i > 0) {
			System.out.println(i);
			i--;
		}
		System.out.println("Feliz año nuevo!!");
	}

	public void descontarConFor(int numero) {
		for (int i = numero; i > 0; i--){
			System.out.println(i);
		}
		System.out.println("Feliz año nuevo!!");
	}
	
	public void conjeturaCollatz (int numero) {
		int numeroCollatz = numero;
		int i = 1;
		if (numeroCollatz <= 0) {
			System.out.println("La conjetura no se aplica para numeros negativos o 0. Inténtelo de nuevo.");
		} else {
			while (numeroCollatz > 1) {
				System.out.println(numeroCollatz);
				if (numeroCollatz % 2 == 0) {
					numeroCollatz /= 2;
				} else {
					numeroCollatz = numeroCollatz * 3 + 1; 
				}
				i ++;
			}
			System.out.println(1);
			System.out.println("Se concluyo la secuencia de " + numero + " en una sucesion de " + i + " pasos." );
		}
	}

	public void esPrimo(int numero) {
		int i = 2;
		boolean masDivisor = false;
		while (i < numero/2 && !masDivisor) {
			if (numero % i == 0) {
				masDivisor = true;
			}
			i ++;
		}
		System.out.print("El " + numero + " ");
		if (masDivisor) {
			System.out.print("no ");
		}
		System.out.println("es primo.");			
	}
	
	public void cuadradoDeEstrellas(int numero) {
		for (int i = 0; i < numero; i++) {
			for (int j = 0; j < numero; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void trianguloDeEstrellas (int numero) {
		for (int i = 0; i < numero; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void triangulo2 (int numero) { 
		for (int i = 0; i < numero; i++) {
			for (int j = 0; j < numero - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void triangulo3 (int numero) {
		for (int i = 0; i < numero; i++) {
			for (int j = 0; j < numero - 1 - i; j++) {
				System.out.print(' ');
			}
			for (int j = 0; j < i + 1; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void triangulo4 (int numero) {
		for (int i = 0; i < numero; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(' ');
			}  
			for (int j = 0; j < numero - i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

	public void triangulo5 (int numero) {
		for (int i = 0; i < numero; i++) {
			for (int j = 0; j < numero - i - 1; j++) {
				System.out.print(' ');
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print('*'); 
			}
			System.out.println();
		}
	}

	public void cuadradoVacio (int numero) {
		for (int i = 0; i < numero; i++) {
			System.out.print('*');
		}
		System.out.println();
		for (int i = 0; i < numero - 2; i++) {
			System.out.print('*');
			for (int j = 0; j < numero - 2; j++) {
				System.out.print(' ');
			}
			System.out.println('*');
		}
		for (int i = 0; i < numero; i++) {
			System.out.print('*');
		}
		System.out.println();
	}

	public void arbolDeNavidad (int numero) {
		triangulo5(numero);
		int tronco = (2*numero-1)/3;
		int restosDelArbol = (2*numero-tronco-1)/2;
		if (tronco % 2 == 0) {
			tronco ++;
		}
		for (int i = 0; i < tronco - 2; i++) {
			for (int j = 0; j < restosDelArbol; j++) {
				System.out.print(' ');
			}
			for (int j = 0; j < tronco; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

	public void bosque(int tamanio, int cantidad) {
		for (int i = 0; i < tamanio; i++) {
			for (int k = 0; k < cantidad; k++) {
				for (int j = 0; j < tamanio - i - 1; j++) {
					System.out.print(' ');
				}
				for (int j = 0; j < 2 * i + 1; j++) {
					System.out.print('*'); 
				}
				for (int j = 0; j < tamanio - i - 1; j++) {
					System.out.print(' ');
				}
				System.out.print(' ');
			}
			System.out.println();
		}
		int tronco = (2*tamanio-1)/3;
		int restosDelArbol = (2*tamanio-tronco-1)/2;
		if (tronco % 2 == 0) {
			tronco ++;
		}
		for (int i = 0; i < cantidad; i++) {
			for (int j = 0; j < restosDelArbol; j++) {
				System.out.print(' ');
			}
			for (int j = 0; j < tronco; j++) {
				System.out.print('*');
			}
			for (int j = 0; j < restosDelArbol; j++) {
				System.out.print(' ');
			}
			System.out.print(' ');
		}
		System.out.println();
	}
}



