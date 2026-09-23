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

public class JsonReader_nextLong_9514535201019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1438809;

    public JsonReader_nextLong_9514535201019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1438809 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term1438605 = (int[]) newIntArray(1);
        setIntField(term1438809, term1438809.getClass(), "peeked", 13);
        setIntField(term1438809, term1438809.getClass(), "lineNumber", 0);
        setIntField(term1438809, term1438809.getClass(), "pos", 0);
        setIntField(term1438809, term1438809.getClass(), "lineStart", 0);
        setIntField(term1438809, term1438809.getClass(), "stackSize", 1);
        setIntElement(term1438605, 0, 6);
        setField(term1438809, term1438809.getClass(), "stack", term1438605);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextLong", argTypes, term1438809, args);
    }

};


