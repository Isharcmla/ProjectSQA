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

public class TypeFactory_init_1846981259140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17188;
     Object term17609;
     Object term17613;

    public TypeFactory_init_1846981259140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term17090 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(term17090, term17090.getClass(), "_typeCache", null);
        term17188 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        term17609 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        Object term17610 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.LRUMap"));
        Object term17611 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term17612 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        setIntField(term17610, term17610.getClass(), "_maxEntries", 200);
        setField(term17611, term17611.getClass(), "table", null);
        setField(term17611, term17611.getClass(), "nextTable", null);
        setLongField(term17611, term17611.getClass(), "baseCount", 0L);
        setIntField(term17611, term17611.getClass(), "sizeCtl", 32);
        setIntField(term17611, term17611.getClass(), "transferIndex", 0);
        setIntField(term17611, term17611.getClass(), "cellsBusy", 0);
        setField(term17611, term17611.getClass(), "counterCells", null);
        setField(term17611, term17611.getClass(), "keySet", null);
        setField(term17611, term17611.getClass(), "values", null);
        setField(term17611, term17611.getClass(), "entrySet", null);
        setField(term17611, term17611.getClass(), "keySet", null);
        setField(term17611, term17611.getClass(), "values", null);
        setField(term17610, term17610.getClass(), "_map", term17611);
        setIntField(term17610, term17610.getClass(), "_jdkSerializeMaxEntries", 0);
        setField(term17609, term17609.getClass(), "_typeCache", term17610);
        setField(term17609, term17609.getClass(), "_modifiers", null);
        setField(term17612, term17612.getClass(), "_factory", term17609);
        setField(term17609, term17609.getClass(), "_parser", term17612);
        setField(term17609, term17609.getClass(), "_classLoader", null);
        term17613 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        setField(term17613, term17613.getClass(), "_factory", null);
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
        args[1] = term17188;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term17609));
        assertTrue(recursiveEquals(term17188, null));
    }

};


