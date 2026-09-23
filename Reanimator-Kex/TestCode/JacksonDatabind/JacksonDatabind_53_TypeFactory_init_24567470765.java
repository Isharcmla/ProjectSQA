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

public class TypeFactory_init_24567470765 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158;

    public TypeFactory_init_24567470765() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term158 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        Object term159 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.LRUMap"));
        Object term160 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term161 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        setIntField(term159, term159.getClass(), "_maxEntries", 100);
        setField(term160, term160.getClass(), "table", null);
        setField(term160, term160.getClass(), "nextTable", null);
        setLongField(term160, term160.getClass(), "baseCount", 0L);
        setIntField(term160, term160.getClass(), "sizeCtl", 32);
        setIntField(term160, term160.getClass(), "transferIndex", 0);
        setIntField(term160, term160.getClass(), "cellsBusy", 0);
        setField(term160, term160.getClass(), "counterCells", null);
        setField(term160, term160.getClass(), "keySet", null);
        setField(term160, term160.getClass(), "values", null);
        setField(term160, term160.getClass(), "entrySet", null);
        setField(term160, term160.getClass(), "keySet", null);
        setField(term160, term160.getClass(), "values", null);
        setField(term159, term159.getClass(), "_map", term160);
        setIntField(term159, term159.getClass(), "_jdkSerializeMaxEntries", 0);
        setField(term158, term158.getClass(), "_typeCache", term159);
        setField(term158, term158.getClass(), "_modifiers", null);
        setField(term161, term161.getClass(), "_factory", term158);
        setField(term158, term158.getClass(), "_parser", term161);
        setField(term158, term158.getClass(), "_classLoader", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term158));
    }

};


