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

public class CpioArchiveInputStream_matches_41168863943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1685;
     Object term1695;
     Object term41100;

    public CpioArchiveInputStream_matches_41168863943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1685 = (byte[]) newByteArray(9);
        setByteElement(term1685, 0, (byte) 96);
        setByteElement(term1685, 1, (byte) -66);
        setByteElement(term1685, 2, (byte) 109);
        setByteElement(term1685, 3, (byte) -44);
        setByteElement(term1685, 4, (byte) 100);
        setByteElement(term1685, 5, (byte) -90);
        setByteElement(term1685, 6, (byte) -49);
        setByteElement(term1685, 7, (byte) -102);
        setByteElement(term1685, 8, (byte) -74);
        term1695 = new Integer(-1371869594);
        term41100 = (byte[]) newByteArray(9);
        setByteElement(term41100, 0, (byte) 96);
        setByteElement(term41100, 1, (byte) -66);
        setByteElement(term41100, 2, (byte) 109);
        setByteElement(term41100, 3, (byte) -44);
        setByteElement(term41100, 4, (byte) 100);
        setByteElement(term41100, 5, (byte) -90);
        setByteElement(term41100, 6, (byte) -49);
        setByteElement(term41100, 7, (byte) -102);
        setByteElement(term41100, 8, (byte) -74);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1685;
        args[1] = term1695;
        Object retValue = callMethod(klass, "matches", argTypes, null, args);
        assertTrue(recursiveEquals(term1685, term41100));
        assertTrue(recursiveEquals(term1695, -1371869594));
        assertTrue(recursiveEquals(retValue, false));
    }

};


