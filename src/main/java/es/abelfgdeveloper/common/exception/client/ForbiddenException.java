package es.abelfgdeveloper.common.exception.client;

import es.abelfgdeveloper.common.exception.AbelfgDeveloperException;

public class ForbiddenException extends AbelfgDeveloperException {

  private static final long serialVersionUID = 1L;
  private static final int ERROR_STATUS_CODE = 403;

  public ForbiddenException(String message) {
    super(ERROR_STATUS_CODE, message);
  }

  public ForbiddenException(String message, Throwable cause) {
    super(ERROR_STATUS_CODE, message, cause);
  }
}
