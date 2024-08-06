package org.codexdei.pooclasesabstractas.form.elementos;

public class TextareaForm extends ElementoForm{

    //Atributos
    private int filas;
    private int columnas;

    //constructores
    public TextareaForm(String nombre) {
        super(nombre);
    }

    public TextareaForm(String nombre, int filas, int columnas) {
        super(nombre);
        this.filas = filas;
        this.columnas = columnas;
    }

    //getters and setters
    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    @Override
    public String dibujarHtml() {
        return "<textarea name='" + this.nombre
                +"' cols='" + this.columnas
                + "' row='" + this.filas + "'>"
                + this.valor + "</textarea>";
    }
}
