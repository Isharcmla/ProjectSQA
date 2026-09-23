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

public class Flat3Map_put_1944740725911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241535;
     Object term241867;
     Object term242240;
     Object term242250;

    public Flat3Map_put_1944740725911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term241535 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term241627 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term241737 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term241775 = newInstance(Class.forName("java.lang.Object"));
        setField(term241535, term241535.getClass(), "delegateMap", null);
        setIntField(term241535, term241535.getClass(), "size", 3);
        setIntField(term241535, term241535.getClass(), "hash3", 0);
        setField(term241627, term241627.getClass(), "delegateMap", null);
        setIntField(term241627, term241627.getClass(), "size", 3);
        setIntField(term241737, term241737.getClass(), "size", 3);
        setField(term241627, term241627.getClass(), "key3", term241737);
        setField(term241627, term241627.getClass(), "key2", null);
        setField(term241627, term241627.getClass(), "value2", null);
        setIntField(term241627, term241627.getClass(), "hash3", 0);
        setIntField(term241627, term241627.getClass(), "hash2", 0);
        setIntField(term241627, term241627.getClass(), "hash1", 0);
        setField(term241627, term241627.getClass(), "key1", null);
        setField(term241535, term241535.getClass(), "key3", term241627);
        setIntField(term241535, term241535.getClass(), "hash2", 0);
        setField(term241535, term241535.getClass(), "key2", term241775);
        setIntField(term241535, term241535.getClass(), "hash1", -1);
        term241867 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term241959 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term241867, term241867.getClass(), "delegateMap", null);
        setIntField(term241867, term241867.getClass(), "size", 3);
        setIntField(term241867, term241867.getClass(), "hash3", 0);
        setField(term241867, term241867.getClass(), "value3", null);
        setIntField(term241867, term241867.getClass(), "hash2", 0);
        setField(term241867, term241867.getClass(), "value2", null);
        setIntField(term241867, term241867.getClass(), "hash1", 0);
        setField(term241867, term241867.getClass(), "value1", null);
        setField(term241867, term241867.getClass(), "key3", null);
        setField(term241959, term241959.getClass(), "delegateMap", null);
        setIntField(term241959, term241959.getClass(), "size", 2);
        setIntField(term241959, term241959.getClass(), "hash2", 0);
        setField(term241959, term241959.getClass(), "value2", null);
        setIntField(term241959, term241959.getClass(), "hash1", 0);
        setField(term241959, term241959.getClass(), "value1", null);
        setField(term241867, term241867.getClass(), "key2", term241959);
        term242240 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term242241 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term242242 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term242243 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term242244 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term242245 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term242246 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term242247 = newInstance(Class.forName("java.lang.Object"));
        Object term242248 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term242249 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term242240, term242240.getClass(), "size", 0);
        setIntField(term242240, term242240.getClass(), "hash1", 0);
        setIntField(term242240, term242240.getClass(), "hash2", 0);
        setIntField(term242240, term242240.getClass(), "hash3", 0);
        setField(term242240, term242240.getClass(), "key1", null);
        setField(term242240, term242240.getClass(), "key2", null);
        setField(term242240, term242240.getClass(), "key3", null);
        setField(term242240, term242240.getClass(), "value1", null);
        setField(term242240, term242240.getClass(), "value2", null);
        setField(term242240, term242240.getClass(), "value3", null);
        setFloatField(term242241, term242241.getClass(), "loadFactor", 0.75F);
        setIntField(term242241, term242241.getClass(), "size", 4);
        setField(term242244, term242244.getClass(), "next", null);
        setField(term242244, term242244.getClass(), "key", null);
        setField(term242244, term242244.getClass(), "value", null);
        setField(term242243, term242243.getClass(), "next", term242244);
        setIntField(term242245, term242245.getClass(), "size", 3);
        setIntField(term242245, term242245.getClass(), "hash1", 0);
        setIntField(term242245, term242245.getClass(), "hash2", 0);
        setIntField(term242245, term242245.getClass(), "hash3", 0);
        setField(term242245, term242245.getClass(), "key1", null);
        setField(term242245, term242245.getClass(), "key2", null);
        setField(term242245, term242245.getClass(), "key3", null);
        setField(term242245, term242245.getClass(), "value1", null);
        setField(term242245, term242245.getClass(), "value2", null);
        setField(term242245, term242245.getClass(), "value3", null);
        setField(term242245, term242245.getClass(), "delegateMap", null);
        setField(term242243, term242243.getClass(), "key", term242245);
        setField(term242243, term242243.getClass(), "value", null);
        setElement(term242242, 0, term242243);
        setField(term242246, term242246.getClass(), "next", null);
        setField(term242246, term242246.getClass(), "key", term242247);
        setField(term242246, term242246.getClass(), "value", null);
        setElement(term242242, 6, term242246);
        setField(term242248, term242248.getClass(), "next", null);
        setField(term242248, term242248.getClass(), "key", term242249);
        setField(term242248, term242248.getClass(), "value", null);
        setElement(term242242, 7, term242248);
        setField(term242241, term242241.getClass(), "data", term242242);
        setIntField(term242241, term242241.getClass(), "threshold", 12);
        setIntField(term242241, term242241.getClass(), "modCount", 4);
        setField(term242241, term242241.getClass(), "entrySet", null);
        setField(term242241, term242241.getClass(), "keySet", null);
        setField(term242241, term242241.getClass(), "values", null);
        setField(term242241, term242241.getClass(), "keySet", null);
        setField(term242241, term242241.getClass(), "values", null);
        setField(term242240, term242240.getClass(), "delegateMap", term242241);
        term242250 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term242250, term242250.getClass(), "size", 3);
        setIntField(term242250, term242250.getClass(), "hash1", 0);
        setIntField(term242250, term242250.getClass(), "hash2", 0);
        setIntField(term242250, term242250.getClass(), "hash3", 0);
        setField(term242250, term242250.getClass(), "key1", null);
        setField(term242250, term242250.getClass(), "key2", null);
        setField(term242250, term242250.getClass(), "key3", null);
        setField(term242250, term242250.getClass(), "value1", null);
        setField(term242250, term242250.getClass(), "value2", null);
        setField(term242250, term242250.getClass(), "value3", null);
        setField(term242250, term242250.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term241867;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term241535, args);
        assertTrue(recursiveEquals(term241535, term242240));
        assertTrue(recursiveEquals(term241867, term242250));
        assertTrue(recursiveEquals(retValue, null));
    }

};


