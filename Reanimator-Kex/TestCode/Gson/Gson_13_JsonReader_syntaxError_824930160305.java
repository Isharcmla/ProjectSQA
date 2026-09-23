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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JsonReader_syntaxError_824930160305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255649;

    public JsonReader_syntaxError_824930160305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term255649 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term255023 = (int[]) newIntArray(117);
        Object[] term255496 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term255649, term255649.getClass(), "lineNumber", 0);
        setIntField(term255649, term255649.getClass(), "pos", 0);
        setIntField(term255649, term255649.getClass(), "lineStart", 0);
        setIntField(term255649, term255649.getClass(), "stackSize", 11);
        setIntElement(term255023, 0, -752870423);
        setIntElement(term255023, 1, -1698809299);
        setIntElement(term255023, 2, 401512128);
        setIntElement(term255023, 3, 3);
        setField(term255649, term255649.getClass(), "stack", term255023);
        setField(term255649, term255649.getClass(), "pathNames", term255496);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "syntaxError", argTypes, term255649, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


