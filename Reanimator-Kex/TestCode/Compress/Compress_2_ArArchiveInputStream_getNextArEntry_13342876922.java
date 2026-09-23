package org.apache.commons.compress.archivers.ar;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.apache.commons.compress.archivers.ar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.ar.EqualityUtils.*;
import java.lang.Object;

public class ArArchiveInputStream_getNextArEntry_13342876922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1999;
     Object term2773;

    public ArArchiveInputStream_getNextArEntry_13342876922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1999 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term2127 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        setLongField(term1999, term1999.getClass(), "offset", 2147483648L);
        setField(term1999, term1999.getClass(), "input", term2127);
        term2773 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term2774 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        setField(term2774, term2774.getClass(), "input", null);
        setLongField(term2774, term2774.getClass(), "offset", 0L);
        setBooleanField(term2774, term2774.getClass(), "closed", false);
        setField(term2773, term2773.getClass(), "input", term2774);
        setLongField(term2773, term2773.getClass(), "offset", 2147483648L);
        setBooleanField(term2773, term2773.getClass(), "closed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNextArEntry", argTypes, term1999, args);
        assertTrue(recursiveEquals(term1999, term2773));
        assertTrue(recursiveEquals(retValue, null));
    }

};


