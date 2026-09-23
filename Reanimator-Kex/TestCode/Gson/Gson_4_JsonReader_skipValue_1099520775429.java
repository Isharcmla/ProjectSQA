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

public class JsonReader_skipValue_1099520775429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168564;

    public JsonReader_skipValue_1099520775429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term168564 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term168456 = (char[]) newCharArray(0);
        setIntField(term168564, term168564.getClass(), "peeked", 8);
        setField(term168564, term168564.getClass(), "buffer", term168456);
        setIntField(term168564, term168564.getClass(), "pos", 0);
        setIntField(term168564, term168564.getClass(), "limit", 0);
        setIntField(term168564, term168564.getClass(), "lineStart", 0);
        setField(term168564, term168564.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "skipValue", argTypes, term168564, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


