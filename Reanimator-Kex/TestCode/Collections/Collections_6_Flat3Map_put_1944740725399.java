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

public class Flat3Map_put_1944740725399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69275;
     Object term69413;
     Object term69539;
     Object term69544;

    public Flat3Map_put_1944740725399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69275 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        term69413 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term69275, term69275.getClass(), "delegateMap", null);
        setIntField(term69275, term69275.getClass(), "size", -4);
        setIntField(term69275, term69275.getClass(), "hash3", 0);
        setField(term69275, term69275.getClass(), "key3", term69275);
        setIntField(term69275, term69275.getClass(), "hash2", 0);
        setField(term69413, term69413.getClass(), "delegateMap", null);
        setIntField(term69413, term69413.getClass(), "size", 3);
        setIntField(term69413, term69413.getClass(), "hash3", 0);
        setField(term69413, term69413.getClass(), "value3", null);
        setIntField(term69413, term69413.getClass(), "hash2", 0);
        setField(term69413, term69413.getClass(), "value2", null);
        setIntField(term69413, term69413.getClass(), "hash1", 0);
        setField(term69413, term69413.getClass(), "value1", null);
        setField(term69275, term69275.getClass(), "key2", term69413);
        term69539 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term69540 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term69541 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term69542 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term69543 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term69539, term69539.getClass(), "size", 0);
        setIntField(term69539, term69539.getClass(), "hash1", 0);
        setIntField(term69539, term69539.getClass(), "hash2", 0);
        setIntField(term69539, term69539.getClass(), "hash3", 0);
        setField(term69539, term69539.getClass(), "key1", null);
        setField(term69539, term69539.getClass(), "key2", null);
        setField(term69539, term69539.getClass(), "key3", null);
        setField(term69539, term69539.getClass(), "value1", null);
        setField(term69539, term69539.getClass(), "value2", null);
        setField(term69539, term69539.getClass(), "value3", null);
        setFloatField(term69540, term69540.getClass(), "loadFactor", 0.75F);
        setIntField(term69540, term69540.getClass(), "size", 1);
        setField(term69542, term69542.getClass(), "next", null);
        setIntField(term69543, term69543.getClass(), "size", 3);
        setIntField(term69543, term69543.getClass(), "hash1", 0);
        setIntField(term69543, term69543.getClass(), "hash2", 0);
        setIntField(term69543, term69543.getClass(), "hash3", 0);
        setField(term69543, term69543.getClass(), "key1", null);
        setField(term69543, term69543.getClass(), "key2", null);
        setField(term69543, term69543.getClass(), "key3", null);
        setField(term69543, term69543.getClass(), "value1", null);
        setField(term69543, term69543.getClass(), "value2", null);
        setField(term69543, term69543.getClass(), "value3", null);
        setField(term69543, term69543.getClass(), "delegateMap", null);
        setField(term69542, term69542.getClass(), "key", term69543);
        setField(term69542, term69542.getClass(), "value", null);
        setElement(term69541, 0, term69542);
        setField(term69540, term69540.getClass(), "data", term69541);
        setIntField(term69540, term69540.getClass(), "threshold", 12);
        setIntField(term69540, term69540.getClass(), "modCount", 1);
        setField(term69540, term69540.getClass(), "entrySet", null);
        setField(term69540, term69540.getClass(), "keySet", null);
        setField(term69540, term69540.getClass(), "values", null);
        setField(term69540, term69540.getClass(), "keySet", null);
        setField(term69540, term69540.getClass(), "values", null);
        setField(term69539, term69539.getClass(), "delegateMap", term69540);
        term69544 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term69544, term69544.getClass(), "size", 3);
        setIntField(term69544, term69544.getClass(), "hash1", 0);
        setIntField(term69544, term69544.getClass(), "hash2", 0);
        setIntField(term69544, term69544.getClass(), "hash3", 0);
        setField(term69544, term69544.getClass(), "key1", null);
        setField(term69544, term69544.getClass(), "key2", null);
        setField(term69544, term69544.getClass(), "key3", null);
        setField(term69544, term69544.getClass(), "value1", null);
        setField(term69544, term69544.getClass(), "value2", null);
        setField(term69544, term69544.getClass(), "value3", null);
        setField(term69544, term69544.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term69413;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term69275, args);
        assertTrue(recursiveEquals(term69275, term69539));
        assertTrue(recursiveEquals(term69413, term69544));
        assertTrue(recursiveEquals(retValue, null));
    }

};


