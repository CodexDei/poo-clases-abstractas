package org.codexdei.mamiferos;

import org.codexdei.mamiferos.caninos.Lobo;
import org.codexdei.mamiferos.caninos.Perro;
import org.codexdei.mamiferos.felinos.Felino;
import org.codexdei.mamiferos.felinos.Guepardo;
import org.codexdei.mamiferos.felinos.Leon;
import org.codexdei.mamiferos.felinos.Tigre;

import javax.swing.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class EjemploAnimal {

    public static boolean estadoPrograma = false;
    public static List<Mamifero> mamiferos = new ArrayList<>();

    public static void main(String[] args) {

       do {

           try{

               estadoPrograma = true;

               int menuPrincipal = Integer.parseInt(JOptionPane.showInputDialog(null,
                       "Ingrese la opcion que desee:\n\n" +
                               "1. Ingresar al programa de animales\n" +
                               "2. Salir",
                       "ANIMALES",JOptionPane.INFORMATION_MESSAGE));

               switch (menuPrincipal){

                   case 1:
                       //Tigre
                       Mamifero tigre = new Tigre(
                       "Selvas tropicales",1.1f,3.3f,220.5f,
                               "Panthera tigris",7.5f,60f,"Tigre de Bengala");
                       //Leon
                       Mamifero leon = new Leon(
                               "Sabana Africana",1.2f,2.5f,190f,"Panthera Leo",
                                        7.5f,80f,15,114.0f);

                       Mamifero guepardo = new Guepardo("Sabana Africana",0.8f,1.5f,72.0f,
                               "Acinonyx jubatus",5.0f,120.0f);

                       Mamifero lobo = new Lobo(
                               "Bosques y tundras",0.85f,1.6f,45.0f,"Canis Lupus","Gris",
                               5.0f,8,"Lobo gris"
                       );

                       Mamifero perro = new Perro(
                               "Hogar HUmano y zonas Urbanas",0.6f,1.0f,25.0f,
                               "Canis lupus familiaris","negro",2.5f,235
                       );

                       //Agregamos objetos Mamifero a la lista mamiferos
                       mamiferos.add(tigre);
                       mamiferos.add(leon);
                       mamiferos.add(guepardo);
                       mamiferos.add(lobo);
                       mamiferos.add(perro);

                       imprimirAnimal(mamiferos);

                       break;

                   case 2:

                       estadoPrograma = false;

                       break;

                   default:

                       JOptionPane.showMessageDialog(null,
                               "Ingrese solo las opciones numericas del menu","OPCION INVALIDA",JOptionPane.WARNING_MESSAGE);

                       break;
               }

           }catch (InputMismatchException e){

               JOptionPane.showMessageDialog(null,
                       "Ingrese una opcion valida, error: " + e.getMessage(),"INGRESEO INCORRECTO",JOptionPane.ERROR_MESSAGE);

           }catch (Exception e){

               JOptionPane.showMessageDialog(null,
                       "Error en la ejecucion: " + e.getMessage(),"ERROR EN LA EJECUCION",JOptionPane.ERROR_MESSAGE);
           }

       }while (estadoPrograma);
    }

    private static void imprimirAnimal(List<Mamifero> mamiferos) {


        Object[] opciones = {"Info General Animales","Info Animal Especifico"};

        int menuAnimales = JOptionPane.showOptionDialog(
                null,
                "Ingrese la opcion que desee:",
                "ANIMALES MAMIFEROS",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]
        );
        switch (menuAnimales){

            case 0:

                for (Mamifero mamifero : mamiferos){
                    System.out.println(mamifero);
                }

//                mamiferos.forEach(System.out::println);
                break;

            case 1:

                Object[] opciones1 = {"FELINOS","CANINOS"};

                int felinoCanino = JOptionPane.showOptionDialog(

        null,
            "Elija la opcion de su preferencia",
                "FELINOS O CANINOS",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones1,
                    opciones1[0]
                );

                switch (felinoCanino){

                    case 0:

                        System.out.println(mamiferos.get(0));
                        System.out.println(mamiferos.get(1));
                        System.out.println(mamiferos.get(2));

                    break;

                    case 1:

                        System.out.println(mamiferos.get(3));
                        System.out.println(mamiferos.get(4));

                    break;

                    default:

                        JOptionPane.showMessageDialog(null,"Ingrese una opcion valida",
                                "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);

                        break;

                }

                break;

            default:

                JOptionPane.showMessageDialog(null,"Ingrese una opcion valida",
                        "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);

                break;
        }
    }
}
