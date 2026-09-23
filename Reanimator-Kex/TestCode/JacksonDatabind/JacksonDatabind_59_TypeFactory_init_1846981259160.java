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

public class TypeFactory_init_1846981259160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19376;
     Object term19474;
     Object term21594;
     Object term21597;
     Object term21598;

    public TypeFactory_init_1846981259160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term19286 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(term19286, term19286.getClass(), "_typeCache", null);
        term19376 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.LRUMap"));
        term19474 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        term21594 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        Object term21595 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.LRUMap"));
        Object term21596 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        setIntField(term21595, term21595.getClass(), "_maxEntries", 0);
        setField(term21595, term21595.getClass(), "_map", null);
        setIntField(term21595, term21595.getClass(), "_jdkSerializeMaxEntries", 0);
        setField(term21594, term21594.getClass(), "_typeCache", term21595);
        setField(term21594, term21594.getClass(), "_modifiers", null);
        setField(term21596, term21596.getClass(), "_factory", term21594);
        setField(term21594, term21594.getClass(), "_parser", term21596);
        setField(term21594, term21594.getClass(), "_classLoader", null);
        term21597 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        setField(term21597, term21597.getClass(), "_factory", null);
        term21598 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.LRUMap"));
        setIntField(term21598, term21598.getClass(), "_maxEntries", 0);
        setField(term21598, term21598.getClass(), "_map", null);
        setIntField(term21598, term21598.getClass(), "_jdkSerializeMaxEntries", 0);
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
        args[0] = term19376;
        args[1] = term19474;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term21594));
        assertTrue(recursiveEquals(term19376, term21597));
        assertTrue(recursiveEquals(term19474, term21598));
    }

};


