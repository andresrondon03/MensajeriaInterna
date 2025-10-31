import Mediador.ProjectManager;
import Usuarios.*;

public class Main {
    public static void main(String[] args) {
        ProjectManager pm = new ProjectManager();

        Desarrollador dev = new Desarrollador(pm, "Juan");
        Tester tester = new Tester(pm, "Ana");
        Gerente gerente = new Gerente(pm, "Luis");

        pm.registrarUsuario(dev);
        pm.registrarUsuario(tester);
        pm.registrarUsuario(gerente);

        System.out.println("\n--- Simulación de comunicación ---\n");
        dev.enviar("Listo el módulo de login, por favor probar.");
        tester.enviar("Bug encontrado en validación.");
        gerente.enviar("Revisión de sprint mañana a las 9am.");
    }
}
