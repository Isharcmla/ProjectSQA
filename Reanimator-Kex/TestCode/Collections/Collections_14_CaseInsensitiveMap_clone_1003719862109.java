package org.apache.commons.collections.map;

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
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.map.EqualityUtils.*;
import java.lang.Object;

public class CaseInsensitiveMap_clone_1003719862109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19158;
     Object term19458;
     Object term19452;

    public CaseInsensitiveMap_clone_1003719862109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19158 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        Object[] term19013 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        setField(term19158, term19158.getClass(), "data", term19013);
        term19458 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        Object[] term19459 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        setFloatField(term19458, term19458.getClass(), "loadFactor", 0.0F);
        setIntField(term19458, term19458.getClass(), "size", 0);
        setField(term19458, term19458.getClass(), "data", term19459);
        setIntField(term19458, term19458.getClass(), "threshold", 0);
        setIntField(term19458, term19458.getClass(), "modCount", 0);
        setField(term19458, term19458.getClass(), "entrySet", null);
        setField(term19458, term19458.getClass(), "keySet", null);
        setField(term19458, term19458.getClass(), "values", null);
        setField(term19458, term19458.getClass(), "keySet", null);
        setField(term19458, term19458.getClass(), "values", null);
        term19452 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        Object[] term19455 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        setFloatField(term19452, term19452.getClass(), "loadFactor", 0.0F);
        setIntField(term19452, term19452.getClass(), "size", 0);
        setField(term19452, term19452.getClass(), "data", term19455);
        setIntField(term19452, term19452.getClass(), "threshold", 0);
        setIntField(term19452, term19452.getClass(), "modCount", 0);
        setField(term19452, term19452.getClass(), "entrySet", null);
        setField(term19452, term19452.getClass(), "keySet", null);
        setField(term19452, term19452.getClass(), "values", null);
        setField(term19452, term19452.getClass(), "keySet", null);
        setField(term19452, term19452.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "clone", argTypes, term19158, args);
        assertTrue(recursiveEquals(term19158, term19458));
        assertTrue(recursiveEquals(retValue, term19452));
    }

};


