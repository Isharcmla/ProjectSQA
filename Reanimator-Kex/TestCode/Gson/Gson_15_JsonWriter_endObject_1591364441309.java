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
import java.lang.Object;

public class JsonWriter_endObject_1591364441309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135135;

    public JsonWriter_endObject_1591364441309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135135 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term135034 = (int[]) newIntArray(0);
        Object term135233 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter$1"));
        setIntField(term135135, term135135.getClass(), "stackSize", -1965344904);
        setIntElement(term135034, -1965344905, 3);
        setField(term135135, term135135.getClass(), "stack", term135034);
        setField(term135135, term135135.getClass(), "deferredName", null);
        setField(term135135, term135135.getClass(), "out", term135233);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "endObject", argTypes, term135135, args);
    }

};


