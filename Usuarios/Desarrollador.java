package Usuarios;

import Mediador.Mediator;

public class Desarrollador extends Usuario{
    public Desarrollador (Mediator mediador, String nombre){
        super(mediador, nombre);
    }

    @Override
    public void enviar (String mensaje){
        System.out.println(nombre + "(Desarrollador) envía: " + mensaje);
        mediador.enviarMensaje(mensaje,this);
    }

    @Override 
    public void recibir (String mensaje, String remitente){
        System.out.println(nombre + "(Desarrollador) recibe de : " + remitente + ": " + mensaje);
    }
}
