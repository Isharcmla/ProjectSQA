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

public class Flat3Map_get_229621781523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99020;
     Object term99204;
     Object term99508;
     Object term99510;

    public Flat3Map_get_229621781523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99020 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term99112 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term99020, term99020.getClass(), "delegateMap", null);
        setIntField(term99020, term99020.getClass(), "size", 2);
        setIntField(term99020, term99020.getClass(), "hash2", 0);
        setField(term99020, term99020.getClass(), "key2", null);
        setIntField(term99020, term99020.getClass(), "hash1", 0);
        setField(term99112, term99112.getClass(), "delegateMap", null);
        setIntField(term99112, term99112.getClass(), "size", 2);
        setField(term99020, term99020.getClass(), "key1", term99112);
        term99204 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term99314 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term99428 = newInstance(Class.forName("org.apache.commons.collections.iterators.IteratorChain"));
        setField(term99204, term99204.getClass(), "delegateMap", null);
        setIntField(term99204, term99204.getClass(), "size", 2);
        setIntField(term99204, term99204.getClass(), "hash2", 0);
        setIntField(term99314, term99314.getClass(), "size", 0);
        setField(term99204, term99204.getClass(), "value2", term99314);
        setIntField(term99204, term99204.getClass(), "hash1", 0);
        setField(term99204, term99204.getClass(), "value1", null);
        setField(term99204, term99204.getClass(), "key2", term99428);
        term99508 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term99509 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term99508, term99508.getClass(), "size", 2);
        setIntField(term99508, term99508.getClass(), "hash1", 0);
        setIntField(term99508, term99508.getClass(), "hash2", 0);
        setIntField(term99508, term99508.getClass(), "hash3", 0);
        setIntField(term99509, term99509.getClass(), "size", 2);
        setIntField(term99509, term99509.getClass(), "hash1", 0);
        setIntField(term99509, term99509.getClass(), "hash2", 0);
        setIntField(term99509, term99509.getClass(), "hash3", 0);
        setField(term99509, term99509.getClass(), "key1", null);
        setField(term99509, term99509.getClass(), "key2", null);
        setField(term99509, term99509.getClass(), "key3", null);
        setField(term99509, term99509.getClass(), "value1", null);
        setField(term99509, term99509.getClass(), "value2", null);
        setField(term99509, term99509.getClass(), "value3", null);
        setField(term99509, term99509.getClass(), "delegateMap", null);
        setField(term99508, term99508.getClass(), "key1", term99509);
        setField(term99508, term99508.getClass(), "key2", null);
        setField(term99508, term99508.getClass(), "key3", null);
        setField(term99508, term99508.getClass(), "value1", null);
        setField(term99508, term99508.getClass(), "value2", null);
        setField(term99508, term99508.getClass(), "value3", null);
        setField(term99508, term99508.getClass(), "delegateMap", null);
        term99510 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term99511 = newInstance(Class.forName("org.apache.commons.collections.iterators.IteratorChain"));
        Object term99512 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term99510, term99510.getClass(), "size", 2);
        setIntField(term99510, term99510.getClass(), "hash1", 0);
        setIntField(term99510, term99510.getClass(), "hash2", 0);
        setIntField(term99510, term99510.getClass(), "hash3", 0);
        setField(term99510, term99510.getClass(), "key1", null);
        setField(term99511, term99511.getClass(), "iteratorChain", null);
        setIntField(term99511, term99511.getClass(), "currentIteratorIndex", 0);
        setField(term99511, term99511.getClass(), "currentIterator", null);
        setField(term99511, term99511.getClass(), "lastUsedIterator", null);
        setBooleanField(term99511, term99511.getClass(), "isLocked", false);
        setField(term99510, term99510.getClass(), "key2", term99511);
        setField(term99510, term99510.getClass(), "key3", null);
        setField(term99510, term99510.getClass(), "value1", null);
        setFloatField(term99512, term99512.getClass(), "loadFactor", 0.0F);
        setIntField(term99512, term99512.getClass(), "size", 0);
        setField(term99512, term99512.getClass(), "data", null);
        setIntField(term99512, term99512.getClass(), "threshold", 0);
        setIntField(term99512, term99512.getClass(), "modCount", 0);
        setField(term99512, term99512.getClass(), "entrySet", null);
        setField(term99512, term99512.getClass(), "keySet", null);
        setField(term99512, term99512.getClass(), "values", null);
        setField(term99512, term99512.getClass(), "keySet", null);
        setField(term99512, term99512.getClass(), "values", null);
        setField(term99510, term99510.getClass(), "value2", term99512);
        setField(term99510, term99510.getClass(), "value3", null);
        setField(term99510, term99510.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term99204;
        Object retValue = callMethod(klass, "get", argTypes, term99020, args);
        assertTrue(recursiveEquals(term99020, term99508));
        assertTrue(recursiveEquals(term99204, term99510));
        assertTrue(recursiveEquals(retValue, null));
    }

};
