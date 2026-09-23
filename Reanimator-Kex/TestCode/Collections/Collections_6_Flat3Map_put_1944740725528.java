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
import java.util.HashMap;

public class Flat3Map_put_1944740725528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101602;
     Object term101926;
     Object term102672;
     Object term102680;

    public Flat3Map_put_1944740725528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term101834 = new HashMap();
        term101602 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term101694 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term101786 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term101602, term101602.getClass(), "delegateMap", null);
        setIntField(term101602, term101602.getClass(), "size", 3);
        setIntField(term101602, term101602.getClass(), "hash3", 843195073);
        setField(term101694, term101694.getClass(), "delegateMap", null);
        setIntField(term101694, term101694.getClass(), "size", 3);
        setField(term101694, term101694.getClass(), "key3", term101786);
        setField(term101694, term101694.getClass(), "key2", null);
        setField(term101694, term101694.getClass(), "value2", term101834);
        setIntField(term101694, term101694.getClass(), "hash3", 1142030592);
        setField(term101694, term101694.getClass(), "value3", null);
        setIntField(term101694, term101694.getClass(), "hash2", -1610431950);
        setIntField(term101694, term101694.getClass(), "hash1", 4326664);
        setField(term101694, term101694.getClass(), "value1", null);
        setField(term101602, term101602.getClass(), "key3", term101694);
        setIntField(term101602, term101602.getClass(), "hash2", 843195073);
        setField(term101602, term101602.getClass(), "key2", null);
        setIntField(term101602, term101602.getClass(), "hash1", 843195073);
        setField(term101602, term101602.getClass(), "key1", null);
        setField(term101602, term101602.getClass(), "value3", null);
        setField(term101602, term101602.getClass(), "value2", null);
        setField(term101602, term101602.getClass(), "value1", null);
        term101926 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term101926, term101926.getClass(), "delegateMap", null);
        setIntField(term101926, term101926.getClass(), "size", 3);
        setIntField(term101926, term101926.getClass(), "hash3", 35652096);
        setField(term101926, term101926.getClass(), "value3", null);
        setIntField(term101926, term101926.getClass(), "hash2", 1106346177);
        setField(term101926, term101926.getClass(), "value2", null);
        setIntField(term101926, term101926.getClass(), "hash1", -298803200);
        setField(term101926, term101926.getClass(), "value1", null);
        setField(term101926, term101926.getClass(), "key3", null);
        term102672 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term102673 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term102674 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term102675 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term102676 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term102677 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term102678 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term102679 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term102672, term102672.getClass(), "size", 0);
        setIntField(term102672, term102672.getClass(), "hash1", 0);
        setIntField(term102672, term102672.getClass(), "hash2", 0);
        setIntField(term102672, term102672.getClass(), "hash3", 0);
        setField(term102672, term102672.getClass(), "key1", null);
        setField(term102672, term102672.getClass(), "key2", null);
        setField(term102672, term102672.getClass(), "key3", null);
        setField(term102672, term102672.getClass(), "value1", null);
        setField(term102672, term102672.getClass(), "value2", null);
        setField(term102672, term102672.getClass(), "value3", null);
        setFloatField(term102673, term102673.getClass(), "loadFactor", 0.75F);
        setIntField(term102673, term102673.getClass(), "size", 3);
        setField(term102676, term102676.getClass(), "next", null);
        setField(term102676, term102676.getClass(), "key", null);
        setField(term102676, term102676.getClass(), "value", null);
        setField(term102675, term102675.getClass(), "next", term102676);
        setIntField(term102677, term102677.getClass(), "size", 3);
        setIntField(term102677, term102677.getClass(), "hash1", -298803200);
        setIntField(term102677, term102677.getClass(), "hash2", 1106346177);
        setIntField(term102677, term102677.getClass(), "hash3", 35652096);
        setField(term102677, term102677.getClass(), "key1", null);
        setField(term102677, term102677.getClass(), "key2", null);
        setField(term102677, term102677.getClass(), "key3", null);
        setField(term102677, term102677.getClass(), "value1", null);
        setField(term102677, term102677.getClass(), "value2", null);
        setField(term102677, term102677.getClass(), "value3", null);
        setField(term102677, term102677.getClass(), "delegateMap", null);
        setField(term102675, term102675.getClass(), "key", term102677);
        setField(term102675, term102675.getClass(), "value", null);
        setElement(term102674, 0, term102675);
        setField(term102678, term102678.getClass(), "next", null);
        setField(term102678, term102678.getClass(), "key", term102679);
        setField(term102678, term102678.getClass(), "value", null);
        setElement(term102674, 5, term102678);
        setField(term102673, term102673.getClass(), "data", term102674);
        setIntField(term102673, term102673.getClass(), "threshold", 12);
        setIntField(term102673, term102673.getClass(), "modCount", 3);
        setField(term102673, term102673.getClass(), "entrySet", null);
        setField(term102673, term102673.getClass(), "keySet", null);
        setField(term102673, term102673.getClass(), "values", null);
        setField(term102673, term102673.getClass(), "keySet", null);
        setField(term102673, term102673.getClass(), "values", null);
        setField(term102672, term102672.getClass(), "delegateMap", term102673);
        term102680 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term102680, term102680.getClass(), "size", 3);
        setIntField(term102680, term102680.getClass(), "hash1", -298803200);
        setIntField(term102680, term102680.getClass(), "hash2", 1106346177);
        setIntField(term102680, term102680.getClass(), "hash3", 35652096);
        setField(term102680, term102680.getClass(), "key1", null);
        setField(term102680, term102680.getClass(), "key2", null);
        setField(term102680, term102680.getClass(), "key3", null);
        setField(term102680, term102680.getClass(), "value1", null);
        setField(term102680, term102680.getClass(), "value2", null);
        setField(term102680, term102680.getClass(), "value3", null);
        setField(term102680, term102680.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term101926;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term101602, args);
        assertTrue(recursiveEquals(term101602, term102672));
        assertTrue(recursiveEquals(term101926, term102680));
        assertTrue(recursiveEquals(retValue, null));
    }

};


