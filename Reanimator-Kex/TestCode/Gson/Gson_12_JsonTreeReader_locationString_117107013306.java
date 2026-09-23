package com.google.gson.internal.bind;

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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.gson.internal.bind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JsonTreeReader_locationString_117107013306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111333;

    public JsonTreeReader_locationString_117107013306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111333 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term111014 = (Object[]) newArray("java.lang.Object", 7);
        Object term111425 = newInstance(Class.forName("java.util.concurrent.ArrayBlockingQueue$Itr"));
        Object term111481 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term111627 = newInstance(Class.forName("java.util.TreeMap$NavigableSubMap$SubMapKeyIterator"));
        Object term111695 = newInstance(Class.forName("java.util.Spliterators$2Adapter"));
        Object term111753 = newInstance(Class.forName("com.google.gson.JsonObject"));
        setIntField(term111333, term111333.getClass(), "stackSize", 22);
        setElement(term111014, 0, term111425);
        setElement(term111014, 1, term111481);
        setElement(term111014, 2, "");
        setElement(term111014, 3, term111627);
        setElement(term111014, 4, term111695);
        setElement(term111014, 5, term111014);
        setElement(term111014, 6, term111753);
        setField(term111333, term111333.getClass(), "stack", term111014);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "locationString", argTypes, term111333, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


