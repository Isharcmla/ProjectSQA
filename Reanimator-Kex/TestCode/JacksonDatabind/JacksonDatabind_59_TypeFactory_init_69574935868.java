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

public class TypeFactory_init_69574935868 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195;

    public TypeFactory_init_69574935868() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term195 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        Object term196 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.LRUMap"));
        Object term197 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term198 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        setIntField(term196, term196.getClass(), "_maxEntries", 200);
        setField(term197, term197.getClass(), "table", null);
        setField(term197, term197.getClass(), "nextTable", null);
        setLongField(term197, term197.getClass(), "baseCount", 0L);
        setIntField(term197, term197.getClass(), "sizeCtl", 32);
        setIntField(term197, term197.getClass(), "transferIndex", 0);
        setIntField(term197, term197.getClass(), "cellsBusy", 0);
        setField(term197, term197.getClass(), "counterCells", null);
        setField(term197, term197.getClass(), "keySet", null);
        setField(term197, term197.getClass(), "values", null);
        setField(term197, term197.getClass(), "entrySet", null);
        setField(term197, term197.getClass(), "keySet", null);
        setField(term197, term197.getClass(), "values", null);
        setField(term196, term196.getClass(), "_map", term197);
        setIntField(term196, term196.getClass(), "_jdkSerializeMaxEntries", 0);
        setField(term195, term195.getClass(), "_typeCache", term196);
        setField(term195, term195.getClass(), "_modifiers", null);
        setField(term198, term198.getClass(), "_factory", term195);
        setField(term195, term195.getClass(), "_parser", term198);
        setField(term195, term195.getClass(), "_classLoader", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.util.LRUMap");
        Object[] args = new Object[1];
        args[0] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term195));
    }

};


