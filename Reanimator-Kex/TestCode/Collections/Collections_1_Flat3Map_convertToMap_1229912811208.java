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

public class Flat3Map_convertToMap_1229912811208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35193;
     Object term36369;

    public Flat3Map_convertToMap_1229912811208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35193 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term35303 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term35395 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term35487 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object[] term34965 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term35579 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term35617 = newInstance(Class.forName("java.lang.Object"));
        setField(term35193, term35193.getClass(), "delegateMap", term35303);
        setIntField(term35193, term35193.getClass(), "size", 3);
        setField(term35395, term35395.getClass(), "delegateMap", null);
        setIntField(term35395, term35395.getClass(), "size", 0);
        setField(term35193, term35193.getClass(), "key3", term35395);
        setField(term35193, term35193.getClass(), "value3", term35487);
        setField(term35193, term35193.getClass(), "key2", null);
        setField(term35193, term35193.getClass(), "value2", term34965);
        setField(term35193, term35193.getClass(), "key1", term35579);
        setField(term35193, term35193.getClass(), "value1", term35617);
        term36369 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term36370 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term36371 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term36372 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term36373 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term36374 = newInstance(Class.forName("java.lang.Object"));
        Object[] term36375 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        setIntField(term36369, term36369.getClass(), "size", 0);
        setIntField(term36369, term36369.getClass(), "hash1", 0);
        setIntField(term36369, term36369.getClass(), "hash2", 0);
        setIntField(term36369, term36369.getClass(), "hash3", 0);
        setField(term36369, term36369.getClass(), "key1", null);
        setField(term36369, term36369.getClass(), "key2", null);
        setField(term36369, term36369.getClass(), "key3", null);
        setField(term36369, term36369.getClass(), "value1", null);
        setField(term36369, term36369.getClass(), "value2", null);
        setField(term36369, term36369.getClass(), "value3", null);
        setFloatField(term36370, term36370.getClass(), "loadFactor", 0.75F);
        setIntField(term36370, term36370.getClass(), "size", 2);
        setField(term36373, term36373.getClass(), "next", null);
        setField(term36373, term36373.getClass(), "key", null);
        setField(term36373, term36373.getClass(), "value", null);
        setField(term36372, term36372.getClass(), "next", term36373);
        setField(term36372, term36372.getClass(), "key", term36374);
        setField(term36372, term36372.getClass(), "value", term36375);
        setElement(term36371, 0, term36372);
        setField(term36370, term36370.getClass(), "data", term36371);
        setIntField(term36370, term36370.getClass(), "threshold", 12);
        setIntField(term36370, term36370.getClass(), "modCount", 2);
        setField(term36370, term36370.getClass(), "entrySet", null);
        setField(term36370, term36370.getClass(), "keySet", null);
        setField(term36370, term36370.getClass(), "values", null);
        setField(term36370, term36370.getClass(), "keySet", null);
        setField(term36370, term36370.getClass(), "values", null);
        setField(term36369, term36369.getClass(), "delegateMap", term36370);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "convertToMap", argTypes, term35193, args);
        assertTrue(recursiveEquals(term35193, term36369));
    }

};
