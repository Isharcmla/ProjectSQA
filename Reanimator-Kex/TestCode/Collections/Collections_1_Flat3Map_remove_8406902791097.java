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

public class Flat3Map_remove_8406902791097 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217478;
     Object term217650;
     Object term217652;

    public Flat3Map_remove_8406902791097() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term217478 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term217533 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term217478, term217478.getClass(), "delegateMap", null);
        setIntField(term217478, term217478.getClass(), "size", 3);
        setIntField(term217478, term217478.getClass(), "hash3", 0);
        setField(term217478, term217478.getClass(), "value3", null);
        setIntField(term217478, term217478.getClass(), "hash2", 0);
        setField(term217478, term217478.getClass(), "value2", term217533);
        term217650 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term217651 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term217650, term217650.getClass(), "size", 3);
        setIntField(term217650, term217650.getClass(), "hash1", 0);
        setIntField(term217650, term217650.getClass(), "hash2", 0);
        setIntField(term217650, term217650.getClass(), "hash3", 0);
        setField(term217650, term217650.getClass(), "key1", null);
        setField(term217650, term217650.getClass(), "key2", null);
        setField(term217650, term217650.getClass(), "key3", null);
        setField(term217650, term217650.getClass(), "value1", null);
        setFloatField(term217651, term217651.getClass(), "loadFactor", 0.0F);
        setIntField(term217651, term217651.getClass(), "size", 0);
        setField(term217651, term217651.getClass(), "data", null);
        setIntField(term217651, term217651.getClass(), "threshold", 0);
        setIntField(term217651, term217651.getClass(), "modCount", 0);
        setField(term217651, term217651.getClass(), "entrySet", null);
        setField(term217651, term217651.getClass(), "keySet", null);
        setField(term217651, term217651.getClass(), "values", null);
        setField(term217651, term217651.getClass(), "keySet", null);
        setField(term217651, term217651.getClass(), "values", null);
        setField(term217650, term217650.getClass(), "value2", term217651);
        setField(term217650, term217650.getClass(), "value3", null);
        setField(term217650, term217650.getClass(), "delegateMap", null);
        term217652 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term217653 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term217652, term217652.getClass(), "size", 3);
        setIntField(term217652, term217652.getClass(), "hash1", 0);
        setIntField(term217652, term217652.getClass(), "hash2", 0);
        setIntField(term217652, term217652.getClass(), "hash3", 0);
        setField(term217652, term217652.getClass(), "key1", null);
        setField(term217652, term217652.getClass(), "key2", null);
        setField(term217652, term217652.getClass(), "key3", null);
        setField(term217652, term217652.getClass(), "value1", null);
        setFloatField(term217653, term217653.getClass(), "loadFactor", 0.0F);
        setIntField(term217653, term217653.getClass(), "size", 0);
        setField(term217653, term217653.getClass(), "data", null);
        setIntField(term217653, term217653.getClass(), "threshold", 0);
        setIntField(term217653, term217653.getClass(), "modCount", 0);
        setField(term217653, term217653.getClass(), "entrySet", null);
        setField(term217653, term217653.getClass(), "keySet", null);
        setField(term217653, term217653.getClass(), "values", null);
        setField(term217653, term217653.getClass(), "keySet", null);
        setField(term217653, term217653.getClass(), "values", null);
        setField(term217652, term217652.getClass(), "value2", term217653);
        setField(term217652, term217652.getClass(), "value3", null);
        setField(term217652, term217652.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term217478;
        Object retValue = callMethod(klass, "remove", argTypes, term217478, args);
        assertTrue(recursiveEquals(term217478, term217650));
        assertTrue(recursiveEquals(term217478, term217652));
        assertTrue(recursiveEquals(retValue, null));
    }

};
