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

public class JsonReader_endObject_977452495485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213032;

    public JsonReader_endObject_977452495485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term213032 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term212836 = (int[]) newIntArray(1);
        setIntField(term213032, term213032.getClass(), "peeked", 3);
        setIntField(term213032, term213032.getClass(), "lineNumber", 0);
        setIntField(term213032, term213032.getClass(), "pos", 0);
        setIntField(term213032, term213032.getClass(), "lineStart", 0);
        setIntField(term213032, term213032.getClass(), "stackSize", 1);
        setIntElement(term212836, 0, 66);
        setField(term213032, term213032.getClass(), "stack", term212836);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "endObject", argTypes, term213032, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


