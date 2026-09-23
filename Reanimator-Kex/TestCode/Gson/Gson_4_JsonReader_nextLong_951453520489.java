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

public class JsonReader_nextLong_951453520489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term218600;

    public JsonReader_nextLong_951453520489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term218600 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term218369 = (int[]) newIntArray(10);
        setIntField(term218600, term218600.getClass(), "peeked", 12);
        setIntField(term218600, term218600.getClass(), "lineNumber", 0);
        setIntField(term218600, term218600.getClass(), "pos", 0);
        setIntField(term218600, term218600.getClass(), "lineStart", 0);
        setIntField(term218600, term218600.getClass(), "stackSize", 3);
        setIntElement(term218369, 0, 66);
        setField(term218600, term218600.getClass(), "stack", term218369);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextLong", argTypes, term218600, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


