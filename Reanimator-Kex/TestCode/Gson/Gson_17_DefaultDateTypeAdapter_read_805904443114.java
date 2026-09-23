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

public class DefaultDateTypeAdapter_read_805904443114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46387;
     Object term46459;

    public DefaultDateTypeAdapter_read_805904443114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46387 = newInstance(Class.forName("com.google.gson.DefaultDateTypeAdapter"));
        term46459 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term45170 = (char[]) newCharArray(512);
        Object term46511 = newInstance(Class.forName("java.io.CharArrayReader"));
        setIntField(term46459, term46459.getClass(), "peeked", 10);
        setIntField(term46459, term46459.getClass(), "pos", 0);
        setIntField(term46459, term46459.getClass(), "limit", 0);
        setCharElement(term45170, 0, 'N');
        setCharElement(term45170, 1, 'U');
        setCharElement(term45170, 2, 'M');
        setCharElement(term45170, 3, 'B');
        setCharElement(term45170, 4, 'E');
        setCharElement(term45170, 5, 'R');
        setField(term46459, term46459.getClass(), "buffer", term45170);
        setIntField(term46459, term46459.getClass(), "lineStart", 0);
        setField(term46459, term46459.getClass(), "in", term46511);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.DefaultDateTypeAdapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.gson.stream.JsonReader");
        Object[] args = new Object[1];
        args[0] = term46459;
        try {
            callMethod(klass, "read", argTypes, term46387, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


