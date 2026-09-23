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

public class DefaultDateTypeAdapter_read_805904443131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61314;
     Object term61386;

    public DefaultDateTypeAdapter_read_805904443131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61314 = newInstance(Class.forName("com.google.gson.DefaultDateTypeAdapter"));
        term61386 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term60143 = (char[]) newCharArray(489);
        Object term61442 = newInstance(Class.forName("java.io.InputStreamReader"));
        setIntField(term61386, term61386.getClass(), "peeked", 10);
        setIntField(term61386, term61386.getClass(), "pos", 0);
        setIntField(term61386, term61386.getClass(), "limit", 0);
        setCharElement(term60143, 0, 'N');
        setCharElement(term60143, 1, 'U');
        setCharElement(term60143, 2, 'M');
        setCharElement(term60143, 3, 'B');
        setCharElement(term60143, 4, 'E');
        setCharElement(term60143, 5, 'R');
        setField(term61386, term61386.getClass(), "buffer", term60143);
        setIntField(term61386, term61386.getClass(), "lineStart", 0);
        setField(term61386, term61386.getClass(), "in", term61442);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.DefaultDateTypeAdapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.gson.stream.JsonReader");
        Object[] args = new Object[1];
        args[0] = term61386;
        try {
            callMethod(klass, "read", argTypes, term61314, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


