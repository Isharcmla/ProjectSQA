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

public class Flat3Map_put_19447407251021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289733;
     Object term290321;
     Object term290685;
     Object term290694;

    public Flat3Map_put_19447407251021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289733 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term289825 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term289919 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term289219 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term290049 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term290141 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term290229 = newInstance(Class.forName("org.apache.commons.collections.map.LRUMap"));
        setField(term289733, term289733.getClass(), "delegateMap", null);
        setIntField(term289733, term289733.getClass(), "size", 3);
        setIntField(term289733, term289733.getClass(), "hash3", 2057384624);
        setField(term289733, term289733.getClass(), "key3", null);
        setIntField(term289733, term289733.getClass(), "hash2", 2057384624);
        setIntField(term289919, term289919.getClass(), "size", 1024);
        setField(term290049, term290049.getClass(), "next", null);
        setField(term290141, term290141.getClass(), "delegateMap", term290229);
        setField(term290049, term290049.getClass(), "key", term290141);
        setField(term290049, term290049.getClass(), "value", null);
        setElement(term289219, 5, term290049);
        setField(term289919, term289919.getClass(), "data", term289219);
        setIntField(term289919, term289919.getClass(), "modCount", 0);
        setField(term289825, term289825.getClass(), "delegateMap", term289919);
        setIntField(term289825, term289825.getClass(), "size", 3);
        setField(term289825, term289825.getClass(), "key3", null);
        setField(term289825, term289825.getClass(), "value3", null);
        setField(term289733, term289733.getClass(), "key2", term289825);
        setIntField(term289733, term289733.getClass(), "hash1", 2057384624);
        setField(term289733, term289733.getClass(), "key1", null);
        setField(term289733, term289733.getClass(), "value3", null);
        setField(term289733, term289733.getClass(), "value2", null);
        setField(term289733, term289733.getClass(), "value1", null);
        term290321 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term290415 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setField(term290321, term290321.getClass(), "delegateMap", null);
        setIntField(term290321, term290321.getClass(), "size", 3);
        setIntField(term290321, term290321.getClass(), "hash3", -1600097616);
        setField(term290321, term290321.getClass(), "value3", null);
        setIntField(term290321, term290321.getClass(), "hash2", 677396480);
        setField(term290321, term290321.getClass(), "value2", null);
        setIntField(term290321, term290321.getClass(), "hash1", -1314881536);
        setIntField(term290415, term290415.getClass(), "size", 0);
        setField(term290321, term290321.getClass(), "value1", term290415);
        setField(term290321, term290321.getClass(), "key3", null);
        setField(term290321, term290321.getClass(), "key2", null);
        setField(term290321, term290321.getClass(), "key1", null);
        HashMap term290688 = new HashMap();
        term290685 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term290686 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term290687 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term290689 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term290690 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term290691 = newInstance(Class.forName("java.lang.Object"));
        Object term290692 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object[] term290693 = (Object[]) newArray("java.lang.Object", 0);
        setField(term290687, term290687.getClass(), "next", null);
        setField(term290687, term290687.getClass(), "key", term290688);
        setField(term290687, term290687.getClass(), "value", null);
        setField(term290686, term290686.getClass(), "next", term290687);
        setIntField(term290689, term290689.getClass(), "size", 3);
        setIntField(term290689, term290689.getClass(), "hash1", 0);
        setIntField(term290689, term290689.getClass(), "hash2", 0);
        setIntField(term290689, term290689.getClass(), "hash3", 0);
        setField(term290689, term290689.getClass(), "key1", null);
        setField(term290689, term290689.getClass(), "key2", null);
        setField(term290689, term290689.getClass(), "key3", null);
        setField(term290689, term290689.getClass(), "value1", null);
        setField(term290689, term290689.getClass(), "value2", null);
        setField(term290689, term290689.getClass(), "value3", null);
        setField(term290689, term290689.getClass(), "delegateMap", null);
        setField(term290686, term290686.getClass(), "key", term290689);
        setField(term290686, term290686.getClass(), "value", null);
        setElement(term290685, 0, term290686);
        setField(term290690, term290690.getClass(), "next", null);
        setField(term290690, term290690.getClass(), "key", term290691);
        setField(term290690, term290690.getClass(), "value", null);
        setElement(term290685, 5, term290690);
        setField(term290692, term290692.getClass(), "next", null);
        setField(term290692, term290692.getClass(), "key", term290693);
        setField(term290692, term290692.getClass(), "value", null);
        setElement(term290685, 9, term290692);
        term290694 = (Object[]) newArray("java.lang.Object", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term290321;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term289733, args);
        assertTrue(recursiveEquals(term289733, term290685));
        assertTrue(recursiveEquals(term290321, term290694));
        assertTrue(recursiveEquals(retValue, null));
    }

};


