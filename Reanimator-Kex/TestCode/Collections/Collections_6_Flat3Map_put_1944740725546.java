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

public class Flat3Map_put_1944740725546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107534;
     Object term108516;
     Object term108523;

    public Flat3Map_put_1944740725546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107534 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term107569 = newInstance(Class.forName("java.lang.Runtime$VersionPattern"));
        setField(term107534, term107534.getClass(), "delegateMap", null);
        setIntField(term107534, term107534.getClass(), "size", 3);
        setIntField(term107534, term107534.getClass(), "hash3", 0);
        setField(term107534, term107534.getClass(), "value3", null);
        setIntField(term107534, term107534.getClass(), "hash2", 0);
        setField(term107534, term107534.getClass(), "value2", null);
        setIntField(term107534, term107534.getClass(), "hash1", 0);
        setField(term107534, term107534.getClass(), "value1", term107569);
        term108516 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term108517 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term108518 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term108519 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term108520 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term108521 = newInstance(Class.forName("java.lang.Object"));
        Object term108522 = newInstance(Class.forName("java.lang.Runtime$VersionPattern"));
        setIntField(term108516, term108516.getClass(), "size", 0);
        setIntField(term108516, term108516.getClass(), "hash1", 0);
        setIntField(term108516, term108516.getClass(), "hash2", 0);
        setIntField(term108516, term108516.getClass(), "hash3", 0);
        setField(term108516, term108516.getClass(), "key1", null);
        setField(term108516, term108516.getClass(), "key2", null);
        setField(term108516, term108516.getClass(), "key3", null);
        setField(term108516, term108516.getClass(), "value1", null);
        setField(term108516, term108516.getClass(), "value2", null);
        setField(term108516, term108516.getClass(), "value3", null);
        setFloatField(term108517, term108517.getClass(), "loadFactor", 0.75F);
        setIntField(term108517, term108517.getClass(), "size", 2);
        setField(term108519, term108519.getClass(), "next", null);
        setField(term108519, term108519.getClass(), "key", term108516);
        setField(term108519, term108519.getClass(), "value", null);
        setElement(term108518, 2, term108519);
        setField(term108520, term108520.getClass(), "next", null);
        setField(term108520, term108520.getClass(), "key", term108521);
        setField(term108520, term108520.getClass(), "value", term108522);
        setElement(term108518, 5, term108520);
        setField(term108517, term108517.getClass(), "data", term108518);
        setIntField(term108517, term108517.getClass(), "threshold", 12);
        setIntField(term108517, term108517.getClass(), "modCount", 2);
        setField(term108517, term108517.getClass(), "entrySet", null);
        setField(term108517, term108517.getClass(), "keySet", null);
        setField(term108517, term108517.getClass(), "values", null);
        setField(term108517, term108517.getClass(), "keySet", null);
        setField(term108517, term108517.getClass(), "values", null);
        setField(term108516, term108516.getClass(), "delegateMap", term108517);
        term108523 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term108524 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term108525 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term108526 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term108527 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term108528 = newInstance(Class.forName("java.lang.Object"));
        Object term108529 = newInstance(Class.forName("java.lang.Runtime$VersionPattern"));
        setIntField(term108523, term108523.getClass(), "size", 0);
        setIntField(term108523, term108523.getClass(), "hash1", 0);
        setIntField(term108523, term108523.getClass(), "hash2", 0);
        setIntField(term108523, term108523.getClass(), "hash3", 0);
        setField(term108523, term108523.getClass(), "key1", null);
        setField(term108523, term108523.getClass(), "key2", null);
        setField(term108523, term108523.getClass(), "key3", null);
        setField(term108523, term108523.getClass(), "value1", null);
        setField(term108523, term108523.getClass(), "value2", null);
        setField(term108523, term108523.getClass(), "value3", null);
        setFloatField(term108524, term108524.getClass(), "loadFactor", 0.75F);
        setIntField(term108524, term108524.getClass(), "size", 2);
        setField(term108526, term108526.getClass(), "next", null);
        setField(term108526, term108526.getClass(), "key", term108523);
        setField(term108526, term108526.getClass(), "value", null);
        setElement(term108525, 2, term108526);
        setField(term108527, term108527.getClass(), "next", null);
        setField(term108527, term108527.getClass(), "key", term108528);
        setField(term108527, term108527.getClass(), "value", term108529);
        setElement(term108525, 5, term108527);
        setField(term108524, term108524.getClass(), "data", term108525);
        setIntField(term108524, term108524.getClass(), "threshold", 12);
        setIntField(term108524, term108524.getClass(), "modCount", 2);
        setField(term108524, term108524.getClass(), "entrySet", null);
        setField(term108524, term108524.getClass(), "keySet", null);
        setField(term108524, term108524.getClass(), "values", null);
        setField(term108524, term108524.getClass(), "keySet", null);
        setField(term108524, term108524.getClass(), "values", null);
        setField(term108523, term108523.getClass(), "delegateMap", term108524);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term107534;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term107534, args);
        assertTrue(recursiveEquals(term107534, term108516));
        assertTrue(recursiveEquals(term107534, term108523));
        assertTrue(recursiveEquals(retValue, null));
    }

};


