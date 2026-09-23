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

public class CaseInsensitiveMap_init_50923775828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7506;

    public CaseInsensitiveMap_init_50923775828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6963 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setFloatField(term6963, term6963.getClass(), "loadFactor", 0.0F);
        term7506 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        Object[] term7507 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16384);
        setFloatField(term7506, term7506.getClass(), "loadFactor", 0.75F);
        setIntField(term7506, term7506.getClass(), "size", 0);
        setField(term7506, term7506.getClass(), "data", term7507);
        setIntField(term7506, term7506.getClass(), "threshold", 12288);
        setIntField(term7506, term7506.getClass(), "modCount", 0);
        setField(term7506, term7506.getClass(), "entrySet", null);
        setField(term7506, term7506.getClass(), "keySet", null);
        setField(term7506, term7506.getClass(), "values", null);
        setField(term7506, term7506.getClass(), "keySet", null);
        setField(term7506, term7506.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 9984;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term7506));
    }

};


