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

public class UTF8JsonGenerator_writeBinary_1197620604101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206;
     Object term213;
     Object term215;

    public UTF8JsonGenerator_writeBinary_1197620604101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206 = (byte[]) newByteArray(6);
        setByteElement(term206, 0, (byte) 83);
        setByteElement(term206, 1, (byte) 74);
        setByteElement(term206, 2, (byte) -71);
        setByteElement(term206, 3, (byte) 49);
        setByteElement(term206, 4, (byte) -54);
        setByteElement(term206, 5, (byte) 67);
        term213 = new Integer(-1456670397);
        term215 = new Integer(1622346318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.Base64Variant");
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term206;
        args[2] = term213;
        args[3] = term215;
        try {
            callMethod(klass, "writeBinary", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


