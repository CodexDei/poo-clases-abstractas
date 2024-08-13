package org.codexdei.pooclasesabstractas.form.elementos.validador;

public class NumeroValidador extends Validador{

    //Atributos de la clase
    protected String mensaje = "El campo %s debe ser numerico";

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

        try{
            Integer.parseInt(valor);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}
