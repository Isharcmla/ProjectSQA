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

public class JsonReader_beginObject_1064829027487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term215256;

    public JsonReader_beginObject_1064829027487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term215256 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term214568 = (int[]) newIntArray(492);
        setIntField(term215256, term215256.getClass(), "peeked", 9);
        setIntField(term215256, term215256.getClass(), "lineNumber", 0);
        setIntField(term215256, term215256.getClass(), "pos", 0);
        setIntField(term215256, term215256.getClass(), "lineStart", 0);
        setIntField(term215256, term215256.getClass(), "stackSize", 1);
        setIntElement(term214568, 0, 8);
        setField(term215256, term215256.getClass(), "stack", term214568);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "beginObject", argTypes, term215256, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


