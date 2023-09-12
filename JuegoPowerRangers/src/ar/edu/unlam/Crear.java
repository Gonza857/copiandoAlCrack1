package ar.edu.unlam;

public class Crear {
	protected String [][][] Mapa = new String [360][20][3];
	public final static String MURO = "░";
	public final static String NOMURO = " ";
	
	public Crear() {
	
		for(int h = 0; h <= 2; h++) {
			for(int i = 0; i <= 359; i++ ) {
				for(int j = 0; j <= 9; j++ ) {
					Mapa[i][j][h] = NOMURO;
					Mapa[i][j+10][h] = MURO;
				}
			}
		}
			Mapa[119][4][0]="A";
			Mapa[239][4][0]="B";
			Mapa[359][4][0]="C";
		
		
		}
		}
	


	

