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

public class CaseInsensitiveMap_init_50923775866 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12396;

    public CaseInsensitiveMap_init_50923775866() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term12193 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setFloatField(term12193, term12193.getClass(), "loadFactor", 0.0F);
        term12396 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        Object[] term12397 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 131072);
        setFloatField(term12396, term12396.getClass(), "loadFactor", 0.75F);
        setIntField(term12396, term12396.getClass(), "size", 0);
        setField(term12396, term12396.getClass(), "data", term12397);
        setIntField(term12396, term12396.getClass(), "threshold", 98304);
        setIntField(term12396, term12396.getClass(), "modCount", 0);
        setField(term12396, term12396.getClass(), "entrySet", null);
        setField(term12396, term12396.getClass(), "keySet", null);
        setField(term12396, term12396.getClass(), "values", null);
        setField(term12396, term12396.getClass(), "keySet", null);
        setField(term12396, term12396.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 131067;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term12396));
    }

};


