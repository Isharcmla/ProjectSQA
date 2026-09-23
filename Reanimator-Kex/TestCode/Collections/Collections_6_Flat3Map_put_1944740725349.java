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

public class Flat3Map_put_1944740725349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58116;
     Object term58494;
     Object term58501;

    public Flat3Map_put_1944740725349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58116 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term58165 = newInstance(Class.forName("java.util.concurrent.ThreadPoolExecutor$Worker"));
        setField(term58116, term58116.getClass(), "delegateMap", null);
        setIntField(term58116, term58116.getClass(), "size", 3);
        setIntField(term58116, term58116.getClass(), "hash3", -1);
        setField(term58116, term58116.getClass(), "value3", null);
        setIntField(term58116, term58116.getClass(), "hash2", -1);
        setField(term58116, term58116.getClass(), "value2", null);
        setIntField(term58116, term58116.getClass(), "hash1", 0);
        setField(term58116, term58116.getClass(), "value1", term58165);
        term58494 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term58495 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term58496 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term58497 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term58498 = newInstance(Class.forName("java.lang.Object"));
        Object term58499 = newInstance(Class.forName("java.util.concurrent.ThreadPoolExecutor$Worker"));
        Object term58500 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setIntField(term58494, term58494.getClass(), "size", 0);
        setIntField(term58494, term58494.getClass(), "hash1", 0);
        setIntField(term58494, term58494.getClass(), "hash2", 0);
        setIntField(term58494, term58494.getClass(), "hash3", 0);
        setField(term58494, term58494.getClass(), "key1", null);
        setField(term58494, term58494.getClass(), "key2", null);
        setField(term58494, term58494.getClass(), "key3", null);
        setField(term58494, term58494.getClass(), "value1", null);
        setField(term58494, term58494.getClass(), "value2", null);
        setField(term58494, term58494.getClass(), "value3", null);
        setFloatField(term58495, term58495.getClass(), "loadFactor", 0.75F);
        setIntField(term58495, term58495.getClass(), "size", 2);
        setField(term58497, term58497.getClass(), "next", null);
        setField(term58497, term58497.getClass(), "key", term58498);
        setField(term58499, term58499.getClass(), "thread", null);
        setField(term58499, term58499.getClass(), "firstTask", null);
        setLongField(term58499, term58499.getClass(), "completedTasks", 0L);
        setField(term58499, term58499.getClass(), "this$0", null);
        setField(term58499, term58499.getClass(), "head", null);
        setField(term58499, term58499.getClass(), "tail", null);
        setIntField(term58499, term58499.getClass(), "state", 0);
        setField(term58499, term58499.getClass(), "exclusiveOwnerThread", null);
        setField(term58497, term58497.getClass(), "value", term58499);
        setElement(term58496, 5, term58497);
        setField(term58500, term58500.getClass(), "next", null);
        setField(term58500, term58500.getClass(), "key", term58494);
        setField(term58500, term58500.getClass(), "value", null);
        setElement(term58496, 13, term58500);
        setField(term58495, term58495.getClass(), "data", term58496);
        setIntField(term58495, term58495.getClass(), "threshold", 12);
        setIntField(term58495, term58495.getClass(), "modCount", 2);
        setField(term58495, term58495.getClass(), "entrySet", null);
        setField(term58495, term58495.getClass(), "keySet", null);
        setField(term58495, term58495.getClass(), "values", null);
        setField(term58495, term58495.getClass(), "keySet", null);
        setField(term58495, term58495.getClass(), "values", null);
        setField(term58494, term58494.getClass(), "delegateMap", term58495);
        term58501 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term58502 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term58503 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term58504 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term58505 = newInstance(Class.forName("java.lang.Object"));
        Object term58506 = newInstance(Class.forName("java.util.concurrent.ThreadPoolExecutor$Worker"));
        Object term58507 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setIntField(term58501, term58501.getClass(), "size", 0);
        setIntField(term58501, term58501.getClass(), "hash1", 0);
        setIntField(term58501, term58501.getClass(), "hash2", 0);
        setIntField(term58501, term58501.getClass(), "hash3", 0);
        setField(term58501, term58501.getClass(), "key1", null);
        setField(term58501, term58501.getClass(), "key2", null);
        setField(term58501, term58501.getClass(), "key3", null);
        setField(term58501, term58501.getClass(), "value1", null);
        setField(term58501, term58501.getClass(), "value2", null);
        setField(term58501, term58501.getClass(), "value3", null);
        setFloatField(term58502, term58502.getClass(), "loadFactor", 0.75F);
        setIntField(term58502, term58502.getClass(), "size", 2);
        setField(term58504, term58504.getClass(), "next", null);
        setField(term58504, term58504.getClass(), "key", term58505);
        setField(term58506, term58506.getClass(), "thread", null);
        setField(term58506, term58506.getClass(), "firstTask", null);
        setLongField(term58506, term58506.getClass(), "completedTasks", 0L);
        setField(term58506, term58506.getClass(), "this$0", null);
        setField(term58506, term58506.getClass(), "head", null);
        setField(term58506, term58506.getClass(), "tail", null);
        setIntField(term58506, term58506.getClass(), "state", 0);
        setField(term58506, term58506.getClass(), "exclusiveOwnerThread", null);
        setField(term58504, term58504.getClass(), "value", term58506);
        setElement(term58503, 5, term58504);
        setField(term58507, term58507.getClass(), "next", null);
        setField(term58507, term58507.getClass(), "key", term58501);
        setField(term58507, term58507.getClass(), "value", null);
        setElement(term58503, 13, term58507);
        setField(term58502, term58502.getClass(), "data", term58503);
        setIntField(term58502, term58502.getClass(), "threshold", 12);
        setIntField(term58502, term58502.getClass(), "modCount", 2);
        setField(term58502, term58502.getClass(), "entrySet", null);
        setField(term58502, term58502.getClass(), "keySet", null);
        setField(term58502, term58502.getClass(), "values", null);
        setField(term58502, term58502.getClass(), "keySet", null);
        setField(term58502, term58502.getClass(), "values", null);
        setField(term58501, term58501.getClass(), "delegateMap", term58502);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term58116;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term58116, args);
        assertTrue(recursiveEquals(term58116, term58494));
        assertTrue(recursiveEquals(term58116, term58501));
        assertTrue(recursiveEquals(retValue, null));
    }

};


