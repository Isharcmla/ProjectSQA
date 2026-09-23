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

public class JsonReader_nextBoolean_2075593930357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124688;

    public JsonReader_nextBoolean_2075593930357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124688 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term124380 = (int[]) newIntArray(112);
        setIntField(term124688, term124688.getClass(), "peeked", 1);
        setIntField(term124688, term124688.getClass(), "lineNumber", 0);
        setIntField(term124688, term124688.getClass(), "pos", 0);
        setIntField(term124688, term124688.getClass(), "lineStart", 0);
        setIntField(term124688, term124688.getClass(), "stackSize", 1);
        setIntElement(term124380, 0, 110);
        setIntElement(term124380, 1, 117);
        setIntElement(term124380, 2, 108);
        setIntElement(term124380, 3, 108);
        setField(term124688, term124688.getClass(), "stack", term124380);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextBoolean", argTypes, term124688, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


