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

public class JsonWriter_init_93896392669 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11784;
     Object term12432;
     Object term12437;

    public JsonWriter_init_93896392669() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term11738 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term11738, term11738.getClass(), "stack", null);
        setIntField(term11738, term11738.getClass(), "stackSize", 0);
        setField(term11738, term11738.getClass(), "separator", null);
        setBooleanField(term11738, term11738.getClass(), "serializeNulls", false);
        term11784 = newInstance(Class.forName("java.io.StringWriter"));
        term12432 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term12433 = newInstance(Class.forName("java.io.StringWriter"));
        int[] term12434 = (int[]) newIntArray(32);
        setField(term12433, term12433.getClass(), "buf", null);
        setField(term12433, term12433.getClass(), "writeBuffer", null);
        setField(term12433, term12433.getClass(), "lock", null);
        setField(term12432, term12432.getClass(), "out", term12433);
        setIntElement(term12434, 0, 6);
        setField(term12432, term12432.getClass(), "stack", term12434);
        setIntField(term12432, term12432.getClass(), "stackSize", 1);
        setField(term12432, term12432.getClass(), "indent", null);
        setField(term12432, term12432.getClass(), "separator", ":");
        setBooleanField(term12432, term12432.getClass(), "lenient", false);
        setBooleanField(term12432, term12432.getClass(), "htmlSafe", false);
        setField(term12432, term12432.getClass(), "deferredName", null);
        setBooleanField(term12432, term12432.getClass(), "serializeNulls", true);
        term12437 = newInstance(Class.forName("java.io.StringWriter"));
        setField(term12437, term12437.getClass(), "buf", null);
        setField(term12437, term12437.getClass(), "writeBuffer", null);
        setField(term12437, term12437.getClass(), "lock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.Writer");
        Object[] args = new Object[1];
        args[0] = term11784;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term12432));
        assertTrue(recursiveEquals(term11784, term12437));
    }

};


