package repeticion;
public class Ejercicio {
    public static void main(String[] args) {
        String[] nombres = {"william", "andres", "monroy", "neira"};
        String cadena = "";

        for (String nombre : nombres) {
            cadena = ( cadena + " "+  nombre )  ;

        }
        System.out.println(cadena);

    }
}
