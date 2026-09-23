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

public class Flat3Map_put_19447407251090 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term319622;
     Object term319916;
     Object term321275;
     Object term321283;

    public Flat3Map_put_19447407251090() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term319622 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term319714 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term319824 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term319622, term319622.getClass(), "delegateMap", null);
        setIntField(term319622, term319622.getClass(), "size", 3);
        setIntField(term319622, term319622.getClass(), "hash3", 0);
        setField(term319714, term319714.getClass(), "delegateMap", null);
        setIntField(term319714, term319714.getClass(), "size", 3);
        setIntField(term319824, term319824.getClass(), "size", 3);
        setField(term319714, term319714.getClass(), "key3", term319824);
        setField(term319714, term319714.getClass(), "key2", null);
        setField(term319714, term319714.getClass(), "value2", null);
        setIntField(term319714, term319714.getClass(), "hash3", 0);
        setIntField(term319714, term319714.getClass(), "hash2", 0);
        setIntField(term319714, term319714.getClass(), "hash1", -1);
        setField(term319622, term319622.getClass(), "key3", term319714);
        term319916 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term320008 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term319916, term319916.getClass(), "delegateMap", null);
        setIntField(term319916, term319916.getClass(), "size", 3);
        setIntField(term319916, term319916.getClass(), "hash3", 0);
        setField(term319916, term319916.getClass(), "value3", null);
        setIntField(term319916, term319916.getClass(), "hash2", 0);
        setField(term319916, term319916.getClass(), "value2", null);
        setIntField(term319916, term319916.getClass(), "hash1", 0);
        setField(term319916, term319916.getClass(), "value1", null);
        setField(term319916, term319916.getClass(), "key3", null);
        setField(term319916, term319916.getClass(), "key2", null);
        setField(term320008, term320008.getClass(), "delegateMap", null);
        setIntField(term320008, term320008.getClass(), "size", 2);
        setIntField(term320008, term320008.getClass(), "hash2", 0);
        setField(term320008, term320008.getClass(), "value2", null);
        setIntField(term320008, term320008.getClass(), "hash1", 0);
        setField(term320008, term320008.getClass(), "value1", null);
        setField(term319916, term319916.getClass(), "key1", term320008);
        term321275 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term321276 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term321277 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term321278 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term321279 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term321280 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term321281 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term321282 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term321275, term321275.getClass(), "size", 0);
        setIntField(term321275, term321275.getClass(), "hash1", 0);
        setIntField(term321275, term321275.getClass(), "hash2", 0);
        setIntField(term321275, term321275.getClass(), "hash3", 0);
        setField(term321275, term321275.getClass(), "key1", null);
        setField(term321275, term321275.getClass(), "key2", null);
        setField(term321275, term321275.getClass(), "key3", null);
        setField(term321275, term321275.getClass(), "value1", null);
        setField(term321275, term321275.getClass(), "value2", null);
        setField(term321275, term321275.getClass(), "value3", null);
        setFloatField(term321276, term321276.getClass(), "loadFactor", 0.75F);
        setIntField(term321276, term321276.getClass(), "size", 3);
        setField(term321278, term321278.getClass(), "next", null);
        setIntField(term321279, term321279.getClass(), "size", 3);
        setIntField(term321279, term321279.getClass(), "hash1", 0);
        setIntField(term321279, term321279.getClass(), "hash2", 0);
        setIntField(term321279, term321279.getClass(), "hash3", 0);
        setField(term321279, term321279.getClass(), "key1", null);
        setField(term321279, term321279.getClass(), "key2", null);
        setField(term321279, term321279.getClass(), "key3", null);
        setField(term321279, term321279.getClass(), "value1", null);
        setField(term321279, term321279.getClass(), "value2", null);
        setField(term321279, term321279.getClass(), "value3", null);
        setField(term321279, term321279.getClass(), "delegateMap", null);
        setField(term321278, term321278.getClass(), "key", term321279);
        setField(term321278, term321278.getClass(), "value", null);
        setElement(term321277, 0, term321278);
        setField(term321281, term321281.getClass(), "next", null);
        setField(term321281, term321281.getClass(), "key", null);
        setField(term321281, term321281.getClass(), "value", null);
        setField(term321280, term321280.getClass(), "next", term321281);
        setField(term321280, term321280.getClass(), "key", term321282);
        setField(term321280, term321280.getClass(), "value", null);
        setElement(term321277, 6, term321280);
        setField(term321276, term321276.getClass(), "data", term321277);
        setIntField(term321276, term321276.getClass(), "threshold", 12);
        setIntField(term321276, term321276.getClass(), "modCount", 3);
        setField(term321276, term321276.getClass(), "entrySet", null);
        setField(term321276, term321276.getClass(), "keySet", null);
        setField(term321276, term321276.getClass(), "values", null);
        setField(term321276, term321276.getClass(), "keySet", null);
        setField(term321276, term321276.getClass(), "values", null);
        setField(term321275, term321275.getClass(), "delegateMap", term321276);
        term321283 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term321283, term321283.getClass(), "size", 3);
        setIntField(term321283, term321283.getClass(), "hash1", 0);
        setIntField(term321283, term321283.getClass(), "hash2", 0);
        setIntField(term321283, term321283.getClass(), "hash3", 0);
        setField(term321283, term321283.getClass(), "key1", null);
        setField(term321283, term321283.getClass(), "key2", null);
        setField(term321283, term321283.getClass(), "key3", null);
        setField(term321283, term321283.getClass(), "value1", null);
        setField(term321283, term321283.getClass(), "value2", null);
        setField(term321283, term321283.getClass(), "value3", null);
        setField(term321283, term321283.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term319916;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term319622, args);
        assertTrue(recursiveEquals(term319622, term321275));
        assertTrue(recursiveEquals(term319916, term321283));
        assertTrue(recursiveEquals(retValue, null));
    }

};


