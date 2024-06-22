package Exception;

public class ResourceNotFoundException extends RuntimeException {
	
	//404 with ResourceNotFoundException
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
