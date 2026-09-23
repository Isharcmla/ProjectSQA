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

public class JsonReader_nextLong_951453520591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term315473;

    public JsonReader_nextLong_951453520591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term315473 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term315230 = (int[]) newIntArray(17);
        setIntField(term315473, term315473.getClass(), "peeked", 12);
        setIntField(term315473, term315473.getClass(), "lineNumber", 0);
        setIntField(term315473, term315473.getClass(), "pos", 0);
        setIntField(term315473, term315473.getClass(), "lineStart", 0);
        setIntField(term315473, term315473.getClass(), "stackSize", 2);
        setIntElement(term315230, 0, 66);
        setIntElement(term315230, 1, 6);
        setField(term315473, term315473.getClass(), "stack", term315230);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextLong", argTypes, term315473, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


