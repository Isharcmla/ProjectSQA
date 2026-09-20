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

public class Flat3Map_put_1944740725936 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188007;
     Object term188443;
     Object term188445;

    public Flat3Map_put_1944740725936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188007 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term188062 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term188007, term188007.getClass(), "delegateMap", null);
        setIntField(term188007, term188007.getClass(), "size", 1);
        setIntField(term188007, term188007.getClass(), "hash1", -1);
        setIntField(term188062, term188062.getClass(), "size", 0);
        setField(term188007, term188007.getClass(), "value1", term188062);
        term188443 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term188444 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term188443, term188443.getClass(), "size", 2);
        setIntField(term188443, term188443.getClass(), "hash1", -1);
        setIntField(term188443, term188443.getClass(), "hash2", -1);
        setIntField(term188443, term188443.getClass(), "hash3", 0);
        setField(term188443, term188443.getClass(), "key1", null);
        setField(term188443, term188443.getClass(), "key2", term188443);
        setField(term188443, term188443.getClass(), "key3", null);
        setFloatField(term188444, term188444.getClass(), "loadFactor", 0.0F);
        setIntField(term188444, term188444.getClass(), "size", 0);
        setField(term188444, term188444.getClass(), "data", null);
        setIntField(term188444, term188444.getClass(), "threshold", 0);
        setIntField(term188444, term188444.getClass(), "modCount", 0);
        setField(term188444, term188444.getClass(), "entrySet", null);
        setField(term188444, term188444.getClass(), "keySet", null);
        setField(term188444, term188444.getClass(), "values", null);
        setField(term188444, term188444.getClass(), "keySet", null);
        setField(term188444, term188444.getClass(), "values", null);
        setField(term188443, term188443.getClass(), "value1", term188444);
        setField(term188443, term188443.getClass(), "value2", null);
        setField(term188443, term188443.getClass(), "value3", null);
        setField(term188443, term188443.getClass(), "delegateMap", null);
        term188445 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term188446 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term188445, term188445.getClass(), "size", 2);
        setIntField(term188445, term188445.getClass(), "hash1", -1);
        setIntField(term188445, term188445.getClass(), "hash2", -1);
        setIntField(term188445, term188445.getClass(), "hash3", 0);
        setField(term188445, term188445.getClass(), "key1", null);
        setField(term188445, term188445.getClass(), "key2", term188445);
        setField(term188445, term188445.getClass(), "key3", null);
        setFloatField(term188446, term188446.getClass(), "loadFactor", 0.0F);
        setIntField(term188446, term188446.getClass(), "size", 0);
        setField(term188446, term188446.getClass(), "data", null);
        setIntField(term188446, term188446.getClass(), "threshold", 0);
        setIntField(term188446, term188446.getClass(), "modCount", 0);
        setField(term188446, term188446.getClass(), "entrySet", null);
        setField(term188446, term188446.getClass(), "keySet", null);
        setField(term188446, term188446.getClass(), "values", null);
        setField(term188446, term188446.getClass(), "keySet", null);
        setField(term188446, term188446.getClass(), "values", null);
        setField(term188445, term188445.getClass(), "value1", term188446);
        setField(term188445, term188445.getClass(), "value2", null);
        setField(term188445, term188445.getClass(), "value3", null);
        setField(term188445, term188445.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term188007;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term188007, args);
        assertTrue(recursiveEquals(term188007, term188443));
        assertTrue(recursiveEquals(term188007, term188445));
        assertTrue(recursiveEquals(retValue, null));
    }

};
