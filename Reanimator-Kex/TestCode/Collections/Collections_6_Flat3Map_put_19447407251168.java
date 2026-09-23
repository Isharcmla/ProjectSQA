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

public class Flat3Map_put_19447407251168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term359208;
     Object term359700;
     Object term361108;
     Object term361117;

    public Flat3Map_put_19447407251168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term359348 = new HashMap();
        HashMap term359396 = new HashMap();
        term359208 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term359300 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term359526 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term359608 = newInstance(Class.forName("java.lang.invoke.MethodHandleProxies$2"));
        setField(term359208, term359208.getClass(), "delegateMap", null);
        setIntField(term359208, term359208.getClass(), "size", 3);
        setIntField(term359208, term359208.getClass(), "hash3", -1443560445);
        setField(term359300, term359300.getClass(), "delegateMap", null);
        setIntField(term359300, term359300.getClass(), "size", 3);
        setField(term359300, term359300.getClass(), "key3", term359348);
        setField(term359300, term359300.getClass(), "key2", null);
        setField(term359300, term359300.getClass(), "value2", null);
        setIntField(term359300, term359300.getClass(), "hash3", 2129992);
        setIntField(term359300, term359300.getClass(), "hash2", -1660944384);
        setIntField(term359300, term359300.getClass(), "hash1", -1064267775);
        setField(term359300, term359300.getClass(), "value3", null);
        setField(term359300, term359300.getClass(), "value1", null);
        setField(term359208, term359208.getClass(), "key3", term359300);
        setIntField(term359208, term359208.getClass(), "hash2", -1443560445);
        setField(term359208, term359208.getClass(), "key2", null);
        setIntField(term359208, term359208.getClass(), "hash1", -1443560445);
        setField(term359208, term359208.getClass(), "key1", null);
        setField(term359208, term359208.getClass(), "value3", term359396);
        setField(term359208, term359208.getClass(), "value2", term359526);
        setField(term359208, term359208.getClass(), "value1", term359608);
        term359700 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term359782 = newInstance(Class.forName("java.lang.invoke.MethodHandleProxies$2"));
        setField(term359700, term359700.getClass(), "delegateMap", null);
        setIntField(term359700, term359700.getClass(), "size", 3);
        setIntField(term359700, term359700.getClass(), "hash3", 1610892705);
        setField(term359700, term359700.getClass(), "value3", null);
        setIntField(term359700, term359700.getClass(), "hash2", 163774498);
        setField(term359700, term359700.getClass(), "value2", null);
        setIntField(term359700, term359700.getClass(), "hash1", 1076739648);
        setField(term359700, term359700.getClass(), "value1", null);
        setField(term359700, term359700.getClass(), "key3", null);
        setField(term359700, term359700.getClass(), "key2", term359782);
        HashMap term361116 = new HashMap();
        term361108 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term361109 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term361110 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term361111 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term361112 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term361113 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term361114 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term361115 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term361108, term361108.getClass(), "size", 0);
        setIntField(term361108, term361108.getClass(), "hash1", 0);
        setIntField(term361108, term361108.getClass(), "hash2", 0);
        setIntField(term361108, term361108.getClass(), "hash3", 0);
        setField(term361108, term361108.getClass(), "key1", null);
        setField(term361108, term361108.getClass(), "key2", null);
        setField(term361108, term361108.getClass(), "key3", null);
        setField(term361108, term361108.getClass(), "value1", null);
        setField(term361108, term361108.getClass(), "value2", null);
        setField(term361108, term361108.getClass(), "value3", null);
        setFloatField(term361109, term361109.getClass(), "loadFactor", 0.75F);
        setIntField(term361109, term361109.getClass(), "size", 3);
        setField(term361112, term361112.getClass(), "next", null);
        setField(term361112, term361112.getClass(), "key", null);
        setField(term361112, term361112.getClass(), "value", null);
        setField(term361111, term361111.getClass(), "next", term361112);
        setIntField(term361113, term361113.getClass(), "size", 3);
        setIntField(term361113, term361113.getClass(), "hash1", 1076739648);
        setIntField(term361113, term361113.getClass(), "hash2", 163774498);
        setIntField(term361113, term361113.getClass(), "hash3", 1610892705);
        setField(term361113, term361113.getClass(), "key1", null);
        setField(term361113, term361113.getClass(), "key2", null);
        setField(term361113, term361113.getClass(), "key3", null);
        setField(term361113, term361113.getClass(), "value1", null);
        setField(term361113, term361113.getClass(), "value2", null);
        setField(term361113, term361113.getClass(), "value3", null);
        setField(term361113, term361113.getClass(), "delegateMap", null);
        setField(term361111, term361111.getClass(), "key", term361113);
        setField(term361111, term361111.getClass(), "value", null);
        setElement(term361110, 6, term361111);
        setField(term361114, term361114.getClass(), "next", null);
        setIntField(term361115, term361115.getClass(), "size", 3);
        setIntField(term361115, term361115.getClass(), "hash1", -1064267775);
        setIntField(term361115, term361115.getClass(), "hash2", -1660944384);
        setIntField(term361115, term361115.getClass(), "hash3", 2129992);
        setField(term361115, term361115.getClass(), "key1", null);
        setField(term361115, term361115.getClass(), "key2", null);
        setField(term361115, term361115.getClass(), "key3", null);
        setField(term361115, term361115.getClass(), "value1", null);
        setField(term361115, term361115.getClass(), "value2", null);
        setField(term361115, term361115.getClass(), "value3", null);
        setField(term361115, term361115.getClass(), "delegateMap", null);
        setField(term361114, term361114.getClass(), "key", term361115);
        setField(term361114, term361114.getClass(), "value", term361116);
        setElement(term361110, 13, term361114);
        setField(term361109, term361109.getClass(), "data", term361110);
        setIntField(term361109, term361109.getClass(), "threshold", 12);
        setIntField(term361109, term361109.getClass(), "modCount", 3);
        setField(term361109, term361109.getClass(), "entrySet", null);
        setField(term361109, term361109.getClass(), "keySet", null);
        setField(term361109, term361109.getClass(), "values", null);
        setField(term361109, term361109.getClass(), "keySet", null);
        setField(term361109, term361109.getClass(), "values", null);
        setField(term361108, term361108.getClass(), "delegateMap", term361109);
        term361117 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term361117, term361117.getClass(), "size", 3);
        setIntField(term361117, term361117.getClass(), "hash1", 1076739648);
        setIntField(term361117, term361117.getClass(), "hash2", 163774498);
        setIntField(term361117, term361117.getClass(), "hash3", 1610892705);
        setField(term361117, term361117.getClass(), "key1", null);
        setField(term361117, term361117.getClass(), "key2", null);
        setField(term361117, term361117.getClass(), "key3", null);
        setField(term361117, term361117.getClass(), "value1", null);
        setField(term361117, term361117.getClass(), "value2", null);
        setField(term361117, term361117.getClass(), "value3", null);
        setField(term361117, term361117.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term359700;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term359208, args);
        assertTrue(recursiveEquals(term359208, term361108));
        assertTrue(recursiveEquals(term359700, term361117));
        assertTrue(recursiveEquals(retValue, null));
    }

};


