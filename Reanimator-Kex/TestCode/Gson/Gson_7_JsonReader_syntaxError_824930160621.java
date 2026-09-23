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
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JsonReader_syntaxError_824930160621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term302682;

    public JsonReader_syntaxError_824930160621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term302682 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term302069 = (int[]) newIntArray(489);
        setIntField(term302682, term302682.getClass(), "lineNumber", 0);
        setIntField(term302682, term302682.getClass(), "pos", 0);
        setIntField(term302682, term302682.getClass(), "lineStart", 0);
        setIntField(term302682, term302682.getClass(), "stackSize", 1);
        setIntElement(term302069, 0, 6);
        setField(term302682, term302682.getClass(), "stack", term302069);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "syntaxError", argTypes, term302682, args);
    }

};


