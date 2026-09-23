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

public class Base64_discardWhitespace_143558285956 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1695;
     Object term8088;
     Object term8074;

    public Base64_discardWhitespace_143558285956() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1695 = (byte[]) newByteArray(6);
        setByteElement(term1695, 0, (byte) -74);
        setByteElement(term1695, 1, (byte) -84);
        setByteElement(term1695, 2, (byte) -53);
        setByteElement(term1695, 3, (byte) -93);
        setByteElement(term1695, 4, (byte) 82);
        setByteElement(term1695, 5, (byte) -89);
        term8088 = (byte[]) newByteArray(6);
        setByteElement(term8088, 0, (byte) -74);
        setByteElement(term8088, 1, (byte) -84);
        setByteElement(term8088, 2, (byte) -53);
        setByteElement(term8088, 3, (byte) -93);
        setByteElement(term8088, 4, (byte) 82);
        setByteElement(term8088, 5, (byte) -89);
        term8074 = (byte[]) newByteArray(6);
        setByteElement(term8074, 0, (byte) -74);
        setByteElement(term8074, 1, (byte) -84);
        setByteElement(term8074, 2, (byte) -53);
        setByteElement(term8074, 3, (byte) -93);
        setByteElement(term8074, 4, (byte) 82);
        setByteElement(term8074, 5, (byte) -89);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1695;
        Object retValue = callMethod(klass, "discardWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term1695, term8088));
        assertTrue(recursiveEquals(retValue, term8074));
    }

};


