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

public class TypeFactory_init_213204686957 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term118;
     Object term122;

    public TypeFactory_init_213204686957() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = (Object[]) newArray("com.fasterxml.jackson.databind.type.TypeModifier", 5);
        term118 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        Object term119 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.LRUMap"));
        Object term120 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object[] term121 = (Object[]) newArray("com.fasterxml.jackson.databind.type.TypeModifier", 5);
        setIntField(term119, term119.getClass(), "_maxEntries", 100);
        setField(term120, term120.getClass(), "table", null);
        setField(term120, term120.getClass(), "nextTable", null);
        setLongField(term120, term120.getClass(), "baseCount", 0L);
        setIntField(term120, term120.getClass(), "sizeCtl", 32);
        setIntField(term120, term120.getClass(), "transferIndex", 0);
        setIntField(term120, term120.getClass(), "cellsBusy", 0);
        setField(term120, term120.getClass(), "counterCells", null);
        setField(term120, term120.getClass(), "keySet", null);
        setField(term120, term120.getClass(), "values", null);
        setField(term120, term120.getClass(), "entrySet", null);
        setField(term120, term120.getClass(), "keySet", null);
        setField(term120, term120.getClass(), "values", null);
        setField(term119, term119.getClass(), "_map", term120);
        setIntField(term119, term119.getClass(), "_jdkSerializeMaxEntries", 0);
        setField(term118, term118.getClass(), "_typeCache", term119);
        setField(term118, term118.getClass(), "_cachedHashMapType", null);
        setField(term118, term118.getClass(), "_cachedArrayListType", null);
        setField(term118, term118.getClass(), "_modifiers", term121);
        setField(term118, term118.getClass(), "_parser", null);
        term122 = (Object[]) newArray("com.fasterxml.jackson.databind.type.TypeModifier", 5);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.type.TypeParser");
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeModifier"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term118));
        assertTrue(recursiveEquals(term1, term122));
    }

};


