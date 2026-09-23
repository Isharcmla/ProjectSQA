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

public class Flat3Map_put_19447407251004 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282946;
     Object term283076;
     Object term284097;
     Object term284101;

    public Flat3Map_put_19447407251004() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term282946 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term283205 = newInstance(Class.forName("java.lang.Object"));
        setField(term282946, term282946.getClass(), "delegateMap", null);
        setIntField(term282946, term282946.getClass(), "size", 2);
        setIntField(term282946, term282946.getClass(), "hash2", -1);
        setIntField(term282946, term282946.getClass(), "hash1", 0);
        setField(term282946, term282946.getClass(), "key1", null);
        setField(term282946, term282946.getClass(), "key2", term283205);
        setField(term282946, term282946.getClass(), "value1", null);
        term283076 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term283186 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term283076, term283076.getClass(), "delegateMap", null);
        setIntField(term283076, term283076.getClass(), "size", 2);
        setIntField(term283076, term283076.getClass(), "hash2", 0);
        setField(term283076, term283076.getClass(), "value2", null);
        setIntField(term283076, term283076.getClass(), "hash1", 0);
        setIntField(term283186, term283186.getClass(), "size", 0);
        setField(term283076, term283076.getClass(), "value1", term283186);
        setField(term283076, term283076.getClass(), "key2", null);
        setField(term283076, term283076.getClass(), "key1", term283205);
        term284097 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term284098 = newInstance(Class.forName("java.lang.Object"));
        Object term284099 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term284100 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term284097, term284097.getClass(), "size", 3);
        setIntField(term284097, term284097.getClass(), "hash1", 0);
        setIntField(term284097, term284097.getClass(), "hash2", -1);
        setIntField(term284097, term284097.getClass(), "hash3", 0);
        setField(term284097, term284097.getClass(), "key1", null);
        setField(term284097, term284097.getClass(), "key2", term284098);
        setIntField(term284099, term284099.getClass(), "size", 2);
        setIntField(term284099, term284099.getClass(), "hash1", 5);
        setIntField(term284099, term284099.getClass(), "hash2", 0);
        setIntField(term284099, term284099.getClass(), "hash3", 0);
        setField(term284099, term284099.getClass(), "key1", term284098);
        setField(term284099, term284099.getClass(), "key2", null);
        setField(term284099, term284099.getClass(), "key3", null);
        setFloatField(term284100, term284100.getClass(), "loadFactor", 0.0F);
        setIntField(term284100, term284100.getClass(), "size", 0);
        setField(term284100, term284100.getClass(), "data", null);
        setIntField(term284100, term284100.getClass(), "threshold", 0);
        setIntField(term284100, term284100.getClass(), "modCount", 0);
        setField(term284100, term284100.getClass(), "entrySet", null);
        setField(term284100, term284100.getClass(), "keySet", null);
        setField(term284100, term284100.getClass(), "values", null);
        setField(term284100, term284100.getClass(), "keySet", null);
        setField(term284100, term284100.getClass(), "values", null);
        setField(term284099, term284099.getClass(), "value1", term284100);
        setField(term284099, term284099.getClass(), "value2", null);
        setField(term284099, term284099.getClass(), "value3", null);
        setField(term284099, term284099.getClass(), "delegateMap", null);
        setField(term284097, term284097.getClass(), "key3", term284099);
        setField(term284097, term284097.getClass(), "value1", null);
        setField(term284097, term284097.getClass(), "value2", null);
        setField(term284097, term284097.getClass(), "value3", null);
        setField(term284097, term284097.getClass(), "delegateMap", null);
        term284101 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term284102 = newInstance(Class.forName("java.lang.Object"));
        Object term284103 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term284101, term284101.getClass(), "size", 2);
        setIntField(term284101, term284101.getClass(), "hash1", 5);
        setIntField(term284101, term284101.getClass(), "hash2", 0);
        setIntField(term284101, term284101.getClass(), "hash3", 0);
        setField(term284101, term284101.getClass(), "key1", term284102);
        setField(term284101, term284101.getClass(), "key2", null);
        setField(term284101, term284101.getClass(), "key3", null);
        setFloatField(term284103, term284103.getClass(), "loadFactor", 0.0F);
        setIntField(term284103, term284103.getClass(), "size", 0);
        setField(term284103, term284103.getClass(), "data", null);
        setIntField(term284103, term284103.getClass(), "threshold", 0);
        setIntField(term284103, term284103.getClass(), "modCount", 0);
        setField(term284103, term284103.getClass(), "entrySet", null);
        setField(term284103, term284103.getClass(), "keySet", null);
        setField(term284103, term284103.getClass(), "values", null);
        setField(term284103, term284103.getClass(), "keySet", null);
        setField(term284103, term284103.getClass(), "values", null);
        setField(term284101, term284101.getClass(), "value1", term284103);
        setField(term284101, term284101.getClass(), "value2", null);
        setField(term284101, term284101.getClass(), "value3", null);
        setField(term284101, term284101.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term283076;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term282946, args);
        assertTrue(recursiveEquals(term282946, term284097));
        assertTrue(recursiveEquals(term283076, term284101));
        assertTrue(recursiveEquals(retValue, null));
    }

};


