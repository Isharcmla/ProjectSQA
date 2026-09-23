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

public class Flat3Map_put_1944740725304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50279;
     Object term51451;
     Object term51458;

    public Flat3Map_put_1944740725304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50279 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term50328 = newInstance(Class.forName("java.util.concurrent.ThreadPoolExecutor$Worker"));
        setField(term50279, term50279.getClass(), "delegateMap", null);
        setIntField(term50279, term50279.getClass(), "size", 3);
        setIntField(term50279, term50279.getClass(), "hash3", 0);
        setField(term50279, term50279.getClass(), "value3", null);
        setIntField(term50279, term50279.getClass(), "hash2", 0);
        setField(term50279, term50279.getClass(), "value2", null);
        setIntField(term50279, term50279.getClass(), "hash1", 0);
        setField(term50279, term50279.getClass(), "value1", term50328);
        term51451 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term51452 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term51453 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term51454 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term51455 = newInstance(Class.forName("java.lang.Object"));
        Object term51456 = newInstance(Class.forName("java.util.concurrent.ThreadPoolExecutor$Worker"));
        Object term51457 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setIntField(term51451, term51451.getClass(), "size", 0);
        setIntField(term51451, term51451.getClass(), "hash1", 0);
        setIntField(term51451, term51451.getClass(), "hash2", 0);
        setIntField(term51451, term51451.getClass(), "hash3", 0);
        setField(term51451, term51451.getClass(), "key1", null);
        setField(term51451, term51451.getClass(), "key2", null);
        setField(term51451, term51451.getClass(), "key3", null);
        setField(term51451, term51451.getClass(), "value1", null);
        setField(term51451, term51451.getClass(), "value2", null);
        setField(term51451, term51451.getClass(), "value3", null);
        setFloatField(term51452, term51452.getClass(), "loadFactor", 0.75F);
        setIntField(term51452, term51452.getClass(), "size", 2);
        setField(term51454, term51454.getClass(), "next", null);
        setField(term51454, term51454.getClass(), "key", term51455);
        setField(term51456, term51456.getClass(), "thread", null);
        setField(term51456, term51456.getClass(), "firstTask", null);
        setLongField(term51456, term51456.getClass(), "completedTasks", 0L);
        setField(term51456, term51456.getClass(), "this$0", null);
        setField(term51456, term51456.getClass(), "head", null);
        setField(term51456, term51456.getClass(), "tail", null);
        setIntField(term51456, term51456.getClass(), "state", 0);
        setField(term51456, term51456.getClass(), "exclusiveOwnerThread", null);
        setField(term51454, term51454.getClass(), "value", term51456);
        setElement(term51453, 5, term51454);
        setField(term51457, term51457.getClass(), "next", null);
        setField(term51457, term51457.getClass(), "key", term51451);
        setField(term51457, term51457.getClass(), "value", null);
        setElement(term51453, 7, term51457);
        setField(term51452, term51452.getClass(), "data", term51453);
        setIntField(term51452, term51452.getClass(), "threshold", 12);
        setIntField(term51452, term51452.getClass(), "modCount", 2);
        setField(term51452, term51452.getClass(), "entrySet", null);
        setField(term51452, term51452.getClass(), "keySet", null);
        setField(term51452, term51452.getClass(), "values", null);
        setField(term51452, term51452.getClass(), "keySet", null);
        setField(term51452, term51452.getClass(), "values", null);
        setField(term51451, term51451.getClass(), "delegateMap", term51452);
        term51458 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term51459 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term51460 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term51461 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term51462 = newInstance(Class.forName("java.lang.Object"));
        Object term51463 = newInstance(Class.forName("java.util.concurrent.ThreadPoolExecutor$Worker"));
        Object term51464 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setIntField(term51458, term51458.getClass(), "size", 0);
        setIntField(term51458, term51458.getClass(), "hash1", 0);
        setIntField(term51458, term51458.getClass(), "hash2", 0);
        setIntField(term51458, term51458.getClass(), "hash3", 0);
        setField(term51458, term51458.getClass(), "key1", null);
        setField(term51458, term51458.getClass(), "key2", null);
        setField(term51458, term51458.getClass(), "key3", null);
        setField(term51458, term51458.getClass(), "value1", null);
        setField(term51458, term51458.getClass(), "value2", null);
        setField(term51458, term51458.getClass(), "value3", null);
        setFloatField(term51459, term51459.getClass(), "loadFactor", 0.75F);
        setIntField(term51459, term51459.getClass(), "size", 2);
        setField(term51461, term51461.getClass(), "next", null);
        setField(term51461, term51461.getClass(), "key", term51462);
        setField(term51463, term51463.getClass(), "thread", null);
        setField(term51463, term51463.getClass(), "firstTask", null);
        setLongField(term51463, term51463.getClass(), "completedTasks", 0L);
        setField(term51463, term51463.getClass(), "this$0", null);
        setField(term51463, term51463.getClass(), "head", null);
        setField(term51463, term51463.getClass(), "tail", null);
        setIntField(term51463, term51463.getClass(), "state", 0);
        setField(term51463, term51463.getClass(), "exclusiveOwnerThread", null);
        setField(term51461, term51461.getClass(), "value", term51463);
        setElement(term51460, 5, term51461);
        setField(term51464, term51464.getClass(), "next", null);
        setField(term51464, term51464.getClass(), "key", term51458);
        setField(term51464, term51464.getClass(), "value", null);
        setElement(term51460, 7, term51464);
        setField(term51459, term51459.getClass(), "data", term51460);
        setIntField(term51459, term51459.getClass(), "threshold", 12);
        setIntField(term51459, term51459.getClass(), "modCount", 2);
        setField(term51459, term51459.getClass(), "entrySet", null);
        setField(term51459, term51459.getClass(), "keySet", null);
        setField(term51459, term51459.getClass(), "values", null);
        setField(term51459, term51459.getClass(), "keySet", null);
        setField(term51459, term51459.getClass(), "values", null);
        setField(term51458, term51458.getClass(), "delegateMap", term51459);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term50279;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term50279, args);
        assertTrue(recursiveEquals(term50279, term51451));
        assertTrue(recursiveEquals(term50279, term51458));
        assertTrue(recursiveEquals(retValue, null));
    }

};


