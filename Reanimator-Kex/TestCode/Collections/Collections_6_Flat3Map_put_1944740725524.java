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

public class Flat3Map_put_1944740725524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100306;
     Object term101075;
     Object term101082;

    public Flat3Map_put_1944740725524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100306 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term100361 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term100418 = newInstance(Class.forName("org.apache.commons.collections.iterators.EmptyIterator"));
        setField(term100306, term100306.getClass(), "delegateMap", null);
        setIntField(term100306, term100306.getClass(), "size", 3);
        setIntField(term100306, term100306.getClass(), "hash3", 0);
        setField(term100306, term100306.getClass(), "value3", null);
        setIntField(term100306, term100306.getClass(), "hash2", 0);
        setIntField(term100361, term100361.getClass(), "size", 0);
        setField(term100306, term100306.getClass(), "value2", term100361);
        setIntField(term100306, term100306.getClass(), "hash1", 0);
        setField(term100306, term100306.getClass(), "value1", term100418);
        term101075 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term101076 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term101077 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term101078 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term101079 = newInstance(Class.forName("java.lang.Object"));
        Object term101080 = newInstance(Class.forName("org.apache.commons.collections.iterators.EmptyIterator"));
        Object term101081 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setIntField(term101075, term101075.getClass(), "size", 0);
        setIntField(term101075, term101075.getClass(), "hash1", 0);
        setIntField(term101075, term101075.getClass(), "hash2", 0);
        setIntField(term101075, term101075.getClass(), "hash3", 0);
        setField(term101075, term101075.getClass(), "key1", null);
        setField(term101075, term101075.getClass(), "key2", null);
        setField(term101075, term101075.getClass(), "key3", null);
        setField(term101075, term101075.getClass(), "value1", null);
        setField(term101075, term101075.getClass(), "value2", null);
        setField(term101075, term101075.getClass(), "value3", null);
        setFloatField(term101076, term101076.getClass(), "loadFactor", 0.75F);
        setIntField(term101076, term101076.getClass(), "size", 2);
        setField(term101078, term101078.getClass(), "next", null);
        setField(term101078, term101078.getClass(), "key", term101079);
        setField(term101078, term101078.getClass(), "value", term101080);
        setElement(term101077, 5, term101078);
        setField(term101081, term101081.getClass(), "next", null);
        setField(term101081, term101081.getClass(), "key", term101075);
        setField(term101081, term101081.getClass(), "value", null);
        setElement(term101077, 13, term101081);
        setField(term101076, term101076.getClass(), "data", term101077);
        setIntField(term101076, term101076.getClass(), "threshold", 12);
        setIntField(term101076, term101076.getClass(), "modCount", 2);
        setField(term101076, term101076.getClass(), "entrySet", null);
        setField(term101076, term101076.getClass(), "keySet", null);
        setField(term101076, term101076.getClass(), "values", null);
        setField(term101076, term101076.getClass(), "keySet", null);
        setField(term101076, term101076.getClass(), "values", null);
        setField(term101075, term101075.getClass(), "delegateMap", term101076);
        term101082 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term101083 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term101084 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term101085 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term101086 = newInstance(Class.forName("java.lang.Object"));
        Object term101087 = newInstance(Class.forName("org.apache.commons.collections.iterators.EmptyIterator"));
        Object term101088 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setIntField(term101082, term101082.getClass(), "size", 0);
        setIntField(term101082, term101082.getClass(), "hash1", 0);
        setIntField(term101082, term101082.getClass(), "hash2", 0);
        setIntField(term101082, term101082.getClass(), "hash3", 0);
        setField(term101082, term101082.getClass(), "key1", null);
        setField(term101082, term101082.getClass(), "key2", null);
        setField(term101082, term101082.getClass(), "key3", null);
        setField(term101082, term101082.getClass(), "value1", null);
        setField(term101082, term101082.getClass(), "value2", null);
        setField(term101082, term101082.getClass(), "value3", null);
        setFloatField(term101083, term101083.getClass(), "loadFactor", 0.75F);
        setIntField(term101083, term101083.getClass(), "size", 2);
        setField(term101085, term101085.getClass(), "next", null);
        setField(term101085, term101085.getClass(), "key", term101086);
        setField(term101085, term101085.getClass(), "value", term101087);
        setElement(term101084, 5, term101085);
        setField(term101088, term101088.getClass(), "next", null);
        setField(term101088, term101088.getClass(), "key", term101082);
        setField(term101088, term101088.getClass(), "value", null);
        setElement(term101084, 13, term101088);
        setField(term101083, term101083.getClass(), "data", term101084);
        setIntField(term101083, term101083.getClass(), "threshold", 12);
        setIntField(term101083, term101083.getClass(), "modCount", 2);
        setField(term101083, term101083.getClass(), "entrySet", null);
        setField(term101083, term101083.getClass(), "keySet", null);
        setField(term101083, term101083.getClass(), "values", null);
        setField(term101083, term101083.getClass(), "keySet", null);
        setField(term101083, term101083.getClass(), "values", null);
        setField(term101082, term101082.getClass(), "delegateMap", term101083);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term100306;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term100306, args);
        assertTrue(recursiveEquals(term100306, term101075));
        assertTrue(recursiveEquals(term100306, term101082));
        assertTrue(recursiveEquals(retValue, null));
    }

};


