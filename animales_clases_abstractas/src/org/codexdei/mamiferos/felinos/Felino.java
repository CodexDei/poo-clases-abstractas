package org.codexdei.mamiferos.felinos;

import org.codexdei.mamiferos.Mamifero;

abstract public class Felino extends Mamifero {

    //Atributos de la clase
    protected float tamanioGarras;
    protected float velocidad;

    //constructor
    public Felino(String habitat, float altura, float largo,
                  float peso, String nombreCientifico, float tamanioGarras, float velocidad){

        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamanioGarras = tamanioGarras;
        this.velocidad = velocidad;
    }
    //getters
    public float getTamanioGarras(){

        return this.tamanioGarras;
    }

    public float getVelocidad(){

        return this.velocidad;
    }
    //toStrings

    @Override
    public String toString() {
        return "Felino\n" +
                super.toString() +
                "TamanioGarras=" + tamanioGarras + "\n" +
                "Velocidad=" + velocidad + "\n";
    }
}
