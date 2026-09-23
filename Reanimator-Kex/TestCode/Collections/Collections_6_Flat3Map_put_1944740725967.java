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

public class Flat3Map_put_1944740725967 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267689;
     Object term267965;
     Object term268434;
     Object term268441;

    public Flat3Map_put_1944740725967() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term267689 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term267781 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term267873 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term267689, term267689.getClass(), "delegateMap", null);
        setIntField(term267689, term267689.getClass(), "size", 3);
        setIntField(term267689, term267689.getClass(), "hash3", 0);
        setField(term267781, term267781.getClass(), "delegateMap", null);
        setIntField(term267781, term267781.getClass(), "size", 3);
        setField(term267873, term267873.getClass(), "delegateMap", null);
        setIntField(term267873, term267873.getClass(), "size", 0);
        setField(term267781, term267781.getClass(), "key3", term267873);
        setField(term267781, term267781.getClass(), "key2", null);
        setField(term267781, term267781.getClass(), "value2", null);
        setIntField(term267781, term267781.getClass(), "hash3", 0);
        setField(term267781, term267781.getClass(), "value3", null);
        setIntField(term267781, term267781.getClass(), "hash2", -1);
        setField(term267689, term267689.getClass(), "key3", term267781);
        term267965 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term268057 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term268149 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term267965, term267965.getClass(), "delegateMap", null);
        setIntField(term267965, term267965.getClass(), "size", 3);
        setIntField(term267965, term267965.getClass(), "hash3", 0);
        setField(term267965, term267965.getClass(), "value3", null);
        setIntField(term267965, term267965.getClass(), "hash2", 0);
        setField(term267965, term267965.getClass(), "value2", null);
        setIntField(term267965, term267965.getClass(), "hash1", 0);
        setField(term267965, term267965.getClass(), "value1", null);
        setField(term267965, term267965.getClass(), "key3", null);
        setField(term268057, term268057.getClass(), "delegateMap", null);
        setIntField(term268057, term268057.getClass(), "size", 0);
        setField(term267965, term267965.getClass(), "key2", term268057);
        setField(term268149, term268149.getClass(), "delegateMap", null);
        setIntField(term268149, term268149.getClass(), "size", 1);
        setIntField(term268149, term268149.getClass(), "hash1", 0);
        setField(term268149, term268149.getClass(), "value1", null);
        setField(term267965, term267965.getClass(), "key1", term268149);
        term268434 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term268435 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term268436 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term268437 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term268438 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term268439 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term268440 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term268434, term268434.getClass(), "size", 0);
        setIntField(term268434, term268434.getClass(), "hash1", 0);
        setIntField(term268434, term268434.getClass(), "hash2", 0);
        setIntField(term268434, term268434.getClass(), "hash3", 0);
        setField(term268434, term268434.getClass(), "key1", null);
        setField(term268434, term268434.getClass(), "key2", null);
        setField(term268434, term268434.getClass(), "key3", null);
        setField(term268434, term268434.getClass(), "value1", null);
        setField(term268434, term268434.getClass(), "value2", null);
        setField(term268434, term268434.getClass(), "value3", null);
        setFloatField(term268435, term268435.getClass(), "loadFactor", 0.75F);
        setIntField(term268435, term268435.getClass(), "size", 3);
        setField(term268437, term268437.getClass(), "next", null);
        setIntField(term268438, term268438.getClass(), "size", 3);
        setIntField(term268438, term268438.getClass(), "hash1", 0);
        setIntField(term268438, term268438.getClass(), "hash2", 0);
        setIntField(term268438, term268438.getClass(), "hash3", 16);
        setField(term268438, term268438.getClass(), "key1", null);
        setField(term268438, term268438.getClass(), "key2", null);
        setField(term268438, term268438.getClass(), "key3", null);
        setField(term268438, term268438.getClass(), "value1", null);
        setField(term268438, term268438.getClass(), "value2", null);
        setField(term268438, term268438.getClass(), "value3", null);
        setField(term268438, term268438.getClass(), "delegateMap", null);
        setField(term268437, term268437.getClass(), "key", term268438);
        setField(term268437, term268437.getClass(), "value", null);
        setElement(term268436, 0, term268437);
        setField(term268439, term268439.getClass(), "next", true);
        setField(term268439, term268439.getClass(), "key", term268440);
        setField(term268439, term268439.getClass(), "value", null);
        setElement(term268436, 6, term268439);
        setField(term268435, term268435.getClass(), "data", term268436);
        setIntField(term268435, term268435.getClass(), "threshold", 12);
        setIntField(term268435, term268435.getClass(), "modCount", 3);
        setField(term268435, term268435.getClass(), "entrySet", null);
        setField(term268435, term268435.getClass(), "keySet", null);
        setField(term268435, term268435.getClass(), "values", null);
        setField(term268435, term268435.getClass(), "keySet", null);
        setField(term268435, term268435.getClass(), "values", null);
        setField(term268434, term268434.getClass(), "delegateMap", term268435);
        term268441 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term268441, term268441.getClass(), "size", 3);
        setIntField(term268441, term268441.getClass(), "hash1", 0);
        setIntField(term268441, term268441.getClass(), "hash2", 0);
        setIntField(term268441, term268441.getClass(), "hash3", 16);
        setField(term268441, term268441.getClass(), "key1", null);
        setField(term268441, term268441.getClass(), "key2", null);
        setField(term268441, term268441.getClass(), "key3", null);
        setField(term268441, term268441.getClass(), "value1", null);
        setField(term268441, term268441.getClass(), "value2", null);
        setField(term268441, term268441.getClass(), "value3", null);
        setField(term268441, term268441.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term267965;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term267689, args);
        assertTrue(recursiveEquals(term267689, term268434));
        assertTrue(recursiveEquals(term267965, term268441));
        assertTrue(recursiveEquals(retValue, null));
    }

};


