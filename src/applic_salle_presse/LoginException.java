package applic_salle_presse;

public class LoginException extends Exception {

    private String errorMessage;

    public LoginException(String message) {
        this.errorMessage = message;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
