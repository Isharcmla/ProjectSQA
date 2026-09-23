package org.apache.commons.compress.archivers.cpio;

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
import static org.apache.commons.compress.archivers.cpio.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.cpio.EqualityUtils.*;
import java.lang.Integer;

public class CpioArchiveInputStream_matches_41168863939 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1639;
     Object term1649;
     Object term23269;

    public CpioArchiveInputStream_matches_41168863939() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1639 = (byte[]) newByteArray(9);
        setByteElement(term1639, 0, (byte) 96);
        setByteElement(term1639, 1, (byte) -66);
        setByteElement(term1639, 2, (byte) 109);
        setByteElement(term1639, 3, (byte) -44);
        setByteElement(term1639, 4, (byte) 100);
        setByteElement(term1639, 5, (byte) -90);
        setByteElement(term1639, 6, (byte) -49);
        setByteElement(term1639, 7, (byte) -102);
        setByteElement(term1639, 8, (byte) -74);
        term1649 = new Integer(97029295);
        term23269 = (byte[]) newByteArray(9);
        setByteElement(term23269, 0, (byte) 96);
        setByteElement(term23269, 1, (byte) -66);
        setByteElement(term23269, 2, (byte) 109);
        setByteElement(term23269, 3, (byte) -44);
        setByteElement(term23269, 4, (byte) 100);
        setByteElement(term23269, 5, (byte) -90);
        setByteElement(term23269, 6, (byte) -49);
        setByteElement(term23269, 7, (byte) -102);
        setByteElement(term23269, 8, (byte) -74);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1639;
        args[1] = term1649;
        Object retValue = callMethod(klass, "matches", argTypes, null, args);
        assertTrue(recursiveEquals(term1639, term23269));
        assertTrue(recursiveEquals(term1649, 97029295));
        assertTrue(recursiveEquals(retValue, false));
    }

};


