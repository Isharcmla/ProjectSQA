package com.google.gson.internal;

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
import static com.google.gson.internal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;

public class ConstructorConstructor_get_8042201077 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10;
     Object term16;

    public ConstructorConstructor_get_8042201077() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term11 = new HashMap();
        term10 = newInstance(Class.forName("com.google.gson.internal.ConstructorConstructor"));
        setField(term10, term10.getClass(), "instanceCreators", term11);
        term16 = newInstance(Class.forName("com.google.gson.reflect.TypeToken"));
        setField(term16, term16.getClass(), "rawType", null);
        setField(term16, term16.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.ConstructorConstructor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.gson.reflect.TypeToken");
        Object[] args = new Object[1];
        args[0] = term16;
        try {
            callMethod(klass, "get", argTypes, term10, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


