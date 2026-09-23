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
import java.lang.NullPointerException;
import static com.google.gson.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DefaultDateTypeAdapter_read_805904443128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56567;
     Object term56639;

    public DefaultDateTypeAdapter_read_805904443128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56567 = newInstance(Class.forName("com.google.gson.DefaultDateTypeAdapter"));
        term56639 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term55396 = (char[]) newCharArray(489);
        Object term56689 = newInstance(Class.forName("java.io.BufferedReader"));
        setIntField(term56639, term56639.getClass(), "peeked", 10);
        setIntField(term56639, term56639.getClass(), "pos", 0);
        setIntField(term56639, term56639.getClass(), "limit", 0);
        setCharElement(term55396, 0, 'N');
        setCharElement(term55396, 1, 'U');
        setCharElement(term55396, 2, 'M');
        setCharElement(term55396, 3, 'B');
        setCharElement(term55396, 4, 'E');
        setCharElement(term55396, 5, 'R');
        setField(term56639, term56639.getClass(), "buffer", term55396);
        setIntField(term56639, term56639.getClass(), "lineStart", 0);
        setField(term56639, term56639.getClass(), "in", term56689);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.DefaultDateTypeAdapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.gson.stream.JsonReader");
        Object[] args = new Object[1];
        args[0] = term56639;
        try {
            callMethod(klass, "read", argTypes, term56567, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


