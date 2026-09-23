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

public class JsonReader_fillBuffer_136745690495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192670;

    public JsonReader_fillBuffer_136745690495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term192670 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term192577 = (char[]) newCharArray(0);
        setField(term192670, term192670.getClass(), "buffer", term192577);
        setIntField(term192670, term192670.getClass(), "lineStart", 0);
        setIntField(term192670, term192670.getClass(), "pos", 0);
        setIntField(term192670, term192670.getClass(), "limit", 0);
        setField(term192670, term192670.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "fillBuffer", argTypes, term192670, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


