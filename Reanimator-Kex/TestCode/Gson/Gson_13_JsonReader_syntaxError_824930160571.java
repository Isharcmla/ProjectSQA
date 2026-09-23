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

public class JsonReader_syntaxError_824930160571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1058474;

    public JsonReader_syntaxError_824930160571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1058474 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term1043340 = (int[]) newIntArray(511);
        setIntField(term1058474, term1058474.getClass(), "lineNumber", 0);
        setIntField(term1058474, term1058474.getClass(), "pos", 0);
        setIntField(term1058474, term1058474.getClass(), "lineStart", 0);
        setIntField(term1058474, term1058474.getClass(), "stackSize", 31);
        setIntElement(term1043340, 0, -752870423);
        setIntElement(term1043340, 1, -1698809299);
        setIntElement(term1043340, 2, 401512128);
        setIntElement(term1043340, 3, -2069930777);
        setIntElement(term1043340, 4, 7);
        setIntElement(term1043340, 15, 7);
        setIntElement(term1043340, 28, 7);
        setField(term1058474, term1058474.getClass(), "stack", term1043340);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "syntaxError", argTypes, term1058474, args);
            assertTrue(false);
        }
        catch (MalformedJsonException e) {
        }

    }

};


