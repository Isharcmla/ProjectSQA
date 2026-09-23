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

public class TypeFactory_defaultInstance_211940341370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1386;

    public TypeFactory_defaultInstance_211940341370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1386 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        Object term1387 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.LRUMap"));
        Object term1389 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term1395 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        setIntField(term1387, term1387.getClass(), "_maxEntries", 100);
        setField(term1389, term1389.getClass(), "table", null);
        setField(term1389, term1389.getClass(), "nextTable", null);
        setLongField(term1389, term1389.getClass(), "baseCount", 0L);
        setIntField(term1389, term1389.getClass(), "sizeCtl", 32);
        setIntField(term1389, term1389.getClass(), "transferIndex", 0);
        setIntField(term1389, term1389.getClass(), "cellsBusy", 0);
        setField(term1389, term1389.getClass(), "counterCells", null);
        setField(term1389, term1389.getClass(), "keySet", null);
        setField(term1389, term1389.getClass(), "values", null);
        setField(term1389, term1389.getClass(), "entrySet", null);
        setField(term1389, term1389.getClass(), "keySet", null);
        setField(term1389, term1389.getClass(), "values", null);
        setField(term1387, term1387.getClass(), "_map", term1389);
        setIntField(term1387, term1387.getClass(), "_jdkSerializeMaxEntries", 0);
        setField(term1386, term1386.getClass(), "_typeCache", term1387);
        setField(term1386, term1386.getClass(), "_modifiers", null);
        setField(term1395, term1395.getClass(), "_factory", term1386);
        setField(term1386, term1386.getClass(), "_parser", term1395);
        setField(term1386, term1386.getClass(), "_classLoader", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "defaultInstance", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term1386));
    }

};


