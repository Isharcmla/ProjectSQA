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

public class JsonReader_syntaxError_824930160505 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198656;

    public JsonReader_syntaxError_824930160505() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198656 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term198048 = (int[]) newIntArray(489);
        setIntField(term198656, term198656.getClass(), "lineNumber", 0);
        setIntField(term198656, term198656.getClass(), "pos", 0);
        setIntField(term198656, term198656.getClass(), "lineStart", 0);
        setIntField(term198656, term198656.getClass(), "stackSize", 1);
        setField(term198656, term198656.getClass(), "stack", term198048);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "syntaxError", argTypes, term198656, args);
            assertTrue(false);
        }
        catch (MalformedJsonException e) {
        }

    }

};


