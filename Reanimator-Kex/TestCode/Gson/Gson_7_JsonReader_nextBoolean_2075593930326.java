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

public class JsonReader_nextBoolean_2075593930326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112564;

    public JsonReader_nextBoolean_2075593930326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112564 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term112262 = (int[]) newIntArray(105);
        setIntField(term112564, term112564.getClass(), "peeked", 9);
        setIntField(term112564, term112564.getClass(), "lineNumber", 0);
        setIntField(term112564, term112564.getClass(), "pos", 0);
        setIntField(term112564, term112564.getClass(), "lineStart", 0);
        setIntField(term112564, term112564.getClass(), "stackSize", 1);
        setIntElement(term112262, 0, 110);
        setIntElement(term112262, 1, 117);
        setIntElement(term112262, 2, 108);
        setIntElement(term112262, 3, 108);
        setField(term112564, term112564.getClass(), "stack", term112262);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextBoolean", argTypes, term112564, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


