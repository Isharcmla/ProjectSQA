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

public class DefaultDateTypeAdapter_read_805904443147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71868;
     Object term71940;

    public DefaultDateTypeAdapter_read_805904443147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71868 = newInstance(Class.forName("com.google.gson.DefaultDateTypeAdapter"));
        term71940 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term71203 = (int[]) newIntArray(489);
        setIntField(term71940, term71940.getClass(), "peeked", 11);
        setField(term71940, term71940.getClass(), "peekedString", "");
        setIntElement(term71203, 0, 66);
        setIntElement(term71203, 1, 69);
        setIntElement(term71203, 2, 71);
        setIntElement(term71203, 3, 73);
        setIntElement(term71203, 4, 78);
        setIntElement(term71203, 5, 95);
        setIntElement(term71203, 6, 65);
        setIntElement(term71203, 7, 82);
        setIntElement(term71203, 8, 82);
        setIntElement(term71203, 9, 65);
        setIntElement(term71203, 10, 89);
        setField(term71940, term71940.getClass(), "pathIndices", term71203);
        setIntField(term71940, term71940.getClass(), "stackSize", 490);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.DefaultDateTypeAdapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.gson.stream.JsonReader");
        Object[] args = new Object[1];
        args[0] = term71940;
        try {
            callMethod(klass, "read", argTypes, term71868, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


