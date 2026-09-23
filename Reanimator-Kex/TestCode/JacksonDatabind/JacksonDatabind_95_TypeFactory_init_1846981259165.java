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

public class TypeFactory_init_1846981259165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20295;
     Object term22154;
     Object term22158;

    public TypeFactory_init_1846981259165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term20345 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(term20345, term20345.getClass(), "_typeCache", null);
        term20295 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        setField(term20295, term20295.getClass(), "_factory", term20345);
        term22154 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        Object term22155 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.LRUMap"));
        Object term22156 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term22157 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        setIntField(term22155, term22155.getClass(), "_maxEntries", 200);
        setField(term22156, term22156.getClass(), "table", null);
        setField(term22156, term22156.getClass(), "nextTable", null);
        setLongField(term22156, term22156.getClass(), "baseCount", 0L);
        setIntField(term22156, term22156.getClass(), "sizeCtl", 32);
        setIntField(term22156, term22156.getClass(), "transferIndex", 0);
        setIntField(term22156, term22156.getClass(), "cellsBusy", 0);
        setField(term22156, term22156.getClass(), "counterCells", null);
        setField(term22156, term22156.getClass(), "keySet", null);
        setField(term22156, term22156.getClass(), "values", null);
        setField(term22156, term22156.getClass(), "entrySet", null);
        setField(term22156, term22156.getClass(), "keySet", null);
        setField(term22156, term22156.getClass(), "values", null);
        setField(term22155, term22155.getClass(), "_map", term22156);
        setIntField(term22155, term22155.getClass(), "_jdkSerializeMaxEntries", 0);
        setField(term22154, term22154.getClass(), "_typeCache", term22155);
        setField(term22154, term22154.getClass(), "_modifiers", null);
        setField(term22157, term22157.getClass(), "_factory", term22154);
        setField(term22154, term22154.getClass(), "_parser", term22157);
        setField(term22154, term22154.getClass(), "_classLoader", null);
        term22158 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        Object term22159 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(term22159, term22159.getClass(), "_typeCache", null);
        setField(term22159, term22159.getClass(), "_modifiers", null);
        setField(term22159, term22159.getClass(), "_parser", null);
        setField(term22159, term22159.getClass(), "_classLoader", null);
        setField(term22158, term22158.getClass(), "_factory", term22159);
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
        args[1] = term20295;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term22154));
        assertTrue(recursiveEquals(term20295, null));
    }

};


