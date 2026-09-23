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

public class Flat3Map_put_1944740725599 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125209;
     Object term125503;
     Object term126054;
     Object term126062;

    public Flat3Map_put_1944740725599() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125209 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term125301 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term125558 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term125209, term125209.getClass(), "delegateMap", null);
        setIntField(term125209, term125209.getClass(), "size", 3);
        setIntField(term125209, term125209.getClass(), "hash3", 0);
        setField(term125209, term125209.getClass(), "key3", null);
        setIntField(term125209, term125209.getClass(), "hash2", 0);
        setField(term125209, term125209.getClass(), "key2", null);
        setIntField(term125209, term125209.getClass(), "hash1", 0);
        setIntField(term125558, term125558.getClass(), "size", 0);
        setField(term125301, term125301.getClass(), "delegateMap", term125558);
        setField(term125209, term125209.getClass(), "key1", term125301);
        term125503 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term125503, term125503.getClass(), "delegateMap", null);
        setIntField(term125503, term125503.getClass(), "size", 3);
        setIntField(term125503, term125503.getClass(), "hash3", 0);
        setField(term125503, term125503.getClass(), "value3", null);
        setIntField(term125503, term125503.getClass(), "hash2", 0);
        setField(term125503, term125503.getClass(), "value2", null);
        setIntField(term125503, term125503.getClass(), "hash1", 0);
        setField(term125503, term125503.getClass(), "value1", term125558);
        term126054 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term126055 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term126056 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term126057 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term126058 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term126059 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term126060 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term126061 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term126054, term126054.getClass(), "size", 0);
        setIntField(term126054, term126054.getClass(), "hash1", 0);
        setIntField(term126054, term126054.getClass(), "hash2", 0);
        setIntField(term126054, term126054.getClass(), "hash3", 0);
        setField(term126054, term126054.getClass(), "key1", null);
        setField(term126054, term126054.getClass(), "key2", null);
        setField(term126054, term126054.getClass(), "key3", null);
        setField(term126054, term126054.getClass(), "value1", null);
        setField(term126054, term126054.getClass(), "value2", null);
        setField(term126054, term126054.getClass(), "value3", null);
        setFloatField(term126055, term126055.getClass(), "loadFactor", 0.75F);
        setIntField(term126055, term126055.getClass(), "size", 3);
        setField(term126058, term126058.getClass(), "next", null);
        setField(term126058, term126058.getClass(), "key", null);
        setField(term126058, term126058.getClass(), "value", null);
        setField(term126057, term126057.getClass(), "next", term126058);
        setIntField(term126059, term126059.getClass(), "size", 3);
        setIntField(term126059, term126059.getClass(), "hash1", 0);
        setIntField(term126059, term126059.getClass(), "hash2", 0);
        setIntField(term126059, term126059.getClass(), "hash3", 0);
        setField(term126059, term126059.getClass(), "key1", null);
        setField(term126059, term126059.getClass(), "key2", null);
        setField(term126059, term126059.getClass(), "key3", null);
        setField(term126059, term126059.getClass(), "value1", null);
        setField(term126059, term126059.getClass(), "value2", null);
        setField(term126059, term126059.getClass(), "value3", null);
        setField(term126059, term126059.getClass(), "delegateMap", null);
        setField(term126057, term126057.getClass(), "key", term126059);
        setField(term126057, term126057.getClass(), "value", null);
        setElement(term126056, 0, term126057);
        setField(term126060, term126060.getClass(), "next", null);
        setField(term126060, term126060.getClass(), "key", term126061);
        setField(term126060, term126060.getClass(), "value", null);
        setElement(term126056, 5, term126060);
        setField(term126055, term126055.getClass(), "data", term126056);
        setIntField(term126055, term126055.getClass(), "threshold", 12);
        setIntField(term126055, term126055.getClass(), "modCount", 3);
        setField(term126055, term126055.getClass(), "entrySet", null);
        setField(term126055, term126055.getClass(), "keySet", null);
        setField(term126055, term126055.getClass(), "values", null);
        setField(term126055, term126055.getClass(), "keySet", null);
        setField(term126055, term126055.getClass(), "values", null);
        setField(term126054, term126054.getClass(), "delegateMap", term126055);
        term126062 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term126062, term126062.getClass(), "size", 3);
        setIntField(term126062, term126062.getClass(), "hash1", 0);
        setIntField(term126062, term126062.getClass(), "hash2", 0);
        setIntField(term126062, term126062.getClass(), "hash3", 0);
        setField(term126062, term126062.getClass(), "key1", null);
        setField(term126062, term126062.getClass(), "key2", null);
        setField(term126062, term126062.getClass(), "key3", null);
        setField(term126062, term126062.getClass(), "value1", null);
        setField(term126062, term126062.getClass(), "value2", null);
        setField(term126062, term126062.getClass(), "value3", null);
        setField(term126062, term126062.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term125503;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term125209, args);
        assertTrue(recursiveEquals(term125209, term126054));
        assertTrue(recursiveEquals(term125503, term126062));
        assertTrue(recursiveEquals(retValue, null));
    }

};


