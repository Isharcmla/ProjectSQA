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

public class Flat3Map_convertToMap_1229912811182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30098;
     Object term30608;

    public Flat3Map_convertToMap_1229912811182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term30256 = new HashMap();
        term30098 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term30208 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object[] term29928 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        setField(term30098, term30098.getClass(), "delegateMap", term30208);
        setIntField(term30098, term30098.getClass(), "size", 2);
        setField(term30098, term30098.getClass(), "key2", null);
        setField(term30098, term30098.getClass(), "value2", null);
        setField(term30098, term30098.getClass(), "key1", term29928);
        setField(term30098, term30098.getClass(), "value1", term30256);
        HashMap term30615 = new HashMap();
        term30608 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term30609 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term30610 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term30611 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term30612 = newInstance(Class.forName("java.lang.Object"));
        Object term30613 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object[] term30614 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        setIntField(term30608, term30608.getClass(), "size", 0);
        setIntField(term30608, term30608.getClass(), "hash1", 0);
        setIntField(term30608, term30608.getClass(), "hash2", 0);
        setIntField(term30608, term30608.getClass(), "hash3", 0);
        setField(term30608, term30608.getClass(), "key1", null);
        setField(term30608, term30608.getClass(), "key2", null);
        setField(term30608, term30608.getClass(), "key3", null);
        setField(term30608, term30608.getClass(), "value1", null);
        setField(term30608, term30608.getClass(), "value2", null);
        setField(term30608, term30608.getClass(), "value3", null);
        setFloatField(term30609, term30609.getClass(), "loadFactor", 0.75F);
        setIntField(term30609, term30609.getClass(), "size", 2);
        setField(term30611, term30611.getClass(), "next", null);
        setField(term30611, term30611.getClass(), "key", term30612);
        setField(term30611, term30611.getClass(), "value", null);
        setElement(term30610, 5, term30611);
        setField(term30613, term30613.getClass(), "next", null);
        setField(term30613, term30613.getClass(), "key", term30614);
        setField(term30613, term30613.getClass(), "value", term30615);
        setElement(term30610, 15, term30613);
        setField(term30609, term30609.getClass(), "data", term30610);
        setIntField(term30609, term30609.getClass(), "threshold", 12);
        setIntField(term30609, term30609.getClass(), "modCount", 2);
        setField(term30609, term30609.getClass(), "entrySet", null);
        setField(term30609, term30609.getClass(), "keySet", null);
        setField(term30609, term30609.getClass(), "values", null);
        setField(term30609, term30609.getClass(), "keySet", null);
        setField(term30609, term30609.getClass(), "values", null);
        setField(term30608, term30608.getClass(), "delegateMap", term30609);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "convertToMap", argTypes, term30098, args);
        assertTrue(recursiveEquals(term30098, term30608));
    }

};


