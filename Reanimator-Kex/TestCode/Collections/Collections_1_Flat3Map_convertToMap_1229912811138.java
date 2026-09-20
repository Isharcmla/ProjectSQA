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

public class Flat3Map_convertToMap_1229912811138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23552;
     Object term24360;

    public Flat3Map_convertToMap_1229912811138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term23894 = new HashMap();
        term23552 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term23662 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term23754 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term23846 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term23552, term23552.getClass(), "delegateMap", term23662);
        setIntField(term23552, term23552.getClass(), "size", 3);
        setField(term23552, term23552.getClass(), "key3", null);
        setField(term23552, term23552.getClass(), "value3", term23754);
        setField(term23552, term23552.getClass(), "key2", null);
        setField(term23552, term23552.getClass(), "value2", null);
        setField(term23552, term23552.getClass(), "key1", term23846);
        setField(term23552, term23552.getClass(), "value1", term23894);
        HashMap term24366 = new HashMap();
        term24360 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term24361 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term24362 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term24363 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term24364 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term24365 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term24360, term24360.getClass(), "size", 0);
        setIntField(term24360, term24360.getClass(), "hash1", 0);
        setIntField(term24360, term24360.getClass(), "hash2", 0);
        setIntField(term24360, term24360.getClass(), "hash3", 0);
        setField(term24360, term24360.getClass(), "key1", null);
        setField(term24360, term24360.getClass(), "key2", null);
        setField(term24360, term24360.getClass(), "key3", null);
        setField(term24360, term24360.getClass(), "value1", null);
        setField(term24360, term24360.getClass(), "value2", null);
        setField(term24360, term24360.getClass(), "value3", null);
        setFloatField(term24361, term24361.getClass(), "loadFactor", 0.75F);
        setIntField(term24361, term24361.getClass(), "size", 2);
        setField(term24364, term24364.getClass(), "next", null);
        setField(term24364, term24364.getClass(), "key", null);
        setField(term24364, term24364.getClass(), "value", null);
        setField(term24363, term24363.getClass(), "next", term24364);
        setIntField(term24365, term24365.getClass(), "size", 0);
        setIntField(term24365, term24365.getClass(), "hash1", 0);
        setIntField(term24365, term24365.getClass(), "hash2", 0);
        setIntField(term24365, term24365.getClass(), "hash3", 0);
        setField(term24365, term24365.getClass(), "key1", null);
        setField(term24365, term24365.getClass(), "key2", null);
        setField(term24365, term24365.getClass(), "key3", null);
        setField(term24365, term24365.getClass(), "value1", null);
        setField(term24365, term24365.getClass(), "value2", null);
        setField(term24365, term24365.getClass(), "value3", null);
        setField(term24365, term24365.getClass(), "delegateMap", null);
        setField(term24363, term24363.getClass(), "key", term24365);
        setField(term24363, term24363.getClass(), "value", term24366);
        setElement(term24362, 0, term24363);
        setField(term24361, term24361.getClass(), "data", term24362);
        setIntField(term24361, term24361.getClass(), "threshold", 12);
        setIntField(term24361, term24361.getClass(), "modCount", 2);
        setField(term24361, term24361.getClass(), "entrySet", null);
        setField(term24361, term24361.getClass(), "keySet", null);
        setField(term24361, term24361.getClass(), "values", null);
        setField(term24361, term24361.getClass(), "keySet", null);
        setField(term24361, term24361.getClass(), "values", null);
        setField(term24360, term24360.getClass(), "delegateMap", term24361);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "convertToMap", argTypes, term23552, args);
        assertTrue(recursiveEquals(term23552, term24360));
    }

};
