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

public class Base64_encodeBase64_46078026963 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1855;
     Object term1862;
     Object term9429;
     Object term9418;

    public Base64_encodeBase64_46078026963() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1855 = (byte[]) newByteArray(6);
        setByteElement(term1855, 0, (byte) -74);
        setByteElement(term1855, 1, (byte) -84);
        setByteElement(term1855, 2, (byte) -53);
        setByteElement(term1855, 3, (byte) -93);
        setByteElement(term1855, 4, (byte) 82);
        setByteElement(term1855, 5, (byte) -89);
        term1862 = new Boolean(true);
        term9429 = (byte[]) newByteArray(6);
        setByteElement(term9429, 0, (byte) -74);
        setByteElement(term9429, 1, (byte) -84);
        setByteElement(term9429, 2, (byte) -53);
        setByteElement(term9429, 3, (byte) -93);
        setByteElement(term9429, 4, (byte) 82);
        setByteElement(term9429, 5, (byte) -89);
        term9418 = (byte[]) newByteArray(10);
        setByteElement(term9418, 0, (byte) 116);
        setByteElement(term9418, 1, (byte) 113);
        setByteElement(term9418, 2, (byte) 122);
        setByteElement(term9418, 3, (byte) 76);
        setByteElement(term9418, 4, (byte) 111);
        setByteElement(term9418, 5, (byte) 49);
        setByteElement(term9418, 6, (byte) 75);
        setByteElement(term9418, 7, (byte) 110);
        setByteElement(term9418, 8, (byte) 13);
        setByteElement(term9418, 9, (byte) 10);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term1855;
        args[1] = term1862;
        Object retValue = callMethod(klass, "encodeBase64", argTypes, null, args);
        assertTrue(recursiveEquals(term1855, term9429));
        assertTrue(recursiveEquals(term1862, true));
        assertTrue(recursiveEquals(retValue, term9418));
    }

};


