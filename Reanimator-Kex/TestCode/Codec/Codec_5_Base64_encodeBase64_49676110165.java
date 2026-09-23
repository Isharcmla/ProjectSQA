package org.apache.commons.codec.binary;

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
import static org.apache.commons.codec.binary.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.codec.binary.EqualityUtils.*;
import java.lang.Boolean;
import java.lang.Integer;

public class Base64_encodeBase64_49676110165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1885;
     Object term1889;
     Object term1891;
     Object term1893;
     Object term10206;
     Object term10197;

    public Base64_encodeBase64_49676110165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1885 = (byte[]) newByteArray(3);
        setByteElement(term1885, 0, (byte) -2);
        setByteElement(term1885, 1, (byte) 28);
        setByteElement(term1885, 2, (byte) 84);
        term1889 = new Boolean(true);
        term1891 = new Boolean(true);
        term1893 = new Integer(1063420942);
        term10206 = (byte[]) newByteArray(3);
        setByteElement(term10206, 0, (byte) -2);
        setByteElement(term10206, 1, (byte) 28);
        setByteElement(term10206, 2, (byte) 84);
        term10197 = (byte[]) newByteArray(6);
        setByteElement(term10197, 0, (byte) 95);
        setByteElement(term10197, 1, (byte) 104);
        setByteElement(term10197, 2, (byte) 120);
        setByteElement(term10197, 3, (byte) 85);
        setByteElement(term10197, 4, (byte) 13);
        setByteElement(term10197, 5, (byte) 10);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = boolean.class;
        argTypes[2] = boolean.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term1885;
        args[1] = term1889;
        args[2] = term1891;
        args[3] = term1893;
        Object retValue = callMethod(klass, "encodeBase64", argTypes, null, args);
        assertTrue(recursiveEquals(term1885, term10206));
        assertTrue(recursiveEquals(term1889, true));
        assertTrue(recursiveEquals(term1891, true));
        assertTrue(recursiveEquals(term1893, 1063420942));
        assertTrue(recursiveEquals(retValue, term10197));
    }

};


