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

public class UTF8JsonGenerator_writeCustomEscape_782279850133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term603;
     Object term607;
     Object term609;

    public UTF8JsonGenerator_writeCustomEscape_782279850133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term603 = (byte[]) newByteArray(3);
        setByteElement(term603, 0, (byte) -15);
        setByteElement(term603, 1, (byte) 36);
        setByteElement(term603, 2, (byte) 118);
        term607 = new Integer(-157887805);
        term609 = new Integer(1876565163);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.fasterxml.jackson.core.SerializableString");
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term603;
        args[1] = term607;
        args[2] = null;
        args[3] = term609;
        try {
            callMethod(klass, "_writeCustomEscape", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


