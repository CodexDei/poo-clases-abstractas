package org.codexdei.mamiferos.caninos;

import org.codexdei.mamiferos.Mamifero;

abstract public class Canino extends Mamifero {

    //Atributos de la clase
    protected String color;
    protected float tamanioColmillos;

    //Constructor
    public Canino(String habitat, float altura, float largo, float peso, String nombreCientifico, String color,
                  float tamanioColmillos) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamanioColmillos = tamanioColmillos;
    }


    //getters

    public String getColor() {
        return color;
    }

    public float getTamanioColmillos() {
        return tamanioColmillos;
    }
    //toString
    public String toString() {
        return "Canino\n" +
                super.toString() +
                "Color=" + color + "\n" +
                "Tamaño Colmillos=" + tamanioColmillos + "\n";
    }
}
