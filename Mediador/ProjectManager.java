package Mediador;

import java.util.ArrayList;
import java.util.List;

import Usuarios.Usuario;

public class ProjectManager implements Mediator {
    private List<Usuario> usuarios = new ArrayList<>();

    @Override
    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public void enviarMensaje(String mensaje, Usuario remitente) {
        System.out.println("Project Manager recibe mensaje de " + remitente.getNombre() + ": " + mensaje);

        // Reglas de comunicación
        if (remitente.getClass().getSimpleName().equals("Desarrollador")) {
            // Desarrollador → Testers
            for (Usuario u : usuarios) {
                if (u.getClass().getSimpleName().equals("Tester")) {
                    u.recibir(mensaje, remitente.getNombre());
                }
            }
        } else if (remitente.getClass().getSimpleName().equals("Tester")) {
            // Tester → Desarrolladores
            for (Usuario u : usuarios) {
                if (u.getClass().getSimpleName().equals("Desarrollador")) {
                    u.recibir(mensaje, remitente.getNombre());
                }
            }
        } else if (remitente.getClass().getSimpleName().equals("Gerente")) {
            // Gerente → todos
            for (Usuario u : usuarios) {
                if (u != remitente) {
                    u.recibir(mensaje, remitente.getNombre());
                }
            }
        }
    }
}
