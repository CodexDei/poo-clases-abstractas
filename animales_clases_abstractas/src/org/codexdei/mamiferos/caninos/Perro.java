package org.codexdei.mamiferos.caninos;

public class Perro extends Canino{

    //Atributos de la clase
    private int fuerzaMordida;

    //Constructor

    public Perro(String habitat, float altura, float largo, float peso, String nombreCientifico, String color,
                 float tamanioColmillos, int fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanioColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    //getters
    public int getFuerzaMordida() {
        return fuerzaMordida;
    }

    @Override
    public String comer() {
        return "El perro (" + nombreCientifico + ") se alimenta principalmente de comida seca o húmeda adaptada " +
                "para su nutrición. Vive en " + habitat + " y su dieta puede incluir proteínas, carbohidratos, " +
                "y otros nutrientes necesarios para su salud.";

    }

    @Override
    public String dormir() {
        return "El perro duerme entre 12 y 14 horas al día, generalmente en un lugar cómodo dentro de los " +
                habitat + ". Dependiendo de su tamaño, su sueño se distribuye en siestas a lo largo del día.";

    }

    @Override
    public String correr() {
        return "El perro, con una altura promedio de " + altura + " metros y un peso de " + peso +
                " kg, puede correr a velocidades de hasta 30 km/h, aunque esta cifra varía mucho entre razas.";

    }

    @Override
    public String comunicarse() {
        return "El perro utiliza una variedad de vocalizaciones como ladridos, gruñidos y aullidos para comunicarse" +
                " en su " + habitat + ". Su fuerza de mordida de " + fuerzaMordida + " psi es utilizada " +
                "principalmente en la defensa, pero también juega un papel en su interacción con otros perros" +
                " y humanos. Además, utiliza el lenguaje corporal para expresar emociones y necesidades.";
    }
    //toString
    public String toString() {
        return "Perro:\n" +
                super.toString() +
                "Fuerza de mordida=" + fuerzaMordida + " PSI\n";
    }
}
