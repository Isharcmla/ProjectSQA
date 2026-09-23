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

public class DefaultDateTypeAdapter_read_805904443111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42354;
     Object term42426;

    public DefaultDateTypeAdapter_read_805904443111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42354 = newInstance(Class.forName("com.google.gson.DefaultDateTypeAdapter"));
        term42426 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term41190 = (char[]) newCharArray(490);
        setIntField(term42426, term42426.getClass(), "peeked", 10);
        setIntField(term42426, term42426.getClass(), "pos", 0);
        setIntField(term42426, term42426.getClass(), "limit", -2147483644);
        setCharElement(term41190, 0, 'B');
        setCharElement(term41190, 1, 'E');
        setCharElement(term41190, 2, 'G');
        setCharElement(term41190, 3, 'I');
        setCharElement(term41190, 4, 'N');
        setCharElement(term41190, 5, (char) 95);
        setCharElement(term41190, 6, 'O');
        setCharElement(term41190, 7, 'B');
        setCharElement(term41190, 8, 'J');
        setCharElement(term41190, 9, 'E');
        setCharElement(term41190, 10, 'C');
        setCharElement(term41190, 11, 'T');
        setField(term42426, term42426.getClass(), "buffer", term41190);
        setIntField(term42426, term42426.getClass(), "lineStart", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.DefaultDateTypeAdapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.gson.stream.JsonReader");
        Object[] args = new Object[1];
        args[0] = term42426;
        try {
            callMethod(klass, "read", argTypes, term42354, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


