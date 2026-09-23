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

public class JsonReader_nextString_1089781162401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144830;

    public JsonReader_nextString_1089781162401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144830 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term144628 = (int[]) newIntArray(1);
        setIntField(term144830, term144830.getClass(), "peeked", 5);
        setIntField(term144830, term144830.getClass(), "lineNumber", 0);
        setIntField(term144830, term144830.getClass(), "pos", 0);
        setIntField(term144830, term144830.getClass(), "lineStart", 0);
        setIntField(term144830, term144830.getClass(), "stackSize", 1);
        setIntElement(term144628, 0, 2);
        setField(term144830, term144830.getClass(), "stack", term144628);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextString", argTypes, term144830, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


