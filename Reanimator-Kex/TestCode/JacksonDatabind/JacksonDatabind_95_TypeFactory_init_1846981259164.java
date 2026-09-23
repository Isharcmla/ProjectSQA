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

public class TypeFactory_init_1846981259164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19911;
     Object term20009;
     Object term22081;
     Object term22084;
     Object term22085;

    public TypeFactory_init_1846981259164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term19821 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(term19821, term19821.getClass(), "_typeCache", null);
        term19911 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.LRUMap"));
        term20009 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        term22081 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        Object term22082 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.LRUMap"));
        Object term22083 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        setIntField(term22082, term22082.getClass(), "_maxEntries", 0);
        setField(term22082, term22082.getClass(), "_map", null);
        setIntField(term22082, term22082.getClass(), "_jdkSerializeMaxEntries", 0);
        setField(term22081, term22081.getClass(), "_typeCache", term22082);
        setField(term22081, term22081.getClass(), "_modifiers", null);
        setField(term22083, term22083.getClass(), "_factory", term22081);
        setField(term22081, term22081.getClass(), "_parser", term22083);
        setField(term22081, term22081.getClass(), "_classLoader", null);
        term22084 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        setField(term22084, term22084.getClass(), "_factory", null);
        term22085 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.LRUMap"));
        setIntField(term22085, term22085.getClass(), "_maxEntries", 0);
        setField(term22085, term22085.getClass(), "_map", null);
        setIntField(term22085, term22085.getClass(), "_jdkSerializeMaxEntries", 0);
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
        args[0] = term19911;
        args[1] = term20009;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term22081));
        assertTrue(recursiveEquals(term19911, term22084));
        assertTrue(recursiveEquals(term20009, term22085));
    }

};


