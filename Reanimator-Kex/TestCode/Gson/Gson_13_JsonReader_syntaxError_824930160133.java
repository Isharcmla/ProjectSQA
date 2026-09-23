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
import java.lang.NullPointerException;
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JsonReader_syntaxError_824930160133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52567;

    public JsonReader_syntaxError_824930160133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52567 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term50953 = (int[]) newIntArray(491);
        setIntField(term52567, term52567.getClass(), "lineNumber", 0);
        setIntField(term52567, term52567.getClass(), "pos", 0);
        setIntField(term52567, term52567.getClass(), "lineStart", 0);
        setIntField(term52567, term52567.getClass(), "stackSize", 3);
        setIntElement(term50953, 0, -752870423);
        setIntElement(term50953, 1, -1698809299);
        setIntElement(term50953, 2, 2);
        setField(term52567, term52567.getClass(), "stack", term50953);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "syntaxError", argTypes, term52567, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


