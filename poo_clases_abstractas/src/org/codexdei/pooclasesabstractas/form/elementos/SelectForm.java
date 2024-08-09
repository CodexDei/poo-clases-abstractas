package org.codexdei.pooclasesabstractas.form.elementos;

import org.codexdei.pooclasesabstractas.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementoForm{
    //Atributos de la clase
    private List<Opcion> opciones;

    //Constructores de la clase
    public SelectForm(String nombre){

        super(nombre);
        this.opciones = new ArrayList<>();
    }
    public SelectForm(String nombre,List<Opcion> opciones){

        super(nombre);
        this.opciones = opciones;
    }

    public SelectForm addOpcion(Opcion opcion){
        this.opciones.add(opcion);
        return this;
    }

    @Override
    public String dibujarHtml() {

        StringBuilder sb = new StringBuilder("<select ");
        sb.append("name='")
                .append(this.nombre)
                .append("'>");

        for (Opcion opcion : this.opciones){
            sb.append("\n<option value='")
                    .append(opcion.getValor())
                    .append("'");
            if(opcion.isSelected()){
                sb.append(" selected");
                this.valor = opcion.getValor();
            }
            sb.append(">")
                    .append(opcion.getNombre())
                    .append("</option>");
        }
        sb.append("</select>");

        return sb.toString();
    }
}
