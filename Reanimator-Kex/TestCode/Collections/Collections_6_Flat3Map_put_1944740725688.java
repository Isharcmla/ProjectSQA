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

public class Flat3Map_put_1944740725688 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159695;
     Object term159787;
     Object term160837;
     Object term160845;

    public Flat3Map_put_1944740725688() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159695 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term159695, term159695.getClass(), "delegateMap", null);
        setIntField(term159695, term159695.getClass(), "size", 3);
        setIntField(term159695, term159695.getClass(), "hash3", 0);
        setField(term159695, term159695.getClass(), "key3", null);
        setIntField(term159695, term159695.getClass(), "hash2", 0);
        setField(term159695, term159695.getClass(), "key2", term159695);
        term159787 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term159897 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term159787, term159787.getClass(), "delegateMap", null);
        setIntField(term159787, term159787.getClass(), "size", 3);
        setIntField(term159787, term159787.getClass(), "hash3", 0);
        setField(term159787, term159787.getClass(), "value3", null);
        setIntField(term159787, term159787.getClass(), "hash2", 0);
        setField(term159787, term159787.getClass(), "value2", null);
        setIntField(term159787, term159787.getClass(), "hash1", 0);
        setIntField(term159897, term159897.getClass(), "size", 0);
        setField(term159787, term159787.getClass(), "value1", term159897);
        term160837 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term160838 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term160839 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term160840 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term160841 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term160842 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term160843 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term160844 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term160837, term160837.getClass(), "size", 0);
        setIntField(term160837, term160837.getClass(), "hash1", 0);
        setIntField(term160837, term160837.getClass(), "hash2", 0);
        setIntField(term160837, term160837.getClass(), "hash3", 0);
        setField(term160837, term160837.getClass(), "key1", null);
        setField(term160837, term160837.getClass(), "key2", null);
        setField(term160837, term160837.getClass(), "key3", null);
        setField(term160837, term160837.getClass(), "value1", null);
        setField(term160837, term160837.getClass(), "value2", null);
        setField(term160837, term160837.getClass(), "value3", null);
        setFloatField(term160838, term160838.getClass(), "loadFactor", 0.75F);
        setIntField(term160838, term160838.getClass(), "size", 3);
        setField(term160841, term160841.getClass(), "next", null);
        setField(term160841, term160841.getClass(), "key", term160837);
        setField(term160841, term160841.getClass(), "value", null);
        setField(term160840, term160840.getClass(), "next", term160841);
        setIntField(term160842, term160842.getClass(), "size", 3);
        setIntField(term160842, term160842.getClass(), "hash1", 0);
        setIntField(term160842, term160842.getClass(), "hash2", 0);
        setIntField(term160842, term160842.getClass(), "hash3", 0);
        setField(term160842, term160842.getClass(), "key1", null);
        setField(term160842, term160842.getClass(), "key2", null);
        setField(term160842, term160842.getClass(), "key3", null);
        setField(term160842, term160842.getClass(), "value1", null);
        setField(term160842, term160842.getClass(), "value2", null);
        setField(term160842, term160842.getClass(), "value3", null);
        setField(term160842, term160842.getClass(), "delegateMap", null);
        setField(term160840, term160840.getClass(), "key", term160842);
        setField(term160840, term160840.getClass(), "value", null);
        setElement(term160839, 0, term160840);
        setField(term160843, term160843.getClass(), "next", null);
        setField(term160843, term160843.getClass(), "key", term160844);
        setField(term160843, term160843.getClass(), "value", null);
        setElement(term160839, 5, term160843);
        setField(term160838, term160838.getClass(), "data", term160839);
        setIntField(term160838, term160838.getClass(), "threshold", 12);
        setIntField(term160838, term160838.getClass(), "modCount", 3);
        setField(term160838, term160838.getClass(), "entrySet", null);
        setField(term160838, term160838.getClass(), "keySet", null);
        setField(term160838, term160838.getClass(), "values", null);
        setField(term160838, term160838.getClass(), "keySet", null);
        setField(term160838, term160838.getClass(), "values", null);
        setField(term160837, term160837.getClass(), "delegateMap", term160838);
        term160845 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term160845, term160845.getClass(), "size", 3);
        setIntField(term160845, term160845.getClass(), "hash1", 0);
        setIntField(term160845, term160845.getClass(), "hash2", 0);
        setIntField(term160845, term160845.getClass(), "hash3", 0);
        setField(term160845, term160845.getClass(), "key1", null);
        setField(term160845, term160845.getClass(), "key2", null);
        setField(term160845, term160845.getClass(), "key3", null);
        setField(term160845, term160845.getClass(), "value1", null);
        setField(term160845, term160845.getClass(), "value2", null);
        setField(term160845, term160845.getClass(), "value3", null);
        setField(term160845, term160845.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term159787;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term159695, args);
        assertTrue(recursiveEquals(term159695, term160837));
        assertTrue(recursiveEquals(term159787, term160845));
        assertTrue(recursiveEquals(retValue, null));
    }

};


