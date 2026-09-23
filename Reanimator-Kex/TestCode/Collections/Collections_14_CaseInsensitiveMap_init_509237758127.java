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

public class CaseInsensitiveMap_init_509237758127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22755;

    public CaseInsensitiveMap_init_509237758127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term22729 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setFloatField(term22729, term22729.getClass(), "loadFactor", 0.0F);
        term22755 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        Object[] term22756 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 128);
        setFloatField(term22755, term22755.getClass(), "loadFactor", 0.75F);
        setIntField(term22755, term22755.getClass(), "size", 0);
        setField(term22755, term22755.getClass(), "data", term22756);
        setIntField(term22755, term22755.getClass(), "threshold", 96);
        setIntField(term22755, term22755.getClass(), "modCount", 0);
        setField(term22755, term22755.getClass(), "entrySet", null);
        setField(term22755, term22755.getClass(), "keySet", null);
        setField(term22755, term22755.getClass(), "values", null);
        setField(term22755, term22755.getClass(), "keySet", null);
        setField(term22755, term22755.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 126;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term22755));
    }

};


