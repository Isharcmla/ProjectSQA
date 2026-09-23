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

public class TypeFactory_init_1133011088151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18801;
     Object term20442;
     Object term20446;

    public TypeFactory_init_1133011088151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term18851 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(term18851, term18851.getClass(), "_typeCache", null);
        term18801 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        setField(term18801, term18801.getClass(), "_factory", term18851);
        term20442 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        Object term20443 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.LRUMap"));
        Object term20444 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term20445 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        setIntField(term20443, term20443.getClass(), "_maxEntries", 100);
        setField(term20444, term20444.getClass(), "table", null);
        setField(term20444, term20444.getClass(), "nextTable", null);
        setLongField(term20444, term20444.getClass(), "baseCount", 0L);
        setIntField(term20444, term20444.getClass(), "sizeCtl", 32);
        setIntField(term20444, term20444.getClass(), "transferIndex", 0);
        setIntField(term20444, term20444.getClass(), "cellsBusy", 0);
        setField(term20444, term20444.getClass(), "counterCells", null);
        setField(term20444, term20444.getClass(), "keySet", null);
        setField(term20444, term20444.getClass(), "values", null);
        setField(term20444, term20444.getClass(), "entrySet", null);
        setField(term20444, term20444.getClass(), "keySet", null);
        setField(term20444, term20444.getClass(), "values", null);
        setField(term20443, term20443.getClass(), "_map", term20444);
        setIntField(term20443, term20443.getClass(), "_jdkSerializeMaxEntries", 0);
        setField(term20442, term20442.getClass(), "_typeCache", term20443);
        setField(term20442, term20442.getClass(), "_modifiers", null);
        setField(term20445, term20445.getClass(), "_factory", term20442);
        setField(term20442, term20442.getClass(), "_parser", term20445);
        setField(term20442, term20442.getClass(), "_classLoader", null);
        term20446 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        Object term20447 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(term20447, term20447.getClass(), "_typeCache", null);
        setField(term20447, term20447.getClass(), "_modifiers", null);
        setField(term20447, term20447.getClass(), "_parser", null);
        setField(term20447, term20447.getClass(), "_classLoader", null);
        setField(term20446, term20446.getClass(), "_factory", term20447);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.type.TypeParser");
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeModifier"), 0).getClass();
        argTypes[2] = Class.forName("java.lang.ClassLoader");
        Object[] args = new Object[3];
        args[0] = term18801;
        args[1] = null;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term20442));
        assertTrue(recursiveEquals(term18801, term20446));
    }

};


