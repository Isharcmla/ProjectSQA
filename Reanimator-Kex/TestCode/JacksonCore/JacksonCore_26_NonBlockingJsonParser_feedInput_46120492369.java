package com.fasterxml.jackson.core.json.async;

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
import static com.fasterxml.jackson.core.json.async.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class NonBlockingJsonParser_feedInput_46120492369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;
     Object term9;
     Object term11;

    public NonBlockingJsonParser_feedInput_46120492369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = (byte[]) newByteArray(5);
        setByteElement(term3, 0, (byte) 47);
        setByteElement(term3, 1, (byte) 48);
        setByteElement(term3, 2, (byte) 89);
        setByteElement(term3, 3, (byte) 75);
        setByteElement(term3, 4, (byte) 18);
        term9 = new Integer(1162663216);
        term11 = new Integer(1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term3;
        args[1] = term9;
        args[2] = term11;
        try {
            callMethod(klass, "feedInput", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


