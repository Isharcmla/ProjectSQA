package com.google.gson;

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
import static com.google.gson.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DefaultDateTypeAdapter_read_805904443154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79304;
     Object term79376;

    public DefaultDateTypeAdapter_read_805904443154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79304 = newInstance(Class.forName("com.google.gson.DefaultDateTypeAdapter"));
        term79376 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term76133 = (char[]) newCharArray(674);
        Object term79414 = newInstance(Class.forName("java.io.Reader$1"));
        int[] term78162 = (int[]) newIntArray(418);
        setIntField(term79376, term79376.getClass(), "peeked", 10);
        setIntField(term79376, term79376.getClass(), "pos", 0);
        setIntField(term79376, term79376.getClass(), "limit", 0);
        setField(term79376, term79376.getClass(), "buffer", term76133);
        setIntField(term79376, term79376.getClass(), "lineStart", 0);
        setField(term79376, term79376.getClass(), "in", term79414);
        setField(term79376, term79376.getClass(), "pathIndices", term78162);
        setIntField(term79376, term79376.getClass(), "stackSize", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.DefaultDateTypeAdapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.gson.stream.JsonReader");
        Object[] args = new Object[1];
        args[0] = term79376;
        try {
            callMethod(klass, "read", argTypes, term79304, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


