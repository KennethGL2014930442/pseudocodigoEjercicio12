import java.util.*;

public class ejercicio12{
	
	public static void main(String[] args){
		double edad = 0;
		double altura = 0;
		int sexo;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese la edad: ");
		edad = scanner.nextDouble();
		System.out.println("Ingrese la altura en centimetros: ");
		altura = scanner.nextDouble();
		System.out.println("Ingrese el sexo (1. M / 2. F): ");
		sexo = scanner.nextInt();
		
		double contadormasculino = 0;
		double contadorfemenino = 0;
		double acumuladormasculino = 0;
		double acumuladorfemenino = 0;
		double contadoredad = 0;
		double acumuladoredad = 0;
		double promediomujeres, promediohombres, promedioedades;
		
		while (altura > 0){
			if (sexo == 1){
				contadormasculino = contadormasculino + 1;
				acumuladormasculino = acumuladormasculino + altura;
			}else 
				if(sexo == 2){
					contadorfemenino = contadorfemenino + 1;
					acumuladorfemenino = acumuladorfemenino + altura;
				}
			contadoredad = contadoredad + 1;
			acumuladoredad = acumuladoredad + edad;
			
			System.out.println("Ingrese edad siguiente persona: ");
			edad = scanner.nextDouble();
			System.out.println("Ingrese altura en centimetros siguiente persona: ");
			altura = scanner.nextDouble();
			System.out.println("Ingrese sexo siguiente persona (1. M / 2. F): ");
			sexo = scanner.nextInt();
		}
		
		promediomujeres = acumuladorfemenino/contadorfemenino;
		promediohombres = acumuladormasculino/contadormasculino;
		promedioedades = acumuladoredad/contadoredad;
		
		System.out.println("El promedio de la altura de las mujeres es: "+promediomujeres);
		System.out.println("El promedio de la altura de los hombres es: "+promediohombres);
		System.out.println("El promedio de la de los participantes es: "+promedioedades);
	}
}