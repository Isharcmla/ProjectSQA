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

public class JsonTreeReader_locationString_117107013244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73185;

    public JsonTreeReader_locationString_117107013244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73185 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term72919 = (Object[]) newArray("java.lang.Object", 64);
        Object term73243 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term73307 = newInstance(Class.forName("java.util.TreeMap$KeyIterator"));
        Object term73345 = newInstance(Class.forName("java.lang.Object"));
        Object[] term72923 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term73185, term73185.getClass(), "stackSize", 1);
        setElement(term72919, 0, term73243);
        setElement(term72919, 1, term73307);
        setElement(term72919, 2, term73345);
        setField(term73185, term73185.getClass(), "stack", term72919);
        setField(term73185, term73185.getClass(), "pathNames", term72923);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "locationString", argTypes, term73185, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


