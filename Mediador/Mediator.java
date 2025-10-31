package Mediador;

import Usuarios.Usuario;

public interface Mediator {
    void enviarMensaje (String mensaje, Usuario remitente);
    void registrarUsuario (Usuario usuario);
}
