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

public class JsonReader_nextBoolean_2075593930482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207509;

    public JsonReader_nextBoolean_2075593930482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term207509 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term207078 = (int[]) newIntArray(234);
        setIntField(term207509, term207509.getClass(), "peeked", 1);
        setIntField(term207509, term207509.getClass(), "lineNumber", 0);
        setIntField(term207509, term207509.getClass(), "pos", 0);
        setIntField(term207509, term207509.getClass(), "lineStart", 0);
        setIntField(term207509, term207509.getClass(), "stackSize", 1);
        setIntElement(term207078, 0, 4);
        setField(term207509, term207509.getClass(), "stack", term207078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextBoolean", argTypes, term207509, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


