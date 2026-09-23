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

public class TypeFactory_init_1133011088156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18960;
     Object term21089;
     Object term21093;

    public TypeFactory_init_1133011088156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term19010 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(term19010, term19010.getClass(), "_typeCache", null);
        term18960 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        setField(term18960, term18960.getClass(), "_factory", term19010);
        term21089 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        Object term21090 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.LRUMap"));
        Object term21091 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term21092 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        setIntField(term21090, term21090.getClass(), "_maxEntries", 100);
        setField(term21091, term21091.getClass(), "table", null);
        setField(term21091, term21091.getClass(), "nextTable", null);
        setLongField(term21091, term21091.getClass(), "baseCount", 0L);
        setIntField(term21091, term21091.getClass(), "sizeCtl", 32);
        setIntField(term21091, term21091.getClass(), "transferIndex", 0);
        setIntField(term21091, term21091.getClass(), "cellsBusy", 0);
        setField(term21091, term21091.getClass(), "counterCells", null);
        setField(term21091, term21091.getClass(), "keySet", null);
        setField(term21091, term21091.getClass(), "values", null);
        setField(term21091, term21091.getClass(), "entrySet", null);
        setField(term21091, term21091.getClass(), "keySet", null);
        setField(term21091, term21091.getClass(), "values", null);
        setField(term21090, term21090.getClass(), "_map", term21091);
        setIntField(term21090, term21090.getClass(), "_jdkSerializeMaxEntries", 0);
        setField(term21089, term21089.getClass(), "_typeCache", term21090);
        setField(term21089, term21089.getClass(), "_modifiers", null);
        setField(term21092, term21092.getClass(), "_factory", term21089);
        setField(term21089, term21089.getClass(), "_parser", term21092);
        setField(term21089, term21089.getClass(), "_classLoader", null);
        term21093 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        Object term21094 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(term21094, term21094.getClass(), "_typeCache", null);
        setField(term21094, term21094.getClass(), "_modifiers", null);
        setField(term21094, term21094.getClass(), "_parser", null);
        setField(term21094, term21094.getClass(), "_classLoader", null);
        setField(term21093, term21093.getClass(), "_factory", term21094);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.type.TypeParser");
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeModifier"), 0).getClass();
        argTypes[2] = Class.forName("java.lang.ClassLoader");
        Object[] args = new Object[3];
        args[0] = term18960;
        args[1] = null;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term21089));
        assertTrue(recursiveEquals(term18960, term21093));
    }

};


