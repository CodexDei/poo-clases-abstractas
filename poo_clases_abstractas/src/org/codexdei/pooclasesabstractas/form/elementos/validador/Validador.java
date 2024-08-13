package org.codexdei.pooclasesabstractas.form.elementos.validador;

abstract public class Validador {

    //Atributos de la clase
    protected String mensaje;

    //metodos abstractos
    abstract public String getMensaje();
    abstract public void setMensaje(String mensaje);
    abstract public boolean esValido(String valor);
}
