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

public class CaseInsensitiveMap_init_50923775858 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11447;

    public CaseInsensitiveMap_init_50923775858() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term11200 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setFloatField(term11200, term11200.getClass(), "loadFactor", 0.0F);
        term11447 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        Object[] term11448 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 4194304);
        setFloatField(term11447, term11447.getClass(), "loadFactor", 0.75F);
        setIntField(term11447, term11447.getClass(), "size", 0);
        setField(term11447, term11447.getClass(), "data", term11448);
        setIntField(term11447, term11447.getClass(), "threshold", 3145728);
        setIntField(term11447, term11447.getClass(), "modCount", 0);
        setField(term11447, term11447.getClass(), "entrySet", null);
        setField(term11447, term11447.getClass(), "keySet", null);
        setField(term11447, term11447.getClass(), "values", null);
        setField(term11447, term11447.getClass(), "keySet", null);
        setField(term11447, term11447.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 4194303;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term11447));
    }

};


