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
import java.util.LinkedHashMap;
import java.lang.Object;

public class CaseInsensitiveMap_init_63898556211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7;
     Object term5053;
     Object term5055;

    public CaseInsensitiveMap_init_63898556211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7 = new LinkedHashMap();
        term5053 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        Object[] term5054 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        setFloatField(term5053, term5053.getClass(), "loadFactor", 0.75F);
        setIntField(term5053, term5053.getClass(), "size", 0);
        setField(term5053, term5053.getClass(), "data", term5054);
        setIntField(term5053, term5053.getClass(), "threshold", 12);
        setIntField(term5053, term5053.getClass(), "modCount", 0);
        setField(term5053, term5053.getClass(), "entrySet", null);
        setField(term5053, term5053.getClass(), "keySet", null);
        setField(term5053, term5053.getClass(), "values", null);
        setField(term5053, term5053.getClass(), "keySet", null);
        setField(term5053, term5053.getClass(), "values", null);
        term5055 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term7;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term5053));
        assertTrue(recursiveEquals(term7, term5055));
    }

};


