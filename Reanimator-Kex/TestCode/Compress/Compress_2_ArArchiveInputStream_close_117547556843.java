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

public class ArArchiveInputStream_close_117547556843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8559;
     Object term8952;

    public ArArchiveInputStream_close_117547556843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8559 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term8687 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        setBooleanField(term8559, term8559.getClass(), "closed", false);
        setBooleanField(term8687, term8687.getClass(), "closed", true);
        setField(term8559, term8559.getClass(), "input", term8687);
        term8952 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term8953 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        setField(term8953, term8953.getClass(), "input", null);
        setLongField(term8953, term8953.getClass(), "offset", 0L);
        setBooleanField(term8953, term8953.getClass(), "closed", true);
        setField(term8952, term8952.getClass(), "input", term8953);
        setLongField(term8952, term8952.getClass(), "offset", 0L);
        setBooleanField(term8952, term8952.getClass(), "closed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term8559, args);
        assertTrue(recursiveEquals(term8559, term8952));
    }

};


