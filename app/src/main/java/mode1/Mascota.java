package mode1;

public class Mascota {
    private String id;
    private String nombre;
    private String fotoUrl;
    private int rating;

    public Mascota(String id, String nombre, String fotoUrl, int rating) {
        this.id = id;
        this.nombre = nombre;
        this.fotoUrl = fotoUrl;
        this.rating = rating;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFotoUrl() {
        return fotoUrl;
    }

    public void setFotoUrl(String fotoUrl) {
        this.fotoUrl = fotoUrl;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
