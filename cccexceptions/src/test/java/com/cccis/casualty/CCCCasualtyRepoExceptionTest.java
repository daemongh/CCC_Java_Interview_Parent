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

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cccis.casualty.CCCCasualtyException;
import com.cccis.casualty.CCCCasualtyRepoException;

public class CCCCasualtyRepoExceptionTest {

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
  }

  @AfterClass
  public static void tearDownAfterClass() throws Exception {
  }

  @Before
  public void setUp() throws Exception {
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void testCCCCasualtyMavenException() {
    assertNotNull("Empty maven exception", new CCCCasualtyRepoException());
  }

  @Test
  public void testCCCCasualtyMavenExceptionString() {
    assertNotNull("With string", new CCCCasualtyRepoException("ABC"));
  }

  @Test
  public void testCCCCasualtyMavenExceptionStringThrowable() {
    assertNotNull("With string", new CCCCasualtyRepoException("ABC", new CCCCasualtyException("DEF")));
  }

  @Test
  public void testCCCCasualtyMavenExceptionStringThrowableBooleanBoolean() {
    assertNotNull("With string", new CCCCasualtyRepoException("ABC", new CCCCasualtyException("DEF"), true, true));
  }

  @Test
  public void testCCCCasualtyMavenExceptionThrowable() {
    assertNotNull("With  string", new CCCCasualtyRepoException(new CCCCasualtyException()));
  }

}
