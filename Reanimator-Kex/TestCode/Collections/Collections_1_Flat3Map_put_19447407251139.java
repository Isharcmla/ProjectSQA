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

public class Flat3Map_put_19447407251139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235016;
     Object term235451;
     Object term237168;
     Object term237175;

    public Flat3Map_put_19447407251139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term235016 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term235126 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object[] term234366 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 450);
        Object term235256 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        term235451 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setElement(term234366, 357, term235256);
        setField(term235451, term235451.getClass(), "next", null);
        setIntField(term235451, term235451.getClass(), "hashCode", 898);
        setElement(term234366, 409, term235451);
        setField(term235126, term235126.getClass(), "data", term234366);
        setIntField(term235126, term235126.getClass(), "modCount", 0);
        setIntField(term235126, term235126.getClass(), "size", 0);
        setIntField(term235126, term235126.getClass(), "threshold", 1);
        setField(term235016, term235016.getClass(), "delegateMap", term235126);
        term237168 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term237169 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object[] term237170 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 900);
        Object term237171 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term237172 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term237173 = newInstance(Class.forName("java.lang.Object"));
        Object term237174 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setIntField(term237168, term237168.getClass(), "size", 0);
        setIntField(term237168, term237168.getClass(), "hash1", 0);
        setIntField(term237168, term237168.getClass(), "hash2", 0);
        setIntField(term237168, term237168.getClass(), "hash3", 0);
        setField(term237168, term237168.getClass(), "key1", null);
        setField(term237168, term237168.getClass(), "key2", null);
        setField(term237168, term237168.getClass(), "key3", null);
        setField(term237168, term237168.getClass(), "value1", null);
        setField(term237168, term237168.getClass(), "value2", null);
        setField(term237168, term237168.getClass(), "value3", null);
        setFloatField(term237169, term237169.getClass(), "loadFactor", 0.0F);
        setIntField(term237169, term237169.getClass(), "size", 1);
        setField(term237171, term237171.getClass(), "next", null);
        setField(term237171, term237171.getClass(), "key", null);
        setField(term237171, term237171.getClass(), "value", null);
        setElement(term237170, 0, term237171);
        setField(term237172, term237172.getClass(), "next", null);
        setField(term237172, term237172.getClass(), "key", term237173);
        setField(term237174, term237174.getClass(), "next", null);
        setField(term237174, term237174.getClass(), "key", null);
        setField(term237174, term237174.getClass(), "value", null);
        setField(term237172, term237172.getClass(), "value", term237174);
        setElement(term237170, 384, term237172);
        setElement(term237170, 898, term237174);
        setField(term237169, term237169.getClass(), "data", term237170);
        setIntField(term237169, term237169.getClass(), "threshold", 0);
        setIntField(term237169, term237169.getClass(), "modCount", 2);
        setField(term237169, term237169.getClass(), "entrySet", null);
        setField(term237169, term237169.getClass(), "keySet", null);
        setField(term237169, term237169.getClass(), "values", null);
        setField(term237169, term237169.getClass(), "keySet", null);
        setField(term237169, term237169.getClass(), "values", null);
        setField(term237168, term237168.getClass(), "delegateMap", term237169);
        term237175 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setField(term237175, term237175.getClass(), "next", null);
        setField(term237175, term237175.getClass(), "key", null);
        setField(term237175, term237175.getClass(), "value", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term235451;
        Object retValue = callMethod(klass, "put", argTypes, term235016, args);
        assertTrue(recursiveEquals(term235016, term237168));
        assertTrue(recursiveEquals(term235451, term237175));
        assertTrue(recursiveEquals(retValue, null));
    }

};
