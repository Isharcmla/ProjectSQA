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

public class ArArchiveInputStream_getNextArEntry_13342876938 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6102;
     Object term7760;

    public ArArchiveInputStream_getNextArEntry_13342876938() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6102 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term6230 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        setLongField(term6102, term6102.getClass(), "offset", 2147483648L);
        setField(term6102, term6102.getClass(), "input", term6230);
        term7760 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term7761 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        setField(term7761, term7761.getClass(), "input", null);
        setLongField(term7761, term7761.getClass(), "offset", 0L);
        setBooleanField(term7761, term7761.getClass(), "closed", false);
        setField(term7760, term7760.getClass(), "input", term7761);
        setLongField(term7760, term7760.getClass(), "offset", 2147483648L);
        setBooleanField(term7760, term7760.getClass(), "closed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNextArEntry", argTypes, term6102, args);
        assertTrue(recursiveEquals(term6102, term7760));
        assertTrue(recursiveEquals(retValue, null));
    }

};


