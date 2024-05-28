public class Main {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "El planeta de los simios";
        miPelicula.fechaDeLanzamiento = 2024;
        miPelicula.duracionEnMinutos = 120;

        System.out.println("Mi pelicula es: " + miPelicula.nombre);
        System.out.println("Lanzada en: " + miPelicula.fechaDeLanzamiento);

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre = "Transformers";
        otraPelicula.fechaDeLanzamiento = 2009;

        System.out.println("Mi otra pelicula es: " + otraPelicula.nombre);
        System.out.println("Dura: " + otraPelicula.duracionEnMinutos);
    }
}
