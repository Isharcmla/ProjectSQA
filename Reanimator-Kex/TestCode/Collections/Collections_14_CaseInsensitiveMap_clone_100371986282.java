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

public class CaseInsensitiveMap_clone_100371986282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14340;
     Object term14803;
     Object term14797;

    public CaseInsensitiveMap_clone_100371986282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14340 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        Object[] term14194 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        setField(term14340, term14340.getClass(), "data", term14194);
        term14803 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        Object[] term14804 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        setFloatField(term14803, term14803.getClass(), "loadFactor", 0.0F);
        setIntField(term14803, term14803.getClass(), "size", 0);
        setField(term14803, term14803.getClass(), "data", term14804);
        setIntField(term14803, term14803.getClass(), "threshold", 0);
        setIntField(term14803, term14803.getClass(), "modCount", 0);
        setField(term14803, term14803.getClass(), "entrySet", null);
        setField(term14803, term14803.getClass(), "keySet", null);
        setField(term14803, term14803.getClass(), "values", null);
        setField(term14803, term14803.getClass(), "keySet", null);
        setField(term14803, term14803.getClass(), "values", null);
        term14797 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        Object[] term14800 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        setFloatField(term14797, term14797.getClass(), "loadFactor", 0.0F);
        setIntField(term14797, term14797.getClass(), "size", 0);
        setField(term14797, term14797.getClass(), "data", term14800);
        setIntField(term14797, term14797.getClass(), "threshold", 0);
        setIntField(term14797, term14797.getClass(), "modCount", 0);
        setField(term14797, term14797.getClass(), "entrySet", null);
        setField(term14797, term14797.getClass(), "keySet", null);
        setField(term14797, term14797.getClass(), "values", null);
        setField(term14797, term14797.getClass(), "keySet", null);
        setField(term14797, term14797.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "clone", argTypes, term14340, args);
        assertTrue(recursiveEquals(term14340, term14803));
        assertTrue(recursiveEquals(retValue, term14797));
    }

};


