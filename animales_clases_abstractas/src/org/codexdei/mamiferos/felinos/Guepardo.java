package org.codexdei.mamiferos.felinos;

public class Guepardo extends Felino{

    //Constructor
    public Guepardo(String habitat, float altura, float largo, float peso, String nombreCientifico,
                    float tamanioGarras, float velocidad) {

        super(habitat, altura, largo, peso, nombreCientifico, tamanioGarras, velocidad);
    }

    @Override
    public String comer() {
        return "El guepardo (Acinonyx jubatus) caza en la " + habitat + ". Con una altura de " + altura +
                " metros y un peso de " + peso + " kg, acecha a sus presas, generalmente gacelas y antílopes," +
                " y las derriba a gran velocidad.";

    }

    @Override
    public String dormir() {
        return "El guepardo duerme en la " + habitat + " aproximadamente 12 horas al día. Debido a sus hábitos diurnos," +
                " necesita descansar mucho para recuperar energía después de cazar.";
    }

    @Override
    public String correr() {
        return "El guepardo, con su velocidad de hasta " + velocidad + " km/h, es el animal terrestre más rápido del" +
                " mundo. Su cuerpo ligero, con un peso de " + peso + " kg, y su altura de " + altura + " metros, " +
                "están perfectamente adaptados para alcanzar estas velocidades.";
    }

    @Override
    public String comunicarse() {
        return "El guepardo se comunica a través de sonidos como chirridos y silbidos, que se diferencian de los " +
                "rugidos de otros grandes felinos. También utiliza posturas corporales y marcas de olor para " +
                "interactuar con otros guepardos en la " + habitat + ".";
    }
    //toString
    public String toString() {
        return "Guepardo:\n" +
                super.toString();
    }
}
