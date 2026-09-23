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

public class Flat3Map_put_1944740725679 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156802;
     Object term156894;
     Object term157506;
     Object term157509;

    public Flat3Map_put_1944740725679() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156802 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term156802, term156802.getClass(), "delegateMap", null);
        setIntField(term156802, term156802.getClass(), "size", 2);
        setIntField(term156802, term156802.getClass(), "hash2", -1);
        setIntField(term156802, term156802.getClass(), "hash1", 0);
        setField(term156802, term156802.getClass(), "key1", term156802);
        term156894 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term157004 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term156894, term156894.getClass(), "delegateMap", null);
        setIntField(term156894, term156894.getClass(), "size", 2);
        setIntField(term156894, term156894.getClass(), "hash2", 0);
        setField(term156894, term156894.getClass(), "value2", null);
        setIntField(term156894, term156894.getClass(), "hash1", 0);
        setIntField(term157004, term157004.getClass(), "size", 0);
        setField(term156894, term156894.getClass(), "value1", term157004);
        term157506 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term157507 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term157508 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term157506, term157506.getClass(), "size", 3);
        setIntField(term157506, term157506.getClass(), "hash1", 0);
        setIntField(term157506, term157506.getClass(), "hash2", -1);
        setIntField(term157506, term157506.getClass(), "hash3", 0);
        setField(term157506, term157506.getClass(), "key1", term157506);
        setField(term157506, term157506.getClass(), "key2", null);
        setIntField(term157507, term157507.getClass(), "size", 2);
        setIntField(term157507, term157507.getClass(), "hash1", 0);
        setIntField(term157507, term157507.getClass(), "hash2", 0);
        setIntField(term157507, term157507.getClass(), "hash3", 0);
        setField(term157507, term157507.getClass(), "key1", null);
        setField(term157507, term157507.getClass(), "key2", null);
        setField(term157507, term157507.getClass(), "key3", null);
        setFloatField(term157508, term157508.getClass(), "loadFactor", 0.0F);
        setIntField(term157508, term157508.getClass(), "size", 0);
        setField(term157508, term157508.getClass(), "data", null);
        setIntField(term157508, term157508.getClass(), "threshold", 0);
        setIntField(term157508, term157508.getClass(), "modCount", 0);
        setField(term157508, term157508.getClass(), "entrySet", null);
        setField(term157508, term157508.getClass(), "keySet", null);
        setField(term157508, term157508.getClass(), "values", null);
        setField(term157508, term157508.getClass(), "keySet", null);
        setField(term157508, term157508.getClass(), "values", null);
        setField(term157507, term157507.getClass(), "value1", term157508);
        setField(term157507, term157507.getClass(), "value2", null);
        setField(term157507, term157507.getClass(), "value3", null);
        setField(term157507, term157507.getClass(), "delegateMap", null);
        setField(term157506, term157506.getClass(), "key3", term157507);
        setField(term157506, term157506.getClass(), "value1", null);
        setField(term157506, term157506.getClass(), "value2", null);
        setField(term157506, term157506.getClass(), "value3", null);
        setField(term157506, term157506.getClass(), "delegateMap", null);
        term157509 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term157510 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term157509, term157509.getClass(), "size", 2);
        setIntField(term157509, term157509.getClass(), "hash1", 0);
        setIntField(term157509, term157509.getClass(), "hash2", 0);
        setIntField(term157509, term157509.getClass(), "hash3", 0);
        setField(term157509, term157509.getClass(), "key1", null);
        setField(term157509, term157509.getClass(), "key2", null);
        setField(term157509, term157509.getClass(), "key3", null);
        setFloatField(term157510, term157510.getClass(), "loadFactor", 0.0F);
        setIntField(term157510, term157510.getClass(), "size", 0);
        setField(term157510, term157510.getClass(), "data", null);
        setIntField(term157510, term157510.getClass(), "threshold", 0);
        setIntField(term157510, term157510.getClass(), "modCount", 0);
        setField(term157510, term157510.getClass(), "entrySet", null);
        setField(term157510, term157510.getClass(), "keySet", null);
        setField(term157510, term157510.getClass(), "values", null);
        setField(term157510, term157510.getClass(), "keySet", null);
        setField(term157510, term157510.getClass(), "values", null);
        setField(term157509, term157509.getClass(), "value1", term157510);
        setField(term157509, term157509.getClass(), "value2", null);
        setField(term157509, term157509.getClass(), "value3", null);
        setField(term157509, term157509.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term156894;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term156802, args);
        assertTrue(recursiveEquals(term156802, term157506));
        assertTrue(recursiveEquals(term156894, term157509));
        assertTrue(recursiveEquals(retValue, null));
    }

};


