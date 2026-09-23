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

public class JsonWriter_beginObject_45091708176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13856;

    public JsonWriter_beginObject_45091708176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13856 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term12997 = (int[]) newIntArray(768);
        setField(term13856, term13856.getClass(), "deferredName", "");
        setIntField(term13856, term13856.getClass(), "stackSize", 360);
        setField(term13856, term13856.getClass(), "stack", term12997);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "beginObject", argTypes, term13856, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


