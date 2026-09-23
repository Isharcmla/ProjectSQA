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

public class Flat3Map_put_1944740725359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60808;
     Object term60900;
     Object term61070;
     Object term61077;

    public Flat3Map_put_1944740725359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60808 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term60808, term60808.getClass(), "delegateMap", null);
        setIntField(term60808, term60808.getClass(), "size", 3);
        setIntField(term60808, term60808.getClass(), "hash3", 0);
        setField(term60808, term60808.getClass(), "key3", null);
        term60900 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term60900, term60900.getClass(), "delegateMap", null);
        setIntField(term60900, term60900.getClass(), "size", 3);
        setIntField(term60900, term60900.getClass(), "hash3", 0);
        setField(term60900, term60900.getClass(), "value3", null);
        setIntField(term60900, term60900.getClass(), "hash2", 0);
        setField(term60900, term60900.getClass(), "value2", null);
        setIntField(term60900, term60900.getClass(), "hash1", 0);
        setField(term60900, term60900.getClass(), "value1", null);
        setField(term60900, term60900.getClass(), "key3", null);
        term61070 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term61071 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term61072 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term61073 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term61074 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term61075 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term61076 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term61070, term61070.getClass(), "size", 0);
        setIntField(term61070, term61070.getClass(), "hash1", 0);
        setIntField(term61070, term61070.getClass(), "hash2", 0);
        setIntField(term61070, term61070.getClass(), "hash3", 0);
        setField(term61070, term61070.getClass(), "key1", null);
        setField(term61070, term61070.getClass(), "key2", null);
        setField(term61070, term61070.getClass(), "key3", null);
        setField(term61070, term61070.getClass(), "value1", null);
        setField(term61070, term61070.getClass(), "value2", null);
        setField(term61070, term61070.getClass(), "value3", null);
        setFloatField(term61071, term61071.getClass(), "loadFactor", 0.75F);
        setIntField(term61071, term61071.getClass(), "size", 2);
        setField(term61073, term61073.getClass(), "next", null);
        setIntField(term61074, term61074.getClass(), "size", 3);
        setIntField(term61074, term61074.getClass(), "hash1", 0);
        setIntField(term61074, term61074.getClass(), "hash2", 0);
        setIntField(term61074, term61074.getClass(), "hash3", 0);
        setField(term61074, term61074.getClass(), "key1", null);
        setField(term61074, term61074.getClass(), "key2", null);
        setField(term61074, term61074.getClass(), "key3", null);
        setField(term61074, term61074.getClass(), "value1", null);
        setField(term61074, term61074.getClass(), "value2", null);
        setField(term61074, term61074.getClass(), "value3", null);
        setField(term61074, term61074.getClass(), "delegateMap", null);
        setField(term61073, term61073.getClass(), "key", term61074);
        setField(term61073, term61073.getClass(), "value", null);
        setElement(term61072, 0, term61073);
        setField(term61075, term61075.getClass(), "next", null);
        setField(term61075, term61075.getClass(), "key", term61076);
        setField(term61075, term61075.getClass(), "value", null);
        setElement(term61072, 5, term61075);
        setField(term61071, term61071.getClass(), "data", term61072);
        setIntField(term61071, term61071.getClass(), "threshold", 12);
        setIntField(term61071, term61071.getClass(), "modCount", 2);
        setField(term61071, term61071.getClass(), "entrySet", null);
        setField(term61071, term61071.getClass(), "keySet", null);
        setField(term61071, term61071.getClass(), "values", null);
        setField(term61071, term61071.getClass(), "keySet", null);
        setField(term61071, term61071.getClass(), "values", null);
        setField(term61070, term61070.getClass(), "delegateMap", term61071);
        term61077 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term61077, term61077.getClass(), "size", 3);
        setIntField(term61077, term61077.getClass(), "hash1", 0);
        setIntField(term61077, term61077.getClass(), "hash2", 0);
        setIntField(term61077, term61077.getClass(), "hash3", 0);
        setField(term61077, term61077.getClass(), "key1", null);
        setField(term61077, term61077.getClass(), "key2", null);
        setField(term61077, term61077.getClass(), "key3", null);
        setField(term61077, term61077.getClass(), "value1", null);
        setField(term61077, term61077.getClass(), "value2", null);
        setField(term61077, term61077.getClass(), "value3", null);
        setField(term61077, term61077.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term60900;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term60808, args);
        assertTrue(recursiveEquals(term60808, term61070));
        assertTrue(recursiveEquals(term60900, term61077));
        assertTrue(recursiveEquals(retValue, null));
    }

};


