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

public class TypeFactory_init_1133011088131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16622;
     Object term16665;
     Object term16669;

    public TypeFactory_init_1133011088131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term16524 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(term16524, term16524.getClass(), "_typeCache", null);
        term16622 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        term16665 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        Object term16666 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.LRUMap"));
        Object term16667 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term16668 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        setIntField(term16666, term16666.getClass(), "_maxEntries", 100);
        setField(term16667, term16667.getClass(), "table", null);
        setField(term16667, term16667.getClass(), "nextTable", null);
        setLongField(term16667, term16667.getClass(), "baseCount", 0L);
        setIntField(term16667, term16667.getClass(), "sizeCtl", 32);
        setIntField(term16667, term16667.getClass(), "transferIndex", 0);
        setIntField(term16667, term16667.getClass(), "cellsBusy", 0);
        setField(term16667, term16667.getClass(), "counterCells", null);
        setField(term16667, term16667.getClass(), "keySet", null);
        setField(term16667, term16667.getClass(), "values", null);
        setField(term16667, term16667.getClass(), "entrySet", null);
        setField(term16667, term16667.getClass(), "keySet", null);
        setField(term16667, term16667.getClass(), "values", null);
        setField(term16666, term16666.getClass(), "_map", term16667);
        setIntField(term16666, term16666.getClass(), "_jdkSerializeMaxEntries", 0);
        setField(term16665, term16665.getClass(), "_typeCache", term16666);
        setField(term16665, term16665.getClass(), "_modifiers", null);
        setField(term16668, term16668.getClass(), "_factory", term16665);
        setField(term16665, term16665.getClass(), "_parser", term16668);
        setField(term16665, term16665.getClass(), "_classLoader", null);
        term16669 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        setField(term16669, term16669.getClass(), "_factory", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.type.TypeParser");
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeModifier"), 0).getClass();
        argTypes[2] = Class.forName("java.lang.ClassLoader");
        Object[] args = new Object[3];
        args[0] = term16622;
        args[1] = null;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term16665));
        assertTrue(recursiveEquals(term16622, term16669));
    }

};


