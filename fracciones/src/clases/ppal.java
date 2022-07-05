package clases;

public class ppal {
	public static void main(String[] args) {
		Fraccion f=new Fraccion(1,2);
		
		System.out.println("El valor decimal de la fraccion es "+ f.valorDecimal());
		
		Fraccion f2=new Fraccion(2,3);
		Fraccion f3=new Fraccion(4,5);
		
		//MULTIPLICAR
		Fraccion mult=f2.multiplicar(f3);
		System.out.println("La multiplicacion es: "+ mult);		
		
		System.out.println(f2+" multiplicado por 4 es "+f2.multiplicar(4));	
		
		//COMPARACION
		Fraccion f4=new Fraccion(4,6);
		
		if (f2.equals(f4))
			System.out.println(f2+" y "+f4+" son iguales");
		else
			System.out.println(f2+" y "+f4+" no son iguales");	
		
		Fraccion comp=new Fraccion(48,36);
		
		//MCD - SIMPLIFICAR		
		System.out.println("El mcd de 48 y 36 es: "+Fraccion.mcd(48,36));
		
		comp.simplificar();
		
		System.out.println("La fraccion simplificada es: "+comp);
		
		//SUMAR
		f=new Fraccion(2,3);
		f2=new Fraccion(5,6);
		Fraccion resultado=f.sumar(f2);
		
		System.out.println("El resultado de sumar "+f+" y "+f2+ " es: "+resultado);
		resultado.simplificar();
		System.out.println("El resultado simplificado es:  "+resultado);
		
		//RESTAR
		Fraccion resultado2=f.resta(f2);
		
		System.out.println("El resultado de restar "+f+" y "+f2+ " es: "+resultado2);
		resultado2.simplificar();
		System.out.println("El resultado simplificado es:  "+resultado2);
		
		//DIVIDIR
		Fraccion resultado3=f.dividir(f2);
		
		System.out.println("El resultado de dividir "+f+" y "+f2+ " es: "+resultado3);
		resultado3.simplificar();
		System.out.println("El resultado simplificado es:  "+resultado3);
	}

}
