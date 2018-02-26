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
        // TODO code application logic here
        while(true){
            int [][] tablero =new int [10][10]; 
            System.out.println("[IPC1]Tarea3_201701133");
            System.out.println("  ");
            System.out.println("1. Dificultad del Juego");
            System.out.println("2. Parametros Inciales");
            System.out.println("3. Inciar Juego");
            System.out.println("4. Salir");
            Scanner lectura=new Scanner(System.in);
            int opcion_principal=lectura.nextInt();
            switch(opcion_principal){
                case 1:
                    int cont_submenu1=1;
                    while(cont_submenu1==1){
                        System.out.println("1. Facil");
                        System.out.println("2. Dificil");
                        System.out.println("3. Regresar");
                        int lectura_op1=lectura.nextInt();
                        switch(lectura_op1){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                cont_submenu1++;
                                //Cerramos el ciclo y volvemos al menu principal
                                break;
                        }
                        
                    }
                    break;
                case 2:
                    int cont_submenu2=1;
                    while(cont_submenu2==1){
                        System.out.println("1. Jugadores");
                        System.out.println("2. Subidas y bajones");
                        System.out.println("3. Regresar");
                        int lectura_op1=lectura.nextInt();
                        switch(lectura_op1){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                cont_submenu2++;
                                //Cerramos el ciclo y volvemos al menu principal
                                break;
                        }
                    }
                    break;
                case 3:
                    break;
                case 4:
                    System.exit(0);
                    break;
                
            }
        }
    }   
}
