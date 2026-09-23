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

public class TypeFactory_init_1846981259178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23655;
     Object term23753;
     Object term23965;
     Object term23968;
     Object term23970;

    public TypeFactory_init_1846981259178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term23803 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(term23803, term23803.getClass(), "_typeCache", null);
        term23655 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.LRUMap"));
        term23753 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        setField(term23753, term23753.getClass(), "_factory", term23803);
        term23965 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        Object term23966 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.LRUMap"));
        Object term23967 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        setIntField(term23966, term23966.getClass(), "_maxEntries", 0);
        setField(term23966, term23966.getClass(), "_map", null);
        setIntField(term23966, term23966.getClass(), "_jdkSerializeMaxEntries", 0);
        setField(term23965, term23965.getClass(), "_typeCache", term23966);
        setField(term23965, term23965.getClass(), "_modifiers", null);
        setField(term23967, term23967.getClass(), "_factory", term23965);
        setField(term23965, term23965.getClass(), "_parser", term23967);
        setField(term23965, term23965.getClass(), "_classLoader", null);
        term23968 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        Object term23969 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(term23969, term23969.getClass(), "_typeCache", null);
        setField(term23969, term23969.getClass(), "_modifiers", null);
        setField(term23969, term23969.getClass(), "_parser", null);
        setField(term23969, term23969.getClass(), "_classLoader", null);
        setField(term23968, term23968.getClass(), "_factory", term23969);
        term23970 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.LRUMap"));
        setIntField(term23970, term23970.getClass(), "_maxEntries", 0);
        setField(term23970, term23970.getClass(), "_map", null);
        setIntField(term23970, term23970.getClass(), "_jdkSerializeMaxEntries", 0);
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
        args[0] = term23655;
        args[1] = term23753;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term23965));
        assertTrue(recursiveEquals(term23655, term23968));
        assertTrue(recursiveEquals(term23753, term23970));
    }

};


