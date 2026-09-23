package com.fasterxml.jackson.databind.type;

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
import static com.fasterxml.jackson.databind.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.type.EqualityUtils.*;
import java.lang.Object;

public class TypeFactory_init_1846981259143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17680;
     Object term18096;
     Object term18100;

    public TypeFactory_init_1846981259143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term17582 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(term17582, term17582.getClass(), "_typeCache", null);
        term17680 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        term18096 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        Object term18097 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.LRUMap"));
        Object term18098 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term18099 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        setIntField(term18097, term18097.getClass(), "_maxEntries", 200);
        setField(term18098, term18098.getClass(), "table", null);
        setField(term18098, term18098.getClass(), "nextTable", null);
        setLongField(term18098, term18098.getClass(), "baseCount", 0L);
        setIntField(term18098, term18098.getClass(), "sizeCtl", 32);
        setIntField(term18098, term18098.getClass(), "transferIndex", 0);
        setIntField(term18098, term18098.getClass(), "cellsBusy", 0);
        setField(term18098, term18098.getClass(), "counterCells", null);
        setField(term18098, term18098.getClass(), "keySet", null);
        setField(term18098, term18098.getClass(), "values", null);
        setField(term18098, term18098.getClass(), "entrySet", null);
        setField(term18098, term18098.getClass(), "keySet", null);
        setField(term18098, term18098.getClass(), "values", null);
        setField(term18097, term18097.getClass(), "_map", term18098);
        setIntField(term18097, term18097.getClass(), "_jdkSerializeMaxEntries", 0);
        setField(term18096, term18096.getClass(), "_typeCache", term18097);
        setField(term18096, term18096.getClass(), "_modifiers", null);
        setField(term18099, term18099.getClass(), "_factory", term18096);
        setField(term18096, term18096.getClass(), "_parser", term18099);
        setField(term18096, term18096.getClass(), "_classLoader", null);
        term18100 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        setField(term18100, term18100.getClass(), "_factory", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.util.LRUMap");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.type.TypeParser");
        argTypes[2] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeModifier"), 0).getClass();
        argTypes[3] = Class.forName("java.lang.ClassLoader");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term17680;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term18096));
        assertTrue(recursiveEquals(term17680, null));
    }

};


