package Usuarios;

import Mediador.Mediator;

public abstract class Usuario {
    protected Mediator mediador;
    protected String nombre;

    public Usuario (Mediator mediador, String nombre){
        this.mediador=mediador;
        this.nombre=nombre;
    }

    public abstract void enviar(String mensaje);
    public abstract void recibir(String mensaje, String remitente);

    public String getNombre (){
        return nombre;
    }
}
