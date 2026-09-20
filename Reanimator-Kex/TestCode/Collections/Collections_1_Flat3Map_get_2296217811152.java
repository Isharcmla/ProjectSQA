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

public class Flat3Map_get_2296217811152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249646;
     Object term249922;
     Object term250514;
     Object term250517;

    public Flat3Map_get_2296217811152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term249646 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term249738 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term249830 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term249646, term249646.getClass(), "delegateMap", null);
        setIntField(term249646, term249646.getClass(), "size", 2);
        setIntField(term249646, term249646.getClass(), "hash2", 0);
        setField(term249738, term249738.getClass(), "delegateMap", null);
        setIntField(term249738, term249738.getClass(), "size", 0);
        setField(term249646, term249646.getClass(), "key2", term249738);
        setIntField(term249646, term249646.getClass(), "hash1", 0);
        setField(term249830, term249830.getClass(), "delegateMap", null);
        setIntField(term249830, term249830.getClass(), "size", 2);
        setIntField(term249830, term249830.getClass(), "hash2", 0);
        setField(term249830, term249830.getClass(), "key2", null);
        setIntField(term249830, term249830.getClass(), "hash1", -1);
        setField(term249646, term249646.getClass(), "key1", term249830);
        term249922 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term250032 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term249922, term249922.getClass(), "delegateMap", null);
        setIntField(term249922, term249922.getClass(), "size", 2);
        setIntField(term249922, term249922.getClass(), "hash2", 0);
        setField(term249922, term249922.getClass(), "value2", null);
        setIntField(term249922, term249922.getClass(), "hash1", 0);
        setField(term249922, term249922.getClass(), "value1", null);
        setIntField(term250032, term250032.getClass(), "size", 0);
        setField(term249922, term249922.getClass(), "key2", term250032);
        term250514 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term250515 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term250516 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term250514, term250514.getClass(), "size", 2);
        setIntField(term250514, term250514.getClass(), "hash1", 0);
        setIntField(term250514, term250514.getClass(), "hash2", 0);
        setIntField(term250514, term250514.getClass(), "hash3", 0);
        setIntField(term250515, term250515.getClass(), "size", 2);
        setIntField(term250515, term250515.getClass(), "hash1", -1);
        setIntField(term250515, term250515.getClass(), "hash2", 0);
        setIntField(term250515, term250515.getClass(), "hash3", 0);
        setField(term250515, term250515.getClass(), "key1", null);
        setField(term250515, term250515.getClass(), "key2", null);
        setField(term250515, term250515.getClass(), "key3", null);
        setField(term250515, term250515.getClass(), "value1", null);
        setField(term250515, term250515.getClass(), "value2", null);
        setField(term250515, term250515.getClass(), "value3", null);
        setField(term250515, term250515.getClass(), "delegateMap", null);
        setField(term250514, term250514.getClass(), "key1", term250515);
        setIntField(term250516, term250516.getClass(), "size", 0);
        setIntField(term250516, term250516.getClass(), "hash1", 0);
        setIntField(term250516, term250516.getClass(), "hash2", 0);
        setIntField(term250516, term250516.getClass(), "hash3", 0);
        setField(term250516, term250516.getClass(), "key1", null);
        setField(term250516, term250516.getClass(), "key2", null);
        setField(term250516, term250516.getClass(), "key3", null);
        setField(term250516, term250516.getClass(), "value1", null);
        setField(term250516, term250516.getClass(), "value2", null);
        setField(term250516, term250516.getClass(), "value3", null);
        setField(term250516, term250516.getClass(), "delegateMap", null);
        setField(term250514, term250514.getClass(), "key2", term250516);
        setField(term250514, term250514.getClass(), "key3", null);
        setField(term250514, term250514.getClass(), "value1", null);
        setField(term250514, term250514.getClass(), "value2", null);
        setField(term250514, term250514.getClass(), "value3", null);
        setField(term250514, term250514.getClass(), "delegateMap", null);
        term250517 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term250518 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term250517, term250517.getClass(), "size", 2);
        setIntField(term250517, term250517.getClass(), "hash1", 0);
        setIntField(term250517, term250517.getClass(), "hash2", 0);
        setIntField(term250517, term250517.getClass(), "hash3", 0);
        setField(term250517, term250517.getClass(), "key1", null);
        setFloatField(term250518, term250518.getClass(), "loadFactor", 0.0F);
        setIntField(term250518, term250518.getClass(), "size", 0);
        setField(term250518, term250518.getClass(), "data", null);
        setIntField(term250518, term250518.getClass(), "threshold", 0);
        setIntField(term250518, term250518.getClass(), "modCount", 0);
        setField(term250518, term250518.getClass(), "entrySet", null);
        setField(term250518, term250518.getClass(), "keySet", null);
        setField(term250518, term250518.getClass(), "values", null);
        setField(term250518, term250518.getClass(), "keySet", null);
        setField(term250518, term250518.getClass(), "values", null);
        setField(term250517, term250517.getClass(), "key2", term250518);
        setField(term250517, term250517.getClass(), "key3", null);
        setField(term250517, term250517.getClass(), "value1", null);
        setField(term250517, term250517.getClass(), "value2", null);
        setField(term250517, term250517.getClass(), "value3", null);
        setField(term250517, term250517.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term249922;
        Object retValue = callMethod(klass, "get", argTypes, term249646, args);
        assertTrue(recursiveEquals(term249646, term250514));
        assertTrue(recursiveEquals(term249922, term250517));
        assertTrue(recursiveEquals(retValue, null));
    }

};
