/**
 * Copyright (C) 2014 - present by OpenGamma Inc. and the OpenGamma group of companies
 *
 * Please see distribution for license.
 */
package com.acuo.common.type;

import org.joda.convert.FromString;

/**
 * The sample type.
 */
public final class SampleType
    extends TypedString<SampleType> {

  /** Serialization version. */
  private static final long serialVersionUID = 1L;

  /**
   * Obtains a {@code SampleType} by name.
   * 
   * @param name  the name to lookup, not null
   * @return the type matching the name, not null
   */
  @FromString
  public static SampleType of(String name) {
    return new SampleType(name);
  }

  //-------------------------------------------------------------------------
  /**
   * Creates an instance.
   * 
   * @param name  the name, not null
   */
  private SampleType(String name) {
    super(name);
  }

}
