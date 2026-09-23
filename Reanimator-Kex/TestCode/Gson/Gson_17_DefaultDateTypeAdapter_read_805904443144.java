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

public class DefaultDateTypeAdapter_read_805904443144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70447;
     Object term70519;

    public DefaultDateTypeAdapter_read_805904443144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70447 = newInstance(Class.forName("com.google.gson.DefaultDateTypeAdapter"));
        term70519 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term70248 = (char[]) newCharArray(2);
        Object term70557 = newInstance(Class.forName("java.io.Reader$1"));
        setIntField(term70519, term70519.getClass(), "peeked", 10);
        setIntField(term70519, term70519.getClass(), "pos", 0);
        setIntField(term70519, term70519.getClass(), "limit", 0);
        setCharElement(term70248, 0, 'N');
        setCharElement(term70248, 1, 'U');
        setField(term70519, term70519.getClass(), "buffer", term70248);
        setIntField(term70519, term70519.getClass(), "lineStart", 0);
        setField(term70519, term70519.getClass(), "in", term70557);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.DefaultDateTypeAdapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.gson.stream.JsonReader");
        Object[] args = new Object[1];
        args[0] = term70519;
        try {
            callMethod(klass, "read", argTypes, term70447, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


