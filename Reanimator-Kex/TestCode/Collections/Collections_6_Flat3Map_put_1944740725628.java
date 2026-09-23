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

public class Flat3Map_put_1944740725628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136371;
     Object term136871;
     Object term138073;
     Object term138083;

    public Flat3Map_put_1944740725628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136371 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term136463 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term136621 = newInstance(Class.forName("org.apache.commons.collections.iterators.AbstractOrderedMapIteratorDecorator"));
        Object term136779 = newInstance(Class.forName("org.apache.commons.collections.iterators.AbstractOrderedMapIteratorDecorator"));
        setField(term136371, term136371.getClass(), "delegateMap", null);
        setIntField(term136371, term136371.getClass(), "size", 3);
        setIntField(term136371, term136371.getClass(), "hash3", -1503526912);
        setField(term136371, term136371.getClass(), "key3", null);
        setIntField(term136371, term136371.getClass(), "hash2", -1503526912);
        setField(term136371, term136371.getClass(), "key2", null);
        setIntField(term136371, term136371.getClass(), "hash1", -1503526912);
        setField(term136463, term136463.getClass(), "delegateMap", null);
        setIntField(term136463, term136463.getClass(), "size", 3);
        setField(term136463, term136463.getClass(), "key3", null);
        setField(term136463, term136463.getClass(), "value3", null);
        setIntField(term136463, term136463.getClass(), "hash3", -2080367519);
        setIntField(term136463, term136463.getClass(), "hash2", 134754316);
        setField(term136463, term136463.getClass(), "value2", null);
        setIntField(term136463, term136463.getClass(), "hash1", 1080035456);
        setField(term136463, term136463.getClass(), "value1", null);
        setField(term136371, term136371.getClass(), "key1", term136463);
        setField(term136371, term136371.getClass(), "value3", term136621);
        setField(term136371, term136371.getClass(), "value2", term136371);
        setField(term136371, term136371.getClass(), "value1", term136779);
        term136871 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term136965 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setField(term136871, term136871.getClass(), "delegateMap", null);
        setIntField(term136871, term136871.getClass(), "size", 3);
        setIntField(term136871, term136871.getClass(), "hash3", 601882624);
        setField(term136871, term136871.getClass(), "value3", null);
        setIntField(term136871, term136871.getClass(), "hash2", 370016256);
        setField(term136871, term136871.getClass(), "value2", null);
        setIntField(term136871, term136871.getClass(), "hash1", 1819541504);
        setIntField(term136965, term136965.getClass(), "size", 0);
        setField(term136871, term136871.getClass(), "value1", term136965);
        setField(term136871, term136871.getClass(), "key3", null);
        setField(term136871, term136871.getClass(), "key2", null);
        setField(term136871, term136871.getClass(), "key1", null);
        term138073 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term138074 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term138075 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term138076 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term138077 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term138078 = newInstance(Class.forName("org.apache.commons.collections.iterators.AbstractOrderedMapIteratorDecorator"));
        Object term138079 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term138080 = newInstance(Class.forName("java.lang.Object"));
        Object term138081 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term138082 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term138073, term138073.getClass(), "size", 0);
        setIntField(term138073, term138073.getClass(), "hash1", 0);
        setIntField(term138073, term138073.getClass(), "hash2", 0);
        setIntField(term138073, term138073.getClass(), "hash3", 0);
        setField(term138073, term138073.getClass(), "key1", null);
        setField(term138073, term138073.getClass(), "key2", null);
        setField(term138073, term138073.getClass(), "key3", null);
        setField(term138073, term138073.getClass(), "value1", null);
        setField(term138073, term138073.getClass(), "value2", null);
        setField(term138073, term138073.getClass(), "value3", null);
        setFloatField(term138074, term138074.getClass(), "loadFactor", 0.75F);
        setIntField(term138074, term138074.getClass(), "size", 3);
        setField(term138076, term138076.getClass(), "next", null);
        setIntField(term138077, term138077.getClass(), "size", 3);
        setIntField(term138077, term138077.getClass(), "hash1", 1080035456);
        setIntField(term138077, term138077.getClass(), "hash2", 134754316);
        setIntField(term138077, term138077.getClass(), "hash3", -2080367519);
        setField(term138077, term138077.getClass(), "key1", null);
        setField(term138077, term138077.getClass(), "key2", null);
        setField(term138077, term138077.getClass(), "key3", null);
        setField(term138077, term138077.getClass(), "value1", null);
        setField(term138077, term138077.getClass(), "value2", null);
        setField(term138077, term138077.getClass(), "value3", null);
        setField(term138077, term138077.getClass(), "delegateMap", null);
        setField(term138076, term138076.getClass(), "key", term138077);
        setField(term138078, term138078.getClass(), "iterator", null);
        setField(term138076, term138076.getClass(), "value", term138078);
        setElement(term138075, 0, term138076);
        setField(term138079, term138079.getClass(), "next", null);
        setField(term138079, term138079.getClass(), "key", term138080);
        setField(term138079, term138079.getClass(), "value", term138073);
        setElement(term138075, 5, term138079);
        setField(term138081, term138081.getClass(), "next", null);
        setIntField(term138082, term138082.getClass(), "size", 3);
        setIntField(term138082, term138082.getClass(), "hash1", 1819541504);
        setIntField(term138082, term138082.getClass(), "hash2", 370016256);
        setIntField(term138082, term138082.getClass(), "hash3", 601882624);
        setField(term138082, term138082.getClass(), "key1", null);
        setField(term138082, term138082.getClass(), "key2", null);
        setField(term138082, term138082.getClass(), "key3", null);
        setField(term138082, term138082.getClass(), "value1", null);
        setField(term138082, term138082.getClass(), "value2", null);
        setField(term138082, term138082.getClass(), "value3", null);
        setField(term138082, term138082.getClass(), "delegateMap", null);
        setField(term138081, term138081.getClass(), "key", term138082);
        setField(term138081, term138081.getClass(), "value", null);
        setElement(term138075, 15, term138081);
        setField(term138074, term138074.getClass(), "data", term138075);
        setIntField(term138074, term138074.getClass(), "threshold", 12);
        setIntField(term138074, term138074.getClass(), "modCount", 3);
        setField(term138074, term138074.getClass(), "entrySet", null);
        setField(term138074, term138074.getClass(), "keySet", null);
        setField(term138074, term138074.getClass(), "values", null);
        setField(term138074, term138074.getClass(), "keySet", null);
        setField(term138074, term138074.getClass(), "values", null);
        setField(term138073, term138073.getClass(), "delegateMap", term138074);
        term138083 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term138083, term138083.getClass(), "size", 3);
        setIntField(term138083, term138083.getClass(), "hash1", 1819541504);
        setIntField(term138083, term138083.getClass(), "hash2", 370016256);
        setIntField(term138083, term138083.getClass(), "hash3", 601882624);
        setField(term138083, term138083.getClass(), "key1", null);
        setField(term138083, term138083.getClass(), "key2", null);
        setField(term138083, term138083.getClass(), "key3", null);
        setField(term138083, term138083.getClass(), "value1", null);
        setField(term138083, term138083.getClass(), "value2", null);
        setField(term138083, term138083.getClass(), "value3", null);
        setField(term138083, term138083.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term136871;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term136371, args);
        assertTrue(recursiveEquals(term136371, term138073));
        assertTrue(recursiveEquals(term136871, term138083));
        assertTrue(recursiveEquals(retValue, null));
    }

};


