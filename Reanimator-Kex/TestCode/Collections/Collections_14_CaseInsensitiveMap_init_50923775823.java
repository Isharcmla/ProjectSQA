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

public class CaseInsensitiveMap_init_50923775823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6604;

    public CaseInsensitiveMap_init_50923775823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6166 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setFloatField(term6166, term6166.getClass(), "loadFactor", 0.0F);
        term6604 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        Object[] term6605 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 8388608);
        setFloatField(term6604, term6604.getClass(), "loadFactor", 0.75F);
        setIntField(term6604, term6604.getClass(), "size", 0);
        setField(term6604, term6604.getClass(), "data", term6605);
        setIntField(term6604, term6604.getClass(), "threshold", 6291456);
        setIntField(term6604, term6604.getClass(), "modCount", 0);
        setField(term6604, term6604.getClass(), "entrySet", null);
        setField(term6604, term6604.getClass(), "keySet", null);
        setField(term6604, term6604.getClass(), "values", null);
        setField(term6604, term6604.getClass(), "keySet", null);
        setField(term6604, term6604.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 8257536;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term6604));
    }

};


