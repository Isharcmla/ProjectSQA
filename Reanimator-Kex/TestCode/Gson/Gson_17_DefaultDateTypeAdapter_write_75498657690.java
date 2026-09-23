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

public class DefaultDateTypeAdapter_write_75498657690 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30428;
     Object term30500;

    public DefaultDateTypeAdapter_write_75498657690() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30428 = newInstance(Class.forName("com.google.gson.DefaultDateTypeAdapter"));
        term30500 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term30500, term30500.getClass(), "deferredName", "");
        setBooleanField(term30500, term30500.getClass(), "serializeNulls", true);
        setIntField(term30500, term30500.getClass(), "stackSize", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.DefaultDateTypeAdapter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.gson.stream.JsonWriter");
        argTypes[1] = Class.forName("java.util.Date");
        Object[] args = new Object[2];
        args[0] = term30500;
        args[1] = null;
        try {
            callMethod(klass, "write", argTypes, term30428, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


