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

public class DefaultDateTypeAdapter_read_80590444374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20864;
     Object term20936;

    public DefaultDateTypeAdapter_read_80590444374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20864 = newInstance(Class.forName("com.google.gson.DefaultDateTypeAdapter"));
        term20936 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setIntField(term20936, term20936.getClass(), "peeked", 8);
        setField(term20936, term20936.getClass(), "buffer", null);
        setIntField(term20936, term20936.getClass(), "pos", -2147483648);
        setIntField(term20936, term20936.getClass(), "limit", -2147483647);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.DefaultDateTypeAdapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.gson.stream.JsonReader");
        Object[] args = new Object[1];
        args[0] = term20936;
        try {
            callMethod(klass, "read", argTypes, term20864, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


