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

public class JsonReader_nextString_1089781162478 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183019;

    public JsonReader_nextString_1089781162478() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term183019 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term182817 = (int[]) newIntArray(1);
        setIntField(term183019, term183019.getClass(), "peeked", 5);
        setIntField(term183019, term183019.getClass(), "lineNumber", 0);
        setIntField(term183019, term183019.getClass(), "pos", 0);
        setIntField(term183019, term183019.getClass(), "lineStart", 0);
        setIntField(term183019, term183019.getClass(), "stackSize", 1);
        setIntElement(term182817, 0, 7);
        setField(term183019, term183019.getClass(), "stack", term182817);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextString", argTypes, term183019, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


