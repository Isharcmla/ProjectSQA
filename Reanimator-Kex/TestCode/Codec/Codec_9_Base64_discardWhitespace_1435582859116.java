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

public class Base64_discardWhitespace_1435582859116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54091;
     Object term90540;
     Object term89549;

    public Base64_discardWhitespace_1435582859116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54091 = (byte[]) newByteArray(495);
        setByteElement(term54091, 0, (byte) -128);
        setByteElement(term54091, 1, (byte) -128);
        setByteElement(term54091, 2, (byte) -128);
        setByteElement(term54091, 3, (byte) -128);
        setByteElement(term54091, 4, (byte) -128);
        setByteElement(term54091, 5, (byte) -128);
        setByteElement(term54091, 6, (byte) 13);
        term90540 = (byte[]) newByteArray(495);
        setByteElement(term90540, 0, (byte) -128);
        setByteElement(term90540, 1, (byte) -128);
        setByteElement(term90540, 2, (byte) -128);
        setByteElement(term90540, 3, (byte) -128);
        setByteElement(term90540, 4, (byte) -128);
        setByteElement(term90540, 5, (byte) -128);
        setByteElement(term90540, 6, (byte) 13);
        term89549 = (byte[]) newByteArray(494);
        setByteElement(term89549, 0, (byte) -128);
        setByteElement(term89549, 1, (byte) -128);
        setByteElement(term89549, 2, (byte) -128);
        setByteElement(term89549, 3, (byte) -128);
        setByteElement(term89549, 4, (byte) -128);
        setByteElement(term89549, 5, (byte) -128);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term54091;
        Object retValue = callMethod(klass, "discardWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term54091, term90540));
        assertTrue(recursiveEquals(retValue, term89549));
    }

};


