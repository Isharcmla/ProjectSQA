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

public class Flat3Map_convertToMap_1229912811148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25584;
     Object term26262;

    public Flat3Map_convertToMap_1229912811148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25584 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term25694 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term25786 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term25878 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term25584, term25584.getClass(), "delegateMap", term25694);
        setIntField(term25584, term25584.getClass(), "size", 3);
        setField(term25584, term25584.getClass(), "key3", term25786);
        setField(term25584, term25584.getClass(), "value3", term25878);
        term26262 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term26263 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term26264 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term26265 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term26266 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term26267 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term26262, term26262.getClass(), "size", 0);
        setIntField(term26262, term26262.getClass(), "hash1", 0);
        setIntField(term26262, term26262.getClass(), "hash2", 0);
        setIntField(term26262, term26262.getClass(), "hash3", 0);
        setField(term26262, term26262.getClass(), "key1", null);
        setField(term26262, term26262.getClass(), "key2", null);
        setField(term26262, term26262.getClass(), "key3", null);
        setField(term26262, term26262.getClass(), "value1", null);
        setField(term26262, term26262.getClass(), "value2", null);
        setField(term26262, term26262.getClass(), "value3", null);
        setFloatField(term26263, term26263.getClass(), "loadFactor", 0.75F);
        setIntField(term26263, term26263.getClass(), "size", 2);
        setField(term26266, term26266.getClass(), "next", null);
        setField(term26266, term26266.getClass(), "key", null);
        setField(term26266, term26266.getClass(), "value", null);
        setField(term26265, term26265.getClass(), "next", term26266);
        setField(term26265, term26265.getClass(), "key", term26267);
        setField(term26265, term26265.getClass(), "value", null);
        setElement(term26264, 0, term26265);
        setField(term26263, term26263.getClass(), "data", term26264);
        setIntField(term26263, term26263.getClass(), "threshold", 12);
        setIntField(term26263, term26263.getClass(), "modCount", 2);
        setField(term26263, term26263.getClass(), "entrySet", null);
        setField(term26263, term26263.getClass(), "keySet", null);
        setField(term26263, term26263.getClass(), "values", null);
        setField(term26263, term26263.getClass(), "keySet", null);
        setField(term26263, term26263.getClass(), "values", null);
        setField(term26262, term26262.getClass(), "delegateMap", term26263);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "convertToMap", argTypes, term25584, args);
        assertTrue(recursiveEquals(term25584, term26262));
    }

};
