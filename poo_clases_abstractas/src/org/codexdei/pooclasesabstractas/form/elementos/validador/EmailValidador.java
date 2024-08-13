package org.codexdei.pooclasesabstractas.form.elementos.validador;

public class EmailValidador extends Validador{

    protected String mensaje = "";

    @Override
    public String getMensaje() {
        return "";
    }

    @Override
    public void setMensaje(String mensaje) {

    }

    @Override
    public boolean esValido(String valor) {
        return false;
    }
}
