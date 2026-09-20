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

public class Flat3Map_put_19447407251132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232092;
     Object term231858;
     Object term233671;
     Object term233678;

    public Flat3Map_put_19447407251132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term232092 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term232202 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object[] term231861 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 478);
        Object term232332 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setElement(term231861, 467, term232332);
        setField(term232202, term232202.getClass(), "data", term231861);
        setIntField(term232202, term232202.getClass(), "modCount", 0);
        setIntField(term232202, term232202.getClass(), "size", 0);
        setIntField(term232202, term232202.getClass(), "threshold", 1);
        setField(term232092, term232092.getClass(), "delegateMap", term232202);
        term231858 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        term233671 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term233672 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object[] term233673 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 956);
        Object term233674 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term233675 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term233676 = newInstance(Class.forName("java.lang.Object"));
        Object[] term233677 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        setIntField(term233671, term233671.getClass(), "size", 0);
        setIntField(term233671, term233671.getClass(), "hash1", 0);
        setIntField(term233671, term233671.getClass(), "hash2", 0);
        setIntField(term233671, term233671.getClass(), "hash3", 0);
        setField(term233671, term233671.getClass(), "key1", null);
        setField(term233671, term233671.getClass(), "key2", null);
        setField(term233671, term233671.getClass(), "key3", null);
        setField(term233671, term233671.getClass(), "value1", null);
        setField(term233671, term233671.getClass(), "value2", null);
        setField(term233671, term233671.getClass(), "value3", null);
        setFloatField(term233672, term233672.getClass(), "loadFactor", 0.0F);
        setIntField(term233672, term233672.getClass(), "size", 1);
        setField(term233674, term233674.getClass(), "next", null);
        setField(term233674, term233674.getClass(), "key", null);
        setField(term233674, term233674.getClass(), "value", null);
        setElement(term233673, 0, term233674);
        setField(term233675, term233675.getClass(), "next", null);
        setField(term233675, term233675.getClass(), "key", term233676);
        setField(term233675, term233675.getClass(), "value", term233677);
        setElement(term233673, 400, term233675);
        setField(term233672, term233672.getClass(), "data", term233673);
        setIntField(term233672, term233672.getClass(), "threshold", 0);
        setIntField(term233672, term233672.getClass(), "modCount", 2);
        setField(term233672, term233672.getClass(), "entrySet", null);
        setField(term233672, term233672.getClass(), "keySet", null);
        setField(term233672, term233672.getClass(), "values", null);
        setField(term233672, term233672.getClass(), "keySet", null);
        setField(term233672, term233672.getClass(), "values", null);
        setField(term233671, term233671.getClass(), "delegateMap", term233672);
        term233678 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term231858;
        Object retValue = callMethod(klass, "put", argTypes, term232092, args);
        assertTrue(recursiveEquals(term232092, term233671));
        assertTrue(recursiveEquals(term231858, term233678));
        assertTrue(recursiveEquals(retValue, null));
    }

};
