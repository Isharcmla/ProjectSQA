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

public class JsonReader_nextBoolean_2075593930593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term317489;

    public JsonReader_nextBoolean_2075593930593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term317489 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term317058 = (int[]) newIntArray(234);
        setIntField(term317489, term317489.getClass(), "peeked", 1);
        setIntField(term317489, term317489.getClass(), "lineNumber", 0);
        setIntField(term317489, term317489.getClass(), "pos", 0);
        setIntField(term317489, term317489.getClass(), "lineStart", 0);
        setIntField(term317489, term317489.getClass(), "stackSize", 1);
        setIntElement(term317058, 0, 2);
        setField(term317489, term317489.getClass(), "stack", term317058);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextBoolean", argTypes, term317489, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


