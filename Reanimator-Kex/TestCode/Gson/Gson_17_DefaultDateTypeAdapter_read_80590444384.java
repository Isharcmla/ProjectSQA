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

public class DefaultDateTypeAdapter_read_80590444384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23981;
     Object term24053;

    public DefaultDateTypeAdapter_read_80590444384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23981 = newInstance(Class.forName("com.google.gson.DefaultDateTypeAdapter"));
        term24053 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term23318 = (int[]) newIntArray(489);
        setIntField(term24053, term24053.getClass(), "peeked", 11);
        setField(term24053, term24053.getClass(), "peekedString", "");
        setIntElement(term23318, 0, 83);
        setIntElement(term23318, 1, 84);
        setIntElement(term23318, 2, 82);
        setIntElement(term23318, 3, 73);
        setIntElement(term23318, 4, 78);
        setIntElement(term23318, 5, 71);
        setField(term24053, term24053.getClass(), "pathIndices", term23318);
        setIntField(term24053, term24053.getClass(), "stackSize", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.DefaultDateTypeAdapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.gson.stream.JsonReader");
        Object[] args = new Object[1];
        args[0] = term24053;
        try {
            callMethod(klass, "read", argTypes, term23981, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


