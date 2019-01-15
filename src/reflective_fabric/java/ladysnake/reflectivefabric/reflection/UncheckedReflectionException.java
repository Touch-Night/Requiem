package ladysnake.reflectivefabric.reflection;

public class UncheckedReflectionException extends RuntimeException {

    public UncheckedReflectionException(String message, Throwable cause) {
        super(message, cause);
    }

    public UncheckedReflectionException(Throwable cause) {
        super(cause);
    }
}