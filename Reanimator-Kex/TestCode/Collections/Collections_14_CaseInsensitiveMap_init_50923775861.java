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

public class CaseInsensitiveMap_init_50923775861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11708;

    public CaseInsensitiveMap_init_50923775861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term11629 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setFloatField(term11629, term11629.getClass(), "loadFactor", 0.0F);
        term11708 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        Object[] term11709 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 65536);
        setFloatField(term11708, term11708.getClass(), "loadFactor", 0.75F);
        setIntField(term11708, term11708.getClass(), "size", 0);
        setField(term11708, term11708.getClass(), "data", term11709);
        setIntField(term11708, term11708.getClass(), "threshold", 49152);
        setIntField(term11708, term11708.getClass(), "modCount", 0);
        setField(term11708, term11708.getClass(), "entrySet", null);
        setField(term11708, term11708.getClass(), "keySet", null);
        setField(term11708, term11708.getClass(), "values", null);
        setField(term11708, term11708.getClass(), "keySet", null);
        setField(term11708, term11708.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 65536;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term11708));
    }

};


