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

public class JsonReader_syntaxError_824930160223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128277;

    public JsonReader_syntaxError_824930160223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term128277 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term127714 = (int[]) newIntArray(55);
        Object[] term128107 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term128277, term128277.getClass(), "lineNumber", 0);
        setIntField(term128277, term128277.getClass(), "pos", 0);
        setIntField(term128277, term128277.getClass(), "lineStart", 0);
        setIntField(term128277, term128277.getClass(), "stackSize", 7);
        setIntElement(term127714, 0, -752870423);
        setIntElement(term127714, 1, -1698809299);
        setIntElement(term127714, 2, 401512128);
        setIntElement(term127714, 3, -2069930777);
        setIntElement(term127714, 4, 1543696412);
        setIntElement(term127714, 5, -1385748168);
        setIntElement(term127714, 6, 3);
        setField(term128277, term128277.getClass(), "stack", term127714);
        setField(term128277, term128277.getClass(), "pathNames", term128107);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "syntaxError", argTypes, term128277, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


