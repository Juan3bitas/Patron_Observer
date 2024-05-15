package co.edu.uniquindio.observer;

import java.util.ArrayList;
import java.util.List;

public class CanalYouTube {

    private String nombre;
    private String titulo;
    private List<Suscriptor> suscriptores;

    public CanalYouTube(String nombre, String titulo, List<Suscriptor> suscriptores) {
        this.nombre = nombre;
        this.titulo = titulo;
        this.suscriptores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
        notificarSuscriptores();
    }

    public void suscribirse(Suscriptor suscriptor){
        suscriptores.add(suscriptor);
    }

    public void desuscribirse(Suscriptor suscriptor){
        suscriptores.remove(suscriptor);
    }

    public void notificarSuscriptores(){
        for(Suscriptor suscriptor : suscriptores){
            suscriptor.actualizar(titulo);
            suscriptor.toString();
        }
    }

    @Override
    public String toString(){
        return "Canal de YouTube:\n" + "Nombre: " + nombre + ". Último video subido: " + titulo;
    }
    
}