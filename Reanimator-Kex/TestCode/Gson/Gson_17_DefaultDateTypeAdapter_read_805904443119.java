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

public class DefaultDateTypeAdapter_read_805904443119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50330;
     Object term50402;

    public DefaultDateTypeAdapter_read_805904443119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50330 = newInstance(Class.forName("com.google.gson.DefaultDateTypeAdapter"));
        term50402 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term50143 = (char[]) newCharArray(9);
        setIntField(term50402, term50402.getClass(), "peeked", 9);
        setCharElement(term50143, 0, 'N');
        setCharElement(term50143, 1, 'U');
        setCharElement(term50143, 2, 'M');
        setCharElement(term50143, 3, 'B');
        setCharElement(term50143, 4, 'E');
        setCharElement(term50143, 5, 'R');
        setField(term50402, term50402.getClass(), "buffer", term50143);
        setIntField(term50402, term50402.getClass(), "pos", 536870912);
        setIntField(term50402, term50402.getClass(), "limit", 536870913);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.DefaultDateTypeAdapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.gson.stream.JsonReader");
        Object[] args = new Object[1];
        args[0] = term50402;
        try {
            callMethod(klass, "read", argTypes, term50330, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


