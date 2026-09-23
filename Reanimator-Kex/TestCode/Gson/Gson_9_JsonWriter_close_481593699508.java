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
import java.io.IOException;
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JsonWriter_close_481593699508 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term367486;

    public JsonWriter_close_481593699508() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term367486 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term367524 = newInstance(Class.forName("java.io.Writer$1"));
        int[] term367394 = (int[]) newIntArray(1);
        setField(term367486, term367486.getClass(), "out", term367524);
        setIntField(term367486, term367486.getClass(), "stackSize", 1);
        setField(term367486, term367486.getClass(), "stack", term367394);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term367486, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


