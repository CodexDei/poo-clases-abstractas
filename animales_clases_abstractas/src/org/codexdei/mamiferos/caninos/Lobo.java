package org.codexdei.mamiferos.caninos;

public class Lobo extends Canino{

    //Atributos de la clase
    private int numeroManada;
    private String especieLobo;
    //Constructor

    public Lobo(String habitat, float altura, float largo, float peso, String nombreCientifico, String color,
                float tamanioColmillos, int numeroManada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanioColmillos);
        this.numeroManada = numeroManada;
        this.especieLobo = especieLobo;
    }

    //getters
    public int getNumeroManada() {
        return numeroManada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    @Override
    public String comer() {
        return "El " + especieLobo + " caza en los " + habitat + " en manadas de hasta " + numeroManada +
                " lobos. Con una altura de " + altura + " metros y un peso de " + peso + " kg, el lobo es un " +
                "depredador eficiente, capaz de derribar presas grandes como alces y ciervos.";

    }

    @Override
    public String dormir() {
        return "El " + especieLobo + " descansa en la " + habitat + ", a menudo en madrigueras o lugares resguardados." +
                " Duerme unas 8 horas al día, y se mantiene alerta al entorno, incluso durante el descanso, " +
                "para proteger a su manada.";
    }

    @Override
    public String correr() {
        return "El " + especieLobo + " es un corredor de fondo que puede alcanzar velocidades de hasta " +
                " 60" + " km/h en distancias cortas. Su peso de " + peso + " kg y su altura de " + altura + " " +
                "metros lo hacen resistente en la caza prolongada.";

    }

    @Override
    public String comunicarse() {
        return "El " + especieLobo + " utiliza una variedad de vocalizaciones, como aullidos, gruñidos y ladridos, " +
                "para comunicarse con su manada en los " + habitat + ". Los aullidos pueden ser escuchados a " +
                "kilómetros de distancia, coordinando la caza y marcando territorio.";

    }
    //toString
    public String toString() {
        return "Lobo:\n" +
                super.toString() +
                "Numero Manada=" + numeroManada + "\n" +
                "Especie Lobo=" + especieLobo + "\n";
    }
}
