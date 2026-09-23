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

public class JsonReader_nextString_1089781162600 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term323400;

    public JsonReader_nextString_1089781162600() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term323400 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term322709 = (int[]) newIntArray(489);
        setIntField(term323400, term323400.getClass(), "peeked", 4);
        setIntField(term323400, term323400.getClass(), "lineNumber", 0);
        setIntField(term323400, term323400.getClass(), "pos", 0);
        setIntField(term323400, term323400.getClass(), "lineStart", 0);
        setIntField(term323400, term323400.getClass(), "stackSize", 1);
        setIntElement(term322709, 0, 6);
        setField(term323400, term323400.getClass(), "stack", term322709);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextString", argTypes, term323400, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


