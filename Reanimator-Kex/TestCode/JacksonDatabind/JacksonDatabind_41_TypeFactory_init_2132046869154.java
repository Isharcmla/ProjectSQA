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

public class TypeFactory_init_2132046869154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18543;
     Object term21000;
     Object term21004;

    public TypeFactory_init_2132046869154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term18445 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(term18445, term18445.getClass(), "_typeCache", null);
        term18543 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        term21000 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        Object term21001 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.LRUMap"));
        Object term21002 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term21003 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        setIntField(term21001, term21001.getClass(), "_maxEntries", 100);
        setField(term21002, term21002.getClass(), "table", null);
        setField(term21002, term21002.getClass(), "nextTable", null);
        setLongField(term21002, term21002.getClass(), "baseCount", 0L);
        setIntField(term21002, term21002.getClass(), "sizeCtl", 32);
        setIntField(term21002, term21002.getClass(), "transferIndex", 0);
        setIntField(term21002, term21002.getClass(), "cellsBusy", 0);
        setField(term21002, term21002.getClass(), "counterCells", null);
        setField(term21002, term21002.getClass(), "keySet", null);
        setField(term21002, term21002.getClass(), "values", null);
        setField(term21002, term21002.getClass(), "entrySet", null);
        setField(term21002, term21002.getClass(), "keySet", null);
        setField(term21002, term21002.getClass(), "values", null);
        setField(term21001, term21001.getClass(), "_map", term21002);
        setIntField(term21001, term21001.getClass(), "_jdkSerializeMaxEntries", 0);
        setField(term21000, term21000.getClass(), "_typeCache", term21001);
        setField(term21000, term21000.getClass(), "_modifiers", null);
        setField(term21003, term21003.getClass(), "_factory", term21000);
        setField(term21000, term21000.getClass(), "_parser", term21003);
        setField(term21000, term21000.getClass(), "_classLoader", null);
        term21004 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        setField(term21004, term21004.getClass(), "_factory", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.type.TypeParser");
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeModifier"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term18543;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term21000));
        assertTrue(recursiveEquals(term18543, term21004));
    }

};


