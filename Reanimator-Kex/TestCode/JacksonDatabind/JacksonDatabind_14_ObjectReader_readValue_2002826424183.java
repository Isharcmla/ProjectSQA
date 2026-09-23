package com.fasterxml.jackson.databind;

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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ObjectReader_readValue_2002826424183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153;
     Object term163;
     Object term165;

    public ObjectReader_readValue_2002826424183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153 = (byte[]) newByteArray(9);
        setByteElement(term153, 0, (byte) 79);
        setByteElement(term153, 1, (byte) -119);
        setByteElement(term153, 2, (byte) -66);
        setByteElement(term153, 3, (byte) 83);
        setByteElement(term153, 4, (byte) 74);
        setByteElement(term153, 5, (byte) -71);
        setByteElement(term153, 6, (byte) 49);
        setByteElement(term153, 7, (byte) -54);
        setByteElement(term153, 8, (byte) 67);
        term163 = new Integer(568599855);
        term165 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term153;
        args[1] = term163;
        args[2] = term165;
        try {
            callMethod(klass, "readValue", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


