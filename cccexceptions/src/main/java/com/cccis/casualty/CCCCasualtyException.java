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

import com.mscharhag.et.ET;
import com.mscharhag.et.ExceptionTranslator;

public class CCCCasualtyException extends RuntimeException {

  /**
   *
   */
  private static final long serialVersionUID = -3615731463803876276L;
  public static ExceptionTranslator cet = ET.newConfiguration().translate(Exception.class).to(CCCCasualtyException.class).done();

  public CCCCasualtyException() {
  }

  public CCCCasualtyException(final String message) {
    super(message);
  }

  public CCCCasualtyException(final String message, final Throwable cause) {
    super(message, cause);
  }

  public CCCCasualtyException(final String message, final Throwable cause, final boolean enableSuppression,
      final boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }

  public CCCCasualtyException(final Throwable cause) {
    super(cause);
  }

}
