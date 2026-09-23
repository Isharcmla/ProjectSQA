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

public class JsonReader_beginObject_1064829027509 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236944;

    public JsonReader_beginObject_1064829027509() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term236944 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term236256 = (int[]) newIntArray(492);
        setIntField(term236944, term236944.getClass(), "peeked", 8);
        setIntField(term236944, term236944.getClass(), "lineNumber", 0);
        setIntField(term236944, term236944.getClass(), "pos", 0);
        setIntField(term236944, term236944.getClass(), "lineStart", 0);
        setIntField(term236944, term236944.getClass(), "stackSize", 1);
        setIntElement(term236256, 0, 3);
        setField(term236944, term236944.getClass(), "stack", term236256);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "beginObject", argTypes, term236944, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


