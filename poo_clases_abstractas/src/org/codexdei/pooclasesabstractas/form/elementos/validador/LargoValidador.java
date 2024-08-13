package org.codexdei.pooclasesabstractas.form.elementos.validador;

import org.codexdei.pooclasesabstractas.form.elementos.validador.mensaje.MensajeFormateable;

public class LargoValidador extends Validador implements MensajeFormateable {

    //Atributos de la clase
    protected String mensaje = "El campo %s debe tener minimo %d y maximo %d caracteres";
    private int minimo;
    private int maximo = Integer.MAX_VALUE;

    public LargoValidador(){

    }

    public LargoValidador(int minimo, int maximo){

        this.minimo = minimo;
        this.maximo = maximo;
    }

    public void setMinimo(int minimo){

        this.minimo = minimo;
    }

    public void setMaximo(int maximo){

        this.maximo = maximo;
    }

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

        if (valor == null){

            return true;
        }

        int largo = valor.length();

        return (largo >= minimo && largo <= maximo);
    }

    @Override
    public String getMensajeFormateado(String campo) {
        return this.mensaje = String.format(this.mensaje, campo, this.minimo, this.maximo);
    }
}
