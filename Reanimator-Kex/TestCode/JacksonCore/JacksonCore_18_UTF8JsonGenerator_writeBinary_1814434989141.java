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

public class UTF8JsonGenerator_writeBinary_1814434989141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term687;
     Object term697;

    public UTF8JsonGenerator_writeBinary_1814434989141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term687 = (byte[]) newByteArray(9);
        setByteElement(term687, 0, (byte) 93);
        setByteElement(term687, 1, (byte) 69);
        setByteElement(term687, 2, (byte) -74);
        setByteElement(term687, 3, (byte) -123);
        setByteElement(term687, 4, (byte) -23);
        setByteElement(term687, 5, (byte) 100);
        setByteElement(term687, 6, (byte) 106);
        setByteElement(term687, 7, (byte) -57);
        setByteElement(term687, 8, (byte) -103);
        term697 = new Integer(493620644);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.Base64Variant");
        argTypes[1] = Class.forName("java.io.InputStream");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term687;
        args[3] = term697;
        try {
            callMethod(klass, "_writeBinary", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


