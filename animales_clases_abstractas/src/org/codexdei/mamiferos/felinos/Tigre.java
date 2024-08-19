package org.codexdei.mamiferos.felinos;

import org.codexdei.mamiferos.Mamifero;

public class Tigre extends Felino {

    //Atributos de la clase Tigre
    private String especie;

    //construtores
    public Tigre(String habitat, float altura, float largo,
                 float peso, String nombreCientifico, float tamanioGarras, float velocidad,String especie){

        super(habitat, altura, largo, peso, nombreCientifico, tamanioGarras, velocidad);
        this.especie = especie;
    }

    //getters
    public String getEspecie(){

        return this.especie;
    }
    //Metodos heredados e implementados de la clase abstracta Mamifero
    @Override
    public String comer() {
        //peso
        return "El " + getEspecie() + " (" + getNombreCientifico() + "), que habita en " + getHabitat() + "\n" +
                ", mide aproximadamente " + getAltura() + " metros de altura, " + getLargo() + "\n" +
                " metros de largo y pesa alrededor de " + getPeso() + " kg. " + "\n" +
                "Este majestuoso animal caza y come con gran destreza con sus garras de " + getTamanioGarras() + " cm\n";
    }

    @Override
    public String dormir() {
        return "El " + getEspecie() + ", que habita en " + getHabitat() + ", es un animal que pasa gran parte del día durmiendo.\n" +
                "Los tigres pueden dormir entre 16 y 20 horas al día. " +
                "Este hábito es común debido a su estilo de vida como depredador solitario, lo que les permite ahorrar energía\n" +
                "para sus cacerías. Prefieren descansar en lugares tranquilos y aislados, a menudo entre la vegetación densa\n" +
                "donde pueden permanecer ocultos de otros animales y del calor intenso.\n";
    }

    @Override
    public String correr() {
        return "El " + especie + ", con un peso aproximado de " + peso + " kg y una altura de " + altura + " metros,\n" +
                "es conocido por su impresionante capacidad para correr a altas velocidades.\n" +
                "A pesar de su gran tamaño, los tigres pueden alcanzar velocidades de hasta " + getVelocidad() +" km/h en distancias cortas.\n" +
                "Utilizan su fuerza y agilidad para cazar presas, aprovechando su velocidad en emboscadas\n" +
                "rápidas y explosivas. Sin embargo, no pueden mantener esta velocidad por mucho tiempo\n" +
                "por lo que dependen de su capacidad para acercarse sigilosamente a sus presas antes de atacar\n";
    }

    @Override
    public String comunicarse() {
        return "El " + especie + ", que habita en " + habitat + ", se comunica de diversas maneras.\n" +
                "Los tigres utilizan rugidos poderosos para marcar su territorio y advertir a otros tigres.\n" +
                "Además, usan gruñidos, bufidos y ronroneos para expresar diferentes estados de ánimo.\n" +
                "También se comunican mediante marcas de olor que dejan en árboles y el suelo,\n" +
                "así como mediante el marcado de su territorio con orina y arañazos en la corteza de los árboles.\n";
    }

    //toString
    @Override
    public String toString() {
        return "Tigre:\n" +
                super.toString() +
                "Especie=" + especie + "\n";
    }
}
