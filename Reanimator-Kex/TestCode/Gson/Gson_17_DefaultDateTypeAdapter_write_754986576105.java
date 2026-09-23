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

public class DefaultDateTypeAdapter_write_754986576105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39425;
     Object term39497;

    public DefaultDateTypeAdapter_write_754986576105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39425 = newInstance(Class.forName("com.google.gson.DefaultDateTypeAdapter"));
        term39497 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term39317 = (int[]) newIntArray(0);
        setField(term39497, term39497.getClass(), "deferredName", "");
        setBooleanField(term39497, term39497.getClass(), "serializeNulls", true);
        setIntField(term39497, term39497.getClass(), "stackSize", -1);
        setField(term39497, term39497.getClass(), "stack", term39317);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.DefaultDateTypeAdapter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.gson.stream.JsonWriter");
        argTypes[1] = Class.forName("java.util.Date");
        Object[] args = new Object[2];
        args[0] = term39497;
        args[1] = null;
        try {
            callMethod(klass, "write", argTypes, term39425, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


