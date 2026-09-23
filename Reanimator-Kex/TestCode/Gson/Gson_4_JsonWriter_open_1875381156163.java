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

public class JsonWriter_open_1875381156163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46884;

    public JsonWriter_open_1875381156163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46884 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term46787 = (int[]) newIntArray(8);
        setIntField(term46884, term46884.getClass(), "stackSize", 8);
        setIntElement(term46787, 0, 1);
        setIntElement(term46787, 1, 1);
        setIntElement(term46787, 2, 1);
        setIntElement(term46787, 3, 1);
        setIntElement(term46787, 4, 1);
        setIntElement(term46787, 5, 1);
        setIntElement(term46787, 6, 1);
        setIntElement(term46787, 7, 1);
        setField(term46884, term46884.getClass(), "stack", term46787);
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
            callMethod(klass, "open", argTypes, term46884, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


