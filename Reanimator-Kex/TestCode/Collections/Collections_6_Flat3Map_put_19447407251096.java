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

public class Flat3Map_put_19447407251096 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term323224;
     Object term323730;
     Object term325479;
     Object term325490;

    public Flat3Map_put_19447407251096() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term323224 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term323316 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term323410 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object term323502 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term323540 = newInstance(Class.forName("java.lang.Object"));
        Object term323638 = newInstance(Class.forName("org.apache.commons.collections.map.IdentityMap"));
        setField(term323224, term323224.getClass(), "delegateMap", null);
        setIntField(term323224, term323224.getClass(), "size", 3);
        setIntField(term323224, term323224.getClass(), "hash3", -1341282560);
        setField(term323224, term323224.getClass(), "key3", null);
        setIntField(term323224, term323224.getClass(), "hash2", -1341282560);
        setField(term323224, term323224.getClass(), "key2", null);
        setIntField(term323224, term323224.getClass(), "hash1", -1341282560);
        setIntField(term323410, term323410.getClass(), "size", 0);
        setField(term323316, term323316.getClass(), "delegateMap", term323410);
        setField(term323224, term323224.getClass(), "key1", term323316);
        setField(term323224, term323224.getClass(), "value3", term323502);
        setField(term323224, term323224.getClass(), "value2", term323540);
        setField(term323224, term323224.getClass(), "value1", term323638);
        term323730 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term323824 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setField(term323730, term323730.getClass(), "delegateMap", null);
        setIntField(term323730, term323730.getClass(), "size", 3);
        setIntField(term323730, term323730.getClass(), "hash3", -2147376636);
        setField(term323730, term323730.getClass(), "value3", null);
        setIntField(term323730, term323730.getClass(), "hash2", -1656309760);
        setField(term323730, term323730.getClass(), "value2", null);
        setIntField(term323730, term323730.getClass(), "hash1", -1832563460);
        setIntField(term323824, term323824.getClass(), "size", 0);
        setField(term323730, term323730.getClass(), "value1", term323824);
        term325479 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term325480 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term325481 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term325482 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term325483 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term325484 = newInstance(Class.forName("org.apache.commons.collections.map.IdentityMap"));
        Object term325485 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term325486 = newInstance(Class.forName("java.lang.Object"));
        Object term325487 = newInstance(Class.forName("java.lang.Object"));
        Object term325488 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term325489 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term325479, term325479.getClass(), "size", 0);
        setIntField(term325479, term325479.getClass(), "hash1", 0);
        setIntField(term325479, term325479.getClass(), "hash2", 0);
        setIntField(term325479, term325479.getClass(), "hash3", 0);
        setField(term325479, term325479.getClass(), "key1", null);
        setField(term325479, term325479.getClass(), "key2", null);
        setField(term325479, term325479.getClass(), "key3", null);
        setField(term325479, term325479.getClass(), "value1", null);
        setField(term325479, term325479.getClass(), "value2", null);
        setField(term325479, term325479.getClass(), "value3", null);
        setFloatField(term325480, term325480.getClass(), "loadFactor", 0.75F);
        setIntField(term325480, term325480.getClass(), "size", 3);
        setField(term325482, term325482.getClass(), "next", null);
        setIntField(term325483, term325483.getClass(), "size", 0);
        setIntField(term325483, term325483.getClass(), "hash1", 0);
        setIntField(term325483, term325483.getClass(), "hash2", 0);
        setIntField(term325483, term325483.getClass(), "hash3", 0);
        setField(term325483, term325483.getClass(), "key1", null);
        setField(term325483, term325483.getClass(), "key2", null);
        setField(term325483, term325483.getClass(), "key3", null);
        setField(term325483, term325483.getClass(), "value1", null);
        setField(term325483, term325483.getClass(), "value2", null);
        setField(term325483, term325483.getClass(), "value3", null);
        setField(term325483, term325483.getClass(), "delegateMap", null);
        setField(term325482, term325482.getClass(), "key", term325483);
        setFloatField(term325484, term325484.getClass(), "loadFactor", 0.0F);
        setIntField(term325484, term325484.getClass(), "size", 0);
        setField(term325484, term325484.getClass(), "data", null);
        setIntField(term325484, term325484.getClass(), "threshold", 0);
        setIntField(term325484, term325484.getClass(), "modCount", 0);
        setField(term325484, term325484.getClass(), "entrySet", null);
        setField(term325484, term325484.getClass(), "keySet", null);
        setField(term325484, term325484.getClass(), "values", null);
        setField(term325484, term325484.getClass(), "keySet", null);
        setField(term325484, term325484.getClass(), "values", null);
        setField(term325482, term325482.getClass(), "value", term325484);
        setElement(term325481, 0, term325482);
        setField(term325485, term325485.getClass(), "next", null);
        setField(term325485, term325485.getClass(), "key", term325486);
        setField(term325485, term325485.getClass(), "value", term325487);
        setElement(term325481, 6, term325485);
        setField(term325488, term325488.getClass(), "next", null);
        setIntField(term325489, term325489.getClass(), "size", 3);
        setIntField(term325489, term325489.getClass(), "hash1", -1832563460);
        setIntField(term325489, term325489.getClass(), "hash2", -1656309760);
        setIntField(term325489, term325489.getClass(), "hash3", -2147376636);
        setField(term325489, term325489.getClass(), "key1", null);
        setField(term325489, term325489.getClass(), "key2", null);
        setField(term325489, term325489.getClass(), "key3", null);
        setField(term325489, term325489.getClass(), "value1", null);
        setField(term325489, term325489.getClass(), "value2", null);
        setField(term325489, term325489.getClass(), "value3", null);
        setField(term325489, term325489.getClass(), "delegateMap", null);
        setField(term325488, term325488.getClass(), "key", term325489);
        setField(term325488, term325488.getClass(), "value", null);
        setElement(term325481, 12, term325488);
        setField(term325480, term325480.getClass(), "data", term325481);
        setIntField(term325480, term325480.getClass(), "threshold", 12);
        setIntField(term325480, term325480.getClass(), "modCount", 3);
        setField(term325480, term325480.getClass(), "entrySet", null);
        setField(term325480, term325480.getClass(), "keySet", null);
        setField(term325480, term325480.getClass(), "values", null);
        setField(term325480, term325480.getClass(), "keySet", null);
        setField(term325480, term325480.getClass(), "values", null);
        setField(term325479, term325479.getClass(), "delegateMap", term325480);
        term325490 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term325490, term325490.getClass(), "size", 3);
        setIntField(term325490, term325490.getClass(), "hash1", -1832563460);
        setIntField(term325490, term325490.getClass(), "hash2", -1656309760);
        setIntField(term325490, term325490.getClass(), "hash3", -2147376636);
        setField(term325490, term325490.getClass(), "key1", null);
        setField(term325490, term325490.getClass(), "key2", null);
        setField(term325490, term325490.getClass(), "key3", null);
        setField(term325490, term325490.getClass(), "value1", null);
        setField(term325490, term325490.getClass(), "value2", null);
        setField(term325490, term325490.getClass(), "value3", null);
        setField(term325490, term325490.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term323730;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term323224, args);
        assertTrue(recursiveEquals(term323224, term325479));
        assertTrue(recursiveEquals(term323730, term325490));
        assertTrue(recursiveEquals(retValue, null));
    }

};


