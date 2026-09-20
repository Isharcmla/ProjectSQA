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

public class Flat3Map_put_1944740725908 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182503;
     Object term183554;
     Object term183559;

    public Flat3Map_put_1944740725908() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term182503 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term182503, term182503.getClass(), "delegateMap", null);
        setIntField(term182503, term182503.getClass(), "size", 3);
        setIntField(term182503, term182503.getClass(), "hash3", 0);
        setField(term182503, term182503.getClass(), "value3", null);
        setIntField(term182503, term182503.getClass(), "hash2", 0);
        setField(term182503, term182503.getClass(), "value2", null);
        setIntField(term182503, term182503.getClass(), "hash1", 0);
        setField(term182503, term182503.getClass(), "value1", null);
        term183554 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term183555 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term183556 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term183557 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term183558 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setIntField(term183554, term183554.getClass(), "size", 0);
        setIntField(term183554, term183554.getClass(), "hash1", 0);
        setIntField(term183554, term183554.getClass(), "hash2", 0);
        setIntField(term183554, term183554.getClass(), "hash3", 0);
        setField(term183554, term183554.getClass(), "key1", null);
        setField(term183554, term183554.getClass(), "key2", null);
        setField(term183554, term183554.getClass(), "key3", null);
        setField(term183554, term183554.getClass(), "value1", null);
        setField(term183554, term183554.getClass(), "value2", null);
        setField(term183554, term183554.getClass(), "value3", null);
        setFloatField(term183555, term183555.getClass(), "loadFactor", 0.75F);
        setIntField(term183555, term183555.getClass(), "size", 2);
        setField(term183558, term183558.getClass(), "next", null);
        setField(term183558, term183558.getClass(), "key", null);
        setField(term183558, term183558.getClass(), "value", null);
        setField(term183557, term183557.getClass(), "next", term183558);
        setField(term183557, term183557.getClass(), "key", term183554);
        setField(term183557, term183557.getClass(), "value", null);
        setElement(term183556, 0, term183557);
        setField(term183555, term183555.getClass(), "data", term183556);
        setIntField(term183555, term183555.getClass(), "threshold", 12);
        setIntField(term183555, term183555.getClass(), "modCount", 2);
        setField(term183555, term183555.getClass(), "entrySet", null);
        setField(term183555, term183555.getClass(), "keySet", null);
        setField(term183555, term183555.getClass(), "values", null);
        setField(term183555, term183555.getClass(), "keySet", null);
        setField(term183555, term183555.getClass(), "values", null);
        setField(term183554, term183554.getClass(), "delegateMap", term183555);
        term183559 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term183560 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term183561 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term183562 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term183563 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setIntField(term183559, term183559.getClass(), "size", 0);
        setIntField(term183559, term183559.getClass(), "hash1", 0);
        setIntField(term183559, term183559.getClass(), "hash2", 0);
        setIntField(term183559, term183559.getClass(), "hash3", 0);
        setField(term183559, term183559.getClass(), "key1", null);
        setField(term183559, term183559.getClass(), "key2", null);
        setField(term183559, term183559.getClass(), "key3", null);
        setField(term183559, term183559.getClass(), "value1", null);
        setField(term183559, term183559.getClass(), "value2", null);
        setField(term183559, term183559.getClass(), "value3", null);
        setFloatField(term183560, term183560.getClass(), "loadFactor", 0.75F);
        setIntField(term183560, term183560.getClass(), "size", 2);
        setField(term183563, term183563.getClass(), "next", null);
        setField(term183563, term183563.getClass(), "key", null);
        setField(term183563, term183563.getClass(), "value", null);
        setField(term183562, term183562.getClass(), "next", term183563);
        setField(term183562, term183562.getClass(), "key", term183559);
        setField(term183562, term183562.getClass(), "value", null);
        setElement(term183561, 0, term183562);
        setField(term183560, term183560.getClass(), "data", term183561);
        setIntField(term183560, term183560.getClass(), "threshold", 12);
        setIntField(term183560, term183560.getClass(), "modCount", 2);
        setField(term183560, term183560.getClass(), "entrySet", null);
        setField(term183560, term183560.getClass(), "keySet", null);
        setField(term183560, term183560.getClass(), "values", null);
        setField(term183560, term183560.getClass(), "keySet", null);
        setField(term183560, term183560.getClass(), "values", null);
        setField(term183559, term183559.getClass(), "delegateMap", term183560);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term182503;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term182503, args);
        assertTrue(recursiveEquals(term182503, term183554));
        assertTrue(recursiveEquals(term182503, term183559));
        assertTrue(recursiveEquals(retValue, null));
    }

};
