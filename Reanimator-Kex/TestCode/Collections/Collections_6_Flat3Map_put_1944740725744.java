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

public class Flat3Map_put_1944740725744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177916;
     Object term178466;
     Object term189656;

    public Flat3Map_put_1944740725744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177916 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term178008 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term178102 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term177410 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term178232 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term178374 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashMapIterator"));
        setField(term177916, term177916.getClass(), "delegateMap", null);
        setIntField(term177916, term177916.getClass(), "size", 3);
        setIntField(term177916, term177916.getClass(), "hash3", -5095359);
        setField(term177916, term177916.getClass(), "key3", null);
        setIntField(term177916, term177916.getClass(), "hash2", -5095359);
        setIntField(term178102, term178102.getClass(), "size", 16777216);
        setField(term178232, term178232.getClass(), "next", null);
        setField(term178232, term178232.getClass(), "key", term178374);
        setField(term178232, term178232.getClass(), "value", null);
        setElement(term177410, 5, term178232);
        setField(term178102, term178102.getClass(), "data", term177410);
        setIntField(term178102, term178102.getClass(), "modCount", 0);
        setField(term178008, term178008.getClass(), "delegateMap", term178102);
        setIntField(term178008, term178008.getClass(), "size", 3);
        setField(term178008, term178008.getClass(), "key3", null);
        setField(term178008, term178008.getClass(), "value3", null);
        setField(term177916, term177916.getClass(), "key2", term178008);
        setIntField(term177916, term177916.getClass(), "hash1", -5095359);
        setField(term177916, term177916.getClass(), "key1", null);
        setField(term177916, term177916.getClass(), "value3", null);
        setField(term177916, term177916.getClass(), "value2", null);
        setField(term177916, term177916.getClass(), "value1", null);
        term178466 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term178560 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setField(term178466, term178466.getClass(), "delegateMap", null);
        setIntField(term178466, term178466.getClass(), "size", 3);
        setIntField(term178466, term178466.getClass(), "hash3", -416284672);
        setField(term178466, term178466.getClass(), "value3", null);
        setIntField(term178466, term178466.getClass(), "hash2", 276971520);
        setField(term178466, term178466.getClass(), "value2", null);
        setIntField(term178466, term178466.getClass(), "hash1", 134217793);
        setIntField(term178560, term178560.getClass(), "size", 0);
        setField(term178466, term178466.getClass(), "value1", term178560);
        setField(term178466, term178466.getClass(), "key3", null);
        setField(term178466, term178466.getClass(), "key2", null);
        setField(term178466, term178466.getClass(), "key1", null);
        term189656 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term189656, term189656.getClass(), "size", 3);
        setIntField(term189656, term189656.getClass(), "hash1", 134217793);
        setIntField(term189656, term189656.getClass(), "hash2", 276971520);
        setIntField(term189656, term189656.getClass(), "hash3", -416284672);
        setField(term189656, term189656.getClass(), "key1", null);
        setField(term189656, term189656.getClass(), "key2", null);
        setField(term189656, term189656.getClass(), "key3", null);
        setField(term189656, term189656.getClass(), "value1", null);
        setField(term189656, term189656.getClass(), "value2", null);
        setField(term189656, term189656.getClass(), "value3", null);
        setField(term189656, term189656.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term178466;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term177916, args);
        assertTrue(recursiveEquals(term178466, term189656));
        assertTrue(recursiveEquals(retValue, null));
    }

};


