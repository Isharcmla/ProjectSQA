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

public class TypeFactory_init_1846981259183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24387;
     Object term24485;
     Object term24555;
     Object term24558;
     Object term24560;

    public TypeFactory_init_1846981259183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term24535 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(term24535, term24535.getClass(), "_typeCache", null);
        term24387 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.LRUMap"));
        term24485 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        setField(term24485, term24485.getClass(), "_factory", term24535);
        term24555 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        Object term24556 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.LRUMap"));
        Object term24557 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        setIntField(term24556, term24556.getClass(), "_maxEntries", 0);
        setField(term24556, term24556.getClass(), "_map", null);
        setIntField(term24556, term24556.getClass(), "_jdkSerializeMaxEntries", 0);
        setField(term24555, term24555.getClass(), "_typeCache", term24556);
        setField(term24555, term24555.getClass(), "_modifiers", null);
        setField(term24557, term24557.getClass(), "_factory", term24555);
        setField(term24555, term24555.getClass(), "_parser", term24557);
        setField(term24555, term24555.getClass(), "_classLoader", null);
        term24558 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        Object term24559 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(term24559, term24559.getClass(), "_typeCache", null);
        setField(term24559, term24559.getClass(), "_modifiers", null);
        setField(term24559, term24559.getClass(), "_parser", null);
        setField(term24559, term24559.getClass(), "_classLoader", null);
        setField(term24558, term24558.getClass(), "_factory", term24559);
        term24560 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.LRUMap"));
        setIntField(term24560, term24560.getClass(), "_maxEntries", 0);
        setField(term24560, term24560.getClass(), "_map", null);
        setIntField(term24560, term24560.getClass(), "_jdkSerializeMaxEntries", 0);
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
        args[0] = term24387;
        args[1] = term24485;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term24555));
        assertTrue(recursiveEquals(term24387, term24558));
        assertTrue(recursiveEquals(term24485, term24560));
    }

};


