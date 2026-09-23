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

public class Flat3Map_put_19447407251141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term345494;
     Object term346148;
     Object term346154;

    public Flat3Map_put_19447407251141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term345494 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term345524 = newInstance(Class.forName("java.util.jar.JarVerifier$3"));
        setField(term345494, term345494.getClass(), "delegateMap", null);
        setIntField(term345494, term345494.getClass(), "size", 3);
        setIntField(term345494, term345494.getClass(), "hash3", -1);
        setField(term345494, term345494.getClass(), "value3", term345524);
        setIntField(term345494, term345494.getClass(), "hash2", -1);
        setField(term345494, term345494.getClass(), "value2", null);
        setIntField(term345494, term345494.getClass(), "hash1", 0);
        setField(term345494, term345494.getClass(), "value1", null);
        term346148 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term346149 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term346150 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term346151 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term346152 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term346153 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term346148, term346148.getClass(), "size", 0);
        setIntField(term346148, term346148.getClass(), "hash1", 0);
        setIntField(term346148, term346148.getClass(), "hash2", 0);
        setIntField(term346148, term346148.getClass(), "hash3", 0);
        setField(term346148, term346148.getClass(), "key1", null);
        setField(term346148, term346148.getClass(), "key2", null);
        setField(term346148, term346148.getClass(), "key3", null);
        setField(term346148, term346148.getClass(), "value1", null);
        setField(term346148, term346148.getClass(), "value2", null);
        setField(term346148, term346148.getClass(), "value3", null);
        setFloatField(term346149, term346149.getClass(), "loadFactor", 0.75F);
        setIntField(term346149, term346149.getClass(), "size", 2);
        setField(term346151, term346151.getClass(), "next", null);
        setField(term346151, term346151.getClass(), "key", term346148);
        setField(term346151, term346151.getClass(), "value", null);
        setElement(term346150, 0, term346151);
        setField(term346152, term346152.getClass(), "next", null);
        setField(term346152, term346152.getClass(), "key", term346153);
        setField(term346152, term346152.getClass(), "value", null);
        setElement(term346150, 6, term346152);
        setField(term346149, term346149.getClass(), "data", term346150);
        setIntField(term346149, term346149.getClass(), "threshold", 12);
        setIntField(term346149, term346149.getClass(), "modCount", 2);
        setField(term346149, term346149.getClass(), "entrySet", null);
        setField(term346149, term346149.getClass(), "keySet", null);
        setField(term346149, term346149.getClass(), "values", null);
        setField(term346149, term346149.getClass(), "keySet", null);
        setField(term346149, term346149.getClass(), "values", null);
        setField(term346148, term346148.getClass(), "delegateMap", term346149);
        term346154 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term346155 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term346156 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term346157 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term346158 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term346159 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term346154, term346154.getClass(), "size", 0);
        setIntField(term346154, term346154.getClass(), "hash1", 0);
        setIntField(term346154, term346154.getClass(), "hash2", 0);
        setIntField(term346154, term346154.getClass(), "hash3", 0);
        setField(term346154, term346154.getClass(), "key1", null);
        setField(term346154, term346154.getClass(), "key2", null);
        setField(term346154, term346154.getClass(), "key3", null);
        setField(term346154, term346154.getClass(), "value1", null);
        setField(term346154, term346154.getClass(), "value2", null);
        setField(term346154, term346154.getClass(), "value3", null);
        setFloatField(term346155, term346155.getClass(), "loadFactor", 0.75F);
        setIntField(term346155, term346155.getClass(), "size", 2);
        setField(term346157, term346157.getClass(), "next", null);
        setField(term346157, term346157.getClass(), "key", term346154);
        setField(term346157, term346157.getClass(), "value", null);
        setElement(term346156, 0, term346157);
        setField(term346158, term346158.getClass(), "next", null);
        setField(term346158, term346158.getClass(), "key", term346159);
        setField(term346158, term346158.getClass(), "value", null);
        setElement(term346156, 6, term346158);
        setField(term346155, term346155.getClass(), "data", term346156);
        setIntField(term346155, term346155.getClass(), "threshold", 12);
        setIntField(term346155, term346155.getClass(), "modCount", 2);
        setField(term346155, term346155.getClass(), "entrySet", null);
        setField(term346155, term346155.getClass(), "keySet", null);
        setField(term346155, term346155.getClass(), "values", null);
        setField(term346155, term346155.getClass(), "keySet", null);
        setField(term346155, term346155.getClass(), "values", null);
        setField(term346154, term346154.getClass(), "delegateMap", term346155);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term345494;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term345494, args);
        assertTrue(recursiveEquals(term345494, term346148));
        assertTrue(recursiveEquals(term345494, term346154));
        assertTrue(recursiveEquals(retValue, null));
    }

};


