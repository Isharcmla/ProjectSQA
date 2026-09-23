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

public class JsonReader_syntaxError_824930160403 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term460186;

    public JsonReader_syntaxError_824930160403() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term460186 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term460028 = (int[]) newIntArray(8);
        Object[] term460047 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term460186, term460186.getClass(), "lineNumber", 0);
        setIntField(term460186, term460186.getClass(), "pos", 0);
        setIntField(term460186, term460186.getClass(), "lineStart", 0);
        setIntField(term460186, term460186.getClass(), "stackSize", 5);
        setIntElement(term460028, 0, -752870423);
        setIntElement(term460028, 1, 5);
        setField(term460186, term460186.getClass(), "stack", term460028);
        setField(term460186, term460186.getClass(), "pathNames", term460047);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "syntaxError", argTypes, term460186, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


