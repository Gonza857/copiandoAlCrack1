package Main;
import java.util.Scanner;

import ar.edu.unlam.Crear;
import ar.edu.unlam.Ilustraciones;
import ar.edu.unlam.Reaccion;
public class MainPowerRagers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcion;
		int nivel;
		boolean azul= false;
		boolean rosa= false;
		boolean amarillo= false;
		boolean rojo= false;
		boolean verde= false;
		boolean salir = false;
		Ilustraciones dibujo = new Ilustraciones();
		
		do {//MENU PRINCIPAL 
			
			dibujo.Menu();
			
			opcion = scanner.nextInt();
			
			
			switch (opcion) {
			case 1:
				
				System.out.println("                            ¡Bienvenido al Modo Historia de los Power Rangers!");
			do {  // MENU JUEGOOO
				dibujo.MenuJuego();
				opcion = scanner.nextInt();
				switch (opcion) {
			case 1:
				if(azul == false) {
					dibujo.RangerAzul();
					opcion = scanner.nextInt();
					if(opcion == 1) {
						dibujo.TramaUnoAzul();
						opcion = scanner.nextInt();
						azul = Gameplay(1);
						//post GAMEPLAY
						dibujo.TramaUnoAzulPrimeraSecuencia();
						opcion = scanner.nextInt();
						if(opcion == 1) {
						dibujo.PeleaSherkParteUno();
						opcion = scanner.nextInt();
						dibujo.PeleaSherkParteDos();
						opcion = scanner.nextInt();
						dibujo.ExplosionFinal();
						opcion = scanner.nextInt();
							//PELEAGIGANTES SHERK
						}else {
							dibujo.FinTramaUnoAzulPrimeraSecuencia();
							opcion = scanner.nextInt();
						}
						
						
						
					}else {
						azul = Gameplay(1);
						//post GAMEPLAY
						dibujo.TramaDosAzul();
						opcion = scanner.nextInt();
						if(opcion==1) {
					do{dibujo.Golpiza();
						opcion = scanner.nextInt();
						}while(opcion == 1);
					dibujo.ExplosionFinal();
					opcion = scanner.nextInt();
					
						//PELEA GIGANTES HECHIZERO
						}else {
							dibujo.FinTramaDosAzul();
							opcion = scanner.nextInt();
						}
					}}else {
						System.err.println("     Ya jugaste el nivel");
					}
					break;
            case 2:
            	if(rosa == false) {
					dibujo.RangerRosa();
					opcion = scanner.nextInt();
					if(opcion == 1) {
						dibujo.TramaUnoRosa();
						opcion = scanner.nextInt();
						rosa = Gameplay(2);
						//post GAMEPLAY
						dibujo.TramaUnoRosaPrimeraSecuencia();
						opcion = scanner.nextInt();
						if(opcion == 1) {
							do{dibujo.Golpiza();
							opcion = scanner.nextInt();
							}while(opcion == 1);
						dibujo.ExplosionFinal();
						opcion = scanner.nextInt();
						
							//PELEAGIGANTES AMOUNG US
						}else {
							dibujo.FinTramaUnoRosaPrimeraSecuencia();
							opcion = scanner.nextInt();
						}
						
						
						
					}else {
						rosa = Gameplay(2);
						//post GAMEPLAY
						dibujo.TramaDosRosa();
						opcion = scanner.nextInt();
						if(opcion==1) {
							do{dibujo.Golpiza();
							opcion = scanner.nextInt();
							}while(opcion == 1);
						dibujo.ExplosionFinal();
						opcion = scanner.nextInt();
						
							//PELEA GIGANTES PIKACHU
						}else {
							dibujo.FinTramaDosRosa();
							opcion = scanner.nextInt();
						}
					}
            	}else {
					System.err.println("     Ya jugaste el nivel");
				}
					break;
            case 3:
            	if(amarillo == false) {
					dibujo.RangerAmarillo();
					opcion = scanner.nextInt();
					if(opcion == 1) {
						dibujo.TramaUnoAmarillo();
						opcion = scanner.nextInt();
						amarillo = Gameplay(3);
						//post GAMEPLAY
						dibujo.TramaUnoAmarilloPrimeraSecuencia();
						opcion = scanner.nextInt();
						if(opcion == 1) {
							do{dibujo.Golpiza();
						opcion = scanner.nextInt();
						}while(opcion == 1);
					dibujo.ExplosionFinal();
					opcion = scanner.nextInt();
					
							//PELEAGIGANTES PIKACHU
						}else {
							dibujo.FinTramaUnoAmarilloPrimeraSecuencia();
							opcion = scanner.nextInt();
						}
						
						
						
					}else {
						amarillo = Gameplay(3);
						//post GAMEPLAY
						dibujo.TramaDosAmarillo();
						opcion = scanner.nextInt();
						if(opcion==1) {
							do{dibujo.Golpiza();
							opcion = scanner.nextInt();
							}while(opcion == 1);
						dibujo.ExplosionFinal();
						opcion = scanner.nextInt();
						dibujo.SpidermanSegundaParte();
						opcion = scanner.nextInt();
						do{dibujo.Golpiza();
						opcion = scanner.nextInt();
						}while(opcion == 1);
						dibujo.ExplosionFinal();
						opcion = scanner.nextInt();
							//PELEA GIGANTES SPIDERMAN
						}else {
							dibujo.FinTramaDosAmarillo();
							opcion = scanner.nextInt();
						}
					}
            	}else {
					System.err.println("     Ya jugaste el nivel");
				}
	                break;
            case 4:
            	if(rojo == false) {
					dibujo.RangerRojo();
					opcion = scanner.nextInt();
					if(opcion == 1) {
						dibujo.TramaUnoRojo();
						opcion = scanner.nextInt();
						rojo = Gameplay(4);
						//post GAMEPLAY
						dibujo.TramaUnoRojoPrimeraSecuencia();
						opcion = scanner.nextInt();
						if(opcion == 1) {
							dibujo.PeleaSherkParteUno();
							opcion = scanner.nextInt();
							dibujo.PeleaSherkParteDos();
							opcion = scanner.nextInt();
							dibujo.ExplosionFinal();
							opcion = scanner.nextInt();
							//PELEAGIGANTES SHERK
						}else {
							dibujo.FinTramaUnoRojoPrimeraSecuencia();
							opcion = scanner.nextInt();
						}
						
						
						
					}else {
						rojo = Gameplay(4);
						//post GAMEPLAY
						dibujo.TramaDosRojo();
						opcion = scanner.nextInt();
						if(opcion==1) {
							do{dibujo.Golpiza();
							opcion = scanner.nextInt();
							}while(opcion == 1);
						dibujo.ExplosionFinal();
						opcion = scanner.nextInt();
							//PELEA GIGANTES HOMERO
						}else {
							dibujo.FinTramaDosRojo();
							opcion = scanner.nextInt();
						}
					}
            	}else {
					System.err.println("     Ya jugaste el nivel");
				}
	                break;
            case 5:
              if(verde == false) {
					dibujo.RangerVerde();
					opcion = scanner.nextInt();
					if(opcion == 1) {
						dibujo.TramaUnoVerde();
						opcion = scanner.nextInt();
						verde = Gameplay(5);
						//post GAMEPLAY
						dibujo.TramaUnoVerdePrimeraSecuencia();
						opcion = scanner.nextInt();
						if(opcion == 1) {
							dibujo.PeleaSherkParteUno();
							opcion = scanner.nextInt();
							dibujo.PeleaSherkParteDos();
							opcion = scanner.nextInt();
							dibujo.ExplosionFinal();
							opcion = scanner.nextInt();
							//PELEAGIGANTES SHERK
						}else {
							dibujo.FinTramaUnoVerdePrimeraSecuencia();
							opcion = scanner.nextInt();
						}
						
						
						
					}else {
						verde = Gameplay(5);
						//post GAMEPLAY
						dibujo.TramaDosVerde();
						opcion = scanner.nextInt();
						if(opcion==1) {
							do{dibujo.Golpiza();
							opcion = scanner.nextInt();
							}while(opcion == 1);
						dibujo.ExplosionFinal();
						opcion = scanner.nextInt();
							//PELEA GIGANTES HOMERORetro
						}else {
							dibujo.FinTramaDosVerde();
							opcion = scanner.nextInt();
						}
					}}else {
						System.err.println("     Ya jugaste el nivel");
					}
	                break;

				default: 
					salir = true;
					break;
				}
				
			}while(salir == false || (azul == true && rosa == true && amarillo == true && rojo == true && verde == true)); //MENU JUEGOOOO
				
				
				
				break;
			case 2:
				//guia de juego
				System.out.println("\033[36m"+"                                                            --- Ayuda ---");
				System.out.println("\033[36m"+"Aquí encontrará ayuda para el juego de los Power Rangers"+"\u001B[0m");
				System.out.println("\033[36m"+" El juego se apoya en dos bases, sus historia y su jugabilidad en momentos puntuales...\n\n Las historias se cuentan atraves de una seguidilla de paneles y para pasar de uno a otro se debe ingresar una tecla numerica exclusivamente.\n\n El gameplay se basa en acabar con todos los enemigos llegando hasta ellos con las teclas \"awsd\"\n\n Los enememigos cuentan con escudos y disparos en secuencias que seran alertado primeramente con un \"!\" y que posterior mente se convertiran en el rayo  \"#\".\n\n A destacar el hecho de que la gravedad se activa tras 6 turnos sin tocar el suelo, y que cada nivel NO es rejugable en la misma partida.\n Esperamos puedan disfrutar del juego." +"\u001B[0m");
				opcion = scanner.nextInt();
				break;
			case 3:
				System.out.println( "                                                            Saliendo del juego...");
				break;
				default:
					System.out.println("                                               Opción invalida. Vuelva a intentar, por favor.");
			}
			
		} while (opcion != 3 );//&& jueego terminado == false  // MENU PRINCIPAL
		System.out.println("                                                            Gracias por jugar a Power Rangers!");
		
		
	
		
		
	}
	public static boolean Gameplay(int nivel) {
  Scanner teclado = new Scanner(System.in);
    Crear generacion = new Crear();
      Reaccion posicion = new Reaccion();
      String estadoDeJuego = "jugando";
      while(!(estadoDeJuego == "ganado") ) {
    		estadoDeJuego = "jugando";
      posicion.GeneradorDeMapa(nivel);
      posicion.cargaExplocion(nivel);
      posicion.inicializacion(nivel);
      posicion.inicializacionDeEnemigos(nivel);
      
      int ciclos = 0; 
      while(estadoDeJuego == "jugando" || estadoDeJuego == "pausa" ) {
      //arranca el ciclo para movimientos
      while(!(estadoDeJuego == "ganado" || estadoDeJuego == "perdido" || estadoDeJuego == "pausa")) {
      //posicion.enemigo();
      
      	if(ciclos <=3) {
      		posicion.cinematicas(false);
               estadoDeJuego = posicion.movimientoEnemigos(estadoDeJuego);
       ciclos++;
      }else {
      	if(ciclos <=8) {
      		if((nivel == 5 || nivel == 4 || nivel == 3)&& ciclos == 6) {
      			ciclos++;
      			posicion.ataqueEnemigo(ciclos);
               posicion.cinematicas(false);
             ciclos++;
       }else { if((nivel !=5 && nivel != 4 && nivel != 3)  && ciclos == 7) {
    	        ciclos++;
    	        posicion.ataqueEnemigo(ciclos);
      			posicion.cinematicas(false);
      	       ciclos++;
      		}else {
      		posicion.ataqueEnemigo(ciclos);
      		posicion.cinematicas(false);
            ciclos++;}}
      }else {
       ciclos = 0;
       posicion.cinematicas(false);
  
      }
      	}
      estadoDeJuego = posicion.barraDeVida(estadoDeJuego);
      if(nivel != 5) {
      posicion.controlDeCamara(false);// si es nivel 5 pasa a ser true
      }else {
      posicion.controlDeCamara(true);
      }
      
      posicion.mostrar();
      posicion.cinematicas(true);
  	String accion = teclado.nextLine();
  	for(int a = 0; a < 10 ; a++) {
  		System.out.println("\n");
  	}
     estadoDeJuego = posicion.setAccion(accion,estadoDeJuego,nivel);	
  	
    
    
  	}//fin del while del juego
      if( estadoDeJuego == "pausa" ) {
      for(int i=0; i<=60; i++) {
  		System.out.println("\n     ");
      }
  	System.out.println( "|     Pausado, presiona cualquier letra para continuar....     |\n\n\n\n\n\n");	
  	String accion = teclado.nextLine();
  	estadoDeJuego = "jugando";
  	for(int i=0; i<=60; i++) {
  		System.out.println("\n     ");
  	}}else { if(estadoDeJuego == "perdido" ) {
  		  for(int i=0; i<=60; i++) {
  				System.out.println("\n     ");
  		    }
  			System.err.println( "|     Te quedaste sin vida y perdiste, Presiona cualquier letra para reintentar el nivel....     |\n\n\n\n\n\n");	
  			String accion = teclado.nextLine();
  		
  			
  	}
  	} }}//fin del otro while de pausa y derrota
      
    
    
    
    
    return true;
	
 	
	}//fin del main
	
}
