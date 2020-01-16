/**
 * Copyright (C) 2019 CCCIS Casualty (admin@aisreview.com)
 *
 * The software code contained herein is the property of CCCIS
 * and its subsidiaries and affiliates (collectively, “CCCIS”).
 *
 * Use of this software code and any applications and information therein
 * constitutes acknowledgement of and consent to this notice
 */
package com.cccis.casualty;

public class CCCCasualtyRepoException extends CCCCasualtyException {

  /**
  *
  */
  private static final long serialVersionUID = -3526372440262133047L;

  public CCCCasualtyRepoException() {
    super();
  }

  public CCCCasualtyRepoException(final String message) {
    super(message);
  }

  public CCCCasualtyRepoException(final String message, final Throwable cause) {
    super(message, cause);
  }

  public CCCCasualtyRepoException(final String message, final Throwable cause, final boolean enableSuppression,
      final boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }

  public CCCCasualtyRepoException(final Throwable cause) {
    super(cause);
  }

}
