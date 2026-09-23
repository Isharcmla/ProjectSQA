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

public class Base64_discardWhitespace_143558285970 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1794;
     Object term10390;
     Object term10374;

    public Base64_discardWhitespace_143558285970() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1794 = (byte[]) newByteArray(7);
        setByteElement(term1794, 0, (byte) 85);
        setByteElement(term1794, 1, (byte) -17);
        setByteElement(term1794, 2, (byte) -83);
        setByteElement(term1794, 3, (byte) 48);
        setByteElement(term1794, 4, (byte) -128);
        setByteElement(term1794, 5, (byte) 70);
        setByteElement(term1794, 6, (byte) -28);
        term10390 = (byte[]) newByteArray(7);
        setByteElement(term10390, 0, (byte) 85);
        setByteElement(term10390, 1, (byte) -17);
        setByteElement(term10390, 2, (byte) -83);
        setByteElement(term10390, 3, (byte) 48);
        setByteElement(term10390, 4, (byte) -128);
        setByteElement(term10390, 5, (byte) 70);
        setByteElement(term10390, 6, (byte) -28);
        term10374 = (byte[]) newByteArray(7);
        setByteElement(term10374, 0, (byte) 85);
        setByteElement(term10374, 1, (byte) -17);
        setByteElement(term10374, 2, (byte) -83);
        setByteElement(term10374, 3, (byte) 48);
        setByteElement(term10374, 4, (byte) -128);
        setByteElement(term10374, 5, (byte) 70);
        setByteElement(term10374, 6, (byte) -28);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1794;
        Object retValue = callMethod(klass, "discardWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term1794, term10390));
        assertTrue(recursiveEquals(retValue, term10374));
    }

};


