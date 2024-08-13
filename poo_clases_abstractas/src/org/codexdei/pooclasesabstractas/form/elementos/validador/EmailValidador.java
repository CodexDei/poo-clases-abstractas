package org.codexdei.pooclasesabstractas.form.elementos.validador;

public class EmailValidador extends Validador{

    protected String mensaje = "El formato del campo %s es invalido";
    //Una constante que se utilizara para validar el correo
    private static final String EMAIL_REGEX = "^(.+)@(.+)$";

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        //validador de correo
        return valor.matches(EMAIL_REGEX);
    }
}
