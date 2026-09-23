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

public class Flat3Map_put_19447407251157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term353538;
     Object term354214;
     Object term355592;
     Object term355600;

    public Flat3Map_put_19447407251157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term353538 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term353630 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term353724 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term353048 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term353854 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        term354214 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term354261 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        Object term354325 = newInstance(Class.forName("org.apache.commons.collections.iterators.EmptyOrderedIterator"));
        Object[] term353036 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        setField(term353538, term353538.getClass(), "delegateMap", null);
        setIntField(term353538, term353538.getClass(), "size", 3);
        setIntField(term353538, term353538.getClass(), "hash3", -2033482495);
        setField(term353538, term353538.getClass(), "key3", null);
        setIntField(term353538, term353538.getClass(), "hash2", -2033482495);
        setField(term353538, term353538.getClass(), "key2", null);
        setIntField(term353538, term353538.getClass(), "hash1", -2033482495);
        setIntField(term353724, term353724.getClass(), "size", 128);
        setField(term353854, term353854.getClass(), "next", null);
        setField(term354214, term354214.getClass(), "delegateMap", null);
        setIntField(term354214, term354214.getClass(), "size", 3);
        setIntField(term354214, term354214.getClass(), "hash3", -2062974975);
        setField(term354214, term354214.getClass(), "value3", null);
        setIntField(term354214, term354214.getClass(), "hash2", 256);
        setField(term354214, term354214.getClass(), "value2", null);
        setIntField(term354214, term354214.getClass(), "hash1", 29492224);
        setIntField(term354261, term354261.getClass(), "size", 0);
        setField(term354214, term354214.getClass(), "value1", term354261);
        setField(term354214, term354214.getClass(), "key3", null);
        setField(term354214, term354214.getClass(), "key2", term354325);
        setField(term353854, term353854.getClass(), "key", term354214);
        setField(term353854, term353854.getClass(), "value", null);
        setElement(term353048, 6, term353854);
        setField(term353724, term353724.getClass(), "data", term353048);
        setIntField(term353724, term353724.getClass(), "modCount", 0);
        setField(term353630, term353630.getClass(), "delegateMap", term353724);
        setIntField(term353630, term353630.getClass(), "size", 3);
        setField(term353630, term353630.getClass(), "key3", null);
        setField(term353630, term353630.getClass(), "value3", null);
        setIntField(term353630, term353630.getClass(), "hash3", -1);
        setIntField(term353630, term353630.getClass(), "hash2", -1);
        setIntField(term353630, term353630.getClass(), "hash1", -1);
        setField(term353538, term353538.getClass(), "key1", term353630);
        setField(term353538, term353538.getClass(), "value3", term353036);
        setField(term353538, term353538.getClass(), "value2", null);
        setField(term353538, term353538.getClass(), "value1", null);
        term355592 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term355593 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term355594 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term355595 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term355596 = newInstance(Class.forName("java.lang.Object"));
        Object term355597 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term355598 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term355599 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term355592, term355592.getClass(), "size", 0);
        setIntField(term355592, term355592.getClass(), "hash1", 0);
        setIntField(term355592, term355592.getClass(), "hash2", 0);
        setIntField(term355592, term355592.getClass(), "hash3", 0);
        setField(term355592, term355592.getClass(), "key1", null);
        setField(term355592, term355592.getClass(), "key2", null);
        setField(term355592, term355592.getClass(), "key3", null);
        setField(term355592, term355592.getClass(), "value1", null);
        setField(term355592, term355592.getClass(), "value2", null);
        setField(term355592, term355592.getClass(), "value3", null);
        setFloatField(term355593, term355593.getClass(), "loadFactor", 0.75F);
        setIntField(term355593, term355593.getClass(), "size", 3);
        setField(term355595, term355595.getClass(), "next", null);
        setField(term355595, term355595.getClass(), "key", term355596);
        setField(term355595, term355595.getClass(), "value", null);
        setElement(term355594, 6, term355595);
        setField(term355598, term355598.getClass(), "next", null);
        setField(term355598, term355598.getClass(), "key", null);
        setField(term355598, term355598.getClass(), "value", null);
        setField(term355597, term355597.getClass(), "next", term355598);
        setIntField(term355599, term355599.getClass(), "size", 3);
        setIntField(term355599, term355599.getClass(), "hash1", 29492224);
        setIntField(term355599, term355599.getClass(), "hash2", 256);
        setIntField(term355599, term355599.getClass(), "hash3", -2062974975);
        setField(term355599, term355599.getClass(), "key1", null);
        setField(term355599, term355599.getClass(), "key2", null);
        setField(term355599, term355599.getClass(), "key3", null);
        setField(term355599, term355599.getClass(), "value1", null);
        setField(term355599, term355599.getClass(), "value2", null);
        setField(term355599, term355599.getClass(), "value3", null);
        setField(term355599, term355599.getClass(), "delegateMap", null);
        setField(term355597, term355597.getClass(), "key", term355599);
        setField(term355597, term355597.getClass(), "value", null);
        setElement(term355594, 9, term355597);
        setField(term355593, term355593.getClass(), "data", term355594);
        setIntField(term355593, term355593.getClass(), "threshold", 12);
        setIntField(term355593, term355593.getClass(), "modCount", 3);
        setField(term355593, term355593.getClass(), "entrySet", null);
        setField(term355593, term355593.getClass(), "keySet", null);
        setField(term355593, term355593.getClass(), "values", null);
        setField(term355593, term355593.getClass(), "keySet", null);
        setField(term355593, term355593.getClass(), "values", null);
        setField(term355592, term355592.getClass(), "delegateMap", term355593);
        term355600 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term355600, term355600.getClass(), "size", 3);
        setIntField(term355600, term355600.getClass(), "hash1", 29492224);
        setIntField(term355600, term355600.getClass(), "hash2", 256);
        setIntField(term355600, term355600.getClass(), "hash3", -2062974975);
        setField(term355600, term355600.getClass(), "key1", null);
        setField(term355600, term355600.getClass(), "key2", null);
        setField(term355600, term355600.getClass(), "key3", null);
        setField(term355600, term355600.getClass(), "value1", null);
        setField(term355600, term355600.getClass(), "value2", null);
        setField(term355600, term355600.getClass(), "value3", null);
        setField(term355600, term355600.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term354214;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term353538, args);
        assertTrue(recursiveEquals(term353538, term355592));
        assertTrue(recursiveEquals(term354214, term355600));
        assertTrue(recursiveEquals(retValue, null));
    }

};


