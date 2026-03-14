public class ValidacionContrasenas {

    public boolean esValida(String contrasena) {

        // Expresión regular:
        // (?=.*[0-9])        → al menos un número
        // (?=.*[A-Z])        → al menos una mayúscula
        // (?=.*[a-z])        → al menos una minúscula
        // (?=.*[^A-Za-z0-9]) → al menos un carácter especial
        // .{8,}              → mínimo 8 caracteres

        String regex = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])(?=.*[^A-Za-z0-9]).{8,}$";

        return contrasena.matches(regex);
    }
}