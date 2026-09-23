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

public class Flat3Map_put_1944740725983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273775;
     Object term274076;
     Object term274080;

    public Flat3Map_put_1944740725983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term273775 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term273830 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term273887 = newInstance(Class.forName("org.apache.commons.collections.iterators.EmptyIterator"));
        setField(term273775, term273775.getClass(), "delegateMap", null);
        setIntField(term273775, term273775.getClass(), "size", 3);
        setIntField(term273775, term273775.getClass(), "hash3", 0);
        setField(term273775, term273775.getClass(), "value3", null);
        setIntField(term273775, term273775.getClass(), "hash2", 0);
        setIntField(term273830, term273830.getClass(), "size", 0);
        setField(term273775, term273775.getClass(), "value2", term273830);
        setIntField(term273775, term273775.getClass(), "hash1", 0);
        setField(term273775, term273775.getClass(), "value1", term273887);
        term274076 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term274077 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term274078 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term274079 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setIntField(term274076, term274076.getClass(), "size", 0);
        setIntField(term274076, term274076.getClass(), "hash1", 0);
        setIntField(term274076, term274076.getClass(), "hash2", 0);
        setIntField(term274076, term274076.getClass(), "hash3", 0);
        setField(term274076, term274076.getClass(), "key1", null);
        setField(term274076, term274076.getClass(), "key2", null);
        setField(term274076, term274076.getClass(), "key3", null);
        setField(term274076, term274076.getClass(), "value1", null);
        setField(term274076, term274076.getClass(), "value2", null);
        setField(term274076, term274076.getClass(), "value3", null);
        setFloatField(term274077, term274077.getClass(), "loadFactor", 0.75F);
        setIntField(term274077, term274077.getClass(), "size", 2);
        setField(term274079, term274079.getClass(), "next", null);
        setField(term274079, term274079.getClass(), "key", term274076);
        setField(term274079, term274079.getClass(), "value", null);
        setElement(term274078, 5, term274079);
        setIntElement(term274078, 6, 5);
        setField(term274077, term274077.getClass(), "data", term274078);
        setIntField(term274077, term274077.getClass(), "threshold", 12);
        setIntField(term274077, term274077.getClass(), "modCount", 2);
        setField(term274077, term274077.getClass(), "entrySet", null);
        setField(term274077, term274077.getClass(), "keySet", null);
        setField(term274077, term274077.getClass(), "values", null);
        setField(term274077, term274077.getClass(), "keySet", null);
        setField(term274077, term274077.getClass(), "values", null);
        setField(term274076, term274076.getClass(), "delegateMap", term274077);
        term274080 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term274081 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term274082 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term274083 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setIntField(term274080, term274080.getClass(), "size", 0);
        setIntField(term274080, term274080.getClass(), "hash1", 0);
        setIntField(term274080, term274080.getClass(), "hash2", 0);
        setIntField(term274080, term274080.getClass(), "hash3", 0);
        setField(term274080, term274080.getClass(), "key1", null);
        setField(term274080, term274080.getClass(), "key2", null);
        setField(term274080, term274080.getClass(), "key3", null);
        setField(term274080, term274080.getClass(), "value1", null);
        setField(term274080, term274080.getClass(), "value2", null);
        setField(term274080, term274080.getClass(), "value3", null);
        setFloatField(term274081, term274081.getClass(), "loadFactor", 0.75F);
        setIntField(term274081, term274081.getClass(), "size", 2);
        setField(term274083, term274083.getClass(), "next", null);
        setField(term274083, term274083.getClass(), "key", term274080);
        setField(term274083, term274083.getClass(), "value", null);
        setElement(term274082, 5, term274083);
        setIntElement(term274082, 6, 5);
        setField(term274081, term274081.getClass(), "data", term274082);
        setIntField(term274081, term274081.getClass(), "threshold", 12);
        setIntField(term274081, term274081.getClass(), "modCount", 2);
        setField(term274081, term274081.getClass(), "entrySet", null);
        setField(term274081, term274081.getClass(), "keySet", null);
        setField(term274081, term274081.getClass(), "values", null);
        setField(term274081, term274081.getClass(), "keySet", null);
        setField(term274081, term274081.getClass(), "values", null);
        setField(term274080, term274080.getClass(), "delegateMap", term274081);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term273775;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term273775, args);
        assertTrue(recursiveEquals(term273775, term274076));
        assertTrue(recursiveEquals(term273775, term274080));
        assertTrue(recursiveEquals(retValue, null));
    }

};


