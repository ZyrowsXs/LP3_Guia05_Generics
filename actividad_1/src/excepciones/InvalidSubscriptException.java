package excepciones;

public class InvalidSubscriptException extends IllegalArgumentException {
    public InvalidSubscriptException(String message)
    {
        super(message);
    }
}
