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

public class JsonWriter_endObject_1591364441219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82331;

    public JsonWriter_endObject_1591364441219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82331 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term82232 = (int[]) newIntArray(8);
        setIntField(term82331, term82331.getClass(), "stackSize", 8);
        setIntElement(term82232, 0, 5);
        setIntElement(term82232, 1, 5);
        setIntElement(term82232, 2, 5);
        setIntElement(term82232, 3, 5);
        setIntElement(term82232, 4, 5);
        setIntElement(term82232, 5, 5);
        setIntElement(term82232, 6, 5);
        setIntElement(term82232, 7, 5);
        setField(term82331, term82331.getClass(), "stack", term82232);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "endObject", argTypes, term82331, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


