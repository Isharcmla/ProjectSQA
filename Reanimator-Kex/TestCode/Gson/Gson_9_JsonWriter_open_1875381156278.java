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

public class JsonWriter_open_1875381156278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116729;

    public JsonWriter_open_1875381156278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116729 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term116629 = (int[]) newIntArray(8);
        setIntField(term116729, term116729.getClass(), "stackSize", 8);
        setIntElement(term116629, 0, 7);
        setIntElement(term116629, 1, 7);
        setIntElement(term116629, 2, 7);
        setIntElement(term116629, 3, 7);
        setIntElement(term116629, 4, 7);
        setIntElement(term116629, 5, 7);
        setIntElement(term116629, 6, 7);
        setIntElement(term116629, 7, 7);
        setField(term116729, term116729.getClass(), "stack", term116629);
        setBooleanField(term116729, term116729.getClass(), "lenient", true);
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
            callMethod(klass, "open", argTypes, term116729, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


