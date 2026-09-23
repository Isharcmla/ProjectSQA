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

public class CaseInsensitiveMap_init_50923775860 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11672;

    public CaseInsensitiveMap_init_50923775860() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term11406 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setFloatField(term11406, term11406.getClass(), "loadFactor", 0.0F);
        term11672 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        Object[] term11673 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16777216);
        setFloatField(term11672, term11672.getClass(), "loadFactor", 0.75F);
        setIntField(term11672, term11672.getClass(), "size", 0);
        setField(term11672, term11672.getClass(), "data", term11673);
        setIntField(term11672, term11672.getClass(), "threshold", 12582912);
        setIntField(term11672, term11672.getClass(), "modCount", 0);
        setField(term11672, term11672.getClass(), "entrySet", null);
        setField(term11672, term11672.getClass(), "keySet", null);
        setField(term11672, term11672.getClass(), "values", null);
        setField(term11672, term11672.getClass(), "keySet", null);
        setField(term11672, term11672.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 16777200;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term11672));
    }

};


