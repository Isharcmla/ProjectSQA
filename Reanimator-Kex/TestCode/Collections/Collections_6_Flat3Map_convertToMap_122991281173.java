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

public class Flat3Map_convertToMap_122991281173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16216;
     Object term16591;

    public Flat3Map_convertToMap_122991281173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16216 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term16326 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term16216, term16216.getClass(), "delegateMap", term16326);
        setIntField(term16216, term16216.getClass(), "size", 2);
        term16591 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term16592 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term16593 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term16594 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term16595 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term16591, term16591.getClass(), "size", 0);
        setIntField(term16591, term16591.getClass(), "hash1", 0);
        setIntField(term16591, term16591.getClass(), "hash2", 0);
        setIntField(term16591, term16591.getClass(), "hash3", 0);
        setField(term16591, term16591.getClass(), "key1", null);
        setField(term16591, term16591.getClass(), "key2", null);
        setField(term16591, term16591.getClass(), "key3", null);
        setField(term16591, term16591.getClass(), "value1", null);
        setField(term16591, term16591.getClass(), "value2", null);
        setField(term16591, term16591.getClass(), "value3", null);
        setFloatField(term16592, term16592.getClass(), "loadFactor", 0.75F);
        setIntField(term16592, term16592.getClass(), "size", 1);
        setField(term16594, term16594.getClass(), "next", null);
        setField(term16594, term16594.getClass(), "key", term16595);
        setField(term16594, term16594.getClass(), "value", null);
        setElement(term16593, 5, term16594);
        setField(term16592, term16592.getClass(), "data", term16593);
        setIntField(term16592, term16592.getClass(), "threshold", 12);
        setIntField(term16592, term16592.getClass(), "modCount", 1);
        setField(term16592, term16592.getClass(), "entrySet", null);
        setField(term16592, term16592.getClass(), "keySet", null);
        setField(term16592, term16592.getClass(), "values", null);
        setField(term16592, term16592.getClass(), "keySet", null);
        setField(term16592, term16592.getClass(), "values", null);
        setField(term16591, term16591.getClass(), "delegateMap", term16592);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "convertToMap", argTypes, term16216, args);
        assertTrue(recursiveEquals(term16216, term16591));
    }

};


