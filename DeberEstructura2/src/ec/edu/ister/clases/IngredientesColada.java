/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.clases;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class IngredientesColada {
    Scanner input= new Scanner(System.in);
    public void Ingredientes1(){
        System.out.println("\t RECETA COLADA MORADA \n ");
        System.out.println("Es una bebida tipica ecuatoriana\n La cual se realiza "
                + "cada 2 de noviembre\n y se la consume con su respectivo\n guagua de pan.......\n"
                + "E aqui una de las mejores recetas\n");
   
        System.out.println("------------------------------------------");
        System.out.println("1.- Colada Morada  ");
        System.out.println("2.- Guagua de Pan \n");
        System.out.println("Que receta decea saber?\n ");
        System.out.println("Escoja una opcion\n >");
        int opcion= input.nextInt();
      
        switch (opcion){
            case 1:
          System.out.println("Usted a escojido COLADA MORADA\n ");  
          System.out.println("\tIngredientes\n\t-------------");
          System.out.println("* 1lb de harina de maìz negro\n* 2 pedasos de panela\n* 8 naranjillas lavadas\n* 1 rama de canela\n* 5 clavos de olor\n"
                  + "*5 granos de pimienta de olor\n* 1/2lb de mora(extracto)\n* 1/2lb de mortiño criollo(extracto)\n* 1/2 piña pelada\n - hojas de naranjo "
                  + "\n - hierba luisa\n - Ishpingo\n -arrayàn \n  - Hierva buena\n");
          System.out.println("\tPreparacion\n\t--------------");
          System.out.println("Disuelva la arina en 1/2 litro de agua caliente,\nagregue un trozo de panela, naranjilla y la cascara de piña "
                  + "\nesta mezcla se debe reposar de un dia para otro,\nDespues agregue otro litro de agua tibia y cierna,\n cocine batiendo para que no se pegue cuando espese baje el fuego,\nincorpore los jugos y cocine 40 minutos sin dejar de batir"
                  + "\nEn un recipiente aparte hierve el resto de la panela con los aliños restantes,\na excepcion de la piña, esta agua vierta a la olla donde esta la harina y siga batiendo,\n Cuando haya espesado y tenga color morado brillante,\n "
                  + "añada la piña finamente picada hierva 10 minutos mas\n agregue las hiervas y deje enfriar. ");
           break;
            case 2:
            System.out.println("Usted a escojido GUAGUA DE PAN\n");
            System.out.println("\tIngredientes\n\t------------");
            System.out.println("*1 1/2kg de harina de trigo\n*1kg de harina sin preparar\n*10 huevos\n*1 1/2kg de azucar\n*500g de manteca\n*"
                    + "50g de canela molida\n*1 oz de esencia de vainilla\n*3 latas de leche evaporada\n*1/4 pq de levadura diluida\n*150g de pasa\n*"
                    + "1/4 de kg de ajonjolì\n*150g de mani tostado y pelado,sal al gusto\n*Grageas");
            System.out.println("\tPreparacion\n\t------------");
            System.out.println("Se mezcla todos los ingredientes hasta obtener una masa suave,\nsi ya esta seca agregue un poco de agua."
                    + "Deje levar 3-4 horas al cabo de los cuales se procede,\n"
                    + "al moldeado de los guaguas.Forme los ojos con pasas,\n"
                    + "y la boca con mani tostado,\nHornee por 30 minutos a 200ºc,\n"
                    + "decore con grajeas y ajonjolì.");
            break;
            default:
            System.out.println("La opcion ingresada no existe \n");
            break;
        } 
       
      
    }
}

