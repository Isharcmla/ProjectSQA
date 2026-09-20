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

public class Flat3Map_put_19447407251120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224776;
     Object term225126;
     Object term228634;
     Object term228641;

    public Flat3Map_put_19447407251120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term224776 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term224886 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object[] term223798 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 448);
        Object term225016 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setElement(term223798, 289, term225016);
        setField(term224886, term224886.getClass(), "data", term223798);
        setIntField(term224886, term224886.getClass(), "modCount", 0);
        setIntField(term224886, term224886.getClass(), "size", 0);
        setIntField(term224886, term224886.getClass(), "threshold", 1);
        setField(term224776, term224776.getClass(), "delegateMap", term224886);
        term225126 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        term228634 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term228635 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object[] term228636 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 896);
        Object term228637 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term228638 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term228639 = newInstance(Class.forName("java.lang.Object"));
        Object term228640 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term228634, term228634.getClass(), "size", 0);
        setIntField(term228634, term228634.getClass(), "hash1", 0);
        setIntField(term228634, term228634.getClass(), "hash2", 0);
        setIntField(term228634, term228634.getClass(), "hash3", 0);
        setField(term228634, term228634.getClass(), "key1", null);
        setField(term228634, term228634.getClass(), "key2", null);
        setField(term228634, term228634.getClass(), "key3", null);
        setField(term228634, term228634.getClass(), "value1", null);
        setField(term228634, term228634.getClass(), "value2", null);
        setField(term228634, term228634.getClass(), "value3", null);
        setFloatField(term228635, term228635.getClass(), "loadFactor", 0.0F);
        setIntField(term228635, term228635.getClass(), "size", 1);
        setField(term228637, term228637.getClass(), "next", null);
        setField(term228637, term228637.getClass(), "key", null);
        setField(term228637, term228637.getClass(), "value", null);
        setElement(term228636, 0, term228637);
        setField(term228638, term228638.getClass(), "next", null);
        setField(term228638, term228638.getClass(), "key", term228639);
        setFloatField(term228640, term228640.getClass(), "loadFactor", 0.0F);
        setIntField(term228640, term228640.getClass(), "size", 0);
        setField(term228640, term228640.getClass(), "data", null);
        setIntField(term228640, term228640.getClass(), "threshold", 0);
        setIntField(term228640, term228640.getClass(), "modCount", 0);
        setField(term228640, term228640.getClass(), "entrySet", null);
        setField(term228640, term228640.getClass(), "keySet", null);
        setField(term228640, term228640.getClass(), "values", null);
        setField(term228640, term228640.getClass(), "keySet", null);
        setField(term228640, term228640.getClass(), "values", null);
        setField(term228638, term228638.getClass(), "value", term228640);
        setElement(term228636, 336, term228638);
        setField(term228635, term228635.getClass(), "data", term228636);
        setIntField(term228635, term228635.getClass(), "threshold", 0);
        setIntField(term228635, term228635.getClass(), "modCount", 2);
        setField(term228635, term228635.getClass(), "entrySet", null);
        setField(term228635, term228635.getClass(), "keySet", null);
        setField(term228635, term228635.getClass(), "values", null);
        setField(term228635, term228635.getClass(), "keySet", null);
        setField(term228635, term228635.getClass(), "values", null);
        setField(term228634, term228634.getClass(), "delegateMap", term228635);
        term228641 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setFloatField(term228641, term228641.getClass(), "loadFactor", 0.0F);
        setIntField(term228641, term228641.getClass(), "size", 0);
        setField(term228641, term228641.getClass(), "data", null);
        setIntField(term228641, term228641.getClass(), "threshold", 0);
        setIntField(term228641, term228641.getClass(), "modCount", 0);
        setField(term228641, term228641.getClass(), "entrySet", null);
        setField(term228641, term228641.getClass(), "keySet", null);
        setField(term228641, term228641.getClass(), "values", null);
        setField(term228641, term228641.getClass(), "keySet", null);
        setField(term228641, term228641.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term225126;
        Object retValue = callMethod(klass, "put", argTypes, term224776, args);
        assertTrue(recursiveEquals(term224776, term228634));
        assertTrue(recursiveEquals(term225126, term228641));
        assertTrue(recursiveEquals(retValue, null));
    }

};
