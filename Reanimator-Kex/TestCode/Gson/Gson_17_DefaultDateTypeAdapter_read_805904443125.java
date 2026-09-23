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

public class DefaultDateTypeAdapter_read_805904443125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52723;
     Object term52795;

    public DefaultDateTypeAdapter_read_805904443125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52723 = newInstance(Class.forName("com.google.gson.DefaultDateTypeAdapter"));
        term52795 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term52048 = (char[]) newCharArray(241);
        Object term52845 = newInstance(Class.forName("java.io.PushbackReader"));
        setIntField(term52795, term52795.getClass(), "peeked", 10);
        setIntField(term52795, term52795.getClass(), "pos", 0);
        setIntField(term52795, term52795.getClass(), "limit", 0);
        setCharElement(term52048, 0, 'E');
        setCharElement(term52048, 1, 'N');
        setCharElement(term52048, 2, 'D');
        setCharElement(term52048, 3, (char) 95);
        setCharElement(term52048, 4, 'O');
        setCharElement(term52048, 5, 'B');
        setCharElement(term52048, 6, 'J');
        setCharElement(term52048, 7, 'E');
        setCharElement(term52048, 8, 'C');
        setCharElement(term52048, 9, 'T');
        setField(term52795, term52795.getClass(), "buffer", term52048);
        setIntField(term52795, term52795.getClass(), "lineStart", 0);
        setField(term52795, term52795.getClass(), "in", term52845);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.DefaultDateTypeAdapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.gson.stream.JsonReader");
        Object[] args = new Object[1];
        args[0] = term52795;
        try {
            callMethod(klass, "read", argTypes, term52723, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


