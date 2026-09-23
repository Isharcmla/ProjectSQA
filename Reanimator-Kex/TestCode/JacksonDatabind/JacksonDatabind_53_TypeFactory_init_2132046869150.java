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

public class TypeFactory_init_2132046869150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17932;
     Object term20394;
     Object term20398;

    public TypeFactory_init_2132046869150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term17834 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(term17834, term17834.getClass(), "_typeCache", null);
        term17932 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        term20394 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        Object term20395 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.LRUMap"));
        Object term20396 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term20397 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        setIntField(term20395, term20395.getClass(), "_maxEntries", 100);
        setField(term20396, term20396.getClass(), "table", null);
        setField(term20396, term20396.getClass(), "nextTable", null);
        setLongField(term20396, term20396.getClass(), "baseCount", 0L);
        setIntField(term20396, term20396.getClass(), "sizeCtl", 32);
        setIntField(term20396, term20396.getClass(), "transferIndex", 0);
        setIntField(term20396, term20396.getClass(), "cellsBusy", 0);
        setField(term20396, term20396.getClass(), "counterCells", null);
        setField(term20396, term20396.getClass(), "keySet", null);
        setField(term20396, term20396.getClass(), "values", null);
        setField(term20396, term20396.getClass(), "entrySet", null);
        setField(term20396, term20396.getClass(), "keySet", null);
        setField(term20396, term20396.getClass(), "values", null);
        setField(term20395, term20395.getClass(), "_map", term20396);
        setIntField(term20395, term20395.getClass(), "_jdkSerializeMaxEntries", 0);
        setField(term20394, term20394.getClass(), "_typeCache", term20395);
        setField(term20394, term20394.getClass(), "_modifiers", null);
        setField(term20397, term20397.getClass(), "_factory", term20394);
        setField(term20394, term20394.getClass(), "_parser", term20397);
        setField(term20394, term20394.getClass(), "_classLoader", null);
        term20398 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        setField(term20398, term20398.getClass(), "_factory", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.type.TypeParser");
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeModifier"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term17932;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term20394));
        assertTrue(recursiveEquals(term17932, term20398));
    }

};


