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

public class Flat3Map_put_1944740725277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45165;
     Object term46097;
     Object term46104;

    public Flat3Map_put_1944740725277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45165 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term45220 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term45165, term45165.getClass(), "delegateMap", null);
        setIntField(term45165, term45165.getClass(), "size", 3);
        setIntField(term45165, term45165.getClass(), "hash3", 0);
        setField(term45165, term45165.getClass(), "value3", null);
        setIntField(term45165, term45165.getClass(), "hash2", 0);
        setField(term45165, term45165.getClass(), "value2", null);
        setIntField(term45165, term45165.getClass(), "hash1", 0);
        setField(term45165, term45165.getClass(), "value1", term45220);
        term46097 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term46098 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term46099 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term46100 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term46101 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term46102 = newInstance(Class.forName("java.lang.Object"));
        Object term46103 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term46097, term46097.getClass(), "size", 0);
        setIntField(term46097, term46097.getClass(), "hash1", 0);
        setIntField(term46097, term46097.getClass(), "hash2", 0);
        setIntField(term46097, term46097.getClass(), "hash3", 0);
        setField(term46097, term46097.getClass(), "key1", null);
        setField(term46097, term46097.getClass(), "key2", null);
        setField(term46097, term46097.getClass(), "key3", null);
        setField(term46097, term46097.getClass(), "value1", null);
        setField(term46097, term46097.getClass(), "value2", null);
        setField(term46097, term46097.getClass(), "value3", null);
        setFloatField(term46098, term46098.getClass(), "loadFactor", 0.75F);
        setIntField(term46098, term46098.getClass(), "size", 2);
        setField(term46100, term46100.getClass(), "next", null);
        setField(term46100, term46100.getClass(), "key", term46097);
        setField(term46100, term46100.getClass(), "value", null);
        setElement(term46099, 0, term46100);
        setField(term46101, term46101.getClass(), "next", null);
        setField(term46101, term46101.getClass(), "key", term46102);
        setFloatField(term46103, term46103.getClass(), "loadFactor", 0.0F);
        setIntField(term46103, term46103.getClass(), "size", 0);
        setField(term46103, term46103.getClass(), "data", null);
        setIntField(term46103, term46103.getClass(), "threshold", 0);
        setIntField(term46103, term46103.getClass(), "modCount", 0);
        setField(term46103, term46103.getClass(), "entrySet", null);
        setField(term46103, term46103.getClass(), "keySet", null);
        setField(term46103, term46103.getClass(), "values", null);
        setField(term46103, term46103.getClass(), "keySet", null);
        setField(term46103, term46103.getClass(), "values", null);
        setField(term46101, term46101.getClass(), "value", term46103);
        setElement(term46099, 5, term46101);
        setField(term46098, term46098.getClass(), "data", term46099);
        setIntField(term46098, term46098.getClass(), "threshold", 12);
        setIntField(term46098, term46098.getClass(), "modCount", 2);
        setField(term46098, term46098.getClass(), "entrySet", null);
        setField(term46098, term46098.getClass(), "keySet", null);
        setField(term46098, term46098.getClass(), "values", null);
        setField(term46098, term46098.getClass(), "keySet", null);
        setField(term46098, term46098.getClass(), "values", null);
        setField(term46097, term46097.getClass(), "delegateMap", term46098);
        term46104 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term46105 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term46106 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term46107 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term46108 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term46109 = newInstance(Class.forName("java.lang.Object"));
        Object term46110 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term46104, term46104.getClass(), "size", 0);
        setIntField(term46104, term46104.getClass(), "hash1", 0);
        setIntField(term46104, term46104.getClass(), "hash2", 0);
        setIntField(term46104, term46104.getClass(), "hash3", 0);
        setField(term46104, term46104.getClass(), "key1", null);
        setField(term46104, term46104.getClass(), "key2", null);
        setField(term46104, term46104.getClass(), "key3", null);
        setField(term46104, term46104.getClass(), "value1", null);
        setField(term46104, term46104.getClass(), "value2", null);
        setField(term46104, term46104.getClass(), "value3", null);
        setFloatField(term46105, term46105.getClass(), "loadFactor", 0.75F);
        setIntField(term46105, term46105.getClass(), "size", 2);
        setField(term46107, term46107.getClass(), "next", null);
        setField(term46107, term46107.getClass(), "key", term46104);
        setField(term46107, term46107.getClass(), "value", null);
        setElement(term46106, 0, term46107);
        setField(term46108, term46108.getClass(), "next", null);
        setField(term46108, term46108.getClass(), "key", term46109);
        setFloatField(term46110, term46110.getClass(), "loadFactor", 0.0F);
        setIntField(term46110, term46110.getClass(), "size", 0);
        setField(term46110, term46110.getClass(), "data", null);
        setIntField(term46110, term46110.getClass(), "threshold", 0);
        setIntField(term46110, term46110.getClass(), "modCount", 0);
        setField(term46110, term46110.getClass(), "entrySet", null);
        setField(term46110, term46110.getClass(), "keySet", null);
        setField(term46110, term46110.getClass(), "values", null);
        setField(term46110, term46110.getClass(), "keySet", null);
        setField(term46110, term46110.getClass(), "values", null);
        setField(term46108, term46108.getClass(), "value", term46110);
        setElement(term46106, 5, term46108);
        setField(term46105, term46105.getClass(), "data", term46106);
        setIntField(term46105, term46105.getClass(), "threshold", 12);
        setIntField(term46105, term46105.getClass(), "modCount", 2);
        setField(term46105, term46105.getClass(), "entrySet", null);
        setField(term46105, term46105.getClass(), "keySet", null);
        setField(term46105, term46105.getClass(), "values", null);
        setField(term46105, term46105.getClass(), "keySet", null);
        setField(term46105, term46105.getClass(), "values", null);
        setField(term46104, term46104.getClass(), "delegateMap", term46105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term45165;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term45165, args);
        assertTrue(recursiveEquals(term45165, term46097));
        assertTrue(recursiveEquals(term45165, term46104));
        assertTrue(recursiveEquals(retValue, null));
    }

};


