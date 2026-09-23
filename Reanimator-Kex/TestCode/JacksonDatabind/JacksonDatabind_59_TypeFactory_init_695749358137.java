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

public class TypeFactory_init_695749358137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16703;
     Object term17200;
     Object term17203;

    public TypeFactory_init_695749358137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term16613 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        term16703 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.LRUMap"));
        term17200 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        Object term17201 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.LRUMap"));
        Object term17202 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        setIntField(term17201, term17201.getClass(), "_maxEntries", 0);
        setField(term17201, term17201.getClass(), "_map", null);
        setIntField(term17201, term17201.getClass(), "_jdkSerializeMaxEntries", 0);
        setField(term17200, term17200.getClass(), "_typeCache", term17201);
        setField(term17200, term17200.getClass(), "_modifiers", null);
        setField(term17202, term17202.getClass(), "_factory", term17200);
        setField(term17200, term17200.getClass(), "_parser", term17202);
        setField(term17200, term17200.getClass(), "_classLoader", null);
        term17203 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.LRUMap"));
        setIntField(term17203, term17203.getClass(), "_maxEntries", 0);
        setField(term17203, term17203.getClass(), "_map", null);
        setIntField(term17203, term17203.getClass(), "_jdkSerializeMaxEntries", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.util.LRUMap");
        Object[] args = new Object[1];
        args[0] = term16703;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term17200));
        assertTrue(recursiveEquals(term16703, term17203));
    }

};


