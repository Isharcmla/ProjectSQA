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
import java.util.HashMap;

public class Flat3Map_put_1944740725439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79173;
     Object term79389;
     Object term79706;
     Object term79715;

    public Flat3Map_put_1944740725439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term79297 = new HashMap();
        term79173 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term79211 = newInstance(Class.forName("java.lang.Object"));
        Object term79249 = newInstance(Class.forName("java.lang.Object"));
        setField(term79173, term79173.getClass(), "delegateMap", null);
        setIntField(term79173, term79173.getClass(), "size", 3);
        setIntField(term79173, term79173.getClass(), "hash3", 0);
        setField(term79173, term79173.getClass(), "key3", term79211);
        setIntField(term79173, term79173.getClass(), "hash2", 0);
        setField(term79173, term79173.getClass(), "key2", term79249);
        setIntField(term79173, term79173.getClass(), "hash1", 0);
        setField(term79173, term79173.getClass(), "key1", term79297);
        term79389 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term79389, term79389.getClass(), "delegateMap", null);
        setIntField(term79389, term79389.getClass(), "size", 3);
        setIntField(term79389, term79389.getClass(), "hash3", 0);
        setField(term79389, term79389.getClass(), "value3", null);
        setIntField(term79389, term79389.getClass(), "hash2", 0);
        setField(term79389, term79389.getClass(), "value2", null);
        setIntField(term79389, term79389.getClass(), "hash1", 0);
        setField(term79389, term79389.getClass(), "value1", null);
        term79706 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term79707 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term79708 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term79709 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term79710 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term79711 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term79712 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term79713 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term79714 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term79706, term79706.getClass(), "size", 0);
        setIntField(term79706, term79706.getClass(), "hash1", 0);
        setIntField(term79706, term79706.getClass(), "hash2", 0);
        setIntField(term79706, term79706.getClass(), "hash3", 0);
        setField(term79706, term79706.getClass(), "key1", null);
        setField(term79706, term79706.getClass(), "key2", null);
        setField(term79706, term79706.getClass(), "key3", null);
        setField(term79706, term79706.getClass(), "value1", null);
        setField(term79706, term79706.getClass(), "value2", null);
        setField(term79706, term79706.getClass(), "value3", null);
        setFloatField(term79707, term79707.getClass(), "loadFactor", 0.75F);
        setIntField(term79707, term79707.getClass(), "size", 4);
        setField(term79710, term79710.getClass(), "next", null);
        setField(term79710, term79710.getClass(), "key", null);
        setField(term79710, term79710.getClass(), "value", null);
        setField(term79709, term79709.getClass(), "next", term79710);
        setIntField(term79711, term79711.getClass(), "size", 3);
        setIntField(term79711, term79711.getClass(), "hash1", 0);
        setIntField(term79711, term79711.getClass(), "hash2", 0);
        setIntField(term79711, term79711.getClass(), "hash3", 0);
        setField(term79711, term79711.getClass(), "key1", null);
        setField(term79711, term79711.getClass(), "key2", null);
        setField(term79711, term79711.getClass(), "key3", null);
        setField(term79711, term79711.getClass(), "value1", null);
        setField(term79711, term79711.getClass(), "value2", null);
        setField(term79711, term79711.getClass(), "value3", null);
        setField(term79711, term79711.getClass(), "delegateMap", null);
        setField(term79709, term79709.getClass(), "key", term79711);
        setField(term79709, term79709.getClass(), "value", null);
        setElement(term79708, 0, term79709);
        setField(term79713, term79713.getClass(), "next", null);
        setField(term79713, term79713.getClass(), "key", null);
        setField(term79713, term79713.getClass(), "value", null);
        setField(term79712, term79712.getClass(), "next", term79713);
        setField(term79712, term79712.getClass(), "key", term79714);
        setField(term79712, term79712.getClass(), "value", null);
        setElement(term79708, 7, term79712);
        setField(term79707, term79707.getClass(), "data", term79708);
        setIntField(term79707, term79707.getClass(), "threshold", 12);
        setIntField(term79707, term79707.getClass(), "modCount", 4);
        setField(term79707, term79707.getClass(), "entrySet", null);
        setField(term79707, term79707.getClass(), "keySet", null);
        setField(term79707, term79707.getClass(), "values", null);
        setField(term79707, term79707.getClass(), "keySet", null);
        setField(term79707, term79707.getClass(), "values", null);
        setField(term79706, term79706.getClass(), "delegateMap", term79707);
        term79715 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term79715, term79715.getClass(), "size", 3);
        setIntField(term79715, term79715.getClass(), "hash1", 0);
        setIntField(term79715, term79715.getClass(), "hash2", 0);
        setIntField(term79715, term79715.getClass(), "hash3", 0);
        setField(term79715, term79715.getClass(), "key1", null);
        setField(term79715, term79715.getClass(), "key2", null);
        setField(term79715, term79715.getClass(), "key3", null);
        setField(term79715, term79715.getClass(), "value1", null);
        setField(term79715, term79715.getClass(), "value2", null);
        setField(term79715, term79715.getClass(), "value3", null);
        setField(term79715, term79715.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term79389;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term79173, args);
        assertTrue(recursiveEquals(term79173, term79706));
        assertTrue(recursiveEquals(term79389, term79715));
        assertTrue(recursiveEquals(retValue, null));
    }

};


