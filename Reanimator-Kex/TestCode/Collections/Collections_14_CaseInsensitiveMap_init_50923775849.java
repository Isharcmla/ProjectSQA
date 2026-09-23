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

public class CaseInsensitiveMap_init_50923775849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10494;

    public CaseInsensitiveMap_init_50923775849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term9533 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setFloatField(term9533, term9533.getClass(), "loadFactor", 0.0F);
        term10494 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        Object[] term10495 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 2);
        setFloatField(term10494, term10494.getClass(), "loadFactor", 0.75F);
        setIntField(term10494, term10494.getClass(), "size", 0);
        setField(term10494, term10494.getClass(), "data", term10495);
        setIntField(term10494, term10494.getClass(), "threshold", 1);
        setIntField(term10494, term10494.getClass(), "modCount", 0);
        setField(term10494, term10494.getClass(), "entrySet", null);
        setField(term10494, term10494.getClass(), "keySet", null);
        setField(term10494, term10494.getClass(), "values", null);
        setField(term10494, term10494.getClass(), "keySet", null);
        setField(term10494, term10494.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 2;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term10494));
    }

};


