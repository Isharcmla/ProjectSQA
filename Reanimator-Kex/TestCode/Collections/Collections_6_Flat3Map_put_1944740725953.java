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

public class Flat3Map_put_1944740725953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term262985;
     Object term263356;
     Object term263358;

    public Flat3Map_put_1944740725953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term262985 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term263018 = newInstance(Class.forName("java.util.zip.GZIPOutputStream"));
        setField(term262985, term262985.getClass(), "delegateMap", null);
        setIntField(term262985, term262985.getClass(), "size", 3);
        setIntField(term262985, term262985.getClass(), "hash3", -1);
        setField(term262985, term262985.getClass(), "value3", null);
        setIntField(term262985, term262985.getClass(), "hash2", 0);
        setField(term262985, term262985.getClass(), "value2", term263018);
        setIntField(term262985, term262985.getClass(), "hash1", 0);
        setField(term262985, term262985.getClass(), "value1", null);
        term263356 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term263357 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term263356, term263356.getClass(), "size", 0);
        setIntField(term263356, term263356.getClass(), "hash1", 0);
        setIntField(term263356, term263356.getClass(), "hash2", 0);
        setIntField(term263356, term263356.getClass(), "hash3", 0);
        setField(term263356, term263356.getClass(), "key1", null);
        setField(term263356, term263356.getClass(), "key2", null);
        setField(term263356, term263356.getClass(), "key3", null);
        setField(term263356, term263356.getClass(), "value1", null);
        setField(term263356, term263356.getClass(), "value2", null);
        setField(term263356, term263356.getClass(), "value3", null);
        setFloatField(term263357, term263357.getClass(), "loadFactor", 0.0F);
        setIntField(term263357, term263357.getClass(), "size", 0);
        setField(term263357, term263357.getClass(), "data", null);
        setIntField(term263357, term263357.getClass(), "threshold", 0);
        setIntField(term263357, term263357.getClass(), "modCount", 0);
        setField(term263357, term263357.getClass(), "entrySet", null);
        setField(term263357, term263357.getClass(), "keySet", null);
        setField(term263357, term263357.getClass(), "values", null);
        setField(term263357, term263357.getClass(), "keySet", null);
        setField(term263357, term263357.getClass(), "values", null);
        setField(term263356, term263356.getClass(), "delegateMap", term263357);
        term263358 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term263359 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term263358, term263358.getClass(), "size", 0);
        setIntField(term263358, term263358.getClass(), "hash1", 0);
        setIntField(term263358, term263358.getClass(), "hash2", 0);
        setIntField(term263358, term263358.getClass(), "hash3", 0);
        setField(term263358, term263358.getClass(), "key1", null);
        setField(term263358, term263358.getClass(), "key2", null);
        setField(term263358, term263358.getClass(), "key3", null);
        setField(term263358, term263358.getClass(), "value1", null);
        setField(term263358, term263358.getClass(), "value2", null);
        setField(term263358, term263358.getClass(), "value3", null);
        setFloatField(term263359, term263359.getClass(), "loadFactor", 0.0F);
        setIntField(term263359, term263359.getClass(), "size", 0);
        setField(term263359, term263359.getClass(), "data", null);
        setIntField(term263359, term263359.getClass(), "threshold", 0);
        setIntField(term263359, term263359.getClass(), "modCount", 0);
        setField(term263359, term263359.getClass(), "entrySet", null);
        setField(term263359, term263359.getClass(), "keySet", null);
        setField(term263359, term263359.getClass(), "values", null);
        setField(term263359, term263359.getClass(), "keySet", null);
        setField(term263359, term263359.getClass(), "values", null);
        setField(term263358, term263358.getClass(), "delegateMap", term263359);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term262985;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term262985, args);
        assertTrue(recursiveEquals(term262985, term263356));
        assertTrue(recursiveEquals(term262985, term263358));
        assertTrue(recursiveEquals(retValue, null));
    }

};


