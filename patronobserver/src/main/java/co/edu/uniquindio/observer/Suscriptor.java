package co.edu.uniquindio.observer;

public class Suscriptor implements Observer{

    private String nombre;
    private CanalYouTube canalYouTube;
    private String titulo;


    public Suscriptor(String nombre, CanalYouTube canalYouTube ,String titulo) {
        this.nombre = nombre;
        this.canalYouTube = canalYouTube;
        this.titulo = titulo;
    }

    public String getNombre() {
        return nombre;
    }

    public CanalYouTube getCanalYouTube() {
        return canalYouTube;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public void actualizar(String titulo){
        this.titulo = titulo;
    }

    
    @Override
    public String toString(){
        return nombre + ". " + canalYouTube.getNombre() + " ha publicado un nuevo video"+ titulo; 
    }

}
