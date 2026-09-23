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

public class ArArchiveInputStream_getNextEntry_182590179930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3963;
     Object term4134;

    public ArArchiveInputStream_getNextEntry_182590179930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3963 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term4091 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        setLongField(term3963, term3963.getClass(), "offset", 2147483648L);
        setField(term3963, term3963.getClass(), "input", term4091);
        term4134 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term4135 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        setField(term4135, term4135.getClass(), "input", null);
        setLongField(term4135, term4135.getClass(), "offset", 0L);
        setBooleanField(term4135, term4135.getClass(), "closed", false);
        setField(term4134, term4134.getClass(), "input", term4135);
        setLongField(term4134, term4134.getClass(), "offset", 2147483648L);
        setBooleanField(term4134, term4134.getClass(), "closed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNextEntry", argTypes, term3963, args);
        assertTrue(recursiveEquals(term3963, term4134));
        assertTrue(recursiveEquals(retValue, null));
    }

};


