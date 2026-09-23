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

public class Flat3Map_convertToMap_122991281158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14898;
     Object term15157;

    public Flat3Map_convertToMap_122991281158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14898 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term15008 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term14898, term14898.getClass(), "delegateMap", term15008);
        setIntField(term14898, term14898.getClass(), "size", 1);
        term15157 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term15158 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term15159 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term15160 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term15161 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term15157, term15157.getClass(), "size", 0);
        setIntField(term15157, term15157.getClass(), "hash1", 0);
        setIntField(term15157, term15157.getClass(), "hash2", 0);
        setIntField(term15157, term15157.getClass(), "hash3", 0);
        setField(term15157, term15157.getClass(), "key1", null);
        setField(term15157, term15157.getClass(), "key2", null);
        setField(term15157, term15157.getClass(), "key3", null);
        setField(term15157, term15157.getClass(), "value1", null);
        setField(term15157, term15157.getClass(), "value2", null);
        setField(term15157, term15157.getClass(), "value3", null);
        setFloatField(term15158, term15158.getClass(), "loadFactor", 0.75F);
        setIntField(term15158, term15158.getClass(), "size", 1);
        setField(term15160, term15160.getClass(), "next", null);
        setField(term15160, term15160.getClass(), "key", term15161);
        setField(term15160, term15160.getClass(), "value", null);
        setElement(term15159, 5, term15160);
        setField(term15158, term15158.getClass(), "data", term15159);
        setIntField(term15158, term15158.getClass(), "threshold", 12);
        setIntField(term15158, term15158.getClass(), "modCount", 1);
        setField(term15158, term15158.getClass(), "entrySet", null);
        setField(term15158, term15158.getClass(), "keySet", null);
        setField(term15158, term15158.getClass(), "values", null);
        setField(term15158, term15158.getClass(), "keySet", null);
        setField(term15158, term15158.getClass(), "values", null);
        setField(term15157, term15157.getClass(), "delegateMap", term15158);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "convertToMap", argTypes, term14898, args);
        assertTrue(recursiveEquals(term14898, term15157));
    }

};


