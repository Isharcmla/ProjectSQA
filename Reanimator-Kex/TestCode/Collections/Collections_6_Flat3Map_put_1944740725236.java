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

public class Flat3Map_put_1944740725236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38813;
     Object term39276;
     Object term39282;

    public Flat3Map_put_1944740725236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38813 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term38813, term38813.getClass(), "delegateMap", null);
        setIntField(term38813, term38813.getClass(), "size", 3);
        term39276 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term39277 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term39278 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term39279 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term39280 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term39281 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term39276, term39276.getClass(), "size", 0);
        setIntField(term39276, term39276.getClass(), "hash1", 0);
        setIntField(term39276, term39276.getClass(), "hash2", 0);
        setIntField(term39276, term39276.getClass(), "hash3", 0);
        setField(term39276, term39276.getClass(), "key1", null);
        setField(term39276, term39276.getClass(), "key2", null);
        setField(term39276, term39276.getClass(), "key3", null);
        setField(term39276, term39276.getClass(), "value1", null);
        setField(term39276, term39276.getClass(), "value2", null);
        setField(term39276, term39276.getClass(), "value3", null);
        setFloatField(term39277, term39277.getClass(), "loadFactor", 0.75F);
        setIntField(term39277, term39277.getClass(), "size", 2);
        setField(term39279, term39279.getClass(), "next", null);
        setField(term39279, term39279.getClass(), "key", term39276);
        setField(term39279, term39279.getClass(), "value", null);
        setElement(term39278, 0, term39279);
        setField(term39280, term39280.getClass(), "next", null);
        setField(term39280, term39280.getClass(), "key", term39281);
        setField(term39280, term39280.getClass(), "value", null);
        setElement(term39278, 5, term39280);
        setField(term39277, term39277.getClass(), "data", term39278);
        setIntField(term39277, term39277.getClass(), "threshold", 12);
        setIntField(term39277, term39277.getClass(), "modCount", 2);
        setField(term39277, term39277.getClass(), "entrySet", null);
        setField(term39277, term39277.getClass(), "keySet", null);
        setField(term39277, term39277.getClass(), "values", null);
        setField(term39277, term39277.getClass(), "keySet", null);
        setField(term39277, term39277.getClass(), "values", null);
        setField(term39276, term39276.getClass(), "delegateMap", term39277);
        term39282 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term39283 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term39284 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term39285 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term39286 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term39287 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term39282, term39282.getClass(), "size", 0);
        setIntField(term39282, term39282.getClass(), "hash1", 0);
        setIntField(term39282, term39282.getClass(), "hash2", 0);
        setIntField(term39282, term39282.getClass(), "hash3", 0);
        setField(term39282, term39282.getClass(), "key1", null);
        setField(term39282, term39282.getClass(), "key2", null);
        setField(term39282, term39282.getClass(), "key3", null);
        setField(term39282, term39282.getClass(), "value1", null);
        setField(term39282, term39282.getClass(), "value2", null);
        setField(term39282, term39282.getClass(), "value3", null);
        setFloatField(term39283, term39283.getClass(), "loadFactor", 0.75F);
        setIntField(term39283, term39283.getClass(), "size", 2);
        setField(term39285, term39285.getClass(), "next", null);
        setField(term39285, term39285.getClass(), "key", term39282);
        setField(term39285, term39285.getClass(), "value", null);
        setElement(term39284, 0, term39285);
        setField(term39286, term39286.getClass(), "next", null);
        setField(term39286, term39286.getClass(), "key", term39287);
        setField(term39286, term39286.getClass(), "value", null);
        setElement(term39284, 5, term39286);
        setField(term39283, term39283.getClass(), "data", term39284);
        setIntField(term39283, term39283.getClass(), "threshold", 12);
        setIntField(term39283, term39283.getClass(), "modCount", 2);
        setField(term39283, term39283.getClass(), "entrySet", null);
        setField(term39283, term39283.getClass(), "keySet", null);
        setField(term39283, term39283.getClass(), "values", null);
        setField(term39283, term39283.getClass(), "keySet", null);
        setField(term39283, term39283.getClass(), "values", null);
        setField(term39282, term39282.getClass(), "delegateMap", term39283);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term38813;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term38813, args);
        assertTrue(recursiveEquals(term38813, term39276));
        assertTrue(recursiveEquals(term38813, term39282));
        assertTrue(recursiveEquals(retValue, null));
    }

};


