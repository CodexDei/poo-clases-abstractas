package org.codexdei.pooclasesabstractas.form.elementos;

import org.codexdei.pooclasesabstractas.form.elementos.validador.Validador;
import org.codexdei.pooclasesabstractas.form.elementos.validador.mensaje.MensajeFormateable;

import java.util.ArrayList;
import java.util.List;

abstract public class ElementoForm {

    //Atributos de la clase
    protected String nombre;
    protected String valor;

    private List<Validador> validadores;
    private List<String> errores;

//    List<String> validadores = new ArrayList<>();

    //Constructores
    public ElementoForm() {

        this.validadores = new ArrayList<>();
        this.errores = new ArrayList<>();
    }

    public ElementoForm(String nombre) {

        this();
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public ElementoForm addValidador(Validador validador) {
        this.validadores.add(validador);
        return this;
    }

    public List<String> getErrores() {
        return this.errores;
    }

    public boolean esValido() {

        for (Validador v : validadores) {

            if (!v.esValido(this.valor)) {

                if (v instanceof MensajeFormateable) {

                    this.errores.add(((MensajeFormateable) v).getMensajeFormateado(this.nombre));

                } else {

                    this.errores.add(String.format(v.getMensaje(), this.nombre));
                }
            }
        }
        return this.errores.isEmpty();
    }

    //Metodos abstractos de la clase
    abstract public String dibujarHtml();
}
