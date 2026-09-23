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

public class JsonReader_syntaxError_824930160296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237538;

    public JsonReader_syntaxError_824930160296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term237538 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term233902 = (int[]) newIntArray(494);
        Object[] term237368 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term237538, term237538.getClass(), "lineNumber", 0);
        setIntField(term237538, term237538.getClass(), "pos", 0);
        setIntField(term237538, term237538.getClass(), "lineStart", 0);
        setIntField(term237538, term237538.getClass(), "stackSize", 7);
        setIntElement(term233902, 0, -752870423);
        setIntElement(term233902, 1, -1698809299);
        setIntElement(term233902, 2, 401512128);
        setIntElement(term233902, 3, -2069930777);
        setIntElement(term233902, 4, 8);
        setIntElement(term233902, 6, 4);
        setField(term237538, term237538.getClass(), "stack", term233902);
        setField(term237538, term237538.getClass(), "pathNames", term237368);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "syntaxError", argTypes, term237538, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


