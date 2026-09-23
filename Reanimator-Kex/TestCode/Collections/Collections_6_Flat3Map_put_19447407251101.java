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

public class Flat3Map_put_19447407251101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term327063;
     Object term327415;
     Object term327530;
     Object term327535;

    public Flat3Map_put_19447407251101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term327063 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term327155 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term327193 = newInstance(Class.forName("java.lang.Object"));
        Object term327285 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term327323 = newInstance(Class.forName("java.lang.Object"));
        setField(term327063, term327063.getClass(), "delegateMap", null);
        setIntField(term327063, term327063.getClass(), "size", 3);
        setIntField(term327063, term327063.getClass(), "hash3", 0);
        setField(term327155, term327155.getClass(), "delegateMap", null);
        setIntField(term327155, term327155.getClass(), "size", -4);
        setField(term327063, term327063.getClass(), "key3", term327155);
        setIntField(term327063, term327063.getClass(), "hash2", 0);
        setField(term327063, term327063.getClass(), "key2", term327193);
        setIntField(term327063, term327063.getClass(), "hash1", 0);
        setField(term327285, term327285.getClass(), "delegateMap", null);
        setIntField(term327285, term327285.getClass(), "size", 3);
        setField(term327285, term327285.getClass(), "key3", term327323);
        setField(term327063, term327063.getClass(), "key1", term327285);
        term327415 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term327415, term327415.getClass(), "delegateMap", null);
        setIntField(term327415, term327415.getClass(), "size", 3);
        setIntField(term327415, term327415.getClass(), "hash3", 0);
        setField(term327415, term327415.getClass(), "value3", null);
        setIntField(term327415, term327415.getClass(), "hash2", 0);
        setField(term327415, term327415.getClass(), "value2", null);
        setIntField(term327415, term327415.getClass(), "hash1", 0);
        setField(term327415, term327415.getClass(), "value1", null);
        setField(term327415, term327415.getClass(), "key3", null);
        term327530 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term327531 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term327532 = newInstance(Class.forName("java.lang.Object"));
        Object term327533 = newInstance(Class.forName("java.lang.Object"));
        Object term327534 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term327530, term327530.getClass(), "size", 3);
        setIntField(term327530, term327530.getClass(), "hash1", 0);
        setIntField(term327530, term327530.getClass(), "hash2", 0);
        setIntField(term327530, term327530.getClass(), "hash3", 0);
        setIntField(term327531, term327531.getClass(), "size", 3);
        setIntField(term327531, term327531.getClass(), "hash1", 0);
        setIntField(term327531, term327531.getClass(), "hash2", 0);
        setIntField(term327531, term327531.getClass(), "hash3", 0);
        setField(term327531, term327531.getClass(), "key1", null);
        setField(term327531, term327531.getClass(), "key2", null);
        setField(term327531, term327531.getClass(), "key3", term327532);
        setField(term327531, term327531.getClass(), "value1", null);
        setField(term327531, term327531.getClass(), "value2", null);
        setField(term327531, term327531.getClass(), "value3", null);
        setField(term327531, term327531.getClass(), "delegateMap", null);
        setField(term327530, term327530.getClass(), "key1", term327531);
        setField(term327530, term327530.getClass(), "key2", term327533);
        setIntField(term327534, term327534.getClass(), "size", -4);
        setIntField(term327534, term327534.getClass(), "hash1", 0);
        setIntField(term327534, term327534.getClass(), "hash2", 0);
        setIntField(term327534, term327534.getClass(), "hash3", 0);
        setField(term327534, term327534.getClass(), "key1", null);
        setField(term327534, term327534.getClass(), "key2", null);
        setField(term327534, term327534.getClass(), "key3", null);
        setField(term327534, term327534.getClass(), "value1", null);
        setField(term327534, term327534.getClass(), "value2", null);
        setField(term327534, term327534.getClass(), "value3", null);
        setField(term327534, term327534.getClass(), "delegateMap", null);
        setField(term327530, term327530.getClass(), "key3", term327534);
        setField(term327530, term327530.getClass(), "value1", null);
        setField(term327530, term327530.getClass(), "value2", null);
        setField(term327530, term327530.getClass(), "value3", null);
        setField(term327530, term327530.getClass(), "delegateMap", null);
        term327535 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term327535, term327535.getClass(), "size", 3);
        setIntField(term327535, term327535.getClass(), "hash1", 0);
        setIntField(term327535, term327535.getClass(), "hash2", 0);
        setIntField(term327535, term327535.getClass(), "hash3", 0);
        setField(term327535, term327535.getClass(), "key1", null);
        setField(term327535, term327535.getClass(), "key2", null);
        setField(term327535, term327535.getClass(), "key3", null);
        setField(term327535, term327535.getClass(), "value1", null);
        setField(term327535, term327535.getClass(), "value2", null);
        setField(term327535, term327535.getClass(), "value3", null);
        setField(term327535, term327535.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term327415;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term327063, args);
        assertTrue(recursiveEquals(term327063, term327530));
        assertTrue(recursiveEquals(term327415, term327535));
        assertTrue(recursiveEquals(retValue, null));
    }

};


