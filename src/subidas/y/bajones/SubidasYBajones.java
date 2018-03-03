/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subidas.y.bajones;

import java.util.Arrays;
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
        int pausa=0, constante_1=0, constante_2=0 ,constante_3=0, constante_4=0; 
        int jugadores=5, jugador_1=0, jugador_2=0, jugador_3=0, jugador_4=0;
        String com_jugador= "";
        String com_jugador_1=" " , com_jugador_2=" " , com_jugador_3=" " , com_jugador_4=" ";
        String primero="", segundo="", tercero="", cuarto="";
        String [] jugador =new String [7];
        //String [][] tablero =new String [tablero1][tablero2];
        String tablero_facil[][]={{"01","02","03","04","05","06"},{"12","11","10","09","08","07"}
        ,{"13","14","15","16","17","18"},{"24","23","22","21","20","19"},{"25","26","27","28","29","30"}
        ,{"36","35","34","33","32","31"},{"37","38","39","40","41","42"},{"48","47","46","45","44","43"}};
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
                                System.out.println("Dificultad facil Seleccionada");
                                System.out.println("2 a 3 Jugadores");
                                System.out.println("Subidas de 5 a 10");
                                System.out.println("Bajones de 5 a 10");
                                dado=6;
                                //tamaño del tablero
                                break;
                            case 2:
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
                    int le_toca=1;
                    int primer_paso=0, primer_paso_2=0;;
                    int ganador=0;
                    int lanzardado=0;
                    while(ganador==0){
                        if(dado==6){
                            for(int imprimir=7; imprimir>=0;imprimir--){
                                System.out.println(Arrays.toString(tablero_facil[imprimir]));
                            }
                            System.out.println("Coloque 1 para Tirar el dado");
                            
                            if(lanzardado==0){
                                lanzardado++;
                                System.out.println("Para definir el Orden de los jugadores");
                                pausa=lectura.nextInt();
                                jugador_1=(int) (Math.random() * dado + 1);
                                jugador_2=(int) (Math.random() * dado + 1); 
                                if(jugador_1>jugador_2 ){
                                    primero=jugador[1];
                                    segundo=jugador[2];
                                    System.out.println("Primero:  "+ jugador[1] );
                                    System.out.println("Segundo:  "+ jugador[2]);
                                    jugador_1=0;
                                    jugador_2=0;

                                }else{
                                    primero=jugador[2];
                                    segundo=jugador[1];
                                    System.out.println("Segundo:  "+ jugador[1] );
                                    System.out.println("primero:  "+ jugador[2] );
                                    jugador_1=0;
                                    jugador_2=0;
                                    }
                                }
                            //jugador 1
                    primer_paso++;
                    if(primer_paso>1){
                        
                        com_jugador=String.valueOf(jugador_1);
                        for(int vali=7; vali>=0;vali--){
                            for(int vali_2=5; vali_2>=0;vali_2--){
                                
                                if(tablero_facil[vali][vali_2].equals(primero)){
                                    tablero_facil[vali][vali_2]=com_jugador_1;
                            }
                            }
                        }
                        //arreglamos la matriz como en el inicio
                        int primeros=(int)(Math.random() * dado + 1);
                        jugador_1=primeros+jugador_1;
                        if(jugador_1>=48){
                            ganador++;
                            limpia.limpiartodo();
                            System.out.println("EL GANADOR ES: "+ primero);
                        }
                        //comprobamos el ganador
                        if(9>=jugador_1){
                        com_jugador = "0"+String.valueOf(jugador_1);
                        if(ganador==0){
                            System.out.println("Valor del Jugador 1: "+primeros);
                        }
                        for(int vali=7; vali>=0;vali--){
                            for(int vali_2=5; vali_2>=0;vali_2--){
                            if(tablero_facil[vali][vali_2].equals(com_jugador)){
                                
                                com_jugador_1=tablero_facil[vali][vali_2];
                                tablero_facil[vali][vali_2]=primero;
                                
                            }
                        }
                        }
                    }else{
                        if(ganador==0){
                            System.out.println("Valor del Jugador 1: "+primeros);
                        }
                        com_jugador=String.valueOf(jugador_1);
                        for(int vali=7; vali>=0;vali--){
                            for(int vali_2=5; vali_2>=0;vali_2--){
                            if(tablero_facil[vali][vali_2].equals(com_jugador)){
                                com_jugador_1=tablero_facil[vali][vali_2];
                                tablero_facil[vali][vali_2]=primero;
                            }
                        }
                        }
                    }
                    }else{
                        int primeros=(int)(Math.random() * dado + 1);
                        jugador_1=primeros+jugador_1;
                        if(ganador==0){
                            System.out.println("Valor del Jugador 1: "+primeros);
                        }
                    if(9>=jugador_1){
                        com_jugador = "0"+String.valueOf(jugador_1);
                        
                        for(int vali=7; vali>=0;vali--){
                            for(int vali_2=5; vali_2>=0;vali_2--){
                            if(tablero_facil[vali][vali_2].equals(com_jugador)){
                                com_jugador_1=tablero_facil[vali][vali_2];
                                tablero_facil[vali][vali_2]=primero;
                                
                            }
                        }
                        }
                    }else{
                        com_jugador=String.valueOf(jugador_1);
                        for(int vali=7; vali>=0;vali--){
                            for(int vali_2=5; vali_2>=0;vali_2--){
                            if(tablero_facil[vali][vali_2].equals(com_jugador)){
                                com_jugador_1=tablero_facil[vali][vali_2];
                                tablero_facil[vali][vali_2]=primero;
                            }
                        }
                        }
                    }
                    }
                    
                    //jugador 2
                    primer_paso_2++;
                    if(primer_paso_2>1){
                        com_jugador=String.valueOf(jugador_2);
                        for(int vali=7; vali>=0;vali--){
                            for(int vali_2=5; vali_2>=0;vali_2--){
                                
                                if(tablero_facil[vali][vali_2].equals(segundo)){
                                    tablero_facil[vali][vali_2]=com_jugador_2;
                            }
                            }
                        }
                        
                                
                        
                        
                        int primeros=(int)(Math.random() * dado + 1);
                        jugador_2=primeros+jugador_2;
                        if(ganador==0){
                            System.out.println("Valor del Jugador 2: "+primeros);
                        }
                        
                        if(jugador_2>=48 && ganador==0){
                            ganador++;
                            limpia.limpiartodo();
                            System.out.println("EL GANADOR ES: "+ segundo);
                        }
                        if(9>=jugador_2){
                        com_jugador = "0"+String.valueOf(jugador_2);
                        
                        for(int vali=7; vali>=0;vali--){
                            for(int vali_2=5; vali_2>=0;vali_2--){
                            if(tablero_facil[vali][vali_2].equals(com_jugador)){
                                
                                com_jugador_2=tablero_facil[vali][vali_2];
                                tablero_facil[vali][vali_2]=segundo;
                                
                            }
                        }
                        }
                    }else{
                        com_jugador=String.valueOf(jugador_2);
                        for(int vali=7; vali>=0;vali--){
                            for(int vali_2=5; vali_2>=0;vali_2--){
                            if(tablero_facil[vali][vali_2].equals(com_jugador)){
                                com_jugador_2=tablero_facil[vali][vali_2];
                                tablero_facil[vali][vali_2]=segundo;
                            }
                        }
                        }
                    }
                    }else{
                        
                        int primeros=(int)(Math.random() * dado + 1);
                        jugador_2=primeros+jugador_2;
                        if(ganador==0){
                            System.out.println("Valor del Jugador 2: "+primeros);
                        }
                        
                        if(9>=jugador_2){
                        com_jugador = "0"+String.valueOf(jugador_2);
                        
                        for(int vali=7; vali>=0;vali--){
                            for(int vali_2=5; vali_2>=0;vali_2--){
                            if(tablero_facil[vali][vali_2].equals(com_jugador)){
                                com_jugador_2=tablero_facil[vali][vali_2];
                                tablero_facil[vali][vali_2]=segundo;
                                
                            }
                        }
                        }
                    }else{
                        com_jugador=String.valueOf(jugador_2);
                        for(int vali=7; vali>=0;vali--){
                            for(int vali_2=5; vali_2>=0;vali_2--){
                            if(tablero_facil[vali][vali_2].equals(com_jugador)){
                                com_jugador_2=tablero_facil[vali][vali_2];
                                tablero_facil[vali][vali_2]=segundo;
                                }
                            }
                        }
                    }
                    }
                            
                            
                            
                            
                }
                            
                    
                            
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    if(ganador==0){
                        limpia.limpiartodo();
                        for(int imprimir=7; imprimir>=0;imprimir--){
                                    System.out.println(Arrays.toString(tablero_facil[imprimir]));
                        }
                        System.out.println("Coloque 1 para volver a tirar");
                        System.out.println("Valores de los dados tirados");
                        pausa=lectura.nextInt();
                    }
                    
                      
                            

        
                            
                    }
 
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
