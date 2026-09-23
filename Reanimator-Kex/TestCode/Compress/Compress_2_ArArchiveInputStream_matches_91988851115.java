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
import java.lang.Integer;

public class ArArchiveInputStream_matches_91988851115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43;
     Object term47;
     Object term1566;

    public ArArchiveInputStream_matches_91988851115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43 = (byte[]) newByteArray(3);
        setByteElement(term43, 0, (byte) 79);
        setByteElement(term43, 1, (byte) -119);
        setByteElement(term43, 2, (byte) -66);
        term47 = new Integer(1484323161);
        term1566 = (byte[]) newByteArray(3);
        setByteElement(term1566, 0, (byte) 79);
        setByteElement(term1566, 1, (byte) -119);
        setByteElement(term1566, 2, (byte) -66);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term43;
        args[1] = term47;
        Object retValue = callMethod(klass, "matches", argTypes, null, args);
        assertTrue(recursiveEquals(term43, term1566));
        assertTrue(recursiveEquals(term47, 1484323161));
        assertTrue(recursiveEquals(retValue, false));
    }

};


