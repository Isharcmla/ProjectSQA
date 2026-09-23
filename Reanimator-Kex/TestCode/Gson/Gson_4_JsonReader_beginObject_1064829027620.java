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

public class JsonReader_beginObject_1064829027620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term341690;

    public JsonReader_beginObject_1064829027620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term341690 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term341257 = (int[]) newIntArray(233);
        setIntField(term341690, term341690.getClass(), "peeked", 9);
        setIntField(term341690, term341690.getClass(), "lineNumber", 0);
        setIntField(term341690, term341690.getClass(), "pos", 0);
        setIntField(term341690, term341690.getClass(), "lineStart", 0);
        setIntField(term341690, term341690.getClass(), "stackSize", 2);
        setIntElement(term341257, 0, 8);
        setField(term341690, term341690.getClass(), "stack", term341257);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "beginObject", argTypes, term341690, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


