package org.codexdei.mamiferos.felinos;

public class Leon extends Felino{

    //Atributos de la clase Leon
    private int numeroManada;
    private float potenciaRugidoDecibel;

    //Consttructores


    public Leon(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanioGarras,
                float velocidad, int numeroManada, float potenciaRugidoDecibel) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanioGarras, velocidad);
        this.numeroManada = numeroManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }
    //getters
    public int getNumeroManada() {
        return numeroManada;
    }

    public float getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }
    //Metodos Abstractos
    @Override
    public String comer() {
        return "El " + nombreCientifico + " (" + habitat + ") es un depredador social que caza en grupo. " +
                "Un león adulto, con un peso de alrededor de " + peso + " kg y un largo de " + largo + " metros, " +
                "utiliza sus poderosas garras de " + tamanioGarras + " cm para derribar a su presa. " +
                "Después de la caza, comparte la comida con los " + numeroManada + " miembros de su manada.";
    }

    @Override
    public String dormir() {
        return "Los leones, que viven en la " + habitat + ", son conocidos por su vida tranquila. " +
                "Pasan hasta 20 horas al día descansando para conservar energía para la caza.";
    }

    @Override
    public String correr() {
        return "A pesar de su gran tamaño, el león (" + nombreCientifico + ") es capaz de alcanzar velocidades " +
                "de hasta " + velocidad + " km/h en distancias cortas, lo que les permite emboscar a sus presas " +
                "en la " + habitat + ".";
    }

    @Override
    public String comunicarse() {
        return "El rugido de un león puede alcanzar los " + potenciaRugidoDecibel + " decibeles, " +
                "y se escucha hasta 8 km de distancia. Esto les permite mantener el contacto con su manada de " +
                numeroManada + " miembros y marcar su territorio en la vasta " + habitat + ".";
    }

    //toString
    public String toString() {
        return "Leon:\n" +
                super.toString() +
                "Numero Manada=" + numeroManada + "\n" +
                "Potencia Rugido=" + potenciaRugidoDecibel + "\n";
    }
}
