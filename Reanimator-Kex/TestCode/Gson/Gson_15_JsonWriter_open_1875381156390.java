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
import java.lang.Object;

public class JsonWriter_open_1875381156390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206326;

    public JsonWriter_open_1875381156390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206326 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term204246 = (int[]) newIntArray(245);
        Object term206370 = newInstance(Class.forName("java.io.PipedWriter"));
        setIntField(term206326, term206326.getClass(), "stackSize", 245);
        setIntElement(term204246, 244, 1);
        setField(term206326, term206326.getClass(), "stack", term204246);
        setField(term206326, term206326.getClass(), "indent", null);
        setField(term206326, term206326.getClass(), "out", term206370);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = null;
        try {
            callMethod(klass, "open", argTypes, term206326, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


