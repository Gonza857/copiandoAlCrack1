package ar.edu.unlam;

public class Reaccion extends Crear {
	  public Reaccion() {}//contructor para llamar superconstructor especifico, algo asi como un enchufe a la otra clase

	public final static String CORAZONLLENO3 =  "\033[31m"+ "3"+"\u001B[0m";  
	public final static String CORAZONLLENO =  "\033[31m"+ "<"+"\u001B[0m";  
    public final static String CORAZONVACIO3 =   "\033[34m"+ "3"+"\u001B[0m";
    public final static String CORAZONVACIO =   "\033[34m"+ "<"+"\u001B[0m";
    public final static String RAYOENEMIGO = "\033[31m" + "#" + "\u001B[0m";
    public final static String RAYO =  "#" ;
    public final static String PRERAYOENEMIGO =  "!";
    public final static String []ESCUDOENEMIGO = new String [4];
    public final static String ESTELA = "\033[35m" + "·" + "\u001B[0m";
    public final static String SUPERESTELA = "\033[32m" + "·" + "\u001B[0m";
    public final static String [][]EXPLOSIONJPG = new String [3][11];
    private boolean explota = false;
    private boolean modoRangerLegendario = false;
	private String cabeza;// a
	private String torso;
	  private String cabezaEnemigo;// agregar selector de personaje xd7
	  private String torsoEnemigo;
	  private int []Bom = new int [39];
	  private boolean boom = false;
	  private boolean lado = false;
	private int columna; 
    private int filaCabeza; 
	private int filaTorso; 
	public int i;
	public int j;//contador base varios ciclos while en comun
	 private int limiteVistaIzquierda;
	 private int limiteVistaDerecha;
	private int contadorGravedad;
	  private int columnaEnemigo; 
      private int filaCabezaEnemigo; 
	  private int filaTorsoEnemigo; 
    private boolean bandera = false;
    private boolean banderaDeGravedad = false;
      private int cantidadDeVida;
  public void GeneradorDeMapa(int nivel) {
	  switch (nivel) {
	case 1:
	case 4:
		for(int h = 0; h <= 2; h++) {
			for(int i = 0; i <= 359; i++ ) {
				for(int j = 0; j <= 17; j++ ) {
					Mapa[i][j][h] = NOMURO;//aire base
				}
			}
		}
		for(int h = 0; h <= 2; h++) {
			for(int i = 0; i <= 359; i++ ) {
				for(int j = 18; j <= 19; j++ ) {
					Mapa[i][j][h] = MURO;//piso base
				}
			}
		}
		
		for(int h = 0; h <= 2; h++) {
			for(int i = 86; i <= 144; i++ ) {
				for(int j = 16; j <= 17; j++ ) {
					Mapa[i][j][h] = MURO;
				}
			}
		}	
		for(int h = 0; h <= 2; h++) {
			for(int i = 87; i <= 141; i++ ) {
				for(int j = 14; j <= 15; j++ ) {
					Mapa[i][j][h] = MURO;
				}
			}
		}	
		for(int h = 0; h <= 2; h++) {
			for(int i = 88; i <= 141; i++ ) {
					Mapa[i][13][h] = MURO;	
			}
		}	
		for(int h = 0; h <= 2; h++) {
			for(int i = 88; i <= 118; i++ ) {
					Mapa[i][12][h] = MURO;	
			}
		}	
		for(int h = 0; h <= 2; h++) {
			for(int i = 89; i <= 118; i++ ) {
				for(int j = 10; j <= 11; j++ ) {
					Mapa[i][j][h] = MURO;
				}
			}
		}
		for(int h = 0; h <= 2; h++) {
			for(int i = 278; i <= 305; i++ ) {
				for(int j = 16; j <= 17; j++ ) {
					Mapa[i][j][h] = MURO;
				}
			}
		}
		for(int h = 0; h <= 2; h++) {
			for(int i = 288; i <= 305; i++ ) {
				for(int j = 14; j <= 15; j++ ) {
					Mapa[i][j][h] = MURO;
				}
			}
		}
		for(int h = 0; h <= 2; h++) {
			for(int i = 296; i <= 305; i++ ) {
				for(int j = 12; j <= 13; j++ ) {
					Mapa[i][j][h] = MURO;
				}
			}
		}
		for(int h = 0; h <= 2; h++) {
			for(int i = 244; i <= 264; i++ ) {
				for(int j = 0; j <= 13; j++ ) {
					Mapa[i][j][h] = MURO;
				}
			}
		}
		for(int h = 0; h <= 2; h++) {
			for(int i = 0; i <= 27; i++ ) {
					Mapa[i+39][9][h] = MURO;
					Mapa[i+158][12][h] = MURO;
					Mapa[i+24][14][h] = MURO;
			}
		}
		for(int h = 0; h <= 2; h++) {
		Mapa[333][17][h] = MURO;
		Mapa[334][14][h] = MURO;
		Mapa[335][14][h] = MURO;
		Mapa[336][14][h] = MURO;
		Mapa[321][16][h] = MURO;
		Mapa[322][13][h] = MURO;
		Mapa[323][13][h] = MURO;
		Mapa[324][13][h] = MURO;
		Mapa[312][12][h] = MURO;
		Mapa[313][12][h] = MURO;
		Mapa[314][12][h] = MURO;
		Mapa[306][5][h] = MURO;
		Mapa[307][5][h] = MURO;
		Mapa[308][5][h] = MURO;
		Mapa[309][5][h] = MURO;
		Mapa[310][5][h] = MURO;
		Mapa[333][8][h] = MURO;
		Mapa[334][8][h] = MURO;
		Mapa[335][8][h] = MURO;
		Mapa[335][7][h] = MURO;
		Mapa[333][0][h] = MURO;
		Mapa[334][0][h] = MURO;
		Mapa[335][0][h] = MURO;
		Mapa[321][1][h] = MURO;
		Mapa[322][4][h] = MURO;
		Mapa[323][4][h] = MURO;
		Mapa[324][4][h] = MURO;
		Mapa[346][17][h] = MURO;
		Mapa[346][3][h] = MURO;
		Mapa[295][3][h] = MURO;
		}
		
		break;
	 case 2:
		 for(int h = 0; h <= 2; h++) {
				for(int i = 0; i <= 359; i++ ) {
					for(int j = 1; j <= 19; j++ ) {
						Mapa[i][0][h] = NOMURO;
						Mapa[i][j][h] = MURO;//piso base
					}
				}
			}
		 for(int h = 0; h <= 2; h++) {
				for(int i = 0; i <= 24; i++ ) {
					for(int j = 1; j <= 4; j++ ) {
						Mapa[i][j][h] = NOMURO;
					}
				}
			}
		 for(int h = 0; h <= 2; h++) {
				for(int i = 269; i <= 359; i++ ) {
					for(int j = 1; j <= 6; j++ ) {
						Mapa[i][j][h] = NOMURO;
					}
				}
			}
		 for(int h = 0; h <= 2; h++) {
				for(int i = 0; i <= 17; i++ ) {
					    Mapa[i+26][2][h] = NOMURO;	
				}
			}
		 for(int h = 0; h <= 2; h++) {
				for(int i = 0; i <= 19; i++ ) {
					    Mapa[i+25][3][h] = NOMURO;	
				}
			}
		 for(int h = 0; h <= 2; h++) {
				for(int i = 0; i <= 20; i++ ) {
					    Mapa[i+25][4][h] = NOMURO;	
				}
			}
		 for(int h = 0; h <= 2; h++) {
				for(int i = 0; i <= 9; i++ ) {
					    Mapa[i+37][5][h] = NOMURO;	
					    Mapa[i+38][6][h] = NOMURO;	
					    Mapa[i+39][7][h] = NOMURO;	
					    Mapa[i+40][8][h] = NOMURO;	
					    Mapa[i+41][9][h] = NOMURO;	
					    Mapa[i+42][10][h] = NOMURO;	
					    Mapa[i+43][11][h] = NOMURO;	
					    Mapa[i+44][12][h] = NOMURO;	
					    Mapa[i+45][13][h] = NOMURO;	
					    Mapa[i+46][14][h] = NOMURO;	
					    Mapa[i+47][15][h] = NOMURO;	
					    Mapa[i+48][16][h] = NOMURO;	
					    
				}
			}
		 for(int h = 0; h <= 2; h++) {
				for(int i = 48; i <= 357; i++ ) {
					for(int j = 14; j <= 16; j++ ) {
						Mapa[i][j][h] = NOMURO;
					}
				}
			}
		 for(int h = 0; h <= 2; h++) {
				for(int i = 0; i <= 68; i++ ) {
					for(int j = 13; j <= 18; j++ ) {
						Mapa[i+100][j][h] = NOMURO;
						Mapa[i+207][j][h] = NOMURO;
					}
				}
			}
		 for(int h = 0; h <= 2; h++) {
				for(int i = 0; i <= 66; i++ ) {
						Mapa[i+101][12][h] = NOMURO;
						Mapa[i+208][12][h] = NOMURO;
				}
			}
		 for(int h = 0; h <= 2; h++) {
				for(int i = 0; i <= 64; i++ ) {
						Mapa[i+102][11][h] = NOMURO;
						Mapa[i+209][11][h] = NOMURO;
				}
			}
		 for(int h = 0; h <= 2; h++) {
				for(int i = 0; i <= 62; i++ ) {
						Mapa[i+103][10][h] = NOMURO;
						Mapa[i+210][10][h] = NOMURO;
				}
			}
		 for(int h = 0; h <= 2; h++) {
				for(int i = 0; i <= 58; i++ ) {
						Mapa[i+105][9][h] = NOMURO;
						Mapa[i+212][9][h] = NOMURO;
				}
			}
		 for(int h = 0; h <= 2; h++) {
				for(int i = 0; i <= 9; i++ ) {
					    Mapa[i+105][15][h] = MURO;	
					    Mapa[i+151][15][h] = MURO;	
					    Mapa[i+129][13][h] = MURO;	
					    Mapa[i+235][15][h] = MURO;	
					
					    
				}
			}
		 for(int h = 0; h <= 2; h++) {
				for(int i = 0; i <= 17; i++ ) {
					for(int j = 7; j <= 13; j++ ) {
						Mapa[i+339][j][h] = NOMURO;
					}
				}
			}
		 for(int h = 0; h <= 2; h++) {
						Mapa[169][13][h] = NOMURO;
						Mapa[276][13][h] = NOMURO;
						Mapa[351][16][h] = MURO;
						Mapa[272][6][h] = MURO;
			}
		 for(int h = 0; h <= 2; h++) {
				for(int i = 0; i <= 68; i++ ) {
					    Mapa[i+100][18][h] = RAYO;	
					    Mapa[i+207][18][h] = RAYO;		    
				}
			}
		 break;
	 case 5:
		 for(int h = 0; h <= 2; h++) {
				for(int i = 1; i <= 358; i++ ) {
					for(int j = 1; j <= 18; j++ ) {
						Mapa[i][j][h] = NOMURO;//aire base
					}
				}
			}
		 for(int h = 0; h <= 2; h++) {
				for(int i = 0; i <= 359; i++ ) {
					    Mapa[i][0][h] = MURO;
					    Mapa[i][18][h] = MURO;	
					    Mapa[i][19][h] = MURO;	    
				}
			}
		 for(int h = 0; h <= 2; h++) {
				for(int i = 0; i <= 19; i++ ) {
					    Mapa[0][i][h] = MURO;	
					    Mapa[359][i][h] = MURO;	    
				}
			}
		 for(int h = 0; h <= 2; h++) {
				for(int i = 0; i <= 22; i++ ) {
					    Mapa[i+169][14][h] = MURO;		
				}
			}
		 for(int h = 0; h <= 2; h++) {
				for(int i = 0; i <= 24; i++ ) {	
					    Mapa[i+168][10][h] = MURO;		
				}
			}
		 for(int h = 0; h <= 2; h++) {
				for(int i = 0; i <= 26; i++ ) {
					    Mapa[i+167][6][h] = MURO;	
				}
			}
		 for(int h = 0; h <= 2; h++) {
				Mapa[9][17][h] = MURO;
				Mapa[9][2][h] = MURO;
				Mapa[350][17][h] = MURO;
				Mapa[350][2][h] = MURO;
				Mapa[180][2][h] = MURO;
				Mapa[179][6][h] = NOMURO;
				Mapa[180][6][h] = NOMURO;
				Mapa[181][6][h] = NOMURO;
				}
		 break;
	 case 3:
		 for(int h = 0; h <= 2; h++) {
				for(int i = 0; i <= 359; i++ ) {
					for(int j = 0; j <= 19; j++ ) {
						Mapa[i][j][h] = NOMURO;//aire base
					}
				}
			}
		 for(int h = 0; h <= 2; h++) {
				for(int i = 0; i <= 15; i++ ) {
					for(int j = 15; j <= 19; j++ ) {
						Mapa[i][j][h] = MURO;
					}
				}
			}
		 for(int h = 0; h <= 2; h++) {
				for(int i = 0; i <= 15; i++ ) {
					for(int j = 0; j <= 1; j++ ) {
						Mapa[i][j][h] = MURO;
					}
				}
			}
		 
		 for(int h = 0; h <= 2; h++) {
				for(int i = 0; i <= 21; i++ ) {	
					    Mapa[i+39][13][h] = MURO;		
				}
			}
		 
		 for(int h = 0; h <= 2; h++) {
				for(int i = 85; i <= 125; i++ ) {
					for(int j = 14; j <= 19; j++ ) {
						Mapa[i][j][h] = MURO;
					}
				}
			}
		 
		 for(int h = 0; h <= 2; h++) {
				for(int i = 0; i <= 9; i++ ) {	
					    Mapa[i+141][13][h] = MURO;
					    Mapa[i+176][11][h] = MURO;
				}
			}
		 
		 
		 for(int h = 0; h <= 2; h++) {
				for(int i = 205; i <= 265; i++ ) {
					for(int j = 12; j <= 19; j++ ) {
						Mapa[i][j][h] = MURO;
					}
				}
			}
		 
		 for(int h = 0; h <= 2; h++) {
				for(int i = 309; i <= 339; i++ ) {
					for(int j = 14; j <= 19; j++ ) {
						Mapa[i][j][h] = MURO;
					}
				}
			}
		 for(int h = 0; h <= 2; h++) {
				Mapa[15][14][h] = MURO;
				Mapa[15][2][h] = MURO;
				Mapa[85][13][h] = MURO;
				Mapa[125][13][h] = MURO;
				Mapa[205][11][h] = MURO;
				Mapa[265][11][h] = MURO;
				Mapa[309][13][h] = MURO;
				Mapa[339][13][h] = MURO;
				Mapa[106][13][h] = MURO;
				Mapa[236][11][h] = MURO;
				Mapa[325][13][h] = MURO;
				}
		 for(int h = 0; h <= 2; h++) {
				for(int i = 0; i <= 68; i++ ) {	
					    Mapa[i+16][19][h] = PRERAYOENEMIGO;
				}
			}
		 for(int h = 0; h <= 2; h++) {
				for(int i = 0; i <= 78; i++ ) {	
					    Mapa[i+126][19][h] = PRERAYOENEMIGO;
				}
			}
		 for(int h = 0; h <= 2; h++) {
				for(int i = 0; i <= 41; i++ ) {	
					    Mapa[i+266][19][h] = PRERAYOENEMIGO;
				}
			}
		 for(int h = 0; h <= 2; h++) {
				for(int i = 0; i <= 19; i++ ) {	
					    Mapa[i+340][19][h] = PRERAYOENEMIGO;
				}
			}
		 break;
		 
	default:
		break;
	}
  }
  public void cargaExplocion(int nivel) {
	  switch (nivel) {
	case 1:
	  EXPLOSIONJPG[0][0] = "\033[34m" + "."+"\u001B[0m";
  	  EXPLOSIONJPG[0][1] = "\033[34m" + "!"+"\u001B[0m";
  	  EXPLOSIONJPG[0][2] = "\033[34m" + ","+"\u001B[0m";
  	  EXPLOSIONJPG[0][3] = " ";
  	  EXPLOSIONJPG[0][4] = "\033[34m" + "*"+"\u001B[0m";
  	  EXPLOSIONJPG[0][5] = "\033[34m" + "B"+"\u001B[0m";
  	  EXPLOSIONJPG[0][6] = "\033[34m" + "O"+"\u001B[0m";
  	  EXPLOSIONJPG[0][7] = "\033[34m" + "O"+"\u001B[0m";
  	  EXPLOSIONJPG[0][8] = "\033[34m" + "M"+"\u001B[0m";
  	  EXPLOSIONJPG[0][9] = "\033[34m" + "!"+"\u001B[0m";
  	  EXPLOSIONJPG[0][10] ="\033[34m" +  "*"+"\u001B[0m";
  	  EXPLOSIONJPG[1][0] = "\033[34m" + "-"+"\u001B[0m";
  	  EXPLOSIONJPG[1][1] ="\033[34m" +  "*"+"\u001B[0m";
  	  EXPLOSIONJPG[1][2] ="\033[34m" +  "-"+"\u001B[0m";
  	  EXPLOSIONJPG[2][0] = "\033[34m" + "'"+"\u001B[0m";
  	  EXPLOSIONJPG[2][1] = "\033[34m" + "|"+"\u001B[0m";
  	  EXPLOSIONJPG[2][2] = "\033[34m" + "`"+"\u001B[0m";
		break;
    case 2:
      EXPLOSIONJPG[0][0] = "\033[35m" + "."+"\u001B[0m";
  	  EXPLOSIONJPG[0][1] = "\033[35m" + "!"+"\u001B[0m";
  	  EXPLOSIONJPG[0][2] = "\033[35m" + ","+"\u001B[0m";
  	  EXPLOSIONJPG[0][3] = " ";
  	  EXPLOSIONJPG[0][4] = "\033[35m" + "*"+"\u001B[0m";
  	  EXPLOSIONJPG[0][5] = "\033[35m" + "B"+"\u001B[0m";
  	  EXPLOSIONJPG[0][6] = "\033[35m" + "O"+"\u001B[0m";
  	  EXPLOSIONJPG[0][7] = "\033[35m" + "O"+"\u001B[0m";
  	  EXPLOSIONJPG[0][8] = "\033[35m" + "M"+"\u001B[0m";
  	  EXPLOSIONJPG[0][9] = "\033[35m" + "!"+"\u001B[0m";
  	  EXPLOSIONJPG[0][10] ="\033[35m" +  "*"+"\u001B[0m";
  	  EXPLOSIONJPG[1][0] = "\033[35m" + "-"+"\u001B[0m";
  	  EXPLOSIONJPG[1][1] ="\033[35m" +  "*"+"\u001B[0m";
  	  EXPLOSIONJPG[1][2] ="\033[35m" +  "-"+"\u001B[0m";
  	  EXPLOSIONJPG[2][0] = "\033[35m" + "'"+"\u001B[0m";
  	  EXPLOSIONJPG[2][1] = "\033[35m" + "|"+"\u001B[0m";
  	  EXPLOSIONJPG[2][2] = "\033[35m" + "`"+"\u001B[0m";
		break;
    case 3:
      EXPLOSIONJPG[0][0] = "\033[33m" + "."+"\u001B[0m";
      EXPLOSIONJPG[0][1] = "\033[33m" + "!"+"\u001B[0m";
      EXPLOSIONJPG[0][2] = "\033[33m" + ","+"\u001B[0m";
      EXPLOSIONJPG[0][3] = " ";
      EXPLOSIONJPG[0][4] = "\033[33m" + "*"+"\u001B[0m";
      EXPLOSIONJPG[0][5] = "\033[33m" + "B"+"\u001B[0m";
      EXPLOSIONJPG[0][6] = "\033[33m" + "O"+"\u001B[0m";
      EXPLOSIONJPG[0][7] = "\033[33m" + "O"+"\u001B[0m";
      EXPLOSIONJPG[0][8] = "\033[33m" + "M"+"\u001B[0m";
      EXPLOSIONJPG[0][9] = "\033[33m" + "!"+"\u001B[0m";
      EXPLOSIONJPG[0][10] ="\033[33m" +  "*"+"\u001B[0m";
      EXPLOSIONJPG[1][0] = "\033[33m" + "-"+"\u001B[0m";
      EXPLOSIONJPG[1][1] ="\033[33m" +  "*"+"\u001B[0m";
      EXPLOSIONJPG[1][2] ="\033[33m" +  "-"+"\u001B[0m";
      EXPLOSIONJPG[2][0] = "\033[33m" + "'"+"\u001B[0m";
      EXPLOSIONJPG[2][1] = "\033[33m" + "|"+"\u001B[0m";
      EXPLOSIONJPG[2][2] = "\033[33m" + "`"+"\u001B[0m";
	break;
    case 4:
      EXPLOSIONJPG[0][0] = "\033[31m" + "."+"\u001B[0m";
      EXPLOSIONJPG[0][1] = "\033[31m" + "!"+"\u001B[0m";
      EXPLOSIONJPG[0][2] = "\033[31m" + ","+"\u001B[0m";
      EXPLOSIONJPG[0][3] = " ";
      EXPLOSIONJPG[0][4] = "\033[31m" + "*"+"\u001B[0m";
      EXPLOSIONJPG[0][5] = "\033[31m" + "B"+"\u001B[0m";
      EXPLOSIONJPG[0][6] = "\033[31m" + "O"+"\u001B[0m";
      EXPLOSIONJPG[0][7] = "\033[31m" + "O"+"\u001B[0m";
      EXPLOSIONJPG[0][8] = "\033[31m" + "M"+"\u001B[0m";
      EXPLOSIONJPG[0][9] = "\033[31m" + "!"+"\u001B[0m";
      EXPLOSIONJPG[0][10] ="\033[31m" +  "*"+"\u001B[0m";
      EXPLOSIONJPG[1][0] = "\033[31m" + "-"+"\u001B[0m";
      EXPLOSIONJPG[1][1] ="\033[31m" +  "*"+"\u001B[0m";
      EXPLOSIONJPG[1][2] ="\033[31m" +  "-"+"\u001B[0m";
      EXPLOSIONJPG[2][0] = "\033[31m" + "'"+"\u001B[0m";
      EXPLOSIONJPG[2][1] = "\033[31m" + "|"+"\u001B[0m";
      EXPLOSIONJPG[2][2] = "\033[31m" + "`"+"\u001B[0m";
	break;
    case 5:
      EXPLOSIONJPG[0][0] = "\033[32m" + "."+"\u001B[0m";
      EXPLOSIONJPG[0][1] = "\033[32m" + "!"+"\u001B[0m";
      EXPLOSIONJPG[0][2] = "\033[32m" + ","+"\u001B[0m";
      EXPLOSIONJPG[0][3] = " ";
      EXPLOSIONJPG[0][4] = "\033[32m" + "*"+"\u001B[0m";
      EXPLOSIONJPG[0][5] = "\033[32m" + "B"+"\u001B[0m";
      EXPLOSIONJPG[0][6] = "\033[32m" + "O"+"\u001B[0m";
      EXPLOSIONJPG[0][7] = "\033[32m" + "O"+"\u001B[0m";
      EXPLOSIONJPG[0][8] = "\033[32m" + "M"+"\u001B[0m";
      EXPLOSIONJPG[0][9] = "\033[32m" + "!"+"\u001B[0m";
      EXPLOSIONJPG[0][10] ="\033[32m" +  "*"+"\u001B[0m";
      EXPLOSIONJPG[1][0] = "\033[32m" + "-"+"\u001B[0m";
      EXPLOSIONJPG[1][1] ="\033[32m" +  "*"+"\u001B[0m";
      EXPLOSIONJPG[1][2] ="\033[32m" +  "-"+"\u001B[0m";
      EXPLOSIONJPG[2][0] = "\033[32m" + "'"+"\u001B[0m";
      EXPLOSIONJPG[2][1] = "\033[32m" + "|"+"\u001B[0m";
      EXPLOSIONJPG[2][2] = "\033[32m" + "`"+"\u001B[0m";
	break;
	default:
		break;
	}
    	  
    	  
      }     
  public void inicializacion(int powerRanger) {

	  switch (powerRanger) {
	case 1:
		cabeza = "\033[34m"+ "©" +"\u001B[0m";
		torso = "\033[34m"+ "T" +"\u001B[0m";
		Mapa[12][16][0] = cabeza;
		Mapa[12][17][0] = torso;
			  columna = 12;
			  filaCabeza = 16;
			  filaTorso = 17;
			  cantidadDeVida=6;
		break;
	case 2:
		cabeza = "\033[35m"+ "©" +"\u001B[0m";
		torso = "\033[35m"+ "T" +"\u001B[0m";
		Mapa[10][3][0] = cabeza;
		Mapa[10][4][0] = torso;
			  columna = 10;
			  filaCabeza = 3;
			  filaTorso = 4;
			  cantidadDeVida=6;
		break;
	case 3:
	cabeza = "\033[33m"+ "©" +"\u001B[0m";
	torso = "\033[33m"+ "T" +"\u001B[0m";
	Mapa[10][13][0] = cabeza;
	Mapa[10][14][0] = torso;
		  columna = 10;
		  filaCabeza = 13;
		  filaTorso = 14;
		  cantidadDeVida=6;
		break;
	case 4:
	cabeza = "\033[31m"+ "©" +"\u001B[0m";
	torso = "\033[31m"+ "T" +"\u001B[0m";
	Mapa[12][16][0] = cabeza;
	Mapa[12][17][0] = torso;
		  columna = 12;
		  filaCabeza = 16;
		  filaTorso = 17;
		  cantidadDeVida=6;
		break;
	case 5:
		cabeza = "\033[32m"+ "©" +"\u001B[0m";
		torso = "\033[32m"+ "T" +"\u001B[0m";
		Mapa[180][12][0] = cabeza;
		Mapa[180][13][0] = torso;
			  columna = 180;
			  filaCabeza = 12;
			  filaTorso = 13;
			  cantidadDeVida=6;
		break;
	default:
		break;
	}
	
}
  public void inicializacionDeEnemigos(int nivel) {
//inicializanding
	    ESCUDOENEMIGO[0]=  "\033[31m" + "├" + "\u001B[0m";
		ESCUDOENEMIGO[1]= "\033[31m" + "┤" + "\u001B[0m";
		ESCUDOENEMIGO[2]= "\033[31m" + "┬" + "\u001B[0m";
		ESCUDOENEMIGO[3]= "\033[31m" + "┴" + "\u001B[0m";
	  switch (nivel) {
	case 1:			
cabezaEnemigo = "@" ;
torsoEnemigo= "K" ;
columnaEnemigo = 121;
filaCabezaEnemigo = 11;
filaTorsoEnemigo = 12;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
cabezaEnemigo = "@" ;
torsoEnemigo= "Ý" ;
columnaEnemigo = 119;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 120;	
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
cabezaEnemigo = "@" ;
torsoEnemigo= "M" ;
columnaEnemigo = 73;
filaCabezaEnemigo = 1;
filaTorsoEnemigo = 2;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 76;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 79;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
cabezaEnemigo = "@" ;
torsoEnemigo= "M" ;
columnaEnemigo = 232;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 235;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 238;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 241;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
cabezaEnemigo = "@" ;
torsoEnemigo= "Æ" ;
columnaEnemigo = 272;
filaCabezaEnemigo = 16;
filaTorsoEnemigo = 17;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 274;
filaCabezaEnemigo = 14;
filaTorsoEnemigo = 15;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
cabezaEnemigo = "@" ;
torsoEnemigo= "Ý" ;
columnaEnemigo = 273;
filaCabezaEnemigo = 16;
filaTorsoEnemigo = 17;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 275;
filaCabezaEnemigo = 14;
filaTorsoEnemigo = 15;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
cabezaEnemigo = "@" ;
torsoEnemigo= "K" ;
columnaEnemigo = 275;
filaCabezaEnemigo = 16;
filaTorsoEnemigo = 17;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
cabezaEnemigo = "@" ;
torsoEnemigo= "¥" ;
columnaEnemigo = 345;
filaCabezaEnemigo = 10;
filaTorsoEnemigo = 11;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
cabezaEnemigo = "@" ;
torsoEnemigo= "X" ;
columnaEnemigo = 320;
filaCabezaEnemigo = 14;
filaTorsoEnemigo = 15;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 323;
filaCabezaEnemigo = 15;
filaTorsoEnemigo = 16;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 326;
filaCabezaEnemigo = 15;
filaTorsoEnemigo = 16;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 329;
filaCabezaEnemigo = 15;
filaTorsoEnemigo = 16;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 332;
filaCabezaEnemigo = 15;
filaTorsoEnemigo = 16;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 317;
filaCabezaEnemigo = 14;
filaTorsoEnemigo = 15;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 320;
filaCabezaEnemigo = 10;
filaTorsoEnemigo = 11;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 323;
filaCabezaEnemigo = 10;
filaTorsoEnemigo = 11;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 326;
filaCabezaEnemigo = 10;
filaTorsoEnemigo = 11;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 317;
filaCabezaEnemigo = 10;
filaTorsoEnemigo = 11;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 329;
filaCabezaEnemigo = 10;
filaTorsoEnemigo = 11;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 332;
filaCabezaEnemigo = 10;
filaTorsoEnemigo = 11;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 320;
filaCabezaEnemigo = 6;
filaTorsoEnemigo = 7;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 323;
filaCabezaEnemigo = 6;
filaTorsoEnemigo = 7;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 326;
filaCabezaEnemigo = 6;
filaTorsoEnemigo = 7;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 317;
filaCabezaEnemigo = 6;
filaTorsoEnemigo = 7;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 329;
filaCabezaEnemigo = 6;
filaTorsoEnemigo = 7;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 332;
filaCabezaEnemigo = 6;
filaTorsoEnemigo = 7;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 320;
filaCabezaEnemigo = 2;
filaTorsoEnemigo = 3;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 323;
filaCabezaEnemigo = 1;
filaTorsoEnemigo = 2;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 326;
filaCabezaEnemigo = 1;
filaTorsoEnemigo = 2;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 317;
filaCabezaEnemigo = 2;
filaTorsoEnemigo = 3;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 329;
filaCabezaEnemigo = 1;
filaTorsoEnemigo = 2;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 332;
filaCabezaEnemigo = 1;
filaTorsoEnemigo = 2;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
			
		break;
	case 2:	
cabezaEnemigo = "@" ;
torsoEnemigo= "Æ" ;
columnaEnemigo = 98;
filaCabezaEnemigo = 15;
filaTorsoEnemigo = 16;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 213;
filaCabezaEnemigo = 15;
filaTorsoEnemigo = 16;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 215;
filaCabezaEnemigo = 15;
filaTorsoEnemigo = 16;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 300;
filaCabezaEnemigo = 15;
filaTorsoEnemigo = 16;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
cabezaEnemigo = "@" ;
torsoEnemigo= "X" ;
columnaEnemigo = 93;
filaCabezaEnemigo = 15;
filaTorsoEnemigo = 16;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 188;
filaCabezaEnemigo = 15;
filaTorsoEnemigo = 16;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 280;
filaCabezaEnemigo = 15;
filaTorsoEnemigo = 16;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 296;
filaCabezaEnemigo = 15;
filaTorsoEnemigo = 16;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
cabezaEnemigo = "@" ;
torsoEnemigo= "¥" ;
columnaEnemigo = 350;
filaCabezaEnemigo = 13;
filaTorsoEnemigo = 14;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 273;
filaCabezaEnemigo = 5;
filaTorsoEnemigo = 6;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
cabezaEnemigo = "@" ;
torsoEnemigo= "K" ;
columnaEnemigo = 97;
filaCabezaEnemigo = 15;
filaTorsoEnemigo = 16;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
cabezaEnemigo = "@" ;
torsoEnemigo= "M" ;
columnaEnemigo = 157;
filaCabezaEnemigo = 9;
filaTorsoEnemigo = 10;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 159;
filaCabezaEnemigo = 9;
filaTorsoEnemigo = 10;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 161;
filaCabezaEnemigo = 9;
filaTorsoEnemigo = 10;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 345;
filaCabezaEnemigo = 1;
filaTorsoEnemigo = 2;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 347;
filaCabezaEnemigo = 1;
filaTorsoEnemigo = 2;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 349;
filaCabezaEnemigo = 1;
filaTorsoEnemigo = 2;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
		break;
case 3:
cabezaEnemigo = "@" ;
torsoEnemigo= "¥" ;
columnaEnemigo = 105;
filaCabezaEnemigo = 12;
filaTorsoEnemigo = 13;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;cabezaEnemigo = "@" ;
columnaEnemigo = 235;
filaCabezaEnemigo = 10;
filaTorsoEnemigo = 11;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;cabezaEnemigo = "@" ;
columnaEnemigo = 324;
filaCabezaEnemigo = 12;
filaTorsoEnemigo = 13;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
          break;
case 4:			
cabezaEnemigo = "@" ;
torsoEnemigo= "K" ;
columnaEnemigo = 121;
filaCabezaEnemigo = 11;
filaTorsoEnemigo = 12;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
cabezaEnemigo = "@" ;
torsoEnemigo= "Ý" ;
columnaEnemigo = 119;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 120;	
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
cabezaEnemigo = "@" ;
torsoEnemigo= "M" ;
columnaEnemigo = 73;
filaCabezaEnemigo = 1;
filaTorsoEnemigo = 2;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 76;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 79;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
cabezaEnemigo = "@" ;
torsoEnemigo= "M" ;
columnaEnemigo = 232;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 235;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 238;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 241;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
cabezaEnemigo = "@" ;
torsoEnemigo= "Æ" ;
columnaEnemigo = 272;
filaCabezaEnemigo = 16;
filaTorsoEnemigo = 17;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 274;
filaCabezaEnemigo = 14;
filaTorsoEnemigo = 15;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
cabezaEnemigo = "@" ;
torsoEnemigo= "Ý" ;
columnaEnemigo = 273;
filaCabezaEnemigo = 16;
filaTorsoEnemigo = 17;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 275;
filaCabezaEnemigo = 14;
filaTorsoEnemigo = 15;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
cabezaEnemigo = "@" ;
torsoEnemigo= "K" ;
columnaEnemigo = 275;
filaCabezaEnemigo = 16;
filaTorsoEnemigo = 17;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
cabezaEnemigo = "@" ;
torsoEnemigo= "¥" ;
columnaEnemigo = 345;
filaCabezaEnemigo = 10;
filaTorsoEnemigo = 11;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 320;
filaCabezaEnemigo = 14;
filaTorsoEnemigo = 15;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 323;
filaCabezaEnemigo = 15;
filaTorsoEnemigo = 16;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 326;
filaCabezaEnemigo = 15;
filaTorsoEnemigo = 16;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 329;
filaCabezaEnemigo = 15;
filaTorsoEnemigo = 16;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 332;
filaCabezaEnemigo = 15;
filaTorsoEnemigo = 16;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 317;
filaCabezaEnemigo = 14;
filaTorsoEnemigo = 15;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 320;
filaCabezaEnemigo = 10;
filaTorsoEnemigo = 11;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 323;
filaCabezaEnemigo = 10;
filaTorsoEnemigo = 11;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 326;
filaCabezaEnemigo = 10;
filaTorsoEnemigo = 11;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 317;
filaCabezaEnemigo = 10;
filaTorsoEnemigo = 11;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 329;
filaCabezaEnemigo = 10;
filaTorsoEnemigo = 11;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 332;
filaCabezaEnemigo = 10;
filaTorsoEnemigo = 11;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 320;
filaCabezaEnemigo = 6;
filaTorsoEnemigo = 7;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 323;
filaCabezaEnemigo = 6;
filaTorsoEnemigo = 7;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 326;
filaCabezaEnemigo = 6;
filaTorsoEnemigo = 7;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 317;
filaCabezaEnemigo = 6;
filaTorsoEnemigo = 7;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 329;
filaCabezaEnemigo = 6;
filaTorsoEnemigo = 7;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 332;
filaCabezaEnemigo = 6;
filaTorsoEnemigo = 7;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 320;
filaCabezaEnemigo = 2;
filaTorsoEnemigo = 3;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 323;
filaCabezaEnemigo = 1;
filaTorsoEnemigo = 2;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 326;
filaCabezaEnemigo = 1;
filaTorsoEnemigo = 2;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 317;
filaCabezaEnemigo = 2;
filaTorsoEnemigo = 3;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 329;
filaCabezaEnemigo = 1;
filaTorsoEnemigo = 2;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 332;
filaCabezaEnemigo = 1;
filaTorsoEnemigo = 2;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 345;
filaCabezaEnemigo = 10;
filaTorsoEnemigo = 11;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
		
	break;
case 5:
cabezaEnemigo = "@" ;
torsoEnemigo= "¥" ;
columnaEnemigo = 10;
filaCabezaEnemigo = 10;
filaTorsoEnemigo = 11;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 349;
filaCabezaEnemigo = 10;
filaTorsoEnemigo = 11;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
	    	      
cabezaEnemigo = "@" ;
torsoEnemigo= "M" ;
columnaEnemigo = 20;
filaCabezaEnemigo = 1;
filaTorsoEnemigo = 2;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 40;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 60;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 80;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 100;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 120;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 140;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 160;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 181;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 200;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 220;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 240;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 260;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 280;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 300;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 320;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
	      
cabezaEnemigo = "@" ;
torsoEnemigo= "Ý" ;
columnaEnemigo = 20;
filaCabezaEnemigo = 16;
filaTorsoEnemigo = 17;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;	
columnaEnemigo = 40;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;	
columnaEnemigo = 60;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;	
columnaEnemigo = 80;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;	
columnaEnemigo = 100;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;	
columnaEnemigo = 120;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;	
columnaEnemigo = 140;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;	
columnaEnemigo = 160;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;		
columnaEnemigo = 180;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;		
columnaEnemigo = 200;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;		
columnaEnemigo = 220;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;	
columnaEnemigo = 240;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;		
columnaEnemigo = 260;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;	
columnaEnemigo = 280;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;	
columnaEnemigo = 300;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;	
columnaEnemigo = 320;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;

cabezaEnemigo = "@" ;
torsoEnemigo= "X" ;
columnaEnemigo = 21;
filaCabezaEnemigo = 12;
filaTorsoEnemigo = 13;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 31;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 41;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 51;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 61;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 71;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 81;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 91;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 101;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 111;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 121;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 131;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 141;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 151;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 161;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 199;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 209;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 219;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 229;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 239;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 249;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 259;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 269;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 279;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 289;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 299;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 309;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 319;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
filaCabezaEnemigo = 8;
filaTorsoEnemigo = 9;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 31;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 41;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 51;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 61;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 71;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 81;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 91;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 101;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 111;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 121;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 131;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 141;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 151;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 161;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 199;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 209;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 219;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 229;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 239;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 249;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 259;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 269;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 279;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 289;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 299;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 309;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 319;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
filaCabezaEnemigo = 4;
filaTorsoEnemigo = 5;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 31;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 41;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 51;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 61;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 71;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 81;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 91;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 101;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 111;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 121;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 131;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 141;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 151;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 161;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 199;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 209;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 219;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 229;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 239;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 249;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 259;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 269;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 279;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 289;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 299;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 309;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
columnaEnemigo = 319;
Mapa[columnaEnemigo][filaCabezaEnemigo][0]= cabezaEnemigo ;
Mapa[columnaEnemigo][filaTorsoEnemigo][0]= torsoEnemigo ;
		break;
	default:
		break;
	  
	  }
  }
  public void ataqueEnemigo(int ciclos ) {
	  boolean golpeDado = false;
switch (ciclos) {
case 4://primeros se los ubica y se le pone el escudo correspondiente
	
	
	
	
	columnaEnemigo = 0;
	filaCabezaEnemigo = 0;
    while(columnaEnemigo < 359 || filaCabezaEnemigo < 18) {
	 if(  Mapa[columnaEnemigo][filaCabezaEnemigo][0] == cabezaEnemigo) {
			switch (Mapa[columnaEnemigo][filaCabezaEnemigo+1][0]) {
			case "Æ"://asignacion de escudo hacia la izquierda
				if(	Mapa[columnaEnemigo-1][filaCabezaEnemigo][0] == NOMURO && Mapa[columnaEnemigo-1][filaCabezaEnemigo+1][0] == NOMURO) {
				Mapa[columnaEnemigo-1][filaCabezaEnemigo][0] = ESCUDOENEMIGO[0];
				Mapa[columnaEnemigo-1][filaCabezaEnemigo+1][0] = ESCUDOENEMIGO[0];
						}
				break;
            case "K"://asignacion de escudo hacia la derecha
            	if(	Mapa[columnaEnemigo+1][filaCabezaEnemigo][0] == NOMURO && Mapa[columnaEnemigo+1][filaCabezaEnemigo+1][0] == NOMURO) {
    				Mapa[columnaEnemigo+1][filaCabezaEnemigo][0] = ESCUDOENEMIGO[1];
    				Mapa[columnaEnemigo+1][filaCabezaEnemigo+1][0] = ESCUDOENEMIGO[1];
    						}
				break;
            case "Ý"://asignacion de escudo hacia arriba
            	if(	Mapa[columnaEnemigo][filaCabezaEnemigo-1][0] == NOMURO) {
    				Mapa[columnaEnemigo][filaCabezaEnemigo-1][0] = ESCUDOENEMIGO[2];
    						}
	            break;
            case "M"://asignacion de escudo hacia abajo
            	if(	Mapa[columnaEnemigo][filaCabezaEnemigo+2][0] == NOMURO) {
    				Mapa[columnaEnemigo][filaCabezaEnemigo+2][0] = ESCUDOENEMIGO[3];
    						}
	
	            break;
	            
	            
	            
            case "X":
            case "¥":if(	Mapa[columnaEnemigo-1][filaCabezaEnemigo][0] == NOMURO && Mapa[columnaEnemigo-1][filaCabezaEnemigo+1][0] == NOMURO) {
				Mapa[columnaEnemigo-1][filaCabezaEnemigo][0] = ESCUDOENEMIGO[0];
				Mapa[columnaEnemigo-1][filaCabezaEnemigo+1][0] = ESCUDOENEMIGO[0];
				}
                     if(	Mapa[columnaEnemigo+1][filaCabezaEnemigo][0] == NOMURO && Mapa[columnaEnemigo+1][filaCabezaEnemigo+1][0] == NOMURO) {
				Mapa[columnaEnemigo+1][filaCabezaEnemigo][0] = ESCUDOENEMIGO[1];
				Mapa[columnaEnemigo+1][filaCabezaEnemigo+1][0] = ESCUDOENEMIGO[1];
                }
                     if(	Mapa[columnaEnemigo][filaCabezaEnemigo-1][0] == NOMURO) {
         		Mapa[columnaEnemigo][filaCabezaEnemigo-1][0] = ESCUDOENEMIGO[2];
         		}
                     if(	Mapa[columnaEnemigo][filaCabezaEnemigo+2][0] == NOMURO) {
         		Mapa[columnaEnemigo][filaCabezaEnemigo+2][0] = ESCUDOENEMIGO[3];
         		}    
            	break;
	    	
	     default:
				break;
			}
		}
		if(columnaEnemigo<359) {
			columnaEnemigo++;
		}else { if(filaCabezaEnemigo < 18) {
			filaCabezaEnemigo++;
			columnaEnemigo = 0;
		}
			}
		

	  }
	  break;
case 5:// preparen un ataque o lo lancen ya
	
	columnaEnemigo = 0;
	filaCabezaEnemigo = 0;
    while(columnaEnemigo < 359 || filaCabezaEnemigo < 18) {
	 if(  Mapa[columnaEnemigo][filaCabezaEnemigo][0] == cabezaEnemigo) {
			switch (Mapa[columnaEnemigo][filaCabezaEnemigo+1][0]) {
			case "Æ"://preataque hacia la izquierda
				i = columnaEnemigo;
				while(i >= 0 && Mapa[i][filaCabezaEnemigo][0] != MURO) {
					if(Mapa[i][filaCabezaEnemigo][0] == NOMURO) {
					Mapa[i][filaCabezaEnemigo][0] = PRERAYOENEMIGO;
					}
					i--;
				}
				break;
            case "K"://preataque hacia la derecha
            	i = columnaEnemigo;
				while(i <= 359 && Mapa[i][filaCabezaEnemigo][0] != MURO) {
					if(Mapa[i][filaCabezaEnemigo][0] == NOMURO) {
					Mapa[i][filaCabezaEnemigo][0] = PRERAYOENEMIGO;
					}
					i++;
				}
				break;
            case "Ý"://preataque hacia arriba
            	i = filaCabezaEnemigo;
				while(i >= 0 && Mapa[columnaEnemigo][i][0] != MURO) {
					if(Mapa[columnaEnemigo][i][0] == NOMURO) {
					Mapa[columnaEnemigo][i][0] = PRERAYOENEMIGO;
					}
					i--;
				}
	            break;
            case "M"://preataque hacia abajo
            	i = filaCabezaEnemigo;
				while(i <= 19 && Mapa[columnaEnemigo][i][0] != MURO) {
					if(Mapa[columnaEnemigo][i][0] == NOMURO) {
					Mapa[columnaEnemigo][i][0] = PRERAYOENEMIGO;
					}
					i++;
				}
	            break;
	            
	            
	            
            case "¥":
            	i = columnaEnemigo;
				while(i >= 0 && Mapa[i][filaCabezaEnemigo][0] != MURO) {
					if(Mapa[i][filaCabezaEnemigo][0] == NOMURO) {
					Mapa[i][filaCabezaEnemigo][0] = PRERAYOENEMIGO;
					}
					i--;
				}
				i = columnaEnemigo;
				while(i >= 0 && Mapa[i][filaCabezaEnemigo-2][0] != MURO) {
					if(Mapa[i][filaCabezaEnemigo-2][0] == NOMURO) {
					Mapa[i][filaCabezaEnemigo-2][0] = PRERAYOENEMIGO;
					}
					i--;
				}
				i = columnaEnemigo;
				while(i >= 0 && Mapa[i][filaCabezaEnemigo+2][0] != MURO) {
					if(Mapa[i][filaCabezaEnemigo+2][0] == NOMURO) {
					Mapa[i][filaCabezaEnemigo+2][0] = PRERAYOENEMIGO;
					}
					i--; //hacia la izquierda
				}
				i = columnaEnemigo;
				while(i <= 359 && Mapa[i][filaCabezaEnemigo][0] != MURO) {
					if(Mapa[i][filaCabezaEnemigo][0] == NOMURO) {
					Mapa[i][filaCabezaEnemigo][0] = PRERAYOENEMIGO;
					}
					i++;
				}
				i = columnaEnemigo;
				while(i <= 359 && Mapa[i][filaCabezaEnemigo-2][0] != MURO) {
					if(Mapa[i][filaCabezaEnemigo-2][0] == NOMURO) {
					Mapa[i][filaCabezaEnemigo-2][0] = PRERAYOENEMIGO;
					}
					i++;
				}
				i = columnaEnemigo;
				while(i <= 359 && Mapa[i][filaCabezaEnemigo+2][0] != MURO) {
					if(Mapa[i][filaCabezaEnemigo+2][0] == NOMURO) {
					Mapa[i][filaCabezaEnemigo+2][0] = PRERAYOENEMIGO;
					}
					i++;
				}//hacia la derecha
				i = filaCabezaEnemigo;
				while(i >= 0 && Mapa[columnaEnemigo][i][0] != MURO) {
					if(Mapa[columnaEnemigo][i][0] == NOMURO) {
					Mapa[columnaEnemigo][i][0] = PRERAYOENEMIGO;
					}
					i--;
				}
				i = filaCabezaEnemigo;
				while(i >= 0 && Mapa[columnaEnemigo+2][i][0] != MURO) {
					if(Mapa[columnaEnemigo+2][i][0] == NOMURO) {
					Mapa[columnaEnemigo+2][i][0] = PRERAYOENEMIGO;
					}
					i--;
				}
				i = filaCabezaEnemigo;
				while(i >= 0 && Mapa[columnaEnemigo-2][i][0] != MURO) {
					if(Mapa[columnaEnemigo-2][i][0] == NOMURO) {
					Mapa[columnaEnemigo-2][i][0] = PRERAYOENEMIGO;
					}
					i--;
				}//hacia arriba
				i = filaCabezaEnemigo;
				while(i <= 19 && Mapa[columnaEnemigo][i][0] != MURO) {
					if(Mapa[columnaEnemigo][i][0] == NOMURO) {
					Mapa[columnaEnemigo][i][0] = PRERAYOENEMIGO;
					}
					i++;
				}
				i = filaCabezaEnemigo;
				while(i <= 19 && Mapa[columnaEnemigo+2][i][0] != MURO) {
					if(Mapa[columnaEnemigo+2][i][0] == NOMURO) {
					Mapa[columnaEnemigo+2][i][0] = PRERAYOENEMIGO;
					}
					i++;
				}
				i = filaCabezaEnemigo;
				while(i <= 19 && Mapa[columnaEnemigo-2][i][0] != MURO) {
					if(Mapa[columnaEnemigo-2][i][0] == NOMURO) {
					Mapa[columnaEnemigo-2][i][0] = PRERAYOENEMIGO;
					}
					i++;
				}//hacia abajo
            	break;
			default:
				break;
			}
			
			
		}
		if(columnaEnemigo<359) {
			columnaEnemigo++;
		}else { if(filaCabezaEnemigo < 18) {
			filaCabezaEnemigo++;
			columnaEnemigo = 0;
		}
			}
		

	  }
	
	break;
case 6://terminar ataque

	columnaEnemigo = 0;
	filaCabezaEnemigo = 0;
    while(columnaEnemigo < 359 || filaCabezaEnemigo < 18) {
	 if(  Mapa[columnaEnemigo][filaCabezaEnemigo][0] == cabezaEnemigo) {
			switch (Mapa[columnaEnemigo][filaCabezaEnemigo+1][0]) {
			case "Æ"://preataque hacia la izquierda
				i = columnaEnemigo;
				while(i >= 0 && Mapa[i][filaCabezaEnemigo][0] != MURO) {
					if(Mapa[i][filaCabezaEnemigo][0] == PRERAYOENEMIGO || Mapa[i][filaCabezaEnemigo][0] == NOMURO) {
					Mapa[i][filaCabezaEnemigo][0] = RAYOENEMIGO;
					}
					if((Mapa[i][filaCabezaEnemigo][0] == cabeza || Mapa[i][filaCabezaEnemigo][0] == torso) && golpeDado == false ) {
						cantidadDeVida --;
						explota = true;
						
						golpeDado = true;
					}
					i--;
				}
				break;
            case "K"://preataque hacia la derecha
            	i = columnaEnemigo;
				while(i <= 359 && Mapa[i][filaCabezaEnemigo][0] != MURO) {
					if(Mapa[i][filaCabezaEnemigo][0] == PRERAYOENEMIGO || Mapa[i][filaCabezaEnemigo][0] == NOMURO) {
					Mapa[i][filaCabezaEnemigo][0] = RAYOENEMIGO;
					}
					if((Mapa[i][filaCabezaEnemigo][0] == cabeza|| Mapa[i][filaCabezaEnemigo][0] == torso) && golpeDado == false) {
						cantidadDeVida --;
						explota = true;
						golpeDado = true;
					}
					i++;
				}
				break;
            case "Ý"://preataque hacia arriba
            	i = filaCabezaEnemigo;
				while(i >= 0 && Mapa[columnaEnemigo][i][0] != MURO) {
					if(Mapa[columnaEnemigo][i][0] == PRERAYOENEMIGO || Mapa[columnaEnemigo][i][0] == NOMURO) {
					Mapa[columnaEnemigo][i][0] = RAYOENEMIGO;
					}
					if((Mapa[columnaEnemigo][i][0] == cabeza || Mapa[columnaEnemigo][i][0] == torso) && golpeDado == false) {
						cantidadDeVida --;
						explota = true;
						golpeDado = true;
					}
					i--;
				}
	            break;
            case "M"://preataque hacia abajo
            	i = filaCabezaEnemigo;
				while(i <= 19 && Mapa[columnaEnemigo][i][0] != MURO) {
					if(Mapa[columnaEnemigo][i][0] == PRERAYOENEMIGO || Mapa[columnaEnemigo][i][0] == NOMURO) {
					Mapa[columnaEnemigo][i][0] = RAYOENEMIGO;
					}
					if((Mapa[columnaEnemigo][i][0] == cabeza || Mapa[columnaEnemigo][i][0] == torso ) && golpeDado == false) {
						cantidadDeVida --;
						explota = true;
						golpeDado = true;
					}
					i++;
				}
	            break;
            case "¥":
            	i = columnaEnemigo;
				while(i >= 0 && Mapa[i][filaCabezaEnemigo][0] != MURO) {
					if(Mapa[i][filaCabezaEnemigo][0] == PRERAYOENEMIGO || Mapa[i][filaCabezaEnemigo][0] == NOMURO) {
					Mapa[i][filaCabezaEnemigo][0] = RAYOENEMIGO;
					}
					if((Mapa[i][filaCabezaEnemigo][0] == cabeza || Mapa[i][filaCabezaEnemigo][0] == torso) && golpeDado == false ) {
						cantidadDeVida --;
						explota = true;
						
						golpeDado = true;
					}
					i--;
				}
				i = columnaEnemigo;
				while(i >= 0 && Mapa[i][filaCabezaEnemigo-2][0] != MURO) {
					if(Mapa[i][filaCabezaEnemigo-2][0] == PRERAYOENEMIGO || Mapa[i][filaCabezaEnemigo-2][0] == NOMURO) {
					Mapa[i][filaCabezaEnemigo-2][0] = RAYOENEMIGO;
					}
					if((Mapa[i][filaCabezaEnemigo-2][0] == cabeza || Mapa[i][filaCabezaEnemigo-2][0] == torso) && golpeDado == false ) {
						cantidadDeVida --;
						explota = true;
						
						golpeDado = true;
					}
					i--;
				}
				i = columnaEnemigo;
				while(i >= 0 && Mapa[i][filaCabezaEnemigo+2][0] != MURO) {
					if(Mapa[i][filaCabezaEnemigo+2][0] == PRERAYOENEMIGO || Mapa[i][filaCabezaEnemigo+2][0] == NOMURO) {
					Mapa[i][filaCabezaEnemigo+2][0] = RAYOENEMIGO;
					}
					if((Mapa[i][filaCabezaEnemigo+2][0] == cabeza || Mapa[i][filaCabezaEnemigo+2][0] == torso) && golpeDado == false ) {
						cantidadDeVida --;
						explota = true;
						
						golpeDado = true;
					}
					i--;
				}//izquierda
				i = columnaEnemigo;
				while(i <= 359 && Mapa[i][filaCabezaEnemigo][0] != MURO) {
					if(Mapa[i][filaCabezaEnemigo][0] == PRERAYOENEMIGO || Mapa[i][filaCabezaEnemigo][0] == NOMURO) {
					Mapa[i][filaCabezaEnemigo][0] = RAYOENEMIGO;
					}
					if((Mapa[i][filaCabezaEnemigo][0] == cabeza|| Mapa[i][filaCabezaEnemigo][0] == torso) && golpeDado == false) {
						cantidadDeVida --;
						explota = true;
						golpeDado = true;
					}
					i++;
				}
				i = columnaEnemigo;
				while(i <= 359 && Mapa[i][filaCabezaEnemigo-2][0] != MURO) {
					if(Mapa[i][filaCabezaEnemigo-2][0] == PRERAYOENEMIGO || Mapa[i][filaCabezaEnemigo-2][0] == NOMURO) {
					Mapa[i][filaCabezaEnemigo-2][0] = RAYOENEMIGO;
					}
					if((Mapa[i][filaCabezaEnemigo-2][0] == cabeza|| Mapa[i][filaCabezaEnemigo-2][0] == torso) && golpeDado == false) {
						cantidadDeVida --;
						explota = true;
						golpeDado = true;
					}
					i++;
				}
				i = columnaEnemigo;
				while(i <= 359 && Mapa[i][filaCabezaEnemigo+2][0] != MURO) {
					if(Mapa[i][filaCabezaEnemigo+2][0] == PRERAYOENEMIGO || Mapa[i][filaCabezaEnemigo+2][0] == NOMURO) {
					Mapa[i][filaCabezaEnemigo+2][0] = RAYOENEMIGO;
					}
					if((Mapa[i][filaCabezaEnemigo+2][0] == cabeza|| Mapa[i][filaCabezaEnemigo+2][0] == torso) && golpeDado == false) {
						cantidadDeVida --;
						explota = true;
						golpeDado = true;
					}
					i++;
				}//derecha
				i = filaCabezaEnemigo;
				while(i >= 0 && Mapa[columnaEnemigo][i][0] != MURO) {
					if(Mapa[columnaEnemigo][i][0] == PRERAYOENEMIGO || Mapa[columnaEnemigo][i][0] == NOMURO) {
					Mapa[columnaEnemigo][i][0] = RAYOENEMIGO;
					}
					if((Mapa[columnaEnemigo][i][0] == cabeza || Mapa[columnaEnemigo][i][0] == torso) && golpeDado == false) {
						cantidadDeVida --;
						explota = true;
						golpeDado = true;
					}
					i--;
				}
				i = filaCabezaEnemigo;
				while(i >= 0 && Mapa[columnaEnemigo-2][i][0] != MURO) {
					if(Mapa[columnaEnemigo-2][i][0] == PRERAYOENEMIGO || Mapa[columnaEnemigo-2][i][0] == NOMURO) {
					Mapa[columnaEnemigo-2][i][0] = RAYOENEMIGO;
					}
					if((Mapa[columnaEnemigo-2][i][0] == cabeza || Mapa[columnaEnemigo-2][i][0] == torso) && golpeDado == false) {
						cantidadDeVida --;
						explota = true;
						golpeDado = true;
					}
					i--;
				}
				i = filaCabezaEnemigo;
				while(i >= 0 && Mapa[columnaEnemigo+2][i][0] != MURO) {
					if(Mapa[columnaEnemigo+2][i][0] == PRERAYOENEMIGO || Mapa[columnaEnemigo+2][i][0] == NOMURO) {
					Mapa[columnaEnemigo+2][i][0] = RAYOENEMIGO;
					}
					if((Mapa[columnaEnemigo+2][i][0] == cabeza || Mapa[columnaEnemigo+2][i][0] == torso) && golpeDado == false) {
						cantidadDeVida --;
						explota = true;
						golpeDado = true;
					}
					i--;
				}//arriba
				i = filaCabezaEnemigo;
				while(i <= 19 && Mapa[columnaEnemigo][i][0] != MURO) {
					if(Mapa[columnaEnemigo][i][0] == PRERAYOENEMIGO || Mapa[columnaEnemigo][i][0] == NOMURO) {
					Mapa[columnaEnemigo][i][0] = RAYOENEMIGO;
					}
					if((Mapa[columnaEnemigo][i][0] == cabeza || Mapa[columnaEnemigo][i][0] == torso ) && golpeDado == false) {
						cantidadDeVida --;
						explota = true;
						golpeDado = true;
					}
					i++;
				}
				i = filaCabezaEnemigo;
				while(i <= 19 && Mapa[columnaEnemigo-2][i][0] != MURO) {
					if(Mapa[columnaEnemigo-2][i][0] == PRERAYOENEMIGO || Mapa[columnaEnemigo-2][i][0] == NOMURO) {
					Mapa[columnaEnemigo-2][i][0] = RAYOENEMIGO;
					}
					if((Mapa[columnaEnemigo-2][i][0] == cabeza || Mapa[columnaEnemigo-2][i][0] == torso ) && golpeDado == false) {
						cantidadDeVida --;
						explota = true;
						golpeDado = true;
					}
					i++;
				}
				i = filaCabezaEnemigo;
				while(i <= 19 && Mapa[columnaEnemigo+2][i][0] != MURO) {
					if(Mapa[columnaEnemigo+2][i][0] == PRERAYOENEMIGO || Mapa[columnaEnemigo+2][i][0] == NOMURO) {
					Mapa[columnaEnemigo+2][i][0] = RAYOENEMIGO;
					}
					if((Mapa[columnaEnemigo+2][i][0] == cabeza || Mapa[columnaEnemigo+2][i][0] == torso ) && golpeDado == false) {
						cantidadDeVida --;
						explota = true;
						golpeDado = true;
					}
					i++;
				}//abajo
            	break;
			default:
				break;
			}
			
			
		}
		if(columnaEnemigo<359) {
			columnaEnemigo++;
		}else { if(filaCabezaEnemigo < 18) {
			filaCabezaEnemigo++;
			columnaEnemigo = 0;
		}
			}
		

	  }
	
	
	break;
case 7://terminar ataque

	columnaEnemigo = 0;
	filaCabezaEnemigo = 0;
    while(columnaEnemigo < 359 || filaCabezaEnemigo < 18) {
	 if(  Mapa[columnaEnemigo][filaCabezaEnemigo][0] == cabezaEnemigo) {
			switch (Mapa[columnaEnemigo][filaCabezaEnemigo+1][0]) {
			case "Æ"://preataque hacia la izquierda
				i = columnaEnemigo;
				while(i >= 0 && Mapa[i][filaCabezaEnemigo][0] != MURO) {
					if(Mapa[i][filaCabezaEnemigo][0] == PRERAYOENEMIGO || Mapa[i][filaCabezaEnemigo][0] == NOMURO) {
					Mapa[i][filaCabezaEnemigo][0] = RAYO;
					}
					if((Mapa[i][filaCabezaEnemigo][0] == cabeza || Mapa[i][filaCabezaEnemigo][0] == torso) && golpeDado == false ) {
						cantidadDeVida --;
						explota = true;
						
						golpeDado = true;
					}
					i--;
				}
				break;
            case "K"://preataque hacia la derecha
            	i = columnaEnemigo;
				while(i <= 359 && Mapa[i][filaCabezaEnemigo][0] != MURO) {
					if(Mapa[i][filaCabezaEnemigo][0] == PRERAYOENEMIGO || Mapa[i][filaCabezaEnemigo][0] == NOMURO) {
					Mapa[i][filaCabezaEnemigo][0] = RAYO;
					}
					if((Mapa[i][filaCabezaEnemigo][0] == cabeza|| Mapa[i][filaCabezaEnemigo][0] == torso) && golpeDado == false) {
						cantidadDeVida --;
						explota = true;
						golpeDado = true;
					}
					i++;
				}
				break;
            case "Ý"://preataque hacia arriba
            	i = filaCabezaEnemigo;
				while(i >= 0 && Mapa[columnaEnemigo][i][0] != MURO) {
					if(Mapa[columnaEnemigo][i][0] == PRERAYOENEMIGO || Mapa[columnaEnemigo][i][0] == NOMURO) {
					Mapa[columnaEnemigo][i][0] = RAYO;
					}
					if((Mapa[columnaEnemigo][i][0] == cabeza || Mapa[columnaEnemigo][i][0] == torso) && golpeDado == false) {
						cantidadDeVida --;
						explota = true;
						golpeDado = true;
					}
					i--;
				}
	            break;
            case "M"://preataque hacia abajo
            	i = filaCabezaEnemigo;
				while(i <= 19 && Mapa[columnaEnemigo][i][0] != MURO) {
					if(Mapa[columnaEnemigo][i][0] == PRERAYOENEMIGO || Mapa[columnaEnemigo][i][0] == NOMURO) {
					Mapa[columnaEnemigo][i][0] = RAYO;
					}
					if((Mapa[columnaEnemigo][i][0] == cabeza || Mapa[columnaEnemigo][i][0] == torso ) && golpeDado == false) {
						cantidadDeVida --;
						explota = true;
						golpeDado = true;
					}
					i++;
				}
	            break;
            case "¥":
            	i = columnaEnemigo;
				while(i >= 0 && Mapa[i][filaCabezaEnemigo][0] != MURO) {
					if(Mapa[i][filaCabezaEnemigo][0] == PRERAYOENEMIGO || Mapa[i][filaCabezaEnemigo][0] == NOMURO) {
					Mapa[i][filaCabezaEnemigo][0] = RAYO;
					}
					if((Mapa[i][filaCabezaEnemigo][0] == cabeza || Mapa[i][filaCabezaEnemigo][0] == torso) && golpeDado == false ) {
						cantidadDeVida --;
						explota = true;
						
						golpeDado = true;
					}
					i--;
				}
				i = columnaEnemigo;
				while(i >= 0 && Mapa[i][filaCabezaEnemigo-2][0] != MURO) {
					if(Mapa[i][filaCabezaEnemigo-2][0] == PRERAYOENEMIGO || Mapa[i][filaCabezaEnemigo-2][0] == NOMURO) {
					Mapa[i][filaCabezaEnemigo-2][0] = RAYO;
					}
					if((Mapa[i][filaCabezaEnemigo-2][0] == cabeza || Mapa[i][filaCabezaEnemigo-2][0] == torso) && golpeDado == false ) {
						cantidadDeVida --;
						explota = true;
						
						golpeDado = true;
					}
					i--;
				}
				i = columnaEnemigo;
				while(i >= 0 && Mapa[i][filaCabezaEnemigo+2][0] != MURO) {
					if(Mapa[i][filaCabezaEnemigo+2][0] == PRERAYOENEMIGO || Mapa[i][filaCabezaEnemigo+2][0] == NOMURO) {
					Mapa[i][filaCabezaEnemigo+2][0] = RAYO;
					}
					if((Mapa[i][filaCabezaEnemigo+2][0] == cabeza || Mapa[i][filaCabezaEnemigo+2][0] == torso) && golpeDado == false ) {
						cantidadDeVida --;
						explota = true;
						
						golpeDado = true;
					}
					i--;
				}//izquierda
				i = columnaEnemigo;
				while(i <= 359 && Mapa[i][filaCabezaEnemigo][0] != MURO) {
					if(Mapa[i][filaCabezaEnemigo][0] == PRERAYOENEMIGO || Mapa[i][filaCabezaEnemigo][0] == NOMURO) {
					Mapa[i][filaCabezaEnemigo][0] = RAYO;
					}
					if((Mapa[i][filaCabezaEnemigo][0] == cabeza|| Mapa[i][filaCabezaEnemigo][0] == torso) && golpeDado == false) {
						cantidadDeVida --;
						explota = true;
						golpeDado = true;
					}
					i++;
				}
				i = columnaEnemigo;
				while(i <= 359 && Mapa[i][filaCabezaEnemigo-2][0] != MURO) {
					if(Mapa[i][filaCabezaEnemigo-2][0] == PRERAYOENEMIGO || Mapa[i][filaCabezaEnemigo-2][0] == NOMURO) {
					Mapa[i][filaCabezaEnemigo-2][0] = RAYO;
					}
					if((Mapa[i][filaCabezaEnemigo-2][0] == cabeza|| Mapa[i][filaCabezaEnemigo-2][0] == torso) && golpeDado == false) {
						cantidadDeVida --;
						explota = true;
						golpeDado = true;
					}
					i++;
				}
				i = columnaEnemigo;
				while(i <= 359 && Mapa[i][filaCabezaEnemigo+2][0] != MURO) {
					if(Mapa[i][filaCabezaEnemigo+2][0] == PRERAYOENEMIGO || Mapa[i][filaCabezaEnemigo+2][0] == NOMURO) {
					Mapa[i][filaCabezaEnemigo+2][0] = RAYO;
					}
					if((Mapa[i][filaCabezaEnemigo+2][0] == cabeza|| Mapa[i][filaCabezaEnemigo+2][0] == torso) && golpeDado == false) {
						cantidadDeVida --;
						explota = true;
						golpeDado = true;
					}
					i++;
				}//derecha
				i = filaCabezaEnemigo;
				while(i >= 0 && Mapa[columnaEnemigo][i][0] != MURO) {
					if(Mapa[columnaEnemigo][i][0] == PRERAYOENEMIGO || Mapa[columnaEnemigo][i][0] == NOMURO) {
					Mapa[columnaEnemigo][i][0] = RAYO;
					}
					if((Mapa[columnaEnemigo][i][0] == cabeza || Mapa[columnaEnemigo][i][0] == torso) && golpeDado == false) {
						cantidadDeVida --;
						explota = true;
						golpeDado = true;
					}
					i--;
				}
				i = filaCabezaEnemigo;
				while(i >= 0 && Mapa[columnaEnemigo-2][i][0] != MURO) {
					if(Mapa[columnaEnemigo-2][i][0] == PRERAYOENEMIGO || Mapa[columnaEnemigo-2][i][0] == NOMURO) {
					Mapa[columnaEnemigo-2][i][0] = RAYO;
					}
					if((Mapa[columnaEnemigo-2][i][0] == cabeza || Mapa[columnaEnemigo-2][i][0] == torso) && golpeDado == false) {
						cantidadDeVida --;
						explota = true;
						golpeDado = true;
					}
					i--;
				}
				i = filaCabezaEnemigo;
				while(i >= 0 && Mapa[columnaEnemigo+2][i][0] != MURO) {
					if(Mapa[columnaEnemigo+2][i][0] == PRERAYOENEMIGO || Mapa[columnaEnemigo+2][i][0] == NOMURO) {
					Mapa[columnaEnemigo+2][i][0] = RAYO;
					}
					if((Mapa[columnaEnemigo+2][i][0] == cabeza || Mapa[columnaEnemigo+2][i][0] == torso) && golpeDado == false) {
						cantidadDeVida --;
						explota = true;
						golpeDado = true;
					}
					i--;
				}//arriba
				i = filaCabezaEnemigo;
				while(i <= 19 && Mapa[columnaEnemigo][i][0] != MURO) {
					if(Mapa[columnaEnemigo][i][0] == PRERAYOENEMIGO || Mapa[columnaEnemigo][i][0] == NOMURO) {
					Mapa[columnaEnemigo][i][0] = RAYO;
					}
					if((Mapa[columnaEnemigo][i][0] == cabeza || Mapa[columnaEnemigo][i][0] == torso ) && golpeDado == false) {
						cantidadDeVida --;
						explota = true;
						golpeDado = true;
					}
					i++;
				}
				i = filaCabezaEnemigo;
				while(i <= 19 && Mapa[columnaEnemigo-2][i][0] != MURO) {
					if(Mapa[columnaEnemigo-2][i][0] == PRERAYOENEMIGO || Mapa[columnaEnemigo-2][i][0] == NOMURO) {
					Mapa[columnaEnemigo-2][i][0] = RAYO;
					}
					if((Mapa[columnaEnemigo-2][i][0] == cabeza || Mapa[columnaEnemigo-2][i][0] == torso ) && golpeDado == false) {
						cantidadDeVida --;
						explota = true;
						golpeDado = true;
					}
					i++;
				}
				i = filaCabezaEnemigo;
				while(i <= 19 && Mapa[columnaEnemigo+2][i][0] != MURO) {
					if(Mapa[columnaEnemigo+2][i][0] == PRERAYOENEMIGO || Mapa[columnaEnemigo+2][i][0] == NOMURO) {
					Mapa[columnaEnemigo+2][i][0] = RAYO;
					}
					if((Mapa[columnaEnemigo+2][i][0] == cabeza || Mapa[columnaEnemigo+2][i][0] == torso ) && golpeDado == false) {
						cantidadDeVida --;
						explota = true;
						golpeDado = true;
					}
					i++;
				}//abajo
            	break;
			default:
				break;
			}
			
			
		}
		if(columnaEnemigo<359) {
			columnaEnemigo++;
		}else { if(filaCabezaEnemigo < 18) {
			filaCabezaEnemigo++;
			columnaEnemigo = 0;
		}
			}
		

	  }
	
	
	break;
case 8:// borrar el escudo
	columnaEnemigo = 0;
	filaCabezaEnemigo = 0;
	while(columnaEnemigo < 359 || filaCabezaEnemigo < 18) {
    if(  Mapa[columnaEnemigo][filaCabezaEnemigo][0] == ESCUDOENEMIGO[0] || Mapa[columnaEnemigo][filaCabezaEnemigo][0] == ESCUDOENEMIGO[1] || Mapa[columnaEnemigo][filaCabezaEnemigo][0] == ESCUDOENEMIGO[2] || Mapa[columnaEnemigo][filaCabezaEnemigo][0] == ESCUDOENEMIGO[3] || Mapa[columnaEnemigo][filaCabezaEnemigo][0] == PRERAYOENEMIGO || Mapa[columnaEnemigo][filaCabezaEnemigo][0] == RAYOENEMIGO || Mapa[columnaEnemigo][filaCabezaEnemigo][0] == RAYO ) {
		switch (Mapa[columnaEnemigo][filaCabezaEnemigo][0]) {
			case "\033[31m" + "├" + "\u001B[0m"://asignacion de escudo hacia la izquierda
				
				Mapa[columnaEnemigo][filaCabezaEnemigo][0] = Mapa[columnaEnemigo][filaCabezaEnemigo][1];
				if(Mapa[columnaEnemigo][filaCabezaEnemigo+1][0] == "├") {
				Mapa[columnaEnemigo][filaCabezaEnemigo+1][0] = Mapa[columnaEnemigo][filaCabezaEnemigo+1][1];
				}
				i = columnaEnemigo;
				
				break;
          case  "\033[31m" + "┤" + "\u001B[0m"://asignacion de escudo hacia la derecha
          
  				Mapa[columnaEnemigo][filaCabezaEnemigo][0] = Mapa[columnaEnemigo][filaCabezaEnemigo][1];
  				if(Mapa[columnaEnemigo][filaCabezaEnemigo+1][0] == "┤") {
  				Mapa[columnaEnemigo][filaCabezaEnemigo+1][0] = Mapa[columnaEnemigo][filaCabezaEnemigo+1][1];
  				}
  				i = columnaEnemigo;
  				
				break;
          case "\033[31m" + "┬" + "\u001B[0m"://asignacion de escudo hacia arriba
          
  				Mapa[columnaEnemigo][filaCabezaEnemigo][0] = Mapa[columnaEnemigo][filaCabezaEnemigo][1];
  				
  				i = filaCabezaEnemigo;
  				
	            break;
          case  "\033[31m" + "┴" + "\u001B[0m"://asignacion de escudo hacia abajo
          	
  				Mapa[columnaEnemigo][filaCabezaEnemigo][0] = Mapa[columnaEnemigo][filaCabezaEnemigo][1];
	
  				i = filaCabezaEnemigo;
  				
	            break;
          case RAYO:
        	  if(filaCabezaEnemigo < 18) {
        	  Mapa[columnaEnemigo][filaCabezaEnemigo][0] = Mapa[columnaEnemigo][filaCabezaEnemigo][1];
        	  }
        	  break;
          case RAYOENEMIGO:
          case PRERAYOENEMIGO:
        	  Mapa[columnaEnemigo][filaCabezaEnemigo][0] = Mapa[columnaEnemigo][filaCabezaEnemigo][1];
                break;
			default:
				break;
			}
			
			
		}
		if(columnaEnemigo<359) {
			columnaEnemigo++;
		}else { if(filaCabezaEnemigo < 18) {
			filaCabezaEnemigo++;
			columnaEnemigo = 0;
		}
			}
		

	  }
	
	break;

}


	if(columnaEnemigo<359) {
		columnaEnemigo++;
	}else { if(filaCabezaEnemigo < 18) {
		filaCabezaEnemigo++;
		columnaEnemigo = 0;
	}
		}
	

}  
  public String movimientoEnemigos(String estado) {

	  
	  bandera = false;
	  columnaEnemigo = 0;
	  filaCabezaEnemigo = 0;
	  while(columnaEnemigo < 359 || filaCabezaEnemigo < 18) {
	  if(  Mapa[columnaEnemigo][filaCabezaEnemigo][0] == cabezaEnemigo) {
		if(Mapa[columnaEnemigo][filaCabezaEnemigo+1][0] == NOMURO)  {
			if (columnaEnemigo < 340) {
				Mapa[columnaEnemigo][filaCabezaEnemigo+1][0] = "X" ;
			}else {
				Mapa[columnaEnemigo][filaCabezaEnemigo+1][0] = "¥";
			}
		}
		  bandera = true;
			if(columna < columnaEnemigo && Mapa[columnaEnemigo][filaCabezaEnemigo+1][0] != "X" && Mapa[columnaEnemigo][filaCabezaEnemigo+1][0] != "¥"){
				torsoEnemigo = Mapa[columnaEnemigo][filaCabezaEnemigo+1][0];
				Mapa[columnaEnemigo][filaCabezaEnemigo][0] = Mapa[columnaEnemigo][filaCabezaEnemigo][1];
			    Mapa[columnaEnemigo][filaCabezaEnemigo+1][0] = Mapa[columnaEnemigo][filaCabezaEnemigo+1][1];
				  i = columnaEnemigo;
				  
					while(Mapa[i-1][filaCabezaEnemigo][0] == NOMURO && Mapa[i-1][filaCabezaEnemigo+1][0] == NOMURO && i > columnaEnemigo - 4 && i > 1 ){
						i--;
					}
		
				  	Mapa[i][filaCabezaEnemigo][0] = cabezaEnemigo;
				 	Mapa[i][filaCabezaEnemigo+1][0] = torsoEnemigo;
				 	 	
				  
				  	
			  }else { if(columna > columnaEnemigo && Mapa[columnaEnemigo][filaCabezaEnemigo+1][0] != "X" && Mapa[columnaEnemigo][filaCabezaEnemigo+1][0] != "¥") {
				  torsoEnemigo =   Mapa[columnaEnemigo][filaCabezaEnemigo+1][0];
				  Mapa[columnaEnemigo][filaCabezaEnemigo][0] = Mapa[columnaEnemigo][filaCabezaEnemigo][1];
				  Mapa[columnaEnemigo][filaCabezaEnemigo+1][0] = Mapa[columnaEnemigo][filaCabezaEnemigo+1][1];
				  i = columnaEnemigo; 
					while(Mapa[i+1][filaCabezaEnemigo][0] == NOMURO && Mapa[i+1][filaCabezaEnemigo+1][0] == NOMURO && i < columnaEnemigo + 4 && i < 358 ){
						i++;
					}
					
				  	Mapa[i][filaCabezaEnemigo][0] = cabezaEnemigo;
				 	Mapa[i][filaCabezaEnemigo+1][0] = torsoEnemigo;
				 	
				  	
				
			  }else {
				  //ataquelllll
				  
				  
				  
				  
				  
				  
			  }
				  
			  }
			  if(Mapa[columnaEnemigo][filaCabezaEnemigo+1][0] == "X") {
				  if(	Mapa[columnaEnemigo-1][filaCabezaEnemigo][0] == NOMURO && Mapa[columnaEnemigo-1][filaCabezaEnemigo+1][0] == NOMURO) {
						Mapa[columnaEnemigo-1][filaCabezaEnemigo][0] = ESCUDOENEMIGO[0];
						Mapa[columnaEnemigo-1][filaCabezaEnemigo+1][0] = ESCUDOENEMIGO[0];
						}
		                   if(	Mapa[columnaEnemigo+1][filaCabezaEnemigo][0] == NOMURO && Mapa[columnaEnemigo+1][filaCabezaEnemigo+1][0] == NOMURO) {
						Mapa[columnaEnemigo+1][filaCabezaEnemigo][0] = ESCUDOENEMIGO[1];
						Mapa[columnaEnemigo+1][filaCabezaEnemigo+1][0] = ESCUDOENEMIGO[1];
		              }
		                   if(	Mapa[columnaEnemigo][filaCabezaEnemigo-1][0] == NOMURO) {
		       		Mapa[columnaEnemigo][filaCabezaEnemigo-1][0] = ESCUDOENEMIGO[2];
		       		}
		                   if(	Mapa[columnaEnemigo][filaCabezaEnemigo+2][0] == NOMURO) {
		       		Mapa[columnaEnemigo][filaCabezaEnemigo+2][0] = ESCUDOENEMIGO[3];
		       		}    
			  }
				  
				  if(Mapa[columnaEnemigo][filaCabezaEnemigo+1][0] == "¥") {
					  
					  torsoEnemigo = "¥";
					  Mapa[columnaEnemigo][filaCabezaEnemigo][0] = Mapa[columnaEnemigo][filaCabezaEnemigo][1];
					    Mapa[columnaEnemigo][filaCabezaEnemigo+1][0] = Mapa[columnaEnemigo][filaCabezaEnemigo+1][1];
					    i = filaCabezaEnemigo;
					    
				  		if(filaCabeza > filaCabezaEnemigo) {
				  			
							 
							  while( Mapa[columnaEnemigo][i+2][0] == NOMURO && i < filaCabezaEnemigo + 4 && i < 16 ){
									i++;
								}
			
				  		}else {
				  
							  while(Mapa[columnaEnemigo][i-2][0] == NOMURO && Mapa[columnaEnemigo][i-2][0] == NOMURO && i > filaCabezaEnemigo - 4 && i > 4 ){
									i--;
								}
				
				  		}
				  		Mapa[columnaEnemigo][i][0] = cabezaEnemigo;
					 	Mapa[columnaEnemigo][i+1][0] = torsoEnemigo;
				  	}
			  
		}
		if(columnaEnemigo<359) {
			columnaEnemigo++;
		}else { if(filaCabezaEnemigo < 18) {
			filaCabezaEnemigo++;
			columnaEnemigo = 0;
		}
			}
		

	  }//findelwhile
	  if(bandera == false) {
		  estado = "ganado";
		  return estado;
	  }return estado;
  }
  public String setAccion(String orden, String estado, int nivelActual) {
	 
	  if(columna > 290) {
	System.out.println("\033[31m"+"Para atravesar esos escudos utiliza el comando \"MODORANGERLEGENDARIO\" y demuestra todo tu potencial.\n(PD: recuerda sacar la mayuscula para volver a moverte.)\n Y puedes volver a tu forma normal con el comando \"MODORANGER\""+"\u001B[0m");
	  }
	  
	if(columna < 359) {
	  if(Mapa[columna+1][filaTorso][0] == cabeza) {
		  Mapa[columna+1][filaTorso][0] = Mapa[columna+1][filaTorso][1];
		  Mapa[columna][filaCabeza][0] = cabeza;
	  }}
	  
	if(modoRangerLegendario == false) {
	switch (orden) {
	case "d"://derecha
		if( columna+1 < 359 && Mapa[columna+1][filaCabeza][0] != ESCUDOENEMIGO[0] && Mapa[columna+1][filaTorso][0] != MURO ) {
		i = columna+1;
		while(Mapa[i+1][filaCabeza][0] != MURO && Mapa[i+1][filaTorso][0] !=MURO && i < columna + 10 && i < 358 && Mapa[i+1][filaCabeza][0] != ESCUDOENEMIGO[0] ){
			Mapa[i][filaCabeza+1][2] = ESTELA;
			if(Mapa[i][filaCabeza][0] == cabezaEnemigo || Mapa[i][filaTorso][0] == cabezaEnemigo) {
		  		explota = true;
		  		if(Mapa[i][filaTorso][0] == cabezaEnemigo) {
		  		Mapa[i][filaTorso+1][0] = Mapa[i][filaTorso+1][1];}
		  	}
			Mapa[i][filaCabeza][0] = Mapa[i][filaCabeza][1];
			i++;
		}
	  	Mapa[i][filaCabeza][0] = cabeza;
	 	Mapa[i][filaTorso][0] = torso;
	 	
	 	Mapa[columna][filaCabeza][0] = Mapa[columna][filaCabeza][1];
	 	Mapa[columna][filaTorso][0] = Mapa[columna][filaTorso][1];
	 
	  	columna = i;}
		

		break;
	case "a"://izquierda
		if( columna-1 > 0 && Mapa[columna-1][filaCabeza][0] != ESCUDOENEMIGO[1] && Mapa[columna-1][filaTorso][0] != MURO ) {
		i = columna-1;
		
		while(Mapa[i-1][filaCabeza][0] != MURO && Mapa[i-1][filaTorso][0] != MURO && i > columna - 10 && i > 1 && Mapa[i-1][filaCabeza][0] != ESCUDOENEMIGO[1]){
			Mapa[i][filaCabeza+1][2] = ESTELA;
			if(Mapa[i][filaCabeza][0] == cabezaEnemigo || Mapa[i][filaTorso][0] == cabezaEnemigo) {
		  		explota = true;
		  		if(Mapa[i][filaTorso][0] == cabezaEnemigo) {
			  		Mapa[i][filaTorso+1][0] = Mapa[i][filaTorso+1][1];}
		  	}
			Mapa[i][filaCabeza][0] = Mapa[i][filaCabeza][1];
			i--;
		}
	
	  	Mapa[i][filaCabeza][0] = cabeza;
	 	Mapa[i][filaTorso][0] = torso;
	 	
	 	Mapa[columna][filaCabeza][0] = Mapa[columna][filaCabeza][1];
	 	Mapa[columna][filaTorso][0] = Mapa[columna][filaTorso][1];
	 
	  	
	  	columna = i;}
		break;
	case "w"://subir 
		if( filaCabeza-1 > 0  && Mapa[columna][filaCabeza-1][0] != ESCUDOENEMIGO[3] && Mapa[columna][filaCabeza-1][0] != MURO ) {
		i = filaCabeza - 1;
		while(Mapa[columna][i-1][0] !=MURO && i > filaCabeza - 2 && i > 1  && Mapa[columna][i-1][0] != ESCUDOENEMIGO[3]){
			Mapa[columna][i+1][2] = ESTELA;
			
            i--;
		}
		
		if(Mapa[columna][i][0] == cabezaEnemigo) {
	  		explota = true;
	  	}
		Mapa[columna][filaCabeza][0] = Mapa[columna][filaCabeza][1];
	 	Mapa[columna][filaTorso][0] = Mapa[columna][filaTorso][1];
		
	  	Mapa[columna][i][0] = cabeza;
	 	Mapa[columna][i + 1][0] =torso;
	 	
	 	
	 	
	  	
	  	filaCabeza = i;
	  	filaTorso = i+1;}
		break;
	case "s"://bajar
		if( filaCabeza+1 < 18 && Mapa[columna][filaCabeza+2][0] != MURO && Mapa[columna][filaCabeza+2][0] != ESCUDOENEMIGO[2] ) {
		i = filaCabeza + 1;
		while( Mapa[columna][i+2][0] != MURO  && i < 17  && Mapa[columna][i+2][0] != ESCUDOENEMIGO[2]){
			Mapa[columna][i][2] = ESTELA;
			i++;
		}
		if(Mapa[columna][i][0] == cabezaEnemigo) {
	  		explota = true;
	  	}
	 	Mapa[columna][filaCabeza][0] = Mapa[columna][filaCabeza][1];
	 	Mapa[columna][filaTorso][0] = Mapa[columna][filaTorso][1] ;
	 	
	 	Mapa[columna][i][0] = cabeza;
	 	Mapa[columna][i + 1][0] = torso;
	 
	  	filaCabeza = i;
	  	filaTorso = i+1;
		}
	  	if( Mapa[columna][filaTorso+1][0] == MURO && columna < 359 && Mapa[columna+1][filaTorso][0] != MURO ) {
	  		Mapa[columna][filaCabeza][0] = Mapa[columna][filaCabeza][1];
	  		Mapa[columna+1][filaTorso][0] = cabeza;
	  		
	  	}
	  	
		break;
	case "MODORANGERLEGENDARIO":
		explota = true;
		modoRangerLegendario = true;
	     break;
	case "p":
		estado = "pausa";
		break;
	default:
		break;
		
		
	}}else {//modo ranger legedario
		
		switch (orden) {
		case "d"://derecha
			
	  		
			if( columna+1 < 359 && Mapa[columna+1][filaTorso][0] != MURO) {
			i = columna+1;
			while(Mapa[i+1][filaCabeza][0] != MURO && Mapa[i+1][filaTorso][0] != MURO && i < columna + 40 && i < 358 ){
				Mapa[i][filaCabeza+1][0] = Mapa[i][filaCabeza+1][1];
				Mapa[i][filaCabeza][2] = SUPERESTELA;
				i++;
				if(Mapa[i][filaCabeza][0] == cabezaEnemigo || Mapa[i][filaTorso][0] == cabezaEnemigo) {
					boom = true;
					lado = true;
					if(Mapa[i][filaTorso][0] == cabezaEnemigo) {
				  		Mapa[i][filaTorso+1][0] = Mapa[i][filaTorso+1][1];}
				}
				}
		  	Mapa[i][filaCabeza][0] = cabeza;
		 	Mapa[i][filaTorso][0] = torso;
		 	
		 	Mapa[columna][filaCabeza][0] = Mapa[columna][filaCabeza][1];
		 	Mapa[columna][filaTorso][0] = Mapa[columna][filaTorso][1];
		 
		  	columna = i;}
			

			break;
		case "a"://izquierda
			
	  		
			if( columna-1 > 0 && Mapa[columna-1][filaTorso][0]!= MURO) {
			i = columna-1;
			
			while(Mapa[i-1][filaCabeza][0] != MURO && Mapa[i-1][filaTorso][0]!= MURO && i > columna - 40 && i > 1 ){
				Mapa[i][filaCabeza+1][0] = Mapa[i][filaCabeza+1][1];
				Mapa[i][filaCabeza][2] = SUPERESTELA;
				i--;
				if(Mapa[i][filaCabeza][0] == cabezaEnemigo || Mapa[i][filaTorso][0] == cabezaEnemigo) {
					boom = true;
					lado=false;
					if(Mapa[i][filaTorso][0] == cabezaEnemigo) {
				  		Mapa[i][filaTorso+1][0] = Mapa[i][filaTorso+1][1];}
				}
			}
			
		  	Mapa[i][filaCabeza][0] = cabeza;
		 	Mapa[i][filaTorso][0] = torso;
		 	
		 	Mapa[columna][filaCabeza][0] = Mapa[columna][filaCabeza][1];
		 	Mapa[columna][filaTorso][0] = Mapa[columna][filaTorso][1];
		 
		  	
		  	columna = i;}
			break;
		case "w"://subir
			if( filaCabeza-1 > 1 && Mapa[columna][filaCabeza-1][0] !=MURO ) {
			i = filaCabeza - 1;
			while(Mapa[columna][i-1][0] !=MURO  && i > 1){
				Mapa[columna][i+1][2] = SUPERESTELA;
	            i--;
	            if(Mapa[columna][i][0] == cabezaEnemigo) {
			  		explota = true;
			  	}
			}
		 	Mapa[columna][filaCabeza][0] = Mapa[columna][filaCabeza][1];
		 	Mapa[columna][filaTorso][0] = Mapa[columna][filaTorso][1];
		 	
		 	Mapa[columna][i][0] = cabeza;
		 	Mapa[columna][i + 1][0] =torso;
		 	
		  	
		  	filaCabeza = i;
		  	filaTorso = i+1;}
			break;
		case "s"://bajar
			if( filaCabeza +1 < 18 && Mapa[columna][filaCabeza+2][0] != MURO ) {
			i = filaCabeza + 1;
			while( Mapa[columna][i+2][0] != MURO  && i < 17 ){
				Mapa[columna][i][2] = SUPERESTELA;
				i++;
				if(Mapa[columna][i][0] == cabezaEnemigo) {
			  		explota = true;
			  	}
			}
		 	Mapa[columna][filaCabeza][0] = Mapa[columna][filaCabeza][1];
		 	Mapa[columna][filaTorso][0] = Mapa[columna][filaTorso][1] ;
		 	
		 	Mapa[columna][i][0] = cabeza;
		 	Mapa[columna][i + 1][0] = torso;
		 
		  	filaCabeza = i;
		  	filaTorso = i+1;
			}
		  	if( Mapa[columna][filaTorso+1][0] == MURO && columna < 358 && Mapa[columna+1][filaTorso][0] != MURO ) {
		  		Mapa[columna][filaCabeza][0] = Mapa[columna][filaCabeza][1];
		  		Mapa[columna+1][filaTorso][0] = cabeza;
		  	}
		  		
		  	
			break;
		case "MODORANGER":
			explota = true;
			modoRangerLegendario = false;
		     break;
			
		case "p":
			estado = "pausa";
			break;
		default:
			break;
		}
	}
	
	//gravedad funcion
	   if(banderaDeGravedad == false && Mapa[columna][filaCabeza+2][0] == NOMURO ) {
		   contadorGravedad = 0;
		   banderaDeGravedad = true;
	   }else {
	  if(Mapa[columna][filaCabeza+2][0] == NOMURO ) {
		 contadorGravedad++;
	  }else{if(Mapa[columna][filaCabeza+2][0] == MURO ) {
		  contadorGravedad = 0;
	  }
		  }
	  }
	  if(contadorGravedad >= 6) {//si estuvo por dos turnos en el aire, baja automaticamente.
		  if( filaCabeza < 18 && Mapa[columna][filaCabeza+2][0] != MURO && Mapa[columna][filaCabeza+2][0] != ESCUDOENEMIGO[2] ) {
				i = filaCabeza ;
				while(Mapa[columna][i+2][0] != MURO && i < 17 && Mapa[columna][i+2][0] != ESCUDOENEMIGO[2]){
					Mapa[columna][i-1][2] = ESTELA;
					i++;
		
				}
                if(Mapa[columna][i][0] == cabezaEnemigo) {
			  		explota = true;
			  	}
                Mapa[columna][i][2] = Mapa[columna][i][1];
                Mapa[columna][filaCabeza][0] = Mapa[columna][filaCabeza][1];
			 	Mapa[columna][filaTorso][0] = Mapa[columna][filaTorso][1];
                
			  	Mapa[columna][i][0] = cabeza;
			 	Mapa[columna][i + 1][0] = torso;
			 	
			 	
			
			  	filaCabeza = i;
			  	filaTorso = i+1;
			  	
			  		}
		  banderaDeGravedad = false;
	  }
	if(nivelActual == 3) {
		if(filaCabeza == 17 || filaCabeza == 18) {
			cantidadDeVida = 0;
			explota = true;}
	}else {
	if(filaCabeza == 17 || filaCabeza == 18) {
		cantidadDeVida--;
		explota = true;
	}}
	return estado;
}
  public void controlDeCamara(boolean nivelFinal) {
	  if(nivelFinal == false) {
	if(columna <= 49) {
		  limiteVistaIzquierda = 0;
			limiteVistaDerecha = 129;
    }else {if(columna >= 279) {
		  limiteVistaIzquierda = 230;
			limiteVistaDerecha = 359;
	       }else {
	    	   limiteVistaIzquierda = columna - 49;
				limiteVistaDerecha = columna + 80;   
	       }
    }}
       if(nivelFinal == true) {
    	   if(columna <= 65) {
    			  limiteVistaIzquierda = 0;
    				limiteVistaDerecha = 129;
    	    }else {if(columna >= 294) {
    			  limiteVistaIzquierda = 229;
    				limiteVistaDerecha = 359;
    		       }else {
    		    	   limiteVistaIzquierda = columna - 65;
    					limiteVistaDerecha = columna + 65;   
    		       }
    	    }
       }
  }
  public void mostrar() {
		for(int i = 0; i <= 19; i++ ) {
			for(int j = limiteVistaIzquierda; j <= limiteVistaDerecha; j++ ) {
			System.out.print(    Mapa[j][i][0]);
		} System.out.print("\n");
	}
	}	
  public String barraDeVida(String estado) {
	  i = 0;
	  j = 0;
	  while(j < 359 || i < 8) {
	  if(  Mapa[j][i][0] == CORAZONLLENO || Mapa[j][i][0] == CORAZONLLENO3 || Mapa[j][i][0] == CORAZONVACIO || Mapa[j][i][0] == CORAZONVACIO3  ) {
		  Mapa[j][i][0] = Mapa[j][i][1];
	  }
	  if(j<359) {
			j++;
		}else { if(i < 8) {
			i++;
			j = 0;
		}}}
	 
	  if(columna <= 49) {
		   switch (cantidadDeVida) {
	case 6:
		Mapa[1][1][0] = CORAZONLLENO ;
		Mapa[2][1][0] = CORAZONLLENO3 ;
		Mapa[1][2][0] = CORAZONLLENO ;
		Mapa[2][2][0] = CORAZONLLENO3 ;
		Mapa[1][3][0] = CORAZONLLENO ;
		Mapa[2][3][0] = CORAZONLLENO3 ;
		Mapa[1][4][0] = CORAZONLLENO ;
		Mapa[2][4][0] = CORAZONLLENO3 ;
		Mapa[1][5][0] = CORAZONLLENO ;
		Mapa[2][5][0] = CORAZONLLENO3 ;
		Mapa[1][6][0] = CORAZONLLENO ;
		Mapa[2][6][0] = CORAZONLLENO3 ;
		break;
	case 5:
		Mapa[1][1][0] = CORAZONLLENO ;
		Mapa[2][1][0] = CORAZONLLENO3 ;
		Mapa[1][2][0] = CORAZONLLENO ;
		Mapa[2][2][0] = CORAZONLLENO3 ;
		Mapa[1][3][0] = CORAZONLLENO ;
		Mapa[2][3][0] = CORAZONLLENO3 ;
		Mapa[1][4][0] = CORAZONLLENO ;
		Mapa[2][4][0] = CORAZONLLENO3 ;
		Mapa[1][5][0] = CORAZONLLENO ;
		Mapa[2][5][0] = CORAZONLLENO3 ;
		Mapa[1][6][0] = CORAZONVACIO ;
		Mapa[2][6][0] = CORAZONVACIO3 ;
		break;
    case 4:
    	Mapa[1][1][0] = CORAZONLLENO ;
		Mapa[2][1][0] = CORAZONLLENO3 ;
		Mapa[1][2][0] = CORAZONLLENO ;
		Mapa[2][2][0] = CORAZONLLENO3 ;
		Mapa[1][3][0] = CORAZONLLENO ;
		Mapa[2][3][0] = CORAZONLLENO3 ;
		Mapa[1][4][0] = CORAZONLLENO ;
		Mapa[2][4][0] = CORAZONLLENO3 ;
		Mapa[1][5][0] = CORAZONVACIO ;
		Mapa[2][5][0] = CORAZONVACIO3 ;
		Mapa[1][6][0] = CORAZONVACIO ;
		Mapa[2][6][0] = CORAZONVACIO3 ;
    	break;
	case 3:
		//arrglar el error, tal que si el pj esta en uno de los bordes esta cosa se pasa del limite del mapa. mas otros errores, probar la pausa tambien.
		
		Mapa[1][1][0] = CORAZONLLENO ;
		Mapa[2][1][0] = CORAZONLLENO3 ;
		Mapa[1][2][0] = CORAZONLLENO ;
		Mapa[2][2][0] = CORAZONLLENO3 ;
		Mapa[1][3][0] = CORAZONLLENO ;
		Mapa[2][3][0] = CORAZONLLENO3 ;
		Mapa[1][4][0] = CORAZONVACIO ;
		Mapa[2][4][0] = CORAZONVACIO3 ;
		Mapa[1][5][0] = CORAZONVACIO ;
		Mapa[2][5][0] = CORAZONVACIO3 ;
		Mapa[1][6][0] = CORAZONVACIO ;
		Mapa[2][6][0] = CORAZONVACIO3 ;
		
		
		break;
    case 2:
    	
    	Mapa[1][1][0] = CORAZONLLENO ;
		Mapa[2][1][0] = CORAZONLLENO3 ;
    	Mapa[1][2][0] = CORAZONLLENO ;
		Mapa[2][2][0] = CORAZONLLENO3 ;
		Mapa[1][3][0] = CORAZONVACIO ;
		Mapa[2][3][0] = CORAZONVACIO3 ;
		Mapa[1][4][0] = CORAZONVACIO ;
		Mapa[2][4][0] = CORAZONVACIO3 ;
		Mapa[1][5][0] = CORAZONVACIO ;
		Mapa[2][5][0] = CORAZONVACIO3 ;
		Mapa[1][6][0] = CORAZONVACIO ;
		Mapa[2][6][0] = CORAZONVACIO3 ;
		
	
		break;
    case 1:
    	Mapa[1][1][0] = CORAZONLLENO ;
		Mapa[2][1][0] = CORAZONLLENO3 ;
    	Mapa[1][2][0] = CORAZONVACIO ;
		Mapa[2][2][0] = CORAZONVACIO3 ;
		Mapa[1][3][0] = CORAZONVACIO ;
		Mapa[2][3][0] = CORAZONVACIO3 ;
		Mapa[1][4][0] = CORAZONVACIO ;
		Mapa[2][4][0] = CORAZONVACIO3 ;
		Mapa[1][5][0] = CORAZONVACIO ;
		Mapa[2][5][0] = CORAZONVACIO3 ;
		Mapa[1][6][0] = CORAZONVACIO ;
		Mapa[2][6][0] = CORAZONVACIO3 ;
		
	    break; 
    case 0:
	default:
		estado = "perdido";
		break;
	}
	  }else {if(columna >= 289) {
		   switch (cantidadDeVida) {
	case 6:
		Mapa[241][1][0] = CORAZONLLENO ;
		Mapa[242][1][0] = CORAZONLLENO3 ;
		Mapa[241][2][0] = CORAZONLLENO ;
		Mapa[242][2][0] = CORAZONLLENO3 ;
		Mapa[241][3][0] = CORAZONLLENO ;
		Mapa[242][3][0] = CORAZONLLENO3 ;
		Mapa[241][4][0] = CORAZONLLENO ;
		Mapa[242][4][0] = CORAZONLLENO3 ;
		Mapa[241][5][0] = CORAZONLLENO ;
		Mapa[242][5][0] = CORAZONLLENO3 ;
		Mapa[241][6][0] = CORAZONLLENO ;
		Mapa[242][6][0] = CORAZONLLENO3 ;
		break;
	case 5:
		Mapa[241][1][0] = CORAZONLLENO ;
		Mapa[242][1][0] = CORAZONLLENO3 ;
		Mapa[241][2][0] = CORAZONLLENO ;
		Mapa[242][2][0] = CORAZONLLENO3 ;
		Mapa[241][3][0] = CORAZONLLENO ;
		Mapa[242][3][0] = CORAZONLLENO3 ;
		Mapa[241][4][0] = CORAZONLLENO ;
		Mapa[242][4][0] = CORAZONLLENO3 ;
		Mapa[241][5][0] = CORAZONLLENO ;
		Mapa[242][5][0] = CORAZONLLENO3 ;
		Mapa[241][6][0] = CORAZONVACIO ;
		Mapa[242][6][0] = CORAZONVACIO3 ;
		break;
   case 4:
     	Mapa[241][1][0] = CORAZONLLENO ;
		Mapa[242][1][0] = CORAZONLLENO3 ;
		Mapa[241][2][0] = CORAZONLLENO ;
		Mapa[242][2][0] = CORAZONLLENO3 ;
		Mapa[241][3][0] = CORAZONLLENO ;
		Mapa[242][3][0] = CORAZONLLENO3 ;
		Mapa[241][4][0] = CORAZONLLENO ;
		Mapa[242][4][0] = CORAZONLLENO3 ;
		Mapa[241][5][0] = CORAZONVACIO ;
		Mapa[242][5][0] = CORAZONVACIO3 ;
		Mapa[241][6][0] = CORAZONVACIO ;
		Mapa[242][6][0] = CORAZONVACIO3 ;
   	break;
	case 3:
		//arrglar el error, tal que si el pj esta en uno de los bordes esta cosa se pasa del limite del mapa. mas otros errores, probar la pausa tambien.
		
		Mapa[241][1][0] = CORAZONLLENO ;
		Mapa[242][1][0] = CORAZONLLENO3 ;
		Mapa[241][2][0] = CORAZONLLENO ;
		Mapa[242][2][0] = CORAZONLLENO3 ;
		Mapa[241][3][0] = CORAZONLLENO ;
		Mapa[242][3][0] = CORAZONLLENO3 ;
		Mapa[241][4][0] = CORAZONVACIO ;
		Mapa[242][4][0] = CORAZONVACIO3 ;
		Mapa[241][5][0] = CORAZONVACIO ;
		Mapa[242][5][0] = CORAZONVACIO3 ;
		Mapa[241][6][0] = CORAZONVACIO ;
		Mapa[242][6][0] = CORAZONVACIO3 ;
		
		break;
   case 2:
   	
   	    Mapa[241][1][0] = CORAZONLLENO ;
		Mapa[242][1][0] = CORAZONLLENO3 ;
    	Mapa[241][2][0] = CORAZONLLENO ;
		Mapa[242][2][0] = CORAZONLLENO3 ;
		Mapa[241][3][0] = CORAZONVACIO ;
		Mapa[242][3][0] = CORAZONVACIO3 ;
		Mapa[241][4][0] = CORAZONVACIO ;
		Mapa[242][4][0] = CORAZONVACIO3 ;
		Mapa[241][5][0] = CORAZONVACIO ;
		Mapa[242][5][0] = CORAZONVACIO3 ;
		Mapa[241][6][0] = CORAZONVACIO ;
		Mapa[242][6][0] = CORAZONVACIO3 ;
		
	
		break;
   case 1:
    	Mapa[241][1][0] = CORAZONLLENO ;
 		Mapa[242][1][0] = CORAZONLLENO3 ;
    	Mapa[241][2][0] = CORAZONVACIO ;
		Mapa[242][2][0] = CORAZONVACIO3 ;
		Mapa[241][3][0] = CORAZONVACIO ;
		Mapa[242][3][0] = CORAZONVACIO3 ;
		Mapa[241][4][0] = CORAZONVACIO ;
		Mapa[242][4][0] = CORAZONVACIO3 ;
		Mapa[241][5][0] = CORAZONVACIO ;
		Mapa[242][5][0] = CORAZONVACIO3 ;
		Mapa[241][6][0] = CORAZONVACIO ;
		Mapa[242][6][0] = CORAZONVACIO3 ;
		
	    break; 
   case 0:
  
		estado= "perdido";
		break;
   
	default:
		break;
	} 
	       }else {

			   switch (cantidadDeVida) {
		case 6:
			Mapa[columna-48][1][0] = CORAZONLLENO ;
			Mapa[columna-47][1][0] = CORAZONLLENO3 ;
			Mapa[columna-48][2][0] = CORAZONLLENO ;
			Mapa[columna-47][2][0] = CORAZONLLENO3 ;
			Mapa[columna-48][3][0] = CORAZONLLENO ;
			Mapa[columna-47][3][0] = CORAZONLLENO3 ;
			Mapa[columna-48][4][0] = CORAZONLLENO ;
			Mapa[columna-47][4][0] = CORAZONLLENO3 ;
			Mapa[columna-48][5][0] = CORAZONLLENO ;
			Mapa[columna-47][5][0] = CORAZONLLENO3 ;
			Mapa[columna-48][6][0] = CORAZONLLENO ;
			Mapa[columna-47][6][0] = CORAZONLLENO3 ;
			break;
		case 5:
			Mapa[columna-48][1][0] = CORAZONLLENO ;
			Mapa[columna-47][1][0] = CORAZONLLENO3 ;
			Mapa[columna-48][2][0] = CORAZONLLENO ;
			Mapa[columna-47][2][0] = CORAZONLLENO3 ;
			Mapa[columna-48][3][0] = CORAZONLLENO ;
			Mapa[columna-47][3][0] = CORAZONLLENO3 ;
			Mapa[columna-48][4][0] = CORAZONLLENO ;
			Mapa[columna-47][4][0] = CORAZONLLENO3 ;
			Mapa[columna-48][5][0] = CORAZONLLENO ;
			Mapa[columna-47][5][0] = CORAZONLLENO3 ;
			Mapa[columna-48][6][0] = CORAZONVACIO ;
			Mapa[columna-47][6][0] = CORAZONVACIO3 ;
			break;
	    case 4:
	    	Mapa[columna-48][1][0] = CORAZONLLENO ;
			Mapa[columna-47][1][0] = CORAZONLLENO3 ;
			Mapa[columna-48][2][0] = CORAZONLLENO ;
			Mapa[columna-47][2][0] = CORAZONLLENO3 ;
			Mapa[columna-48][3][0] = CORAZONLLENO ;
			Mapa[columna-47][3][0] = CORAZONLLENO3 ;
			Mapa[columna-48][4][0] = CORAZONLLENO ;
			Mapa[columna-47][4][0] = CORAZONLLENO3 ;
			Mapa[columna-48][5][0] = CORAZONVACIO ;
			Mapa[columna-47][5][0] = CORAZONVACIO3 ;
			Mapa[columna-48][6][0] = CORAZONVACIO ;
			Mapa[columna-47][6][0] = CORAZONVACIO3 ;
	    	break;
		case 3:
			//arrglar el error, tal que si el pj esta en uno de los bordes esta cosa se pasa del limite del mapa. mas otros errores, probar la pausa tambien.
			
			Mapa[columna-48][1][0] = CORAZONLLENO ;
			Mapa[columna-47][1][0] = CORAZONLLENO3 ;
			Mapa[columna-48][2][0] = CORAZONLLENO ;
			Mapa[columna-47][2][0] = CORAZONLLENO3 ;
			Mapa[columna-48][3][0] = CORAZONLLENO ;
			Mapa[columna-47][3][0] = CORAZONLLENO3 ;
			Mapa[columna-48][4][0] = CORAZONVACIO ;
			Mapa[columna-47][4][0] = CORAZONVACIO3 ;
			Mapa[columna-48][5][0] = CORAZONVACIO ;
			Mapa[columna-47][5][0] = CORAZONVACIO3 ;
			Mapa[columna-48][6][0] = CORAZONVACIO ;
			Mapa[columna-47][6][0] = CORAZONVACIO3 ;
			
			
			break;
	    case 2:
	    	
	    	Mapa[columna-48][1][0] = CORAZONLLENO ;
			Mapa[columna-47][1][0] = CORAZONLLENO3 ;
	    	Mapa[columna-48][2][0] = CORAZONLLENO ;
			Mapa[columna-47][2][0] = CORAZONLLENO3 ;
			Mapa[columna-48][3][0] = CORAZONVACIO ;
			Mapa[columna-47][3][0] = CORAZONVACIO3 ;
			Mapa[columna-48][4][0] = CORAZONVACIO ;
			Mapa[columna-47][4][0] = CORAZONVACIO3 ;
			Mapa[columna-48][5][0] = CORAZONVACIO ;
			Mapa[columna-47][5][0] = CORAZONVACIO3 ;
			Mapa[columna-48][6][0] = CORAZONVACIO ;
			Mapa[columna-47][6][0] = CORAZONVACIO3 ;
			
		
			break;
	    case 1:
	    	Mapa[columna-48][1][0] = CORAZONLLENO ;
			Mapa[columna-47][1][0] = CORAZONLLENO3 ;
	    	Mapa[columna-48][2][0] = CORAZONVACIO ;
			Mapa[columna-47][2][0] = CORAZONVACIO3 ;
			Mapa[columna-48][3][0] = CORAZONVACIO ;
			Mapa[columna-47][3][0] = CORAZONVACIO3 ;
			Mapa[columna-48][4][0] = CORAZONVACIO ;
			Mapa[columna-47][4][0] = CORAZONVACIO3 ;
			Mapa[columna-48][5][0] = CORAZONVACIO ;
			Mapa[columna-47][5][0] = CORAZONVACIO3 ;
			Mapa[columna-48][6][0] = CORAZONVACIO ;
			Mapa[columna-47][6][0] = CORAZONVACIO3 ;
			
		    break; 
	    case 0:
	   
			estado = "perdido";
			break;
	    
		default:
			break;
		}
		  
//	    	   limiteVistaIzquierda = columna - 49;
//				limiteVistaDerecha = columna + 70;   
	       }
    }
	  
	 
	 
			 
			 
  	 
	  return estado;
  }  
  public void cinematicas(boolean ordenCinematica) {
		  if(ordenCinematica == false) {
			  if(explota == true) {
				  if(filaCabeza-1 > 1) {
				  Mapa[columna-1][filaCabeza-1][0] =   EXPLOSIONJPG[0][0];
				  Mapa[columna][filaCabeza-1][0] =   EXPLOSIONJPG[0][1];
				  Mapa[columna+1][filaCabeza-1][0] =   EXPLOSIONJPG[0][2];
				  Mapa[columna+2][filaCabeza-1][0] =   EXPLOSIONJPG[0][3];
				  if(columna+9 < 358) {
				  Mapa[columna+3][filaCabeza-1][0] =   EXPLOSIONJPG[0][4];
				  Mapa[columna+4][filaCabeza-1][0] =   EXPLOSIONJPG[0][5];
				  Mapa[columna+5][filaCabeza-1][0] =   EXPLOSIONJPG[0][6];
				  Mapa[columna+6][filaCabeza-1][0] =   EXPLOSIONJPG[0][7];
				  Mapa[columna+7][filaCabeza-1][0] =   EXPLOSIONJPG[0][8];
				  Mapa[columna+8][filaCabeza-1][0] =   EXPLOSIONJPG[0][9];
				  Mapa[columna+9][filaCabeza-1][0] =   EXPLOSIONJPG[0][10];}}
				  Mapa[columna-1][filaCabeza][0] =   EXPLOSIONJPG[1][0];
				  
				  Mapa[columna][filaCabeza][0] =   EXPLOSIONJPG[1][1];
					 
				  Mapa[columna+1][filaCabeza][0] =   EXPLOSIONJPG[1][2];
				  if(filaCabeza + 1 < 18) {
			      Mapa[columna-1][filaCabeza+1][0] =   EXPLOSIONJPG[2][0];
				  Mapa[columna][filaCabeza+1][0] =   EXPLOSIONJPG[2][1];
				  Mapa[columna+1][filaCabeza+1][0] =   EXPLOSIONJPG[2][2];}
				 }
			  if(boom == true) {
			  if(lado == true) {
				  if(columna > 47) {
				  Bom[1] = columna-38;
				  Bom[4] = columna-35;
				  Bom[7] = columna-32;
				  Bom[10] = columna-29;
				  Bom[13] = columna-26;
				  Bom[16] = columna-23;}
				  if(columna > 29) {
				  Bom[19] = columna-20;
				  Bom[22] = columna-17;
				  Bom[25] = columna-14;
				  Bom[28] = columna-11;
				  Bom[31] = columna-8;
				  Bom[34] = columna-5;
				  Bom[37] = columna-2;}
			  }else {if(lado == false) {
				  if(columna < 312) {
				  Bom[1] = columna+38;
				  Bom[4] = columna+35;
				  Bom[7] = columna+32;
				  Bom[10] = columna+29;
				  Bom[13] = columna+26;
				  Bom[16] = columna+23;}
				  if(columna < 330) {
				  Bom[19] = columna+20;
				  Bom[22] = columna+17;
				  Bom[25] = columna+14;
				  Bom[28] = columna+11;
				  Bom[31] = columna+8;
				  Bom[34] = columna+5;
				  Bom[37] = columna+2;}}
			  }
				  int indice=0;
			  		while(indice < 39) {
			  		if(Bom[indice] != 0) { 
				  if(filaCabeza-1 > 0) {
				  Mapa[Bom[indice]-1][filaCabeza-1][0] =   EXPLOSIONJPG[0][0];
				  Mapa[Bom[indice]][filaCabeza-1][0] =   EXPLOSIONJPG[0][1];
				  Mapa[Bom[indice]+1][filaCabeza-1][0] =   EXPLOSIONJPG[0][2];
				  Mapa[Bom[indice]+2][filaCabeza-1][0] =   EXPLOSIONJPG[0][3];
				  if(Bom[indice]+9 < 312 && Bom[indice]-9 > 47) {
				  Mapa[Bom[indice]+3][filaCabeza-1][0] =   EXPLOSIONJPG[0][4];
				  Mapa[Bom[indice]+4][filaCabeza-1][0] =   EXPLOSIONJPG[0][5];
				  Mapa[Bom[indice]+5][filaCabeza-1][0] =   EXPLOSIONJPG[0][6];
				  Mapa[Bom[indice]+6][filaCabeza-1][0] =   EXPLOSIONJPG[0][7];
				  Mapa[Bom[indice]+7][filaCabeza-1][0] =   EXPLOSIONJPG[0][8];
				  Mapa[Bom[indice]+8][filaCabeza-1][0] =   EXPLOSIONJPG[0][9];
				  Mapa[Bom[indice]+9][filaCabeza-1][0] =   EXPLOSIONJPG[0][10];}}
				  Mapa[Bom[indice]-1][filaCabeza][0] =   EXPLOSIONJPG[1][0];
				  
				  Mapa[Bom[indice]][filaCabeza][0] =   EXPLOSIONJPG[1][1];
					 
				  Mapa[Bom[indice]+1][filaCabeza][0] =   EXPLOSIONJPG[1][2];
				  if(filaCabeza + 1 < 18) {
			      Mapa[Bom[indice]-1][filaCabeza+1][0] =   EXPLOSIONJPG[2][0];
				  Mapa[Bom[indice]][filaCabeza+1][0] =   EXPLOSIONJPG[2][1];
				  Mapa[Bom[indice]+1][filaCabeza+1][0] =   EXPLOSIONJPG[2][2];}
			  		}
				  indice++;
			  		}}
			  //buscador
			  int x = 0;
			  int y = 0;//ejes a buscar
			  while(x < 359 || y < 18) {
				
			  if(  Mapa[x][y][2] == ESTELA || Mapa[x][y][2] == SUPERESTELA) {
				  Mapa[x][y][0] = Mapa[x][y][2];//se trae lo que encuentra
			  }//fin del if
				if(x<359) {//sigue buscando
					x++;
				}else { if(y < 18) {
					y++;
					x = 0;
				}
					}
			  }
		  //agregar cinematicas
		  //estela de movimiento Ranger
		  // Daño sufrido Ranger
		  // explosion de enemigos al "morir"
			  
		  }else {
			  if(explota == true) {
				  if(filaCabeza-1 > 1) {
				  Mapa[columna-1][filaCabeza-1][0] =  Mapa[columna-1][filaCabeza-1][1];
				  Mapa[columna][filaCabeza-1][0] =    Mapa[columna][filaCabeza-1][1];
				  Mapa[columna+1][filaCabeza-1][0] =  Mapa[columna+1][filaCabeza-1][1];
				  Mapa[columna+2][filaCabeza-1][0] =  Mapa[columna+2][filaCabeza-1][1];
				  if(columna+9 < 358) {
				  Mapa[columna+3][filaCabeza-1][0] =  Mapa[columna+3][filaCabeza-1][1];
				  Mapa[columna+4][filaCabeza-1][0] =  Mapa[columna+4][filaCabeza-1][1];
				  Mapa[columna+5][filaCabeza-1][0] =  Mapa[columna+5][filaCabeza-1][1];
				  Mapa[columna+6][filaCabeza-1][0] =  Mapa[columna+6][filaCabeza-1][1];
				  Mapa[columna+7][filaCabeza-1][0] =  Mapa[columna+7][filaCabeza-1][1];
				  Mapa[columna+8][filaCabeza-1][0] =  Mapa[columna+8][filaCabeza-1][1];
				  Mapa[columna+9][filaCabeza-1][0] =  Mapa[columna+9][filaCabeza-1][1];}}
				  Mapa[columna-1][filaCabeza][0] =    Mapa[columna-1][filaCabeza][1];
				  
				  Mapa[columna][filaCabeza][0] =     cabeza ;
					 
				  Mapa[columna+1][filaCabeza][0] =    Mapa[columna+1][filaCabeza][1];
				  if(filaCabeza + 1 < 18) {
			      Mapa[columna-1][filaCabeza+1][0] =  Mapa[columna-1][filaCabeza+1][1];
				  Mapa[columna][filaCabeza+1][0] =  torso;
				  Mapa[columna+1][filaCabeza+1][0] =  Mapa[columna+1][filaCabeza+1][1];}
				  
				  explota = false;
				 }
			  if(boom == true) {
				  if(lado == true) {
					  if(columna > 47) {
					  Bom[1] = columna-38;
					  Bom[4] = columna-35;
					  Bom[7] = columna-32;
					  Bom[10] = columna-29;
					  Bom[13] = columna-26;
					  Bom[16] = columna-23;}
					  if(columna > 29) {
					  Bom[19] = columna-20;
					  Bom[22] = columna-17;
					  Bom[25] = columna-14;
					  Bom[28] = columna-11;
					  Bom[31] = columna-8;
					  Bom[34] = columna-5;
					  Bom[37] = columna-2;}
				  }else {if(lado == false) {
					  if(columna < 312) {
					  Bom[1] = columna+38;
					  Bom[4] = columna+35;
					  Bom[7] = columna+32;
					  Bom[10] = columna+29;
					  Bom[13] = columna+26;
					  Bom[16] = columna+23;}
					  if(columna < 330) {
					  Bom[19] = columna+20;
					  Bom[22] = columna+17;
					  Bom[25] = columna+14;
					  Bom[28] = columna+11;
					  Bom[31] = columna+8;
					  Bom[34] = columna+5;
					  Bom[37] = columna+2;}}
				  }
				  int indice=0;
			  		while(indice < 39) {
			  		if(Bom[indice] != 0) {
				  if(filaCabeza-1 >= 0) {
				  Mapa[Bom[indice]-1][filaCabeza-1][0] =  Mapa[Bom[indice]-1][filaCabeza-1][1];
				  Mapa[Bom[indice]][filaCabeza-1][0] =    Mapa[Bom[indice]][filaCabeza-1][1];
				  Mapa[Bom[indice]+1][filaCabeza-1][0] =  Mapa[Bom[indice]+1][filaCabeza-1][1];
				  Mapa[Bom[indice]+2][filaCabeza-1][0] =  Mapa[Bom[indice]+2][filaCabeza-1][1];
				  if(Bom[indice]+9 <= 312 && Bom[indice]-9 > 47) {
				  Mapa[Bom[indice]+3][filaCabeza-1][0] =  Mapa[Bom[indice]+3][filaCabeza-1][1];
				  Mapa[Bom[indice]+4][filaCabeza-1][0] =  Mapa[Bom[indice]+4][filaCabeza-1][1];
				  Mapa[Bom[indice]+5][filaCabeza-1][0] =  Mapa[Bom[indice]+5][filaCabeza-1][1];
				  Mapa[Bom[indice]+6][filaCabeza-1][0] =  Mapa[Bom[indice]+6][filaCabeza-1][1];
				  Mapa[Bom[indice]+7][filaCabeza-1][0] =  Mapa[Bom[indice]+7][filaCabeza-1][1];
				  Mapa[Bom[indice]+8][filaCabeza-1][0] =  Mapa[Bom[indice]+8][filaCabeza-1][1];
				  Mapa[Bom[indice]+9][filaCabeza-1][0] =  Mapa[Bom[indice]+9][filaCabeza-1][1];}}
				  Mapa[Bom[indice]-1][filaCabeza][0] =    Mapa[Bom[indice]-1][filaCabeza][1];
				  
				  Mapa[Bom[indice]][filaCabeza][0] =  Mapa[Bom[indice]][filaCabeza][1] ;
					 
				  Mapa[Bom[indice]+1][filaCabeza][0] =    Mapa[Bom[indice]+1][filaCabeza][1];
				  if(filaCabeza + 1 <= 18) {
			      Mapa[Bom[indice]-1][filaCabeza+1][0] =  Mapa[Bom[indice]-1][filaCabeza+1][1];
				  Mapa[Bom[indice]][filaCabeza+1][0] =  Mapa[Bom[indice]][filaCabeza+1][1];
				  Mapa[Bom[indice]+1][filaCabeza+1][0] =  Mapa[Bom[indice]+1][filaCabeza+1][1];}
				  Bom[indice] = 0;
			  		}
				  indice++;
				  boom = false;
			  		 }}
			  //buscador
			  int x = 0;
			  int y = 0;//ejes a buscar
			  while(x < 359 || y < 18) {
			  if(  Mapa[x][y][2] == ESTELA || Mapa[x][y][2] == SUPERESTELA) {
				  Mapa[x][y][0] = Mapa[x][y][1];
				  Mapa[x][y][2] = Mapa[x][y][1]; //limpia lo que ensucio
			  }//fin del if
				if(x<359) {//sigue buscando
					x++;
				}else { if(y < 18) {
					y++;
					x = 0;
				}
					}
			  }
		  //borrar cinematicas
			  
		  
	  }
}}
