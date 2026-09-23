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

public class JsonTreeReader_getPath_1170023302384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159557;

    public JsonTreeReader_getPath_1170023302384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159557 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term159292 = (Object[]) newArray("java.lang.Object", 235);
        Object term159613 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term159671 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term159789 = newInstance(Class.forName("java.util.concurrent.ConcurrentSkipListMap$ValueIterator"));
        Object term159827 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term159557, term159557.getClass(), "stackSize", 3);
        setElement(term159292, 0, term159613);
        setElement(term159292, 2, term159671);
        setElement(term159292, 3, term159789);
        setElement(term159292, 32, term159827);
        setField(term159557, term159557.getClass(), "stack", term159292);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getPath", argTypes, term159557, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


