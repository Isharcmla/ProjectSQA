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

public class UTF8JsonGenerator_writeStringSegmentASCII2_39380224131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term542;
     Object term545;
     Object term547;

    public UTF8JsonGenerator_writeStringSegmentASCII2_39380224131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term542 = (char[]) newCharArray(2);
        setCharElement(term542, 0, 'x');
        setCharElement(term542, 1, 'x');
        term545 = new Integer(-469968304);
        term547 = new Integer(-1145578966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term542;
        args[1] = term545;
        args[2] = term547;
        try {
            callMethod(klass, "_writeStringSegmentASCII2", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


