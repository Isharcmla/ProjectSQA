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
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ObjectMapper_readTree_170952170593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120;

    public ObjectMapper_readTree_170952170593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120 = (byte[]) newByteArray(9);
        setByteElement(term120, 0, (byte) 47);
        setByteElement(term120, 1, (byte) 48);
        setByteElement(term120, 2, (byte) 89);
        setByteElement(term120, 3, (byte) 75);
        setByteElement(term120, 4, (byte) 18);
        setByteElement(term120, 5, (byte) -58);
        setByteElement(term120, 6, (byte) -29);
        setByteElement(term120, 7, (byte) -54);
        setByteElement(term120, 8, (byte) -10);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term120;
        callMethod(klass, "readTree", argTypes, null, args);
    }

};


