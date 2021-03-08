package es.abelfgdeveloper.common.exception.client;

import es.abelfgdeveloper.common.exception.AbelfgDeveloperException;

public class UnauthorizedException extends AbelfgDeveloperException {

  private static final long serialVersionUID = 1L;
  private static final int ERROR_STATUS_CODE = 401;

  public UnauthorizedException(String message) {
    super(ERROR_STATUS_CODE, message);
  }

  public UnauthorizedException(String message, Throwable cause) {
    super(ERROR_STATUS_CODE, message, cause);
  }
}
