package cl.vacunateapp.microservice_vaccinator.exception.badrequest.password;

public class PasswordEmptyException extends BadPasswordException {
    public static final String DESCRIPTION = "La Contraseña no se encuentra en la peticion";

    public PasswordEmptyException(String detail) {
        super(DESCRIPTION + ": " + detail);
    }
}
