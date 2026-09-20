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

public class Flat3Map_containsKey_76092510632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123139;
     Object term123639;
     Object term123642;

    public Flat3Map_containsKey_76092510632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123139 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term123185 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term123240 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term123139, term123139.getClass(), "delegateMap", null);
        setIntField(term123139, term123139.getClass(), "size", 2);
        setIntField(term123139, term123139.getClass(), "hash2", 0);
        setField(term123139, term123139.getClass(), "value2", null);
        setIntField(term123139, term123139.getClass(), "hash1", 0);
        setField(term123139, term123139.getClass(), "value1", null);
        setField(term123185, term123185.getClass(), "delegateMap", term123240);
        setField(term123139, term123139.getClass(), "key2", term123185);
        term123639 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term123640 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term123641 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term123639, term123639.getClass(), "size", 2);
        setIntField(term123639, term123639.getClass(), "hash1", 0);
        setIntField(term123639, term123639.getClass(), "hash2", 0);
        setIntField(term123639, term123639.getClass(), "hash3", 0);
        setField(term123639, term123639.getClass(), "key1", null);
        setIntField(term123640, term123640.getClass(), "size", 0);
        setIntField(term123640, term123640.getClass(), "hash1", 0);
        setIntField(term123640, term123640.getClass(), "hash2", 0);
        setIntField(term123640, term123640.getClass(), "hash3", 0);
        setField(term123640, term123640.getClass(), "key1", null);
        setField(term123640, term123640.getClass(), "key2", null);
        setField(term123640, term123640.getClass(), "key3", null);
        setField(term123640, term123640.getClass(), "value1", null);
        setField(term123640, term123640.getClass(), "value2", null);
        setField(term123640, term123640.getClass(), "value3", null);
        setFloatField(term123641, term123641.getClass(), "loadFactor", 0.0F);
        setIntField(term123641, term123641.getClass(), "size", 0);
        setField(term123641, term123641.getClass(), "data", null);
        setIntField(term123641, term123641.getClass(), "threshold", 0);
        setIntField(term123641, term123641.getClass(), "modCount", 0);
        setField(term123641, term123641.getClass(), "entrySet", null);
        setField(term123641, term123641.getClass(), "keySet", null);
        setField(term123641, term123641.getClass(), "values", null);
        setField(term123641, term123641.getClass(), "keySet", null);
        setField(term123641, term123641.getClass(), "values", null);
        setField(term123640, term123640.getClass(), "delegateMap", term123641);
        setField(term123639, term123639.getClass(), "key2", term123640);
        setField(term123639, term123639.getClass(), "key3", null);
        setField(term123639, term123639.getClass(), "value1", null);
        setField(term123639, term123639.getClass(), "value2", null);
        setField(term123639, term123639.getClass(), "value3", null);
        setField(term123639, term123639.getClass(), "delegateMap", null);
        term123642 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term123643 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term123644 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term123642, term123642.getClass(), "size", 2);
        setIntField(term123642, term123642.getClass(), "hash1", 0);
        setIntField(term123642, term123642.getClass(), "hash2", 0);
        setIntField(term123642, term123642.getClass(), "hash3", 0);
        setField(term123642, term123642.getClass(), "key1", null);
        setIntField(term123643, term123643.getClass(), "size", 0);
        setIntField(term123643, term123643.getClass(), "hash1", 0);
        setIntField(term123643, term123643.getClass(), "hash2", 0);
        setIntField(term123643, term123643.getClass(), "hash3", 0);
        setField(term123643, term123643.getClass(), "key1", null);
        setField(term123643, term123643.getClass(), "key2", null);
        setField(term123643, term123643.getClass(), "key3", null);
        setField(term123643, term123643.getClass(), "value1", null);
        setField(term123643, term123643.getClass(), "value2", null);
        setField(term123643, term123643.getClass(), "value3", null);
        setFloatField(term123644, term123644.getClass(), "loadFactor", 0.0F);
        setIntField(term123644, term123644.getClass(), "size", 0);
        setField(term123644, term123644.getClass(), "data", null);
        setIntField(term123644, term123644.getClass(), "threshold", 0);
        setIntField(term123644, term123644.getClass(), "modCount", 0);
        setField(term123644, term123644.getClass(), "entrySet", null);
        setField(term123644, term123644.getClass(), "keySet", null);
        setField(term123644, term123644.getClass(), "values", null);
        setField(term123644, term123644.getClass(), "keySet", null);
        setField(term123644, term123644.getClass(), "values", null);
        setField(term123643, term123643.getClass(), "delegateMap", term123644);
        setField(term123642, term123642.getClass(), "key2", term123643);
        setField(term123642, term123642.getClass(), "key3", null);
        setField(term123642, term123642.getClass(), "value1", null);
        setField(term123642, term123642.getClass(), "value2", null);
        setField(term123642, term123642.getClass(), "value3", null);
        setField(term123642, term123642.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term123139;
        callMethod(klass, "containsKey", argTypes, term123139, args);
        assertTrue(recursiveEquals(term123139, term123639));
        assertTrue(recursiveEquals(term123139, term123642));
    }

};
