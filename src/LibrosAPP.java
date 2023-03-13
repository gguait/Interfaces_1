
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author pabmar
 */
public class LibrosAPP {

    public static int cuentaPrestados(ArrayList<Publicacion> lista) {
        int contador = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) instanceof Libro) {
                contador++;
            }
        }
        return contador;
    }

    public static int publicacionesAnterioresA(ArrayList<Publicacion> lista, int ano) {
        int contador = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getAnoPublicacion() < ano) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
//        crear un arrayList de Publicaciones con 2 libros y 2 revistas, prestar uno
//        de los libros, mostrar por pantalla los datos almacenados en el arrayList y mostrar por pantalla
//        cuántas publicaciones hay prestadas y cuántas hay anteriores a 2000 utilizando los métodos escritos
//        anteriormente.

        ArrayList<Publicacion> lista = new ArrayList();

//        int codigo, int anoPublicacion, String nombre
        Libro libro1 = new Libro(11, 2020, "Libro numero 1");
        Libro libro2 = new Libro(12, 1960, "Libro numero 2");
        
//        int numero, int codigo, int anoPublicacion, String nombre
        Revista revista1 = new Revista(11, 53, 2016, "Revista numero 1");
        Revista revista2 = new Revista(12, 32, 2021, "Revista numero 2");
        
        lista.add(libro1);
        lista.add(libro2);
        lista.add(revista1);
        lista.add(revista2);
        
        System.out.println(cuentaPrestados(lista));
        System.out.println(publicacionesAnterioresA(lista, 2000));
        
        System.out.println(lista.toString());
    }
}
