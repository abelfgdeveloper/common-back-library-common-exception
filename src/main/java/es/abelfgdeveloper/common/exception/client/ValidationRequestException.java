package es.abelfgdeveloper.common.exception.client;

public class ValidationRequestException extends BadRequestException {

  private static final long serialVersionUID = 1L;

  protected ValidationRequestException(String message) {
    super(message);
  }

  protected ValidationRequestException(String message, Throwable cause) {
    super(message, cause);
  }
}
