package org.codexdei.pooclasesabstractas.form.elementos;

public class InputForm extends ElementoForm{

    //Atributos de la clase
    private String tipo = "text";

    //constructores
    public InputForm(String nombre){
        super(nombre);
    }

    public InputForm(String nombre, String tipo){

        super(nombre);
        this.tipo = tipo;
    }

    //getters and setters
    public String getTipo(){
        return this.tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    @Override
    public String dibujarHtml() {
        return "<input type:=\"" + this.tipo
                + "\" name=\"" + this.nombre
                + "\" value=\"" + this.valor + "\">";
    }
}
