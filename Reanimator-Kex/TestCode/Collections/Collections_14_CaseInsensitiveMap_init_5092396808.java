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

public class CaseInsensitiveMap_init_5092396808 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4212;

    public CaseInsensitiveMap_init_5092396808() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4212 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        Object[] term4213 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        setFloatField(term4212, term4212.getClass(), "loadFactor", 0.75F);
        setIntField(term4212, term4212.getClass(), "size", 0);
        setField(term4212, term4212.getClass(), "data", term4213);
        setIntField(term4212, term4212.getClass(), "threshold", 12);
        setIntField(term4212, term4212.getClass(), "modCount", 0);
        setField(term4212, term4212.getClass(), "entrySet", null);
        setField(term4212, term4212.getClass(), "keySet", null);
        setField(term4212, term4212.getClass(), "values", null);
        setField(term4212, term4212.getClass(), "keySet", null);
        setField(term4212, term4212.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term4212));
    }

};


