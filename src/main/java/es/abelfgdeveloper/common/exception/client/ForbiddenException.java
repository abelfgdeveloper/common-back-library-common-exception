package es.abelfgdeveloper.common.exception.client;

import es.abelfgdeveloper.common.exception.AbelfgDeveloperException;

public class ForbiddenException extends AbelfgDeveloperException {

  private static final long serialVersionUID = 1L;
  private static final int ERROR_STATUS_CODE = 403;

  protected ForbiddenException(String message) {
    super(ERROR_STATUS_CODE, message);
  }

  protected ForbiddenException(String message, Throwable cause) {
    super(ERROR_STATUS_CODE, message, cause);
  }
}
