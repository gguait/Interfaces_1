
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pabmar
 */
public class Libro extends Publicacion implements Prestable{
    private boolean prestado = false;

    public Libro(int codigo, int anoPublicacion, String nombre) {
        super(codigo, anoPublicacion, nombre);
        this.prestado = false;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return super.toString()+" Libro{" + "prestado=" + prestado + '}'+"\n";
    }
    
    public void prestar(){
        
    }
    public void devolver(){
        
    }
    public boolean prestado(){
        return true;
    }
    
}
