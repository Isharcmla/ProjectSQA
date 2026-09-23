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

public class TypeFactory_init_2132046869165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22444;
     Object term22579;
     Object term22583;

    public TypeFactory_init_2132046869165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term22494 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(term22494, term22494.getClass(), "_typeCache", null);
        term22444 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        setField(term22444, term22444.getClass(), "_factory", term22494);
        term22579 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        Object term22580 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.LRUMap"));
        Object term22581 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term22582 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        setIntField(term22580, term22580.getClass(), "_maxEntries", 100);
        setField(term22581, term22581.getClass(), "table", null);
        setField(term22581, term22581.getClass(), "nextTable", null);
        setLongField(term22581, term22581.getClass(), "baseCount", 0L);
        setIntField(term22581, term22581.getClass(), "sizeCtl", 32);
        setIntField(term22581, term22581.getClass(), "transferIndex", 0);
        setIntField(term22581, term22581.getClass(), "cellsBusy", 0);
        setField(term22581, term22581.getClass(), "counterCells", null);
        setField(term22581, term22581.getClass(), "keySet", null);
        setField(term22581, term22581.getClass(), "values", null);
        setField(term22581, term22581.getClass(), "entrySet", null);
        setField(term22581, term22581.getClass(), "keySet", null);
        setField(term22581, term22581.getClass(), "values", null);
        setField(term22580, term22580.getClass(), "_map", term22581);
        setIntField(term22580, term22580.getClass(), "_jdkSerializeMaxEntries", 0);
        setField(term22579, term22579.getClass(), "_typeCache", term22580);
        setField(term22579, term22579.getClass(), "_modifiers", null);
        setField(term22582, term22582.getClass(), "_factory", term22579);
        setField(term22579, term22579.getClass(), "_parser", term22582);
        setField(term22579, term22579.getClass(), "_classLoader", null);
        term22583 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        Object term22584 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(term22584, term22584.getClass(), "_typeCache", null);
        setField(term22584, term22584.getClass(), "_modifiers", null);
        setField(term22584, term22584.getClass(), "_parser", null);
        setField(term22584, term22584.getClass(), "_classLoader", null);
        setField(term22583, term22583.getClass(), "_factory", term22584);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.type.TypeParser");
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeModifier"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term22444;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term22579));
        assertTrue(recursiveEquals(term22444, term22583));
    }

};


