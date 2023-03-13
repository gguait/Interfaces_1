
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author pabmar
 */
public class Publicacion {

    protected int codigo, anoPublicacion;
    protected String nombre;
    ArrayList<Publicacion> lista;

    public Publicacion(int codigo, int anoPublicacion, String nombre) {
        this.codigo = codigo;
        this.anoPublicacion = anoPublicacion;
        this.nombre = nombre;
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
        return "Publicacion{" + "codigo=" + codigo + ", anoPublicacion=" + anoPublicacion + ", nombre=" + nombre + ", lista=" + lista + '}';
    }

}