package ejemplopipeline;

public class Diezxciento {
	
	public int ahorro;
	public int sueldo;
	public int ciframinima;
	public int tramo1;

	
	
	public Diezxciento(){
		ahorro = 0;
		sueldo = 0;
		ciframinima = 1000000;
		tramo1 = 10000000;
		tramo2 = 43000000;
	}
	
	public Diezxciento(int ahorro, int sueldo) {
		this.ahorro = ahorro;
		this.sueldo = sueldo;
	}
	
	public int diezxciento(){
		double diezxciento;
		if (ahorro<=ciframinima)
			diezxciento = ahorro;
		else if (ahorro > ciframinima && ahorro <= tramo1 )
			diezxciento =ciframinima;
		else if (ahorro > tramo1 && ahorro <= tramo2)
			diezxciento = ahorro * 0.1;
		else 
			diezxciento =  tramo2 * 0.1;	

		return (int) diezxciento;
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
		return 0;
	}
	
	public int saldoAhorro() {
		double noventaxciento = ahorro * 0.9;
		return (int) noventaxciento;
	}

}