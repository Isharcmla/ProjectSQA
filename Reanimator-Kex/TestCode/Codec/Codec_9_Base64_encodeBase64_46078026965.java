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

public class Base64_encodeBase64_46078026965 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1718;
     Object term1724;
     Object term9230;
     Object term9221;

    public Base64_encodeBase64_46078026965() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1718 = (byte[]) newByteArray(5);
        setByteElement(term1718, 0, (byte) -112);
        setByteElement(term1718, 1, (byte) 81);
        setByteElement(term1718, 2, (byte) 65);
        setByteElement(term1718, 3, (byte) -44);
        setByteElement(term1718, 4, (byte) 33);
        term1724 = new Boolean(false);
        term9230 = (byte[]) newByteArray(5);
        setByteElement(term9230, 0, (byte) -112);
        setByteElement(term9230, 1, (byte) 81);
        setByteElement(term9230, 2, (byte) 65);
        setByteElement(term9230, 3, (byte) -44);
        setByteElement(term9230, 4, (byte) 33);
        term9221 = (byte[]) newByteArray(8);
        setByteElement(term9221, 0, (byte) 107);
        setByteElement(term9221, 1, (byte) 70);
        setByteElement(term9221, 2, (byte) 70);
        setByteElement(term9221, 3, (byte) 66);
        setByteElement(term9221, 4, (byte) 49);
        setByteElement(term9221, 5, (byte) 67);
        setByteElement(term9221, 6, (byte) 69);
        setByteElement(term9221, 7, (byte) 61);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term1718;
        args[1] = term1724;
        Object retValue = callMethod(klass, "encodeBase64", argTypes, null, args);
        assertTrue(recursiveEquals(term1718, term9230));
        assertTrue(recursiveEquals(term1724, false));
        assertTrue(recursiveEquals(retValue, term9221));
    }

};


