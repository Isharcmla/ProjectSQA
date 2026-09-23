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

public class Base64_decodeBase64_68803760967 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1920;
     Object term10541;
     Object term10538;

    public Base64_decodeBase64_68803760967() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1920 = (byte[]) newByteArray(7);
        setByteElement(term1920, 0, (byte) 85);
        setByteElement(term1920, 1, (byte) -17);
        setByteElement(term1920, 2, (byte) -83);
        setByteElement(term1920, 3, (byte) 48);
        setByteElement(term1920, 4, (byte) -128);
        setByteElement(term1920, 5, (byte) 70);
        setByteElement(term1920, 6, (byte) -28);
        term10541 = (byte[]) newByteArray(7);
        setByteElement(term10541, 0, (byte) 85);
        setByteElement(term10541, 1, (byte) -17);
        setByteElement(term10541, 2, (byte) -83);
        setByteElement(term10541, 3, (byte) 48);
        setByteElement(term10541, 4, (byte) -128);
        setByteElement(term10541, 5, (byte) 70);
        setByteElement(term10541, 6, (byte) -28);
        term10538 = (byte[]) newByteArray(2);
        setByteElement(term10538, 0, (byte) 83);
        setByteElement(term10538, 1, (byte) 65);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1920;
        Object retValue = callMethod(klass, "decodeBase64", argTypes, null, args);
        assertTrue(recursiveEquals(term1920, term10541));
        assertTrue(recursiveEquals(retValue, term10538));
    }

};


