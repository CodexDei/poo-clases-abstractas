package org.codexdei.mamiferos;

abstract public class Mamifero {

    //Atributos de la clase abstracta Mamifero
    protected String habitat;
    protected float altura;
    protected float largo;
    protected float peso;
    protected String nombreCientifico;

    //constructores
    public Mamifero(String habitat, float altura, float largo,
                    float peso, String nombreCientifico){

        this.habitat = habitat;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
        this.nombreCientifico = nombreCientifico;
    }
    //getters
    public String getHabitat(){

        return this.habitat;
    }

    public float getAltura() {
        return altura;
    }

    public float getLargo() {
        return largo;
    }

    public float getPeso() {
        return peso;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    @Override
    public String toString() {
        return "Mamifero\n" +
                "Habitat='" + habitat + "\n" +
                "Altura=" + altura + "\n" +
                "Largo=" + largo + "\n" +
                "Peso=" + peso + "\n" +
                "NombreCientifico=" + nombreCientifico + "\n";
    }

    //Metodos abstractos de la clase abstracta Mamifero
    abstract public String comer();
    abstract public String dormir();
    abstract public String correr();
    abstract public String comunicarse();
}
