/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subidas.y.bajones;

import java.util.Scanner;

/**
 *
 * @author Aragon Perez
 */
public class SubidasYBajones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dado=0;
        int avace_casillas= (int) (Math.random() * dado + 1);
        int jugadores=3;
        String [] jugador =new String [5];
        int tablero1=1, tablero2=1;
        String [][] tablero =new String [tablero1][tablero2];
        limpiar limpia=new limpiar();
        int subidas, bajones;
        for(int o=0;o<=jugadores;o++){
            jugador[o]=" ";
        }
        
        // TODO code application logic here
        while(true){
            
            
            System.out.println("[IPC1]Practica1_201701133");
            System.out.println("  ");
            System.out.println("1. Dificultad del Juego");
            System.out.println("2. Parametros Inciales");
            System.out.println("3. Inciar Juego");
            System.out.println("4. Salir");
            Scanner lectura=new Scanner(System.in);
            int opcion_principal=lectura.nextInt();
            limpia.limpiartodo();
            switch(opcion_principal){
                case 1:
                    int cont_submenu1=1;
                    while(cont_submenu1==1){
                        System.out.println("1. Facil");
                        System.out.println("2. Dificil");
                        System.out.println("3. Regresar");
                        int lectura_op1=lectura.nextInt();
                        limpia.limpiartodo();
                        switch(lectura_op1){
                            case 1:
                                tablero1=5;
                                tablero2=8;
                                System.out.println("Dificultad facil Seleccionada");
                                System.out.println("2 a 3 Jugadores");
                                System.out.println("Subidas de 5 a 10");
                                System.out.println("Bajones de 5 a 10");
                                dado=6;
                                //tamaño del tablero
                                break;
                            case 2:
                                tablero1=20;
                                tablero2=10;
                                System.out.println("Dificultad Dificil Seleccionada");
                                System.out.println("2 a 4 Jugadores");
                                System.out.println("Subidas de 20 a 40");
                                System.out.println("Bajones de 20 a 40");
                                dado=12;
                                //tamaño del tablero
                                break;
                            case 3:
                                cont_submenu1++;
                                limpia.limpiartodo();
                                //Cerramos el ciclo y volvemos al menu principal
                                break;
                            default:
                                limpia.limpiartodo();
                                System.out.println("Ingrese una opcion correctamente");
                        }
                        
                    }
                    break;
                    
                    
                    
                    
                case 2:
                    int cont_submenu2=1;
                    while(cont_submenu2==1){
                        System.out.println("1. Jugadores");
                        System.out.println("2. Subidas y bajones");
                        System.out.println("3. Regresar");
                        int lectura_op2=lectura.nextInt();
                        limpia.limpiartodo();
                        switch(lectura_op2){
                            case 1:
                                int comprobacion_sub2=1;
                                while(comprobacion_sub2==1){
                                    System.out.println("Ingrese Numero de Jugadores");
                                    jugadores=lectura.nextInt(); 
                                    if(jugadores<2 ||jugadores>3){
                                        System.out.println("Ingrese numero de jugadores Correctmente");
                                    }else{
                                        comprobacion_sub2--;
                                    }
                                }
                                int mostrar=jugadores;
                                for(int verificador=1;verificador<=jugadores;verificador++){
                                    System.out.println("Ingrese Caracter del Jugador"+ verificador);
                                    jugador[verificador]=lectura.next();
                                    int cn=0;
                                //contador para ver si se repite
                                    for(int o=1;o<=4;o++){
                                    if(jugador[verificador].equals(jugador[o]))
                                    {
                                        cn++;
                                    }
                                    //comprobamos si se repite
                                    if(cn>=2){
                                        verificador--;
                                        System.out.println("Este Caracter ya fue ingresado por otro usuario");
                                        cn=0;
                                        
                                    }
                                    }
                                    //manda un mensaje si se repite
                                    
                                }
                                break;
                            case 2:
                                if(dado==6){
                                    for(int verificador_s_b=1;verificador_s_b<=1;verificador_s_b++){
                                        System.out.println("Ingrese Numero de Subidas ");
                                        subidas=lectura.nextInt();
                                        System.out.println("Ingrese Numero de Bajones ");
                                        bajones=lectura.nextInt();
                                        if(subidas<5||subidas>10||bajones<5||bajones>10){
                                            
                                            limpia.limpiartodo();
                                            System.out.println("Ingrese un numero que se encuentre en el rango de Dificultad");
                                            verificador_s_b--;
                                        }
                                    }
                                    if(dado==12){
                                    for(int verificador_s_b=1;verificador_s_b<=1;verificador_s_b++){
                                        System.out.println("Ingrese Numero de Subidas ");
                                        subidas=lectura.nextInt();
                                        System.out.println("Ingrese Numero de Bajones ");
                                        bajones=lectura.nextInt();
                                        if(subidas<20||subidas>40||bajones<20||bajones>40){
                                            
                                            limpia.limpiartodo();
                                            System.out.println("Ingrese un numero que se encuentre en el rango de Dificultad");
                                            verificador_s_b--;
                                        }
                                    }
                                    }
                                    
                                    
                                }
                                break;
                            case 3:
                                cont_submenu2++;
                                limpia.limpiartodo();
                                //Cerramos el ciclo y volvemos al menu principal
                                break;
                            default:
                                System.out.println("Ingrese una opcion correctamente");
                                limpia.limpiartodo();
                        }
                    }
  
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ingrese una opcion Correctamente");
                
            }
        }
    }   
}
