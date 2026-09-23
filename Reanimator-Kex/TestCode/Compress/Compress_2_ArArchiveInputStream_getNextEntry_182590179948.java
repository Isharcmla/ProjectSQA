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

public class ArArchiveInputStream_getNextEntry_182590179948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9139;
     Object term9707;

    public ArArchiveInputStream_getNextEntry_182590179948() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9139 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term9267 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        setLongField(term9139, term9139.getClass(), "offset", 2147483648L);
        setField(term9139, term9139.getClass(), "input", term9267);
        term9707 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term9708 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        setField(term9708, term9708.getClass(), "input", null);
        setLongField(term9708, term9708.getClass(), "offset", 0L);
        setBooleanField(term9708, term9708.getClass(), "closed", false);
        setField(term9707, term9707.getClass(), "input", term9708);
        setLongField(term9707, term9707.getClass(), "offset", 2147483648L);
        setBooleanField(term9707, term9707.getClass(), "closed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNextEntry", argTypes, term9139, args);
        assertTrue(recursiveEquals(term9139, term9707));
        assertTrue(recursiveEquals(retValue, null));
    }

};


