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

public class TypeFactory_defaultInstance_211940341375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1304;

    public TypeFactory_defaultInstance_211940341375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1304 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeFactory"));
        Object term1305 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.LRUMap"));
        Object term1307 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term1313 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeParser"));
        setIntField(term1305, term1305.getClass(), "_maxEntries", 200);
        setField(term1307, term1307.getClass(), "table", null);
        setField(term1307, term1307.getClass(), "nextTable", null);
        setLongField(term1307, term1307.getClass(), "baseCount", 0L);
        setIntField(term1307, term1307.getClass(), "sizeCtl", 32);
        setIntField(term1307, term1307.getClass(), "transferIndex", 0);
        setIntField(term1307, term1307.getClass(), "cellsBusy", 0);
        setField(term1307, term1307.getClass(), "counterCells", null);
        setField(term1307, term1307.getClass(), "keySet", null);
        setField(term1307, term1307.getClass(), "values", null);
        setField(term1307, term1307.getClass(), "entrySet", null);
        setField(term1307, term1307.getClass(), "keySet", null);
        setField(term1307, term1307.getClass(), "values", null);
        setField(term1305, term1305.getClass(), "_map", term1307);
        setIntField(term1305, term1305.getClass(), "_jdkSerializeMaxEntries", 0);
        setField(term1304, term1304.getClass(), "_typeCache", term1305);
        setField(term1304, term1304.getClass(), "_modifiers", null);
        setField(term1313, term1313.getClass(), "_factory", term1304);
        setField(term1304, term1304.getClass(), "_parser", term1313);
        setField(term1304, term1304.getClass(), "_classLoader", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "defaultInstance", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term1304));
    }

};


