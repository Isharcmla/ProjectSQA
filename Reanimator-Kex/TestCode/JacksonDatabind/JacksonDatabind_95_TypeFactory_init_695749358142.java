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

public class TypeFactory_init_695749358142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17395;
     Object term18049;
     Object term18052;

    public TypeFactory_init_695749358142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term17305 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        term17395 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.LRUMap"));
        term18049 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        Object term18050 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.LRUMap"));
        Object term18051 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        setIntField(term18050, term18050.getClass(), "_maxEntries", 0);
        setField(term18050, term18050.getClass(), "_map", null);
        setIntField(term18050, term18050.getClass(), "_jdkSerializeMaxEntries", 0);
        setField(term18049, term18049.getClass(), "_typeCache", term18050);
        setField(term18049, term18049.getClass(), "_modifiers", null);
        setField(term18051, term18051.getClass(), "_factory", term18049);
        setField(term18049, term18049.getClass(), "_parser", term18051);
        setField(term18049, term18049.getClass(), "_classLoader", null);
        term18052 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.LRUMap"));
        setIntField(term18052, term18052.getClass(), "_maxEntries", 0);
        setField(term18052, term18052.getClass(), "_map", null);
        setIntField(term18052, term18052.getClass(), "_jdkSerializeMaxEntries", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.util.LRUMap");
        Object[] args = new Object[1];
        args[0] = term17395;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term18049));
        assertTrue(recursiveEquals(term17395, term18052));
    }

};


