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

public class DefaultDateTypeAdapter_read_805904443127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53888;
     Object term53960;

    public DefaultDateTypeAdapter_read_805904443127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53888 = newInstance(Class.forName("com.google.gson.DefaultDateTypeAdapter"));
        term53960 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term53213 = (char[]) newCharArray(241);
        Object term54018 = newInstance(Class.forName("java.io.Console$LineReader"));
        setIntField(term53960, term53960.getClass(), "peeked", 10);
        setIntField(term53960, term53960.getClass(), "pos", 0);
        setIntField(term53960, term53960.getClass(), "limit", 0);
        setCharElement(term53213, 0, 'E');
        setCharElement(term53213, 1, 'N');
        setCharElement(term53213, 2, 'D');
        setCharElement(term53213, 3, (char) 95);
        setCharElement(term53213, 4, 'O');
        setCharElement(term53213, 5, 'B');
        setCharElement(term53213, 6, 'J');
        setCharElement(term53213, 7, 'E');
        setCharElement(term53213, 8, 'C');
        setCharElement(term53213, 9, 'T');
        setField(term53960, term53960.getClass(), "buffer", term53213);
        setIntField(term53960, term53960.getClass(), "lineStart", 0);
        setField(term53960, term53960.getClass(), "in", term54018);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.DefaultDateTypeAdapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.gson.stream.JsonReader");
        Object[] args = new Object[1];
        args[0] = term53960;
        try {
            callMethod(klass, "read", argTypes, term53888, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


