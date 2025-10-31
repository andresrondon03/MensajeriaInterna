# Mediator
# Ejercicio #1 - Sistema de mensajeria interna

## Integrantes del Grupo 
- **Sara Sofia Castro Quiroga** - 20231020212  
- **Andres Felipe Rondon Lara** - 20232020005  

---

Objetivo:
Implementar el patrón Mediator simulando la comunicación dentro de un equipo de desarrollo
donde los roles (Desarrollador, Tester, Gerente) no se comunican directamente, sino a través
del Project Manager (Mediador).

Reglas de comunicación:
- Desarrolladores: pueden enviar mensajes a Testers o al Project Manager.
- Testers: pueden enviar mensajes a Desarrolladores o al Project Manager.
- Gerentes: envían mensajes a todos (Desarrolladores, Testers y Project Manager).
- Project Manager: recibe todo y decide quién recibe el mensaje.

Comportamiento esperado:
- [Dev Juan] → “Listo el módulo de login, por favor probar.”
- [PM] recibe mensaje de Dev Juan → reenvía a [Tester Ana].
- [Tester Ana] → “Bug encontrado en validación.”
- [PM] recibe mensaje de Tester Ana → reenvía a [Dev Juan].
- [Gerente Luis] → “Revisión de sprint mañana a las 9am.”
- [PM] → envía mensaje a todos los miembros.
