package ejemplopipeline;

public class Diezxciento {
	
	public int ahorro;
	public int sueldo;
	public int ciframinima;
	public int tramo1;
	public int tramo2;
	public double retiro;
	public double impuesto;

	
	
	public Diezxciento(){
		ahorro = 0;
		sueldo = 0;

	}
	
	public Diezxciento(int ahorro, int sueldo) {
		this.ahorro = ahorro;
		this.sueldo = sueldo;
		ciframinima = 1000000;
		tramo1 = 10000000;
		tramo2 = 43000000;
	}
	
	public int diezxciento(){
		
		if (ahorro<=ciframinima)
			retiro = ahorro;
		else if (ahorro > ciframinima && ahorro <= tramo1 )
			retiro =ciframinima;
		else if (ahorro > tramo1 && ahorro <= tramo2)
			retiro = ahorro * 0.1;
		else 
			retiro =  tramo2 * 0.1;	

		return (int) retiro;
	}
	
	public int impuesto(){
	/*
Tramo de remuneración: $0 - $500.000 | Retiro promedio de la persona afiliada: $989.413 | Impuesto a cancelar: $0
TR: $500.000 - $1.000.000 | RP $1.490.241 | IMP. $0
TR: $1.00.000 - $1.500.000 | RP: $1.989.013 | IMP: $0
TR: $1.500.000 - $2.500.000 | RP: $2.247.661 | IMP: $174.531
TR: $2.500.000 - 3.000.000 | RP: $3.815.984 | IMP: $364.086
TR: $3.000.000 - $4.000.000 | RP: $3.815.984 | IMP: $612.396
TR: $4.000.000 - $5.000.000 | RP: $3.815.984 | IMP: 980.357
TR: $5.000.000 - $6.000.000 | RP: $3.815.984 | IMP: 1.294.052
TR: $6.000.000 y más | RP: $3.815.984 | IMP: $1.491.042*/ 
		
		if ( sueldo >= 0 && sueldo < 1500000)
			impuesto = 0;
		else if ( sueldo >= 1500000  && sueldo < 2500000)
			impuesto = 	174531;
		else if ( sueldo >= 2500000  && sueldo < 3000000)
			impuesto = 	364086;	
		else if ( sueldo >= 3000000  && sueldo < 4000000)
			impuesto = 	612396;	
		else if ( sueldo >= 4000000  && sueldo < 5000000)
			impuesto = 	980357;				
		else if ( sueldo >= 5000000  && sueldo < 6000000)
			impuesto = 	1294052;	
		else if ( sueldo >= 6000000)
			impuesto = 	1491042;

		return (int) impuesto;
	}
	
	public int saldoAhorro() {
		diezxciento();
		impuesto();

		return (int) (ahorro - retiro - impuesto);
	}

}