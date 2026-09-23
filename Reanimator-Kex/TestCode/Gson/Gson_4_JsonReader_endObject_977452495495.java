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

public class JsonReader_endObject_977452495495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227380;

    public JsonReader_endObject_977452495495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term227380 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term227186 = (int[]) newIntArray(1);
        setIntField(term227380, term227380.getClass(), "peeked", 6);
        setIntField(term227380, term227380.getClass(), "lineNumber", 0);
        setIntField(term227380, term227380.getClass(), "pos", 0);
        setIntField(term227380, term227380.getClass(), "lineStart", 0);
        setIntField(term227380, term227380.getClass(), "stackSize", 1);
        setIntElement(term227186, 0, 66);
        setField(term227380, term227380.getClass(), "stack", term227186);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "endObject", argTypes, term227380, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


