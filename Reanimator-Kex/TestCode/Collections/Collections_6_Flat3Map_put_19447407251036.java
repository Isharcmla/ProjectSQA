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

public class Flat3Map_put_19447407251036 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term295136;
     Object term295228;
     Object term296172;
     Object term296180;

    public Flat3Map_put_19447407251036() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term295136 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term295136, term295136.getClass(), "delegateMap", null);
        setIntField(term295136, term295136.getClass(), "size", 3);
        setIntField(term295136, term295136.getClass(), "hash3", -1);
        setField(term295136, term295136.getClass(), "key3", null);
        setIntField(term295136, term295136.getClass(), "hash2", 0);
        setField(term295136, term295136.getClass(), "key2", null);
        setIntField(term295136, term295136.getClass(), "hash1", 0);
        setField(term295136, term295136.getClass(), "key1", term295136);
        setField(term295136, term295136.getClass(), "value3", null);
        term295228 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term295322 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        Object term295450 = newInstance(Class.forName("org.apache.commons.collections.iterators.EmptyOrderedIterator"));
        setField(term295228, term295228.getClass(), "delegateMap", null);
        setIntField(term295228, term295228.getClass(), "size", 3);
        setIntField(term295228, term295228.getClass(), "hash3", 0);
        setField(term295228, term295228.getClass(), "value3", null);
        setIntField(term295228, term295228.getClass(), "hash2", 0);
        setField(term295228, term295228.getClass(), "value2", null);
        setIntField(term295228, term295228.getClass(), "hash1", 0);
        setIntField(term295322, term295322.getClass(), "size", 0);
        setField(term295228, term295228.getClass(), "value1", term295322);
        setField(term295228, term295228.getClass(), "key3", null);
        setField(term295228, term295228.getClass(), "key2", null);
        setField(term295228, term295228.getClass(), "key1", term295450);
        term296172 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term296173 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term296174 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term296175 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term296176 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term296177 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term296178 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term296179 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term296172, term296172.getClass(), "size", 0);
        setIntField(term296172, term296172.getClass(), "hash1", 0);
        setIntField(term296172, term296172.getClass(), "hash2", 0);
        setIntField(term296172, term296172.getClass(), "hash3", 0);
        setField(term296172, term296172.getClass(), "key1", null);
        setField(term296172, term296172.getClass(), "key2", null);
        setField(term296172, term296172.getClass(), "key3", null);
        setField(term296172, term296172.getClass(), "value1", null);
        setField(term296172, term296172.getClass(), "value2", null);
        setField(term296172, term296172.getClass(), "value3", null);
        setFloatField(term296173, term296173.getClass(), "loadFactor", 0.75F);
        setIntField(term296173, term296173.getClass(), "size", 3);
        setField(term296176, term296176.getClass(), "next", null);
        setField(term296176, term296176.getClass(), "key", term296172);
        setField(term296176, term296176.getClass(), "value", null);
        setField(term296175, term296175.getClass(), "next", term296176);
        setIntField(term296177, term296177.getClass(), "size", 3);
        setIntField(term296177, term296177.getClass(), "hash1", 0);
        setIntField(term296177, term296177.getClass(), "hash2", 0);
        setIntField(term296177, term296177.getClass(), "hash3", 0);
        setField(term296177, term296177.getClass(), "key1", null);
        setField(term296177, term296177.getClass(), "key2", null);
        setField(term296177, term296177.getClass(), "key3", null);
        setField(term296177, term296177.getClass(), "value1", null);
        setField(term296177, term296177.getClass(), "value2", null);
        setField(term296177, term296177.getClass(), "value3", null);
        setField(term296177, term296177.getClass(), "delegateMap", null);
        setField(term296175, term296175.getClass(), "key", term296177);
        setField(term296175, term296175.getClass(), "value", null);
        setElement(term296174, 0, term296175);
        setField(term296178, term296178.getClass(), "next", null);
        setField(term296178, term296178.getClass(), "key", term296179);
        setField(term296178, term296178.getClass(), "value", null);
        setElement(term296174, 6, term296178);
        setField(term296173, term296173.getClass(), "data", term296174);
        setIntField(term296173, term296173.getClass(), "threshold", 12);
        setIntField(term296173, term296173.getClass(), "modCount", 3);
        setField(term296173, term296173.getClass(), "entrySet", null);
        setField(term296173, term296173.getClass(), "keySet", null);
        setField(term296173, term296173.getClass(), "values", null);
        setField(term296173, term296173.getClass(), "keySet", null);
        setField(term296173, term296173.getClass(), "values", null);
        setField(term296172, term296172.getClass(), "delegateMap", term296173);
        term296180 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term296180, term296180.getClass(), "size", 3);
        setIntField(term296180, term296180.getClass(), "hash1", 0);
        setIntField(term296180, term296180.getClass(), "hash2", 0);
        setIntField(term296180, term296180.getClass(), "hash3", 0);
        setField(term296180, term296180.getClass(), "key1", null);
        setField(term296180, term296180.getClass(), "key2", null);
        setField(term296180, term296180.getClass(), "key3", null);
        setField(term296180, term296180.getClass(), "value1", null);
        setField(term296180, term296180.getClass(), "value2", null);
        setField(term296180, term296180.getClass(), "value3", null);
        setField(term296180, term296180.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term295228;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term295136, args);
        assertTrue(recursiveEquals(term295136, term296172));
        assertTrue(recursiveEquals(term295228, term296180));
        assertTrue(recursiveEquals(retValue, null));
    }

};


