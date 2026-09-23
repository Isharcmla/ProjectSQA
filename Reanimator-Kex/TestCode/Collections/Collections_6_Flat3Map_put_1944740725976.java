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

public class Flat3Map_put_1944740725976 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term271215;
     Object term271491;
     Object term272128;
     Object term272137;

    public Flat3Map_put_1944740725976() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term271215 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term271307 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term271399 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term271215, term271215.getClass(), "delegateMap", null);
        setIntField(term271215, term271215.getClass(), "size", 3);
        setIntField(term271215, term271215.getClass(), "hash3", 0);
        setField(term271307, term271307.getClass(), "delegateMap", null);
        setIntField(term271307, term271307.getClass(), "size", 3);
        setField(term271307, term271307.getClass(), "key3", term271399);
        setField(term271307, term271307.getClass(), "key2", null);
        setField(term271307, term271307.getClass(), "value2", null);
        setIntField(term271307, term271307.getClass(), "hash3", -1);
        setIntField(term271307, term271307.getClass(), "hash2", -1);
        setIntField(term271307, term271307.getClass(), "hash1", 0);
        setField(term271215, term271215.getClass(), "key3", term271307);
        term271491 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term271625 = newInstance(Class.forName("org.apache.commons.collections.iterators.UnmodifiableMapIterator"));
        setField(term271491, term271491.getClass(), "delegateMap", null);
        setIntField(term271491, term271491.getClass(), "size", 3);
        setIntField(term271491, term271491.getClass(), "hash3", 0);
        setField(term271491, term271491.getClass(), "value3", null);
        setIntField(term271491, term271491.getClass(), "hash2", 0);
        setField(term271491, term271491.getClass(), "value2", null);
        setIntField(term271491, term271491.getClass(), "hash1", 0);
        setField(term271491, term271491.getClass(), "value1", null);
        setField(term271491, term271491.getClass(), "key3", null);
        setField(term271491, term271491.getClass(), "key2", null);
        setField(term271491, term271491.getClass(), "key1", term271625);
        term272128 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term272129 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term272130 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term272131 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term272132 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term272133 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term272134 = newInstance(Class.forName("java.lang.Object"));
        Object term272135 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term272136 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term272128, term272128.getClass(), "size", 0);
        setIntField(term272128, term272128.getClass(), "hash1", 0);
        setIntField(term272128, term272128.getClass(), "hash2", 0);
        setIntField(term272128, term272128.getClass(), "hash3", 0);
        setField(term272128, term272128.getClass(), "key1", null);
        setField(term272128, term272128.getClass(), "key2", null);
        setField(term272128, term272128.getClass(), "key3", null);
        setField(term272128, term272128.getClass(), "value1", null);
        setField(term272128, term272128.getClass(), "value2", null);
        setField(term272128, term272128.getClass(), "value3", null);
        setFloatField(term272129, term272129.getClass(), "loadFactor", 0.75F);
        setIntField(term272129, term272129.getClass(), "size", 3);
        setField(term272131, term272131.getClass(), "next", null);
        setIntField(term272132, term272132.getClass(), "size", 3);
        setIntField(term272132, term272132.getClass(), "hash1", 0);
        setIntField(term272132, term272132.getClass(), "hash2", 0);
        setIntField(term272132, term272132.getClass(), "hash3", 0);
        setField(term272132, term272132.getClass(), "key1", null);
        setField(term272132, term272132.getClass(), "key2", null);
        setField(term272132, term272132.getClass(), "key3", null);
        setField(term272132, term272132.getClass(), "value1", null);
        setField(term272132, term272132.getClass(), "value2", null);
        setField(term272132, term272132.getClass(), "value3", null);
        setField(term272132, term272132.getClass(), "delegateMap", null);
        setField(term272131, term272131.getClass(), "key", term272132);
        setField(term272131, term272131.getClass(), "value", null);
        setElement(term272130, 0, term272131);
        setField(term272133, term272133.getClass(), "next", null);
        setField(term272133, term272133.getClass(), "key", term272134);
        setField(term272133, term272133.getClass(), "value", null);
        setElement(term272130, 6, term272133);
        setField(term272135, term272135.getClass(), "next", null);
        setIntField(term272136, term272136.getClass(), "size", 3);
        setIntField(term272136, term272136.getClass(), "hash1", 0);
        setIntField(term272136, term272136.getClass(), "hash2", -1);
        setIntField(term272136, term272136.getClass(), "hash3", -1);
        setField(term272136, term272136.getClass(), "key1", null);
        setField(term272136, term272136.getClass(), "key2", null);
        setField(term272136, term272136.getClass(), "key3", null);
        setField(term272136, term272136.getClass(), "value1", null);
        setField(term272136, term272136.getClass(), "value2", null);
        setField(term272136, term272136.getClass(), "value3", null);
        setField(term272136, term272136.getClass(), "delegateMap", null);
        setField(term272135, term272135.getClass(), "key", term272136);
        setField(term272135, term272135.getClass(), "value", null);
        setElement(term272130, 13, term272135);
        setField(term272129, term272129.getClass(), "data", term272130);
        setIntField(term272129, term272129.getClass(), "threshold", 12);
        setIntField(term272129, term272129.getClass(), "modCount", 3);
        setField(term272129, term272129.getClass(), "entrySet", null);
        setField(term272129, term272129.getClass(), "keySet", null);
        setField(term272129, term272129.getClass(), "values", null);
        setField(term272129, term272129.getClass(), "keySet", null);
        setField(term272129, term272129.getClass(), "values", null);
        setField(term272128, term272128.getClass(), "delegateMap", term272129);
        term272137 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term272137, term272137.getClass(), "size", 3);
        setIntField(term272137, term272137.getClass(), "hash1", 0);
        setIntField(term272137, term272137.getClass(), "hash2", 0);
        setIntField(term272137, term272137.getClass(), "hash3", 0);
        setField(term272137, term272137.getClass(), "key1", null);
        setField(term272137, term272137.getClass(), "key2", null);
        setField(term272137, term272137.getClass(), "key3", null);
        setField(term272137, term272137.getClass(), "value1", null);
        setField(term272137, term272137.getClass(), "value2", null);
        setField(term272137, term272137.getClass(), "value3", null);
        setField(term272137, term272137.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term271491;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term271215, args);
        assertTrue(recursiveEquals(term271215, term272128));
        assertTrue(recursiveEquals(term271491, term272137));
        assertTrue(recursiveEquals(retValue, null));
    }

};


