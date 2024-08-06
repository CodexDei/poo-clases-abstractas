package org.codexdei.pooclasesabstractas.form.elementos;

import java.util.ArrayList;
import java.util.List;

abstract public class ElementoForm {

    //Atributos de la clase
    protected String nombre;
    protected String valor;

//    List<String> validadores = new ArrayList<>();

    //Constructores
    public ElementoForm(){}

    public ElementoForm(String nombre){

        this();
        this.nombre = nombre;
    }

    public void setValor(String valor){
        this.valor = valor;
    }

    abstract public String dibujarHtml();
}
