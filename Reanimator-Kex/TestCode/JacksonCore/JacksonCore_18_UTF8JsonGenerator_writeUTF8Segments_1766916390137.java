package com.fasterxml.jackson.core.json;

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
import static com.fasterxml.jackson.core.json.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UTF8JsonGenerator_writeUTF8Segments_1766916390137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term633;
     Object term642;
     Object term644;

    public UTF8JsonGenerator_writeUTF8Segments_1766916390137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term633 = (byte[]) newByteArray(8);
        setByteElement(term633, 0, (byte) 118);
        setByteElement(term633, 1, (byte) 106);
        setByteElement(term633, 2, (byte) 98);
        setByteElement(term633, 3, (byte) 67);
        setByteElement(term633, 4, (byte) 66);
        setByteElement(term633, 5, (byte) -121);
        setByteElement(term633, 6, (byte) -119);
        setByteElement(term633, 7, (byte) 71);
        term642 = new Integer(1632125673);
        term644 = new Integer(454281060);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term633;
        args[1] = term642;
        args[2] = term644;
        try {
            callMethod(klass, "_writeUTF8Segments", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


