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

public class Base64_encodeBase64_46190463964 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1870;
     Object term1876;
     Object term1878;
     Object term9900;
     Object term9891;

    public Base64_encodeBase64_46190463964() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1870 = (byte[]) newByteArray(5);
        setByteElement(term1870, 0, (byte) 24);
        setByteElement(term1870, 1, (byte) 123);
        setByteElement(term1870, 2, (byte) -101);
        setByteElement(term1870, 3, (byte) -102);
        setByteElement(term1870, 4, (byte) -95);
        term1876 = new Boolean(false);
        term1878 = new Boolean(false);
        term9900 = (byte[]) newByteArray(5);
        setByteElement(term9900, 0, (byte) 24);
        setByteElement(term9900, 1, (byte) 123);
        setByteElement(term9900, 2, (byte) -101);
        setByteElement(term9900, 3, (byte) -102);
        setByteElement(term9900, 4, (byte) -95);
        term9891 = (byte[]) newByteArray(8);
        setByteElement(term9891, 0, (byte) 71);
        setByteElement(term9891, 1, (byte) 72);
        setByteElement(term9891, 2, (byte) 117);
        setByteElement(term9891, 3, (byte) 98);
        setByteElement(term9891, 4, (byte) 109);
        setByteElement(term9891, 5, (byte) 113);
        setByteElement(term9891, 6, (byte) 69);
        setByteElement(term9891, 7, (byte) 61);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = boolean.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term1870;
        args[1] = term1876;
        args[2] = term1878;
        Object retValue = callMethod(klass, "encodeBase64", argTypes, null, args);
        assertTrue(recursiveEquals(term1870, term9900));
        assertTrue(recursiveEquals(term1876, false));
        assertTrue(recursiveEquals(term1878, false));
        assertTrue(recursiveEquals(retValue, term9891));
    }

};


