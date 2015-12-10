/**
 *  Copyright (c) 2011-2013 Terracotta, Inc.
 *  Copyright (c) 2011-2013 Oracle and/or its affiliates.
 *
 *  All rights reserved. Use is subject to license terms.
 */

package javax.cache.integration;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class CacheLoaderExceptionTest {

  @Test
  public void testConstructors() {
    final Throwable CAUSE = new IllegalStateException();
    assertNotNull(new CacheLoaderException());
    assertNotNull(new CacheLoaderException("code coverage test"));
    assertNotNull(new CacheLoaderException(CAUSE));
    assertNotNull(new CacheLoaderException("code coverage test", CAUSE));
  }
}
