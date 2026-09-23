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

public class TypeFactory_defaultInstance_211940341359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369;

    public TypeFactory_defaultInstance_211940341359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term369 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        Object term370 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.LRUMap"));
        Object term372 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term378 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        setIntField(term370, term370.getClass(), "_maxEntries", 100);
        setField(term372, term372.getClass(), "table", null);
        setField(term372, term372.getClass(), "nextTable", null);
        setLongField(term372, term372.getClass(), "baseCount", 0L);
        setIntField(term372, term372.getClass(), "sizeCtl", 32);
        setIntField(term372, term372.getClass(), "transferIndex", 0);
        setIntField(term372, term372.getClass(), "cellsBusy", 0);
        setField(term372, term372.getClass(), "counterCells", null);
        setField(term372, term372.getClass(), "keySet", null);
        setField(term372, term372.getClass(), "values", null);
        setField(term372, term372.getClass(), "entrySet", null);
        setField(term372, term372.getClass(), "keySet", null);
        setField(term372, term372.getClass(), "values", null);
        setField(term370, term370.getClass(), "_map", term372);
        setIntField(term370, term370.getClass(), "_jdkSerializeMaxEntries", 0);
        setField(term369, term369.getClass(), "_typeCache", term370);
        setField(term369, term369.getClass(), "_cachedHashMapType", null);
        setField(term369, term369.getClass(), "_cachedArrayListType", null);
        setField(term369, term369.getClass(), "_modifiers", null);
        setField(term378, term378.getClass(), "_factory", term369);
        setField(term369, term369.getClass(), "_parser", term378);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "defaultInstance", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term369));
    }

};


