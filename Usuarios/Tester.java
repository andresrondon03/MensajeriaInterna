package Usuarios;

import Mediador.Mediator;

public class Tester extends Usuario {
    public Tester (Mediator mediador, String nombre){
        super(mediador, nombre);
    }

    @Override
    public void enviar (String mensaje){
        System.out.println(nombre + "(Tester) envía: " + mensaje);
        mediador.enviarMensaje(mensaje,this);
    }

    @Override 
    public void recibir (String mensaje, String remitente){
        System.out.println(nombre + "(Tester) recibe de : " + remitente + ": " + mensaje);
    }
}
