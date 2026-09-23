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

public class Flat3Map_put_1944740725753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184342;
     Object term184620;
     Object term190487;
     Object term190494;

    public Flat3Map_put_1944740725753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184342 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term184434 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term184528 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        setField(term184342, term184342.getClass(), "delegateMap", null);
        setIntField(term184342, term184342.getClass(), "size", 3);
        setIntField(term184342, term184342.getClass(), "hash3", 0);
        setField(term184342, term184342.getClass(), "key3", null);
        setIntField(term184342, term184342.getClass(), "hash2", 0);
        setField(term184342, term184342.getClass(), "key2", null);
        setIntField(term184342, term184342.getClass(), "hash1", 0);
        setField(term184434, term184434.getClass(), "delegateMap", term184528);
        setField(term184342, term184342.getClass(), "key1", term184434);
        term184620 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term184730 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term184620, term184620.getClass(), "delegateMap", null);
        setIntField(term184620, term184620.getClass(), "size", 3);
        setIntField(term184620, term184620.getClass(), "hash3", 0);
        setField(term184620, term184620.getClass(), "value3", null);
        setIntField(term184620, term184620.getClass(), "hash2", 0);
        setField(term184620, term184620.getClass(), "value2", null);
        setIntField(term184620, term184620.getClass(), "hash1", 0);
        setIntField(term184730, term184730.getClass(), "size", 0);
        setField(term184620, term184620.getClass(), "value1", term184730);
        term190487 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term190488 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term190489 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term190490 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term190491 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term190492 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term190493 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term190487, term190487.getClass(), "size", 652129701);
        setIntField(term190487, term190487.getClass(), "hash1", 0);
        setIntField(term190487, term190487.getClass(), "hash2", 0);
        setIntField(term190487, term190487.getClass(), "hash3", 0);
        setField(term190487, term190487.getClass(), "key1", null);
        setField(term190487, term190487.getClass(), "key2", null);
        setField(term190487, term190487.getClass(), "key3", null);
        setField(term190487, term190487.getClass(), "value1", null);
        setField(term190487, term190487.getClass(), "value2", null);
        setField(term190487, term190487.getClass(), "value3", null);
        setFloatField(term190488, term190488.getClass(), "loadFactor", 0.75F);
        setIntField(term190488, term190488.getClass(), "size", 3);
        setField(term190490, term190490.getClass(), "next", 5);
        setIntField(term190491, term190491.getClass(), "size", 3);
        setIntField(term190491, term190491.getClass(), "hash1", 0);
        setIntField(term190491, term190491.getClass(), "hash2", 0);
        setIntField(term190491, term190491.getClass(), "hash3", 0);
        setField(term190491, term190491.getClass(), "key1", null);
        setField(term190491, term190491.getClass(), "key2", null);
        setField(term190491, term190491.getClass(), "key3", null);
        setField(term190491, term190491.getClass(), "value1", null);
        setField(term190491, term190491.getClass(), "value2", null);
        setField(term190491, term190491.getClass(), "value3", null);
        setField(term190491, term190491.getClass(), "delegateMap", null);
        setField(term190490, term190490.getClass(), "key", term190491);
        setField(term190490, term190490.getClass(), "value", null);
        setElement(term190489, 0, term190490);
        setField(term190492, term190492.getClass(), "next", null);
        setField(term190492, term190492.getClass(), "key", term190493);
        setField(term190492, term190492.getClass(), "value", null);
        setElement(term190489, 15, term190492);
        setField(term190488, term190488.getClass(), "data", term190489);
        setIntField(term190488, term190488.getClass(), "threshold", 12);
        setIntField(term190488, term190488.getClass(), "modCount", 3);
        setField(term190488, term190488.getClass(), "entrySet", null);
        setField(term190488, term190488.getClass(), "keySet", null);
        setField(term190488, term190488.getClass(), "values", null);
        setField(term190488, term190488.getClass(), "keySet", null);
        setField(term190488, term190488.getClass(), "values", null);
        setField(term190487, term190487.getClass(), "delegateMap", term190488);
        term190494 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term190494, term190494.getClass(), "size", 3);
        setIntField(term190494, term190494.getClass(), "hash1", 0);
        setIntField(term190494, term190494.getClass(), "hash2", 0);
        setIntField(term190494, term190494.getClass(), "hash3", 0);
        setField(term190494, term190494.getClass(), "key1", null);
        setField(term190494, term190494.getClass(), "key2", null);
        setField(term190494, term190494.getClass(), "key3", null);
        setField(term190494, term190494.getClass(), "value1", null);
        setField(term190494, term190494.getClass(), "value2", null);
        setField(term190494, term190494.getClass(), "value3", null);
        setField(term190494, term190494.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term184620;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term184342, args);
        assertTrue(recursiveEquals(term184342, term190487));
        assertTrue(recursiveEquals(term184620, term190494));
        assertTrue(recursiveEquals(retValue, null));
    }

};


