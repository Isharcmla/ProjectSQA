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

public class JsonReader_nextNull_1017823471462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term626490;

    public JsonReader_nextNull_1017823471462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term626490 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term625802 = (int[]) newIntArray(489);
        setIntField(term626490, term626490.getClass(), "peeked", 4);
        setIntField(term626490, term626490.getClass(), "lineNumber", 0);
        setIntField(term626490, term626490.getClass(), "pos", 0);
        setIntField(term626490, term626490.getClass(), "lineStart", 0);
        setIntField(term626490, term626490.getClass(), "stackSize", 1);
        setIntElement(term625802, 0, 83);
        setIntElement(term625802, 1, 84);
        setIntElement(term625802, 2, 82);
        setIntElement(term625802, 3, 73);
        setIntElement(term625802, 4, 78);
        setIntElement(term625802, 5, 71);
        setField(term626490, term626490.getClass(), "stack", term625802);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextNull", argTypes, term626490, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


