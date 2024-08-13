package org.codexdei.pooclasesabstractas.form.elementos.validador;

public class NoNuloValidador extends Validador{

    //Atributos de la clase
    private String mensaje = "El campo no puede ser nulo";

    //Implementacion de metodos de la clase padre
    @Override
    public String getMensaje() {
        return this.mensaje;
    }

    @Override
    public void setMensaje(String mensaje) {

        this.mensaje = mensaje;
    }

    @Override
    public boolean esValido(String valor) {

        return (valor != null);
    }
}
