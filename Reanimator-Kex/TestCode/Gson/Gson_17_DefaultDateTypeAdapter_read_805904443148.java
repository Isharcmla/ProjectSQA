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

public class DefaultDateTypeAdapter_read_805904443148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72772;
     Object term72844;

    public DefaultDateTypeAdapter_read_805904443148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72772 = newInstance(Class.forName("com.google.gson.DefaultDateTypeAdapter"));
        term72844 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term72594 = (char[]) newCharArray(1);
        setIntField(term72844, term72844.getClass(), "peeked", 10);
        setIntField(term72844, term72844.getClass(), "pos", 536870912);
        setIntField(term72844, term72844.getClass(), "limit", 536870913);
        setCharElement(term72594, 0, 'N');
        setField(term72844, term72844.getClass(), "buffer", term72594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.DefaultDateTypeAdapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.gson.stream.JsonReader");
        Object[] args = new Object[1];
        args[0] = term72844;
        try {
            callMethod(klass, "read", argTypes, term72772, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


