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

public class Flat3Map_put_1944740725907 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182144;
     Object term182328;
     Object term183255;
     Object term183261;

    public Flat3Map_put_1944740725907() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term182144 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term182236 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term182144, term182144.getClass(), "delegateMap", null);
        setIntField(term182144, term182144.getClass(), "size", 3);
        setIntField(term182144, term182144.getClass(), "hash3", 0);
        setField(term182144, term182144.getClass(), "key3", null);
        setIntField(term182144, term182144.getClass(), "hash2", 0);
        setField(term182144, term182144.getClass(), "key2", term182236);
        term182328 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term182328, term182328.getClass(), "delegateMap", null);
        setIntField(term182328, term182328.getClass(), "size", 3);
        setIntField(term182328, term182328.getClass(), "hash3", 0);
        setField(term182328, term182328.getClass(), "value3", null);
        setIntField(term182328, term182328.getClass(), "hash2", 0);
        setField(term182328, term182328.getClass(), "value2", null);
        setIntField(term182328, term182328.getClass(), "hash1", 0);
        setField(term182328, term182328.getClass(), "value1", null);
        term183255 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term183256 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term183257 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term183258 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term183259 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term183260 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term183255, term183255.getClass(), "size", 0);
        setIntField(term183255, term183255.getClass(), "hash1", 0);
        setIntField(term183255, term183255.getClass(), "hash2", 0);
        setIntField(term183255, term183255.getClass(), "hash3", 0);
        setField(term183255, term183255.getClass(), "key1", null);
        setField(term183255, term183255.getClass(), "key2", null);
        setField(term183255, term183255.getClass(), "key3", null);
        setField(term183255, term183255.getClass(), "value1", null);
        setField(term183255, term183255.getClass(), "value2", null);
        setField(term183255, term183255.getClass(), "value3", null);
        setFloatField(term183256, term183256.getClass(), "loadFactor", 0.75F);
        setIntField(term183256, term183256.getClass(), "size", 3);
        setField(term183259, term183259.getClass(), "next", null);
        setField(term183259, term183259.getClass(), "key", null);
        setField(term183259, term183259.getClass(), "value", null);
        setField(term183258, term183258.getClass(), "next", term183259);
        setIntField(term183260, term183260.getClass(), "size", 3);
        setIntField(term183260, term183260.getClass(), "hash1", 0);
        setIntField(term183260, term183260.getClass(), "hash2", 0);
        setIntField(term183260, term183260.getClass(), "hash3", 0);
        setField(term183260, term183260.getClass(), "key1", null);
        setField(term183260, term183260.getClass(), "key2", null);
        setField(term183260, term183260.getClass(), "key3", null);
        setField(term183260, term183260.getClass(), "value1", null);
        setField(term183260, term183260.getClass(), "value2", null);
        setField(term183260, term183260.getClass(), "value3", null);
        setField(term183260, term183260.getClass(), "delegateMap", null);
        setField(term183258, term183258.getClass(), "key", term183260);
        setField(term183258, term183258.getClass(), "value", null);
        setElement(term183257, 0, term183258);
        setField(term183256, term183256.getClass(), "data", term183257);
        setIntField(term183256, term183256.getClass(), "threshold", 12);
        setIntField(term183256, term183256.getClass(), "modCount", 3);
        setField(term183256, term183256.getClass(), "entrySet", null);
        setField(term183256, term183256.getClass(), "keySet", null);
        setField(term183256, term183256.getClass(), "values", null);
        setField(term183256, term183256.getClass(), "keySet", null);
        setField(term183256, term183256.getClass(), "values", null);
        setField(term183255, term183255.getClass(), "delegateMap", term183256);
        term183261 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term183261, term183261.getClass(), "size", 3);
        setIntField(term183261, term183261.getClass(), "hash1", 0);
        setIntField(term183261, term183261.getClass(), "hash2", 0);
        setIntField(term183261, term183261.getClass(), "hash3", 0);
        setField(term183261, term183261.getClass(), "key1", null);
        setField(term183261, term183261.getClass(), "key2", null);
        setField(term183261, term183261.getClass(), "key3", null);
        setField(term183261, term183261.getClass(), "value1", null);
        setField(term183261, term183261.getClass(), "value2", null);
        setField(term183261, term183261.getClass(), "value3", null);
        setField(term183261, term183261.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term182328;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term182144, args);
        assertTrue(recursiveEquals(term182144, term183255));
        assertTrue(recursiveEquals(term182328, term183261));
        assertTrue(recursiveEquals(retValue, null));
    }

};
