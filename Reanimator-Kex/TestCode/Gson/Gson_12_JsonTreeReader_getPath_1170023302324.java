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
import java.lang.NullPointerException;
import static com.google.gson.internal.bind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JsonTreeReader_getPath_1170023302324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121743;

    public JsonTreeReader_getPath_1170023302324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121743 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term121462 = (Object[]) newArray("java.lang.Object", 495);
        Object term121801 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term121859 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term121977 = newInstance(Class.forName("java.util.concurrent.ConcurrentSkipListMap$ValueIterator"));
        Object term122015 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term121743, term121743.getClass(), "stackSize", 7);
        setElement(term121462, 0, term121801);
        setElement(term121462, 3, term121859);
        setElement(term121462, 4, term121977);
        setElement(term121462, 128, term122015);
        setField(term121743, term121743.getClass(), "stack", term121462);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getPath", argTypes, term121743, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


