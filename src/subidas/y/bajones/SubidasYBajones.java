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
        int pausa=0;
        int jugadores=5, jugador_1=0, jugador_2=0, jugador_3=0, jugador_4=0;
        String com_jugador= "";
        String com_jugador_1=" " , com_jugador_2=" " , com_jugador_3=" " ;
        String primero="", segundo="", tercero="", cuarto="";
        int[] com_sb=new int[50];
        String prueba_sb="";
        int[] com_bj=new int[50];
        String [] jugador =new String [7];
        String [] escaleras =new String [7];
        //String [][] tablero =new String [tablero1][tablero2];
        String tablero_facil[][]={{"01","02","03","04","05","06"},{"12","11","10","09","08","07"}
        ,{"13","14","15","16","17","18"},{"24","23","22","21","20","19"},{"25","26","27","28","29","30"}
        ,{"36","35","34","33","32","31"},{"37","38","39","40","41","42"},{"$","47","46","45","44","43"}};
        
        String tablero_dificil[][]={{"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20"}
        ,{"40","39","38","37","36","35","34","33","32","31","30","29","28","27","26","25","24","23","22","21"},
        {"41","42","43","44","45","46","47","48","49","50","51","52","53","54","55","56","57","58","59","60"},
        {"80","79","78","77","76","75","74","73","72","71","70","69","68","67","66","65","64","63","62","61"},
        {"81","82","83","84","85","86","87","88","89","90","91","92","93","94","95","96","97","98","99","100"},
        {"120","119","118","117","116","115","114","113","112","111","110","109","108","107","106","105","104","103","102","101"},
        {"121","122","123","124","125","126","127","128","129","130","131","132","133","134","135","136","137","138","139","140"},
        {"160","159","158","157","156","155","154","153","152","151","150","149","148","147","146","145","144","143","142","141"}, 
        {"161","162","163","164","165","166","167","168","169","170","171","172","173","174","175","176","177","178","179","180"},
        {"$","199","198","197","196","195","194","193","192","191","190","189","188","187","186","185","184","183","182","181"}};
        limpiar limpia=new limpiar();
        int subidas=0, bajones=0;
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
            System.out.println("Nota: Porfavor Colocar Pantalla Completa");
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
                    int solo_uno=0;
                    int lanzardado=0;
                    while(ganador==0){
                        if(dado==6){
                            
                            if(solo_uno==0){
                                solo_uno++;
                                for(int al_s=subidas;al_s>=0;al_s--){
                                int cont_subidas=1;
                                
                                    
                                    int sb=(int) (Math.random() * 44)+ 6;
                                     prueba_sb="";
                                    if(9>=sb){
                                        prueba_sb="0"+String.valueOf(sb);
                                    }
                                    else{
                                        prueba_sb=String.valueOf(sb);
                                    }
                                    
                                    for(int vali=7; vali>=0;vali--){
                                        for(int vali_2=5; vali_2>=0;vali_2--){
                                        if(tablero_facil[vali][vali_2].equals(prueba_sb)){
                                            tablero_facil[vali][vali_2]=tablero_facil[vali][vali_2]+"+";
                                            com_sb[cont_subidas]=sb;
                                            
                                            }
                                        }
                                    }
                                    cont_subidas++;
                                    for(int a=20;a<=1;a--){
                                        if(com_sb[a]==com_sb[cont_subidas]||(com_sb[a]+1)==com_sb[cont_subidas]||(com_sb[a]-1)==com_sb[cont_subidas ]){
                                            cont_subidas--;
                                            al_s++;
                                        }
                                    }
                                    
                                    
                                
                                
                                
                            }
                             for(int al_b=bajones;al_b>=0;al_b--){
                                int cont_bajones=1;
                                    int sb=(int) (Math.random() * 44)+ 7;
                                     prueba_sb="";
                                    if(9>=sb){
                                        prueba_sb="0"+String.valueOf(sb);
                                    }
                                    else{
                                        prueba_sb=String.valueOf(sb);
                                    }
                                    
                                    for(int vali=7; vali>=0;vali--){
                                        for(int vali_2=5; vali_2>=0;vali_2--){
                                        if(tablero_facil[vali][vali_2].equals(prueba_sb)){
                                            tablero_facil[vali][vali_2]=tablero_facil[vali][vali_2]+"-";
                                            com_bj[cont_bajones]=sb;
                                            
                                            }
                                        }
                                    }
                                    cont_bajones++;
                                    for(int a=20;a<=1;a--){
                                        if(com_bj[a]==com_bj[cont_bajones]||(com_bj[a]+1)==com_sb[cont_bajones]||(com_sb[a]-1)==com_sb[cont_bajones ]){
                                            cont_bajones--;
                                            al_b++;
                                        }
                                        for(int b=20;b<=1;a--){
                                            if(com_bj[a]==com_sb[b] || (com_bj[a] +1) ==com_sb[b]|| (com_bj[a]-1)==com_sb[b] ){
                                                cont_bajones--;
                                                al_b++;
                                            }
                                            
                                        }
                                    }
                                
                            }   
                                
                             
                                
                            
                            }
                            

                            
                            
                            
                            
                            for(int imprimir=7; imprimir>=0;imprimir--){
                                System.out.println(Arrays.toString(tablero_facil[imprimir]));
                            }
                            System.out.println("Coloque 1 para Tirar el dado");
                            
                            if(lanzardado==0){
                                lanzardado++;
                                System.out.println("Para definir el Orden de los jugadores");
                                pausa=lectura.nextInt();
                                jugador_1=(int) (Math.random() * dado) + 1;
                                jugador_2=(int) (Math.random() * dado )+ 1; 
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
                        int primeros=(int)(Math.random() * dado )+ 1;
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
                                //le comparas el valor del dado con la matriz y donde sean iguales para lo siguiente
                            if(tablero_facil[vali][vali_2].equals(com_jugador)){
                                //com_jugador es tu constante guardas es valor de la matriz durante 1 turno
                                com_jugador_1=tablero_facil[vali][vali_2];
                                //aqui le das el caracter a la matriz
                                tablero_facil[vali][vali_2]=primero;
                            }
                        }
                        }
                    }
                    }else{
                        int primeros=(int)(Math.random() * dado )+ 1;
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
                        
                                
                        
                        
                        int primeros=(int)(Math.random() * dado) + 1;
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
                        
                        int primeros=(int)(Math.random() * dado )+ 1;
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
                            
                    
                            
                if(dado==12){
                    
                    if(solo_uno==0){
                                solo_uno++;
                                int cont_subidas=1;
                                for(int al_s=subidas;al_s>=0;al_s--){
                                
                                
                                    
                                    int sb=(int) (Math.random() * 190) + 6;
                                     prueba_sb="";
                                    if(9>=sb){
                                        prueba_sb="0"+String.valueOf(sb);
                                    }
                                    else{
                                        prueba_sb=String.valueOf(sb);
                                    }
                                    
                                    for(int vali=9; vali>=0;vali--){
                                        for(int vali_2=19; vali_2>=0;vali_2--){
                                        if(tablero_dificil[vali][vali_2].equals(prueba_sb)){
                                            tablero_dificil[vali][vali_2]=tablero_dificil[vali][vali_2]+"+";
                                            com_sb[cont_subidas]=sb;
                                            
                                            }
                                        }
                                    }
                                    cont_subidas++;
                                    for(int a=40;a<=1;a--){
                                        if(com_sb[a]==com_sb[cont_subidas]||(com_sb[a]+1)==com_sb[cont_subidas]||(com_sb[a]-1)==com_sb[cont_subidas ]){
                                            cont_subidas--;
                                            al_s++;
                                        }
                                    }
                                    
                                    
                                
                                
                                
                            }
                             for(int al_b=bajones;al_b>=0;al_b--){
                                int cont_bajones=1;
                                    int sb=(int) (Math.random() * 190) + 6;
                                     prueba_sb="";
                                    if(9>=sb){
                                        prueba_sb="0"+String.valueOf(sb);
                                    }
                                    else{
                                        prueba_sb=String.valueOf(sb);
                                    }
                                    
                                    for(int vali=9; vali>=0;vali--){
                                        for(int vali_2=19; vali_2>=0;vali_2--){
                                        if(tablero_dificil[vali][vali_2].equals(prueba_sb)){
                                            tablero_dificil[vali][vali_2]=tablero_dificil[vali][vali_2]+"-";
                                            com_bj[cont_bajones]=sb;
                                            
                                            }
                                        }
                                    }
                                    cont_bajones++;
                                    for(int a=400;a<=1;a--){
                                        if(com_bj[a]==com_bj[cont_bajones]||(com_bj[a]+1)==com_sb[cont_bajones]||(com_sb[a]-1)==com_sb[cont_bajones ]){
                                            cont_bajones--;
                                            al_b++;
                                        }
                                        for(int b=40;b<=1;a--){
                                            if(com_bj[a]==com_sb[b] || (com_bj[a] +1) ==com_sb[b]|| (com_bj[a]-1)==com_sb[b] ){
                                                cont_bajones--;
                                                al_b++;
                                            }
                                            
                                        }
                                    }
                                
                            }   
                                
                             
                                
                            
                            }
                           /* for(int al_syb=1;al_syb>=total_syb;al_syb++){
                                int cont_subidas=1;
                                
                                
                                
                                if(subidas>=cont_subidas){
                                    cont_subidas++;
                                    
                                    int sb=(int) (Math.random() * 44 + 1);
                                    String prueba_sb="";
                                    if(sb<=9){
                                        prueba_sb="0"+String.valueOf(sb);
                                    }
                                    else{
                                        prueba_sb=String.valueOf(sb);
                                    }
                                    for(int vali=7; vali>=0;vali--){
                                        for(int vali_2=5; vali_2>=0;vali_2--){
                                        if(tablero_facil[vali][vali_2].equals(prueba_sb)){
                                            tablero_facil[vali][vali_2]=tablero_facil[vali][vali_2]+"+";
                                            
                                            
                                            }
                                        }
                                    }
                                    
                                    //
                                }
                                
                            } */
                          
                            
                            
                            
                            
                            
                            
                            
                            
                            for(int imprimir=9; imprimir>=0;imprimir--){
                                System.out.println(Arrays.toString(tablero_dificil[imprimir]));
                            }
                            System.out.println("Coloque 1 para Tirar el dado");
                            
                            if(lanzardado==0){
                                lanzardado++;
                                System.out.println("Para definir el Orden de los jugadores");
                                pausa=lectura.nextInt();
                                jugador_1=(int) (Math.random() * dado) + 1;
                                jugador_2=(int) (Math.random() * dado )+ 1; 
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
                        for(int vali=9; vali>=0;vali--){
                            for(int vali_2=19; vali_2>=0;vali_2--){
                                
                                if(tablero_dificil[vali][vali_2].equals(primero)){
                                    tablero_dificil[vali][vali_2]=com_jugador_1;
                            }
                            }
                        }
                        //arreglamos la matriz como en el inicio
                        int primeros=(int)(Math.random() * dado) + 1;
                        jugador_1=primeros+jugador_1;
                        if(jugador_1>=200){
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
                        for(int vali=9; vali>=0;vali--){
                            for(int vali_2=19; vali_2>=0;vali_2--){
                            if(tablero_dificil[vali][vali_2].equals(com_jugador)){
                                
                                com_jugador_1=tablero_dificil[vali][vali_2];
                                tablero_dificil[vali][vali_2]=primero;
                                
                            }
                        }
                        }
                    }else{
                        if(ganador==0){
                            System.out.println("Valor del Jugador 1: "+primeros);
                        }
                        com_jugador=String.valueOf(jugador_1);
                        
                        for(int vali=9; vali>=0;vali--){
                            for(int vali_2=19; vali_2>=0;vali_2--){
                                //le comparas el valor del dado con la matriz y donde sean iguales para lo siguiente
                            if(tablero_dificil[vali][vali_2].equals(com_jugador)){
                                //com_jugador es tu constante guardas es valor de la matriz durante 1 turno
                                com_jugador_1=tablero_dificil[vali][vali_2];
                                //aqui le das el caracter a la matriz
                                tablero_dificil[vali][vali_2]=primero;
                            }
                        }
                        }
                    }
                    }else{
                        int primeros=(int)(Math.random() * dado) + 1;
                        jugador_1=primeros+jugador_1;
                        if(ganador==0){
                            System.out.println("Valor del Jugador 1: "+primeros);
                        }
                        if(9>=jugador_1){
                        com_jugador = "0"+String.valueOf(jugador_1);
                        
                        for(int vali=9; vali>=0;vali--){
                            for(int vali_2=19; vali_2>=0;vali_2--){
                            if(tablero_dificil[vali][vali_2].equals(com_jugador)){
                                com_jugador_1=tablero_dificil[vali][vali_2];
                                tablero_dificil[vali][vali_2]=primero;
                                
                            }
                        }
                        }
                    }else{
                        com_jugador=String.valueOf(jugador_1);
                        for(int vali=9; vali>=0;vali--){
                            for(int vali_2=19; vali_2>=0;vali_2--){
                            if(tablero_dificil[vali][vali_2].equals(com_jugador)){
                                com_jugador_1=tablero_dificil[vali][vali_2];
                                tablero_dificil[vali][vali_2]=primero;
                            }
                        }
                        }
                    }
                    }
                    
                    //jugador 2
                    primer_paso_2++;
                    if(primer_paso_2>1){
                        com_jugador=String.valueOf(jugador_2);
                        for(int vali=9; vali>=0;vali--){
                            for(int vali_2=19; vali_2>=0;vali_2--){
                                
                                if(tablero_dificil[vali][vali_2].equals(segundo)){
                                    tablero_dificil[vali][vali_2]=com_jugador_2;
                            }
                            }
                        }
                        
                                
                        
                        
                        int primeros=(int)(Math.random() * dado)+ 1;
                        jugador_2=primeros+jugador_2;
                        if(ganador==0){
                            System.out.println("Valor del Jugador 2: "+primeros);
                        }
                        
                        if(jugador_2>=200 && ganador==0){
                            ganador++;
                            limpia.limpiartodo();
                            System.out.println("EL GANADOR ES: "+ segundo);
                        }
                        if(9>=jugador_2){
                        com_jugador = "0"+String.valueOf(jugador_2);
                        
                        for(int vali=9; vali>=0;vali--){
                            for(int vali_2=19; vali_2>=0;vali_2--){
                            if(tablero_dificil[vali][vali_2].equals(com_jugador)){
                                
                                com_jugador_2=tablero_dificil[vali][vali_2];
                                tablero_dificil[vali][vali_2]=segundo;
                                
                            }
                        }
                        }
                    }else{
                        com_jugador=String.valueOf(jugador_2);
                        for(int vali=9; vali>=0;vali--){
                            for(int vali_2=19; vali_2>=0;vali_2--){
                            if(tablero_dificil[vali][vali_2].equals(com_jugador)){
                                com_jugador_2=tablero_dificil[vali][vali_2];
                                tablero_dificil[vali][vali_2]=segundo;
                            }
                        }
                        }
                    }
                    }else{
                        
                        int primeros=(int)(Math.random() * dado) + 1;
                        jugador_2=primeros+jugador_2;
                        if(ganador==0){
                            System.out.println("Valor del Jugador 2: "+primeros);
                        }
                        
                        if(9>=jugador_2){
                        com_jugador = "0"+String.valueOf(jugador_2);
                        
                        for(int vali=9; vali>=0;vali--){
                            for(int vali_2=19; vali_2>=0;vali_2--){
                            if(tablero_dificil[vali][vali_2].equals(com_jugador)){
                                com_jugador_2=tablero_dificil[vali][vali_2];
                                tablero_dificil[vali][vali_2]=segundo;
                                
                            }
                        }
                        }
                    }else{
                        com_jugador=String.valueOf(jugador_2);
                        for(int vali=9; vali>=0;vali--){
                            for(int vali_2=19; vali_2>=0;vali_2--){
                            if(tablero_dificil[vali][vali_2].equals(com_jugador)){
                                com_jugador_2=tablero_dificil[vali][vali_2];
                                tablero_dificil[vali][vali_2]=segundo;
                                }
                            }
                        }
                    }
                    }
                            
                    
                    
                        if(ganador==0){
                        limpia.limpiartodo();
                        for(int imprimir=9; imprimir>=0;imprimir--){
                                    System.out.println(Arrays.toString(tablero_dificil[imprimir]));
                        }
                        System.out.println("Coloque 1 para volver a tirar");
                        System.out.println("Valores de los dados tirados");
                        pausa=lectura.nextInt();
                    }  
                            
                            
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
