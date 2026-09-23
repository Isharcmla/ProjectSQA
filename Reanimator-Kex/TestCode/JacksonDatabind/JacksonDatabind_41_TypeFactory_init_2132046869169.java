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

public class TypeFactory_init_2132046869169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22843;
     Object term22937;
     Object term22941;

    public TypeFactory_init_2132046869169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term22893 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(term22893, term22893.getClass(), "_typeCache", null);
        term22843 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        setField(term22843, term22843.getClass(), "_factory", term22893);
        term22937 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        Object term22938 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.LRUMap"));
        Object term22939 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term22940 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        setIntField(term22938, term22938.getClass(), "_maxEntries", 100);
        setField(term22939, term22939.getClass(), "table", null);
        setField(term22939, term22939.getClass(), "nextTable", null);
        setLongField(term22939, term22939.getClass(), "baseCount", 0L);
        setIntField(term22939, term22939.getClass(), "sizeCtl", 32);
        setIntField(term22939, term22939.getClass(), "transferIndex", 0);
        setIntField(term22939, term22939.getClass(), "cellsBusy", 0);
        setField(term22939, term22939.getClass(), "counterCells", null);
        setField(term22939, term22939.getClass(), "keySet", null);
        setField(term22939, term22939.getClass(), "values", null);
        setField(term22939, term22939.getClass(), "entrySet", null);
        setField(term22939, term22939.getClass(), "keySet", null);
        setField(term22939, term22939.getClass(), "values", null);
        setField(term22938, term22938.getClass(), "_map", term22939);
        setIntField(term22938, term22938.getClass(), "_jdkSerializeMaxEntries", 0);
        setField(term22937, term22937.getClass(), "_typeCache", term22938);
        setField(term22937, term22937.getClass(), "_modifiers", null);
        setField(term22940, term22940.getClass(), "_factory", term22937);
        setField(term22937, term22937.getClass(), "_parser", term22940);
        setField(term22937, term22937.getClass(), "_classLoader", null);
        term22941 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        Object term22942 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(term22942, term22942.getClass(), "_typeCache", null);
        setField(term22942, term22942.getClass(), "_modifiers", null);
        setField(term22942, term22942.getClass(), "_parser", null);
        setField(term22942, term22942.getClass(), "_classLoader", null);
        setField(term22941, term22941.getClass(), "_factory", term22942);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.type.TypeParser");
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeModifier"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term22843;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term22937));
        assertTrue(recursiveEquals(term22843, term22941));
    }

};


