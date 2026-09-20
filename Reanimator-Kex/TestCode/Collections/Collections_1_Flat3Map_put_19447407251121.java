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

public class Flat3Map_put_19447407251121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term226703;
     Object term225128;
     Object term229462;
     Object term229469;

    public Flat3Map_put_19447407251121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term226703 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term226813 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object[] term225131 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 382);
        Object term226943 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setElement(term225131, 104, term226943);
        setField(term226813, term226813.getClass(), "data", term225131);
        setIntField(term226813, term226813.getClass(), "modCount", 0);
        setIntField(term226813, term226813.getClass(), "size", 0);
        setIntField(term226813, term226813.getClass(), "threshold", 1);
        setField(term226703, term226703.getClass(), "delegateMap", term226813);
        term225128 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        term229462 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term229463 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object[] term229464 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 764);
        Object term229465 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term229466 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term229467 = newInstance(Class.forName("java.lang.Object"));
        Object[] term229468 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        setIntField(term229462, term229462.getClass(), "size", 0);
        setIntField(term229462, term229462.getClass(), "hash1", 0);
        setIntField(term229462, term229462.getClass(), "hash2", 0);
        setIntField(term229462, term229462.getClass(), "hash3", 0);
        setField(term229462, term229462.getClass(), "key1", null);
        setField(term229462, term229462.getClass(), "key2", null);
        setField(term229462, term229462.getClass(), "key3", null);
        setField(term229462, term229462.getClass(), "value1", null);
        setField(term229462, term229462.getClass(), "value2", null);
        setField(term229462, term229462.getClass(), "value3", null);
        setFloatField(term229463, term229463.getClass(), "loadFactor", 0.0F);
        setIntField(term229463, term229463.getClass(), "size", 1);
        setField(term229465, term229465.getClass(), "next", null);
        setField(term229465, term229465.getClass(), "key", null);
        setField(term229465, term229465.getClass(), "value", null);
        setElement(term229464, 0, term229465);
        setField(term229466, term229466.getClass(), "next", null);
        setField(term229466, term229466.getClass(), "key", term229467);
        setField(term229466, term229466.getClass(), "value", term229468);
        setElement(term229464, 208, term229466);
        setField(term229463, term229463.getClass(), "data", term229464);
        setIntField(term229463, term229463.getClass(), "threshold", 0);
        setIntField(term229463, term229463.getClass(), "modCount", 2);
        setField(term229463, term229463.getClass(), "entrySet", null);
        setField(term229463, term229463.getClass(), "keySet", null);
        setField(term229463, term229463.getClass(), "values", null);
        setField(term229463, term229463.getClass(), "keySet", null);
        setField(term229463, term229463.getClass(), "values", null);
        setField(term229462, term229462.getClass(), "delegateMap", term229463);
        term229469 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term225128;
        Object retValue = callMethod(klass, "put", argTypes, term226703, args);
        assertTrue(recursiveEquals(term226703, term229462));
        assertTrue(recursiveEquals(term225128, term229469));
        assertTrue(recursiveEquals(retValue, null));
    }

};
