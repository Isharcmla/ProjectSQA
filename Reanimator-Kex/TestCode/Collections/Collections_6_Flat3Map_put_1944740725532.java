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

public class Flat3Map_put_1944740725532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103099;
     Object term103559;
     Object term104534;
     Object term104542;

    public Flat3Map_put_1944740725532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103099 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term103191 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term103283 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term103375 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term103467 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term103099, term103099.getClass(), "delegateMap", null);
        setIntField(term103099, term103099.getClass(), "size", 3);
        setIntField(term103099, term103099.getClass(), "hash3", 0);
        setField(term103191, term103191.getClass(), "delegateMap", null);
        setIntField(term103191, term103191.getClass(), "size", 3);
        setField(term103191, term103191.getClass(), "key3", term103283);
        setField(term103191, term103191.getClass(), "key2", null);
        setField(term103191, term103191.getClass(), "value2", term103375);
        setField(term103099, term103099.getClass(), "key3", term103191);
        setIntField(term103099, term103099.getClass(), "hash2", 0);
        setField(term103099, term103099.getClass(), "key2", term103467);
        term103559 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term103559, term103559.getClass(), "delegateMap", null);
        setIntField(term103559, term103559.getClass(), "size", 3);
        setIntField(term103559, term103559.getClass(), "hash3", 0);
        setField(term103559, term103559.getClass(), "value3", null);
        setIntField(term103559, term103559.getClass(), "hash2", 0);
        setField(term103559, term103559.getClass(), "value2", null);
        setIntField(term103559, term103559.getClass(), "hash1", 0);
        setField(term103559, term103559.getClass(), "value1", null);
        setField(term103559, term103559.getClass(), "key3", null);
        term104534 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term104535 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term104536 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term104537 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term104538 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term104539 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term104540 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term104541 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term104534, term104534.getClass(), "size", 0);
        setIntField(term104534, term104534.getClass(), "hash1", 0);
        setIntField(term104534, term104534.getClass(), "hash2", 0);
        setIntField(term104534, term104534.getClass(), "hash3", 0);
        setField(term104534, term104534.getClass(), "key1", null);
        setField(term104534, term104534.getClass(), "key2", null);
        setField(term104534, term104534.getClass(), "key3", null);
        setField(term104534, term104534.getClass(), "value1", null);
        setField(term104534, term104534.getClass(), "value2", null);
        setField(term104534, term104534.getClass(), "value3", null);
        setFloatField(term104535, term104535.getClass(), "loadFactor", 0.75F);
        setIntField(term104535, term104535.getClass(), "size", 4);
        setField(term104538, term104538.getClass(), "next", null);
        setField(term104538, term104538.getClass(), "key", null);
        setField(term104538, term104538.getClass(), "value", null);
        setField(term104537, term104537.getClass(), "next", term104538);
        setIntField(term104539, term104539.getClass(), "size", 3);
        setIntField(term104539, term104539.getClass(), "hash1", 0);
        setIntField(term104539, term104539.getClass(), "hash2", 0);
        setIntField(term104539, term104539.getClass(), "hash3", 0);
        setField(term104539, term104539.getClass(), "key1", null);
        setField(term104539, term104539.getClass(), "key2", null);
        setField(term104539, term104539.getClass(), "key3", null);
        setField(term104539, term104539.getClass(), "value1", null);
        setField(term104539, term104539.getClass(), "value2", null);
        setField(term104539, term104539.getClass(), "value3", null);
        setField(term104539, term104539.getClass(), "delegateMap", null);
        setField(term104537, term104537.getClass(), "key", term104539);
        setField(term104537, term104537.getClass(), "value", null);
        setElement(term104536, 0, term104537);
        setField(term104540, term104540.getClass(), "next", null);
        setField(term104540, term104540.getClass(), "key", term104541);
        setField(term104540, term104540.getClass(), "value", null);
        setElement(term104536, 5, term104540);
        setField(term104535, term104535.getClass(), "data", term104536);
        setIntField(term104535, term104535.getClass(), "threshold", 12);
        setIntField(term104535, term104535.getClass(), "modCount", 4);
        setField(term104535, term104535.getClass(), "entrySet", null);
        setField(term104535, term104535.getClass(), "keySet", null);
        setField(term104535, term104535.getClass(), "values", null);
        setField(term104535, term104535.getClass(), "keySet", null);
        setField(term104535, term104535.getClass(), "values", null);
        setField(term104534, term104534.getClass(), "delegateMap", term104535);
        term104542 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term104542, term104542.getClass(), "size", 3);
        setIntField(term104542, term104542.getClass(), "hash1", 0);
        setIntField(term104542, term104542.getClass(), "hash2", 0);
        setIntField(term104542, term104542.getClass(), "hash3", 0);
        setField(term104542, term104542.getClass(), "key1", null);
        setField(term104542, term104542.getClass(), "key2", null);
        setField(term104542, term104542.getClass(), "key3", null);
        setField(term104542, term104542.getClass(), "value1", null);
        setField(term104542, term104542.getClass(), "value2", null);
        setField(term104542, term104542.getClass(), "value3", null);
        setField(term104542, term104542.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term103559;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term103099, args);
        assertTrue(recursiveEquals(term103099, term104534));
        assertTrue(recursiveEquals(term103559, term104542));
        assertTrue(recursiveEquals(retValue, null));
    }

};


