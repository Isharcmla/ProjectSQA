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

public class Flat3Map_hashCode_201935809495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17663;
     Object term18099;

    public Flat3Map_hashCode_201935809495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17663 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term17751 = newInstance(Class.forName("org.apache.commons.collections.map.LRUMap"));
        setField(term17663, term17663.getClass(), "delegateMap", term17751);
        term18099 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term18100 = newInstance(Class.forName("org.apache.commons.collections.map.LRUMap"));
        setIntField(term18099, term18099.getClass(), "size", 0);
        setIntField(term18099, term18099.getClass(), "hash1", 0);
        setIntField(term18099, term18099.getClass(), "hash2", 0);
        setIntField(term18099, term18099.getClass(), "hash3", 0);
        setField(term18099, term18099.getClass(), "key1", null);
        setField(term18099, term18099.getClass(), "key2", null);
        setField(term18099, term18099.getClass(), "key3", null);
        setField(term18099, term18099.getClass(), "value1", null);
        setField(term18099, term18099.getClass(), "value2", null);
        setField(term18099, term18099.getClass(), "value3", null);
        setIntField(term18100, term18100.getClass(), "maxSize", 0);
        setBooleanField(term18100, term18100.getClass(), "scanUntilRemovable", false);
        setField(term18100, term18100.getClass(), "header", null);
        setFloatField(term18100, term18100.getClass(), "loadFactor", 0.0F);
        setIntField(term18100, term18100.getClass(), "size", 0);
        setField(term18100, term18100.getClass(), "data", null);
        setIntField(term18100, term18100.getClass(), "threshold", 0);
        setIntField(term18100, term18100.getClass(), "modCount", 0);
        setField(term18100, term18100.getClass(), "entrySet", null);
        setField(term18100, term18100.getClass(), "keySet", null);
        setField(term18100, term18100.getClass(), "values", null);
        setField(term18100, term18100.getClass(), "keySet", null);
        setField(term18100, term18100.getClass(), "values", null);
        setField(term18099, term18099.getClass(), "delegateMap", term18100);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term17663, args);
        assertTrue(recursiveEquals(term17663, term18099));
        assertTrue(recursiveEquals(retValue, 0));
    }

};
