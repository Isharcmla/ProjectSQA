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

public class Flat3Map_put_19447407251135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234114;
     Object term234357;

    public Flat3Map_put_19447407251135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term234114 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term234224 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object[] term233721 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 43);
        setField(term234224, term234224.getClass(), "data", term233721);
        setIntField(term234224, term234224.getClass(), "modCount", 0);
        setIntField(term234224, term234224.getClass(), "size", 0);
        setIntField(term234224, term234224.getClass(), "threshold", 1);
        setField(term234114, term234114.getClass(), "delegateMap", term234224);
        term234357 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term234358 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object[] term234359 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 86);
        Object term234360 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term234361 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term234357, term234357.getClass(), "size", 0);
        setIntField(term234357, term234357.getClass(), "hash1", 0);
        setIntField(term234357, term234357.getClass(), "hash2", 0);
        setIntField(term234357, term234357.getClass(), "hash3", 0);
        setField(term234357, term234357.getClass(), "key1", null);
        setField(term234357, term234357.getClass(), "key2", null);
        setField(term234357, term234357.getClass(), "key3", null);
        setField(term234357, term234357.getClass(), "value1", null);
        setField(term234357, term234357.getClass(), "value2", null);
        setField(term234357, term234357.getClass(), "value3", null);
        setFloatField(term234358, term234358.getClass(), "loadFactor", 0.0F);
        setIntField(term234358, term234358.getClass(), "size", 1);
        setField(term234360, term234360.getClass(), "next", null);
        setField(term234360, term234360.getClass(), "key", term234361);
        setField(term234360, term234360.getClass(), "value", null);
        setElement(term234359, 80, term234360);
        setField(term234358, term234358.getClass(), "data", term234359);
        setIntField(term234358, term234358.getClass(), "threshold", 0);
        setIntField(term234358, term234358.getClass(), "modCount", 2);
        setField(term234358, term234358.getClass(), "entrySet", null);
        setField(term234358, term234358.getClass(), "keySet", null);
        setField(term234358, term234358.getClass(), "values", null);
        setField(term234358, term234358.getClass(), "keySet", null);
        setField(term234358, term234358.getClass(), "values", null);
        setField(term234357, term234357.getClass(), "delegateMap", term234358);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term234114, args);
        assertTrue(recursiveEquals(term234114, term234357));
        assertTrue(recursiveEquals(retValue, null));
    }

};
