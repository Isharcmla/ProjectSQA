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

public class Flat3Map_get_229621781696 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137125;
     Object term137309;
     Object term137948;
     Object term137950;

    public Flat3Map_get_229621781696() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137125 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term137217 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term137125, term137125.getClass(), "delegateMap", null);
        setIntField(term137125, term137125.getClass(), "size", 2);
        setIntField(term137125, term137125.getClass(), "hash2", 0);
        setField(term137125, term137125.getClass(), "key2", null);
        setIntField(term137125, term137125.getClass(), "hash1", 0);
        setField(term137217, term137217.getClass(), "delegateMap", null);
        setIntField(term137217, term137217.getClass(), "size", 2);
        setField(term137125, term137125.getClass(), "key1", term137217);
        term137309 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term137419 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term137503 = newInstance(Class.forName("java.util.Collections$CheckedCollection"));
        setField(term137309, term137309.getClass(), "delegateMap", null);
        setIntField(term137309, term137309.getClass(), "size", 2);
        setIntField(term137309, term137309.getClass(), "hash2", 0);
        setIntField(term137419, term137419.getClass(), "size", 0);
        setField(term137309, term137309.getClass(), "value2", term137419);
        setIntField(term137309, term137309.getClass(), "hash1", 0);
        setField(term137309, term137309.getClass(), "value1", null);
        setField(term137309, term137309.getClass(), "key2", term137503);
        term137948 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term137949 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term137948, term137948.getClass(), "size", 2);
        setIntField(term137948, term137948.getClass(), "hash1", 0);
        setIntField(term137948, term137948.getClass(), "hash2", 0);
        setIntField(term137948, term137948.getClass(), "hash3", 0);
        setIntField(term137949, term137949.getClass(), "size", 2);
        setIntField(term137949, term137949.getClass(), "hash1", 0);
        setIntField(term137949, term137949.getClass(), "hash2", 0);
        setIntField(term137949, term137949.getClass(), "hash3", 0);
        setField(term137949, term137949.getClass(), "key1", null);
        setField(term137949, term137949.getClass(), "key2", null);
        setField(term137949, term137949.getClass(), "key3", null);
        setField(term137949, term137949.getClass(), "value1", null);
        setField(term137949, term137949.getClass(), "value2", null);
        setField(term137949, term137949.getClass(), "value3", null);
        setField(term137949, term137949.getClass(), "delegateMap", null);
        setField(term137948, term137948.getClass(), "key1", term137949);
        setField(term137948, term137948.getClass(), "key2", null);
        setField(term137948, term137948.getClass(), "key3", null);
        setField(term137948, term137948.getClass(), "value1", null);
        setField(term137948, term137948.getClass(), "value2", null);
        setField(term137948, term137948.getClass(), "value3", null);
        setField(term137948, term137948.getClass(), "delegateMap", null);
        term137950 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term137951 = newInstance(Class.forName("java.util.Collections$CheckedCollection"));
        Object term137952 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term137950, term137950.getClass(), "size", 2);
        setIntField(term137950, term137950.getClass(), "hash1", 0);
        setIntField(term137950, term137950.getClass(), "hash2", 0);
        setIntField(term137950, term137950.getClass(), "hash3", 0);
        setField(term137950, term137950.getClass(), "key1", null);
        setField(term137951, term137951.getClass(), "c", null);
        setField(term137951, term137951.getClass(), "type", null);
        setField(term137951, term137951.getClass(), "zeroLengthElementArray", null);
        setField(term137950, term137950.getClass(), "key2", term137951);
        setField(term137950, term137950.getClass(), "key3", null);
        setField(term137950, term137950.getClass(), "value1", null);
        setFloatField(term137952, term137952.getClass(), "loadFactor", 0.0F);
        setIntField(term137952, term137952.getClass(), "size", 0);
        setField(term137952, term137952.getClass(), "data", null);
        setIntField(term137952, term137952.getClass(), "threshold", 0);
        setIntField(term137952, term137952.getClass(), "modCount", 0);
        setField(term137952, term137952.getClass(), "entrySet", null);
        setField(term137952, term137952.getClass(), "keySet", null);
        setField(term137952, term137952.getClass(), "values", null);
        setField(term137952, term137952.getClass(), "keySet", null);
        setField(term137952, term137952.getClass(), "values", null);
        setField(term137950, term137950.getClass(), "value2", term137952);
        setField(term137950, term137950.getClass(), "value3", null);
        setField(term137950, term137950.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term137309;
        Object retValue = callMethod(klass, "get", argTypes, term137125, args);
        assertTrue(recursiveEquals(term137125, term137948));
        assertTrue(recursiveEquals(term137309, term137950));
        assertTrue(recursiveEquals(retValue, null));
    }

};
