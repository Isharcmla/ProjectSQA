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

public class TypeFactory_init_1846981259161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19760;
     Object term21643;
     Object term21647;

    public TypeFactory_init_1846981259161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term19810 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(term19810, term19810.getClass(), "_typeCache", null);
        term19760 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        setField(term19760, term19760.getClass(), "_factory", term19810);
        term21643 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        Object term21644 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.LRUMap"));
        Object term21645 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term21646 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        setIntField(term21644, term21644.getClass(), "_maxEntries", 200);
        setField(term21645, term21645.getClass(), "table", null);
        setField(term21645, term21645.getClass(), "nextTable", null);
        setLongField(term21645, term21645.getClass(), "baseCount", 0L);
        setIntField(term21645, term21645.getClass(), "sizeCtl", 32);
        setIntField(term21645, term21645.getClass(), "transferIndex", 0);
        setIntField(term21645, term21645.getClass(), "cellsBusy", 0);
        setField(term21645, term21645.getClass(), "counterCells", null);
        setField(term21645, term21645.getClass(), "keySet", null);
        setField(term21645, term21645.getClass(), "values", null);
        setField(term21645, term21645.getClass(), "entrySet", null);
        setField(term21645, term21645.getClass(), "keySet", null);
        setField(term21645, term21645.getClass(), "values", null);
        setField(term21644, term21644.getClass(), "_map", term21645);
        setIntField(term21644, term21644.getClass(), "_jdkSerializeMaxEntries", 0);
        setField(term21643, term21643.getClass(), "_typeCache", term21644);
        setField(term21643, term21643.getClass(), "_modifiers", null);
        setField(term21646, term21646.getClass(), "_factory", term21643);
        setField(term21643, term21643.getClass(), "_parser", term21646);
        setField(term21643, term21643.getClass(), "_classLoader", null);
        term21647 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        Object term21648 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(term21648, term21648.getClass(), "_typeCache", null);
        setField(term21648, term21648.getClass(), "_modifiers", null);
        setField(term21648, term21648.getClass(), "_parser", null);
        setField(term21648, term21648.getClass(), "_classLoader", null);
        setField(term21647, term21647.getClass(), "_factory", term21648);
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
        args[1] = term19760;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term21643));
        assertTrue(recursiveEquals(term19760, null));
    }

};


