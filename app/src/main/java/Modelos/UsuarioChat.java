package Modelos;

public class UsuarioChat {
    private String nombre;
    private int foto;
    private String lastMessage;


    public UsuarioChat(String nombre, int foto, String lastMessage) {
        this.nombre = nombre;
        this.foto = foto;
        this.lastMessage = lastMessage;
    }

    public UsuarioChat(String nombre, String lastMessage) {
        this.nombre = nombre;
        this.lastMessage = lastMessage;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }
}

