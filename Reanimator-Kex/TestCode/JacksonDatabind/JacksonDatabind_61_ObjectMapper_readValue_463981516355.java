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

public class ObjectMapper_readValue_463981516355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6016;
     Object term6023;
     Object term6025;

    public ObjectMapper_readValue_463981516355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6016 = (byte[]) newByteArray(6);
        setByteElement(term6016, 0, (byte) 18);
        setByteElement(term6016, 1, (byte) -58);
        setByteElement(term6016, 2, (byte) -29);
        setByteElement(term6016, 3, (byte) -54);
        setByteElement(term6016, 4, (byte) -10);
        setByteElement(term6016, 5, (byte) 79);
        term6023 = new Integer(-1922583790);
        term6025 = new Integer(-616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.Class");
        Object[] args = new Object[4];
        args[0] = term6016;
        args[1] = term6023;
        args[2] = term6025;
        args[3] = null;
        try {
            callMethod(klass, "readValue", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


