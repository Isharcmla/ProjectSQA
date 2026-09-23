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

public class JsonReader_nextString_1089781162327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term300417;

    public JsonReader_nextString_1089781162327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term300417 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term299725 = (int[]) newIntArray(489);
        setIntField(term300417, term300417.getClass(), "peeked", 12);
        setIntField(term300417, term300417.getClass(), "lineNumber", 0);
        setIntField(term300417, term300417.getClass(), "pos", 0);
        setIntField(term300417, term300417.getClass(), "lineStart", 0);
        setIntField(term300417, term300417.getClass(), "stackSize", 1);
        setIntElement(term299725, 0, 66);
        setIntElement(term299725, 1, 69);
        setIntElement(term299725, 2, 71);
        setIntElement(term299725, 3, 73);
        setIntElement(term299725, 4, 78);
        setIntElement(term299725, 5, 95);
        setIntElement(term299725, 6, 65);
        setIntElement(term299725, 7, 82);
        setIntElement(term299725, 8, 82);
        setIntElement(term299725, 9, 65);
        setIntElement(term299725, 10, 89);
        setField(term300417, term300417.getClass(), "stack", term299725);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextString", argTypes, term300417, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


