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
import static com.google.gson.stream.EqualityUtils.*;
import java.lang.Object;

public class JsonWriter_init_93896392673 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12790;
     Object term12854;
     Object term12859;

    public JsonWriter_init_93896392673() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term12752 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term12752, term12752.getClass(), "stack", null);
        setIntField(term12752, term12752.getClass(), "stackSize", 0);
        setField(term12752, term12752.getClass(), "separator", null);
        setBooleanField(term12752, term12752.getClass(), "serializeNulls", false);
        term12790 = newInstance(Class.forName("java.io.Writer$1"));
        term12854 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term12855 = newInstance(Class.forName("java.io.Writer$1"));
        int[] term12856 = (int[]) newIntArray(32);
        setBooleanField(term12855, term12855.getClass(), "closed", false);
        setField(term12855, term12855.getClass(), "writeBuffer", null);
        setField(term12855, term12855.getClass(), "lock", null);
        setField(term12854, term12854.getClass(), "out", term12855);
        setIntElement(term12856, 0, 6);
        setField(term12854, term12854.getClass(), "stack", term12856);
        setIntField(term12854, term12854.getClass(), "stackSize", 1);
        setField(term12854, term12854.getClass(), "indent", null);
        setField(term12854, term12854.getClass(), "separator", ":");
        setBooleanField(term12854, term12854.getClass(), "lenient", false);
        setBooleanField(term12854, term12854.getClass(), "htmlSafe", false);
        setField(term12854, term12854.getClass(), "deferredName", null);
        setBooleanField(term12854, term12854.getClass(), "serializeNulls", true);
        term12859 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term12859, term12859.getClass(), "closed", false);
        setField(term12859, term12859.getClass(), "writeBuffer", null);
        setField(term12859, term12859.getClass(), "lock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.Writer");
        Object[] args = new Object[1];
        args[0] = term12790;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term12854));
        assertTrue(recursiveEquals(term12790, term12859));
    }

};


