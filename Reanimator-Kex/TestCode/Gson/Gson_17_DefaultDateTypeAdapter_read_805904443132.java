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

public class DefaultDateTypeAdapter_read_805904443132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62733;
     Object term62805;

    public DefaultDateTypeAdapter_read_805904443132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62733 = newInstance(Class.forName("com.google.gson.DefaultDateTypeAdapter"));
        term62805 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term62058 = (char[]) newCharArray(241);
        Object term62843 = newInstance(Class.forName("java.io.Reader$1"));
        setIntField(term62805, term62805.getClass(), "peeked", 10);
        setIntField(term62805, term62805.getClass(), "pos", 0);
        setIntField(term62805, term62805.getClass(), "limit", 0);
        setCharElement(term62058, 0, 'E');
        setCharElement(term62058, 1, 'N');
        setCharElement(term62058, 2, 'D');
        setCharElement(term62058, 3, (char) 95);
        setCharElement(term62058, 4, 'O');
        setCharElement(term62058, 5, 'B');
        setCharElement(term62058, 6, 'J');
        setCharElement(term62058, 7, 'E');
        setCharElement(term62058, 8, 'C');
        setCharElement(term62058, 9, 'T');
        setField(term62805, term62805.getClass(), "buffer", term62058);
        setIntField(term62805, term62805.getClass(), "lineStart", 0);
        setField(term62805, term62805.getClass(), "in", term62843);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.DefaultDateTypeAdapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.gson.stream.JsonReader");
        Object[] args = new Object[1];
        args[0] = term62805;
        try {
            callMethod(klass, "read", argTypes, term62733, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


