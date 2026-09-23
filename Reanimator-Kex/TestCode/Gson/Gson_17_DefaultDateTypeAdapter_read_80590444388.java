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

public class DefaultDateTypeAdapter_read_80590444388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27658;
     Object term27730;

    public DefaultDateTypeAdapter_read_80590444388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27658 = newInstance(Class.forName("com.google.gson.DefaultDateTypeAdapter"));
        term27730 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term26986 = (char[]) newCharArray(496);
        setIntField(term27730, term27730.getClass(), "peeked", 8);
        setCharElement(term26986, 0, 'B');
        setCharElement(term26986, 1, 'E');
        setCharElement(term26986, 2, 'G');
        setCharElement(term26986, 3, 'I');
        setCharElement(term26986, 4, 'N');
        setCharElement(term26986, 5, (char) 95);
        setCharElement(term26986, 6, 'A');
        setCharElement(term26986, 7, 'R');
        setCharElement(term26986, 8, 'R');
        setCharElement(term26986, 9, 'A');
        setCharElement(term26986, 10, 'Y');
        setField(term27730, term27730.getClass(), "buffer", term26986);
        setIntField(term27730, term27730.getClass(), "pos", -2147483648);
        setIntField(term27730, term27730.getClass(), "limit", -2147483647);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.DefaultDateTypeAdapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.gson.stream.JsonReader");
        Object[] args = new Object[1];
        args[0] = term27730;
        try {
            callMethod(klass, "read", argTypes, term27658, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


