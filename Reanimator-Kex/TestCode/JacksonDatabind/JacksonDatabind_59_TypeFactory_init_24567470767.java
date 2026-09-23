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

public class TypeFactory_init_24567470767 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160;

    public TypeFactory_init_24567470767() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term160 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        Object term161 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.LRUMap"));
        Object term162 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term163 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        setIntField(term161, term161.getClass(), "_maxEntries", 200);
        setField(term162, term162.getClass(), "table", null);
        setField(term162, term162.getClass(), "nextTable", null);
        setLongField(term162, term162.getClass(), "baseCount", 0L);
        setIntField(term162, term162.getClass(), "sizeCtl", 32);
        setIntField(term162, term162.getClass(), "transferIndex", 0);
        setIntField(term162, term162.getClass(), "cellsBusy", 0);
        setField(term162, term162.getClass(), "counterCells", null);
        setField(term162, term162.getClass(), "keySet", null);
        setField(term162, term162.getClass(), "values", null);
        setField(term162, term162.getClass(), "entrySet", null);
        setField(term162, term162.getClass(), "keySet", null);
        setField(term162, term162.getClass(), "values", null);
        setField(term161, term161.getClass(), "_map", term162);
        setIntField(term161, term161.getClass(), "_jdkSerializeMaxEntries", 0);
        setField(term160, term160.getClass(), "_typeCache", term161);
        setField(term160, term160.getClass(), "_modifiers", null);
        setField(term163, term163.getClass(), "_factory", term160);
        setField(term160, term160.getClass(), "_parser", term163);
        setField(term160, term160.getClass(), "_classLoader", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term160));
    }

};


