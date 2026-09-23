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

public class DefaultDateTypeAdapter_write_754986576152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75638;
     Object term75710;

    public DefaultDateTypeAdapter_write_754986576152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75638 = newInstance(Class.forName("com.google.gson.DefaultDateTypeAdapter"));
        term75710 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term75533 = (int[]) newIntArray(0);
        setField(term75710, term75710.getClass(), "deferredName", null);
        setIntField(term75710, term75710.getClass(), "stackSize", 1024);
        setField(term75710, term75710.getClass(), "stack", term75533);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.DefaultDateTypeAdapter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.gson.stream.JsonWriter");
        argTypes[1] = Class.forName("java.util.Date");
        Object[] args = new Object[2];
        args[0] = term75710;
        args[1] = null;
        try {
            callMethod(klass, "write", argTypes, term75638, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


