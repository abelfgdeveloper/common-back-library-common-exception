package es.abelfgdeveloper.common.exception.server;

public class ValidationResponseException extends InternalServerErrorException {

  private static final long serialVersionUID = 1L;

  protected ValidationResponseException(String message) {
    super(message);
  }

  protected ValidationResponseException(String message, Throwable cause) {
    super(message, cause);
  }
}
