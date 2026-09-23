package com.google.gson.stream;

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
import com.google.gson.stream.MalformedJsonException;
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JsonReader_syntaxError_824930160430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term509422;

    public JsonReader_syntaxError_824930160430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term509422 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term502282 = (int[]) newIntArray(495);
        setIntField(term509422, term509422.getClass(), "lineNumber", 0);
        setIntField(term509422, term509422.getClass(), "pos", 0);
        setIntField(term509422, term509422.getClass(), "lineStart", 0);
        setIntField(term509422, term509422.getClass(), "stackSize", 15);
        setIntElement(term502282, 0, -752870423);
        setIntElement(term502282, 1, -1698809299);
        setIntElement(term502282, 2, 401512128);
        setIntElement(term502282, 3, -2069930777);
        setIntElement(term502282, 4, 7);
        setIntElement(term502282, 12, 7);
        setIntElement(term502282, 13, 7);
        setField(term509422, term509422.getClass(), "stack", term502282);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "syntaxError", argTypes, term509422, args);
            assertTrue(false);
        }
        catch (MalformedJsonException e) {
        }

    }

};


