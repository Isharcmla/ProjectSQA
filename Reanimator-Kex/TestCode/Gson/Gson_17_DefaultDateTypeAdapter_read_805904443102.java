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

public class DefaultDateTypeAdapter_read_805904443102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36520;
     Object term36592;

    public DefaultDateTypeAdapter_read_805904443102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36520 = newInstance(Class.forName("com.google.gson.DefaultDateTypeAdapter"));
        term36592 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term35846 = (char[]) newCharArray(497);
        setIntField(term36592, term36592.getClass(), "peeked", 9);
        setCharElement(term35846, 0, 'B');
        setCharElement(term35846, 1, 'E');
        setCharElement(term35846, 2, 'G');
        setCharElement(term35846, 3, 'I');
        setCharElement(term35846, 4, 'N');
        setCharElement(term35846, 5, (char) 95);
        setCharElement(term35846, 6, 'A');
        setCharElement(term35846, 7, 'R');
        setCharElement(term35846, 8, 'R');
        setCharElement(term35846, 9, 'A');
        setCharElement(term35846, 10, 'Y');
        setField(term36592, term36592.getClass(), "buffer", term35846);
        setIntField(term36592, term36592.getClass(), "pos", -2147483648);
        setIntField(term36592, term36592.getClass(), "limit", -2147483647);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.DefaultDateTypeAdapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.gson.stream.JsonReader");
        Object[] args = new Object[1];
        args[0] = term36592;
        try {
            callMethod(klass, "read", argTypes, term36520, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


