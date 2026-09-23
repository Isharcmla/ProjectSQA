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

public class JsonWriter_writeDeferredName_2035940590226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92935;

    public JsonWriter_writeDeferredName_2035940590226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92935 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term92829 = (int[]) newIntArray(8);
        setField(term92935, term92935.getClass(), "deferredName", "");
        setIntField(term92935, term92935.getClass(), "stackSize", 8);
        setIntElement(term92829, 0, 3);
        setIntElement(term92829, 1, 3);
        setIntElement(term92829, 2, 3);
        setIntElement(term92829, 3, 3);
        setIntElement(term92829, 4, 3);
        setIntElement(term92829, 5, 3);
        setIntElement(term92829, 6, 3);
        setIntElement(term92829, 7, 3);
        setField(term92935, term92935.getClass(), "stack", term92829);
        setField(term92935, term92935.getClass(), "indent", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "writeDeferredName", argTypes, term92935, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


