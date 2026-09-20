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

public class Flat3Map_convertToMap_122991281177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15932;
     Object term16131;

    public Flat3Map_convertToMap_122991281177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15932 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term16042 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term15932, term15932.getClass(), "delegateMap", term16042);
        setIntField(term15932, term15932.getClass(), "size", 1);
        term16131 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term16132 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term16133 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term16134 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term16135 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term16131, term16131.getClass(), "size", 0);
        setIntField(term16131, term16131.getClass(), "hash1", 0);
        setIntField(term16131, term16131.getClass(), "hash2", 0);
        setIntField(term16131, term16131.getClass(), "hash3", 0);
        setField(term16131, term16131.getClass(), "key1", null);
        setField(term16131, term16131.getClass(), "key2", null);
        setField(term16131, term16131.getClass(), "key3", null);
        setField(term16131, term16131.getClass(), "value1", null);
        setField(term16131, term16131.getClass(), "value2", null);
        setField(term16131, term16131.getClass(), "value3", null);
        setFloatField(term16132, term16132.getClass(), "loadFactor", 0.75F);
        setIntField(term16132, term16132.getClass(), "size", 1);
        setField(term16134, term16134.getClass(), "next", null);
        setField(term16134, term16134.getClass(), "key", term16135);
        setField(term16134, term16134.getClass(), "value", null);
        setElement(term16133, 0, term16134);
        setField(term16132, term16132.getClass(), "data", term16133);
        setIntField(term16132, term16132.getClass(), "threshold", 12);
        setIntField(term16132, term16132.getClass(), "modCount", 1);
        setField(term16132, term16132.getClass(), "entrySet", null);
        setField(term16132, term16132.getClass(), "keySet", null);
        setField(term16132, term16132.getClass(), "values", null);
        setField(term16132, term16132.getClass(), "keySet", null);
        setField(term16132, term16132.getClass(), "values", null);
        setField(term16131, term16131.getClass(), "delegateMap", term16132);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "convertToMap", argTypes, term15932, args);
        assertTrue(recursiveEquals(term15932, term16131));
    }

};
