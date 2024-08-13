import org.codexdei.pooclasesabstractas.form.elementos.*;
import org.codexdei.pooclasesabstractas.form.elementos.select.Opcion;
import java.util.Arrays;
import java.util.List;

public class EjemploForm {

    public static void main(String[] args) {

        InputForm userName = new InputForm("username");
        InputForm password = new InputForm("clave", "password");
        InputForm email = new InputForm("email", "email");
        InputForm edad =new InputForm("edad", "number");

        TextareaForm experiencia = new TextareaForm("exp",5,9);

        SelectForm lenguaje = new SelectForm("lenguaje");

        Opcion phyton = new Opcion("1","Phyton");
        Opcion java = new Opcion("2","Java");
        //Se puede usar de forma encadenada porque es del tipo de la clase: SelectForm
        lenguaje.addOpcion(phyton)
        .addOpcion(java)
        .addOpcion(new Opcion("3", "Javascript"))
        .addOpcion(new Opcion("4","Kotlin"))
        .addOpcion(new Opcion("5","C#"));

        //Clase ANONIMA
        ElementoForm saludar = new ElementoForm("saludo") {
            @Override
            public String dibujarHtml() {
                return "<input disabled name='" + this.nombre + "' value=\"" + this.valor + "\">";
            }
        };

        saludar.setValor("Hey!! este campo esta deshabilitado");
        userName.setValor("samy.7");
        password.setValor("4321");
        email.setValor("samy7@hotmail.com");
        edad.setValor("20");
        experiencia.setValor("...mas de 10 anios de experiencia...");
        java.setSelected(true);
//Forma comun de agregar elementos a la lista
//        List<ElementoForm> elementos = new ArrayList<>();
//
//        elementos.add(userName);
//        elementos.add(password);
//        elementos.add(email);
//        elementos.add(edad);
//        elementos.add(experiencia);
//        elementos.add(lenguaje);
    //Forma optimizada de agregar elementos a la lista
    List<ElementoForm> elementos = Arrays.asList(
            userName,
            password,
            email,
            edad,
            experiencia,
            lenguaje,
            saludar
    );
    //forma comun de iterar una lista:
//        for(ElementoForm elemento : elementos){
//
//            System.out.println(elemento.dibujarHtml());
//            System.out.println("<br>");
//        }
    //Forma optimizada de iterar una lista utilizando forEch lampda
    elementos.forEach(e -> {
        System.out.println(e.dibujarHtml());
        System.out.println("<br>");
    });


    }
}
