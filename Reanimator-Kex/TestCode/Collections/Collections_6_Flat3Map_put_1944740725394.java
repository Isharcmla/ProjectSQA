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

public class Flat3Map_put_1944740725394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68198;
     Object term68336;
     Object term68671;
     Object term68676;

    public Flat3Map_put_1944740725394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68198 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        term68336 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term68198, term68198.getClass(), "delegateMap", null);
        setIntField(term68198, term68198.getClass(), "size", -3);
        setIntField(term68198, term68198.getClass(), "hash2", 0);
        setField(term68198, term68198.getClass(), "key2", term68198);
        setIntField(term68198, term68198.getClass(), "hash1", 0);
        setField(term68336, term68336.getClass(), "delegateMap", null);
        setIntField(term68336, term68336.getClass(), "size", 2);
        setIntField(term68336, term68336.getClass(), "hash2", 0);
        setField(term68336, term68336.getClass(), "value2", null);
        setIntField(term68336, term68336.getClass(), "hash1", 0);
        setField(term68336, term68336.getClass(), "value1", null);
        setField(term68198, term68198.getClass(), "key1", term68336);
        term68671 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term68672 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term68673 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term68674 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term68675 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term68671, term68671.getClass(), "size", 0);
        setIntField(term68671, term68671.getClass(), "hash1", 0);
        setIntField(term68671, term68671.getClass(), "hash2", 0);
        setIntField(term68671, term68671.getClass(), "hash3", 0);
        setField(term68671, term68671.getClass(), "key1", null);
        setField(term68671, term68671.getClass(), "key2", null);
        setField(term68671, term68671.getClass(), "key3", null);
        setField(term68671, term68671.getClass(), "value1", null);
        setField(term68671, term68671.getClass(), "value2", null);
        setField(term68671, term68671.getClass(), "value3", null);
        setFloatField(term68672, term68672.getClass(), "loadFactor", 0.75F);
        setIntField(term68672, term68672.getClass(), "size", 1);
        setField(term68674, term68674.getClass(), "next", null);
        setIntField(term68675, term68675.getClass(), "size", 2);
        setIntField(term68675, term68675.getClass(), "hash1", 0);
        setIntField(term68675, term68675.getClass(), "hash2", 0);
        setIntField(term68675, term68675.getClass(), "hash3", 0);
        setField(term68675, term68675.getClass(), "key1", null);
        setField(term68675, term68675.getClass(), "key2", null);
        setField(term68675, term68675.getClass(), "key3", null);
        setField(term68675, term68675.getClass(), "value1", null);
        setField(term68675, term68675.getClass(), "value2", null);
        setField(term68675, term68675.getClass(), "value3", null);
        setField(term68675, term68675.getClass(), "delegateMap", null);
        setField(term68674, term68674.getClass(), "key", term68675);
        setField(term68674, term68674.getClass(), "value", null);
        setElement(term68673, 0, term68674);
        setField(term68672, term68672.getClass(), "data", term68673);
        setIntField(term68672, term68672.getClass(), "threshold", 12);
        setIntField(term68672, term68672.getClass(), "modCount", 1);
        setField(term68672, term68672.getClass(), "entrySet", null);
        setField(term68672, term68672.getClass(), "keySet", null);
        setField(term68672, term68672.getClass(), "values", null);
        setField(term68672, term68672.getClass(), "keySet", null);
        setField(term68672, term68672.getClass(), "values", null);
        setField(term68671, term68671.getClass(), "delegateMap", term68672);
        term68676 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term68676, term68676.getClass(), "size", 2);
        setIntField(term68676, term68676.getClass(), "hash1", 0);
        setIntField(term68676, term68676.getClass(), "hash2", 0);
        setIntField(term68676, term68676.getClass(), "hash3", 0);
        setField(term68676, term68676.getClass(), "key1", null);
        setField(term68676, term68676.getClass(), "key2", null);
        setField(term68676, term68676.getClass(), "key3", null);
        setField(term68676, term68676.getClass(), "value1", null);
        setField(term68676, term68676.getClass(), "value2", null);
        setField(term68676, term68676.getClass(), "value3", null);
        setField(term68676, term68676.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term68336;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term68198, args);
        assertTrue(recursiveEquals(term68198, term68671));
        assertTrue(recursiveEquals(term68336, term68676));
        assertTrue(recursiveEquals(retValue, null));
    }

};


