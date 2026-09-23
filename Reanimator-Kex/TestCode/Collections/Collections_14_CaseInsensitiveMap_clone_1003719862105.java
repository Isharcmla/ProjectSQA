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

public class CaseInsensitiveMap_clone_1003719862105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18571;
     Object term18598;
     Object term18592;

    public CaseInsensitiveMap_clone_1003719862105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18571 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        Object[] term18425 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        setField(term18571, term18571.getClass(), "data", term18425);
        term18598 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        Object[] term18599 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        setFloatField(term18598, term18598.getClass(), "loadFactor", 0.0F);
        setIntField(term18598, term18598.getClass(), "size", 0);
        setField(term18598, term18598.getClass(), "data", term18599);
        setIntField(term18598, term18598.getClass(), "threshold", 0);
        setIntField(term18598, term18598.getClass(), "modCount", 0);
        setField(term18598, term18598.getClass(), "entrySet", null);
        setField(term18598, term18598.getClass(), "keySet", null);
        setField(term18598, term18598.getClass(), "values", null);
        setField(term18598, term18598.getClass(), "keySet", null);
        setField(term18598, term18598.getClass(), "values", null);
        term18592 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        Object[] term18595 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        setFloatField(term18592, term18592.getClass(), "loadFactor", 0.0F);
        setIntField(term18592, term18592.getClass(), "size", 0);
        setField(term18592, term18592.getClass(), "data", term18595);
        setIntField(term18592, term18592.getClass(), "threshold", 0);
        setIntField(term18592, term18592.getClass(), "modCount", 0);
        setField(term18592, term18592.getClass(), "entrySet", null);
        setField(term18592, term18592.getClass(), "keySet", null);
        setField(term18592, term18592.getClass(), "values", null);
        setField(term18592, term18592.getClass(), "keySet", null);
        setField(term18592, term18592.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "clone", argTypes, term18571, args);
        assertTrue(recursiveEquals(term18571, term18598));
        assertTrue(recursiveEquals(retValue, term18592));
    }

};


