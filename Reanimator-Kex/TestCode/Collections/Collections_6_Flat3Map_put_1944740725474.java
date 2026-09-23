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

public class Flat3Map_put_1944740725474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86854;
     Object term86946;
     Object term87883;
     Object term87891;

    public Flat3Map_put_1944740725474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86854 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term86854, term86854.getClass(), "delegateMap", null);
        setIntField(term86854, term86854.getClass(), "size", 3);
        setIntField(term86854, term86854.getClass(), "hash3", 0);
        setField(term86854, term86854.getClass(), "key3", null);
        setIntField(term86854, term86854.getClass(), "hash2", 0);
        setField(term86854, term86854.getClass(), "key2", null);
        setIntField(term86854, term86854.getClass(), "hash1", 0);
        setField(term86854, term86854.getClass(), "key1", term86854);
        term86946 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term87056 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term86946, term86946.getClass(), "delegateMap", null);
        setIntField(term86946, term86946.getClass(), "size", 3);
        setIntField(term86946, term86946.getClass(), "hash3", 0);
        setField(term86946, term86946.getClass(), "value3", null);
        setIntField(term86946, term86946.getClass(), "hash2", 0);
        setField(term86946, term86946.getClass(), "value2", null);
        setIntField(term86946, term86946.getClass(), "hash1", 0);
        setIntField(term87056, term87056.getClass(), "size", 0);
        setField(term86946, term86946.getClass(), "value1", term87056);
        term87883 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term87884 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term87885 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term87886 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term87887 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term87888 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term87889 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term87890 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term87883, term87883.getClass(), "size", 0);
        setIntField(term87883, term87883.getClass(), "hash1", 0);
        setIntField(term87883, term87883.getClass(), "hash2", 0);
        setIntField(term87883, term87883.getClass(), "hash3", 0);
        setField(term87883, term87883.getClass(), "key1", null);
        setField(term87883, term87883.getClass(), "key2", null);
        setField(term87883, term87883.getClass(), "key3", null);
        setField(term87883, term87883.getClass(), "value1", null);
        setField(term87883, term87883.getClass(), "value2", null);
        setField(term87883, term87883.getClass(), "value3", null);
        setFloatField(term87884, term87884.getClass(), "loadFactor", 0.75F);
        setIntField(term87884, term87884.getClass(), "size", 3);
        setField(term87887, term87887.getClass(), "next", null);
        setField(term87887, term87887.getClass(), "key", term87883);
        setField(term87887, term87887.getClass(), "value", null);
        setField(term87886, term87886.getClass(), "next", term87887);
        setIntField(term87888, term87888.getClass(), "size", 3);
        setIntField(term87888, term87888.getClass(), "hash1", 0);
        setIntField(term87888, term87888.getClass(), "hash2", 0);
        setIntField(term87888, term87888.getClass(), "hash3", 0);
        setField(term87888, term87888.getClass(), "key1", null);
        setField(term87888, term87888.getClass(), "key2", null);
        setField(term87888, term87888.getClass(), "key3", null);
        setField(term87888, term87888.getClass(), "value1", null);
        setField(term87888, term87888.getClass(), "value2", null);
        setField(term87888, term87888.getClass(), "value3", null);
        setField(term87888, term87888.getClass(), "delegateMap", null);
        setField(term87886, term87886.getClass(), "key", term87888);
        setField(term87886, term87886.getClass(), "value", null);
        setElement(term87885, 0, term87886);
        setField(term87889, term87889.getClass(), "next", null);
        setField(term87889, term87889.getClass(), "key", term87890);
        setField(term87889, term87889.getClass(), "value", null);
        setElement(term87885, 5, term87889);
        setField(term87884, term87884.getClass(), "data", term87885);
        setIntField(term87884, term87884.getClass(), "threshold", 12);
        setIntField(term87884, term87884.getClass(), "modCount", 3);
        setField(term87884, term87884.getClass(), "entrySet", null);
        setField(term87884, term87884.getClass(), "keySet", null);
        setField(term87884, term87884.getClass(), "values", null);
        setField(term87884, term87884.getClass(), "keySet", null);
        setField(term87884, term87884.getClass(), "values", null);
        setField(term87883, term87883.getClass(), "delegateMap", term87884);
        term87891 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term87891, term87891.getClass(), "size", 3);
        setIntField(term87891, term87891.getClass(), "hash1", 0);
        setIntField(term87891, term87891.getClass(), "hash2", 0);
        setIntField(term87891, term87891.getClass(), "hash3", 0);
        setField(term87891, term87891.getClass(), "key1", null);
        setField(term87891, term87891.getClass(), "key2", null);
        setField(term87891, term87891.getClass(), "key3", null);
        setField(term87891, term87891.getClass(), "value1", null);
        setField(term87891, term87891.getClass(), "value2", null);
        setField(term87891, term87891.getClass(), "value3", null);
        setField(term87891, term87891.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term86946;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term86854, args);
        assertTrue(recursiveEquals(term86854, term87883));
        assertTrue(recursiveEquals(term86946, term87891));
        assertTrue(recursiveEquals(retValue, null));
    }

};


