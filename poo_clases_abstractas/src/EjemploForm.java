import org.codexdei.pooclasesabstractas.form.elementos.ElementoForm;
import org.codexdei.pooclasesabstractas.form.elementos.InputForm;
import org.codexdei.pooclasesabstractas.form.elementos.SelectForm;
import org.codexdei.pooclasesabstractas.form.elementos.TextareaForm;
import org.codexdei.pooclasesabstractas.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.List;

public class EjemploForm {

    public static void main(String[] args) {

        InputForm userName = new InputForm("username");
        InputForm password = new InputForm("clave", "password");
        InputForm email = new InputForm("email", "email");
        InputForm edad =new InputForm("edad", "number");

        TextareaForm experiencia = new TextareaForm("exp",5,9);

        SelectForm lenguaje = new SelectForm("lenguaje");

        Opcion java = new Opcion("1","Java");
        lenguaje.addOpcion(java);
        lenguaje.addOpcion(new Opcion("2", "Javascript"));
        lenguaje.addOpcion(new Opcion("3","Kotlin"));
        lenguaje.addOpcion(new Opcion("4","phyton"));
        lenguaje.addOpcion(new Opcion("5","C#"));

        userName.setValor("samy.7");
        password.setValor("4321");
        email.setValor("samy7@hotmail.com");
        edad.setValor("20");
        experiencia.setValor("...mas de 10 anios de experiencia...");
        java.setSelected(true);

        List<ElementoForm> elementos = new ArrayList<>();

        elementos.add(userName);
        elementos.add(password);
        elementos.add(email);
        elementos.add(edad);
        elementos.add(experiencia);
        elementos.add(lenguaje);

        for(ElementoForm elemento : elementos){

            System.out.println(elemento.dibujarHtml());
        }



    }
}
