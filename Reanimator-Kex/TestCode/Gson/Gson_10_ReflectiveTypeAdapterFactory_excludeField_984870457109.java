package com.google.gson.internal.bind;

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
import java.lang.reflect.InaccessibleObjectException;
import static com.google.gson.internal.bind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class ReflectiveTypeAdapterFactory_excludeField_984870457109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69907;
     Object term70031;

    public ReflectiveTypeAdapterFactory_excludeField_984870457109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69907 = newInstance(Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory"));
        Object term69979 = newInstance(Class.forName("com.google.gson.internal.Excluder"));
        setDoubleField(term69979, term69979.getClass(), "version", 1.0);
        setField(term69907, term69907.getClass(), "excluder", term69979);
        Class<? extends Object> term71528 = Class.forName((String) "java.util.zip.ZipException");
        term70031 = ((Class) term71528).getDeclaredField((String) "serialVersionUID");
        ((Field) term70031).setAccessible(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.reflect.Field");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term70031;
        args[1] = false;
        try {
            callMethod(klass, "excludeField", argTypes, term69907, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


