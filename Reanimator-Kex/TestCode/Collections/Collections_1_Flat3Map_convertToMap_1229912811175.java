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

public class Flat3Map_convertToMap_1229912811175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29485;
     Object term29905;

    public Flat3Map_convertToMap_1229912811175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term29729 = new HashMap();
        term29485 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term29595 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term29681 = newInstance(Class.forName("java.lang.invoke.VarHandleBooleans$Array"));
        setField(term29485, term29485.getClass(), "delegateMap", term29595);
        setIntField(term29485, term29485.getClass(), "size", 1);
        setField(term29485, term29485.getClass(), "key1", term29681);
        setField(term29485, term29485.getClass(), "value1", term29729);
        HashMap term29910 = new HashMap();
        term29905 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term29906 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term29907 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term29908 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term29909 = newInstance(Class.forName("java.lang.invoke.VarHandleBooleans$Array"));
        setIntField(term29905, term29905.getClass(), "size", 0);
        setIntField(term29905, term29905.getClass(), "hash1", 0);
        setIntField(term29905, term29905.getClass(), "hash2", 0);
        setIntField(term29905, term29905.getClass(), "hash3", 0);
        setField(term29905, term29905.getClass(), "key1", null);
        setField(term29905, term29905.getClass(), "key2", null);
        setField(term29905, term29905.getClass(), "key3", null);
        setField(term29905, term29905.getClass(), "value1", null);
        setField(term29905, term29905.getClass(), "value2", null);
        setField(term29905, term29905.getClass(), "value3", null);
        setFloatField(term29906, term29906.getClass(), "loadFactor", 0.75F);
        setIntField(term29906, term29906.getClass(), "size", 1);
        setField(term29908, term29908.getClass(), "next", null);
        setIntField(term29909, term29909.getClass(), "abase", 0);
        setIntField(term29909, term29909.getClass(), "ashift", 0);
        setField(term29909, term29909.getClass(), "vform", null);
        setField(term29909, term29909.getClass(), "typesAndInvokers", null);
        setField(term29908, term29908.getClass(), "key", term29909);
        setField(term29908, term29908.getClass(), "value", term29910);
        setElement(term29907, 1, term29908);
        setField(term29906, term29906.getClass(), "data", term29907);
        setIntField(term29906, term29906.getClass(), "threshold", 12);
        setIntField(term29906, term29906.getClass(), "modCount", 1);
        setField(term29906, term29906.getClass(), "entrySet", null);
        setField(term29906, term29906.getClass(), "keySet", null);
        setField(term29906, term29906.getClass(), "values", null);
        setField(term29906, term29906.getClass(), "keySet", null);
        setField(term29906, term29906.getClass(), "values", null);
        setField(term29905, term29905.getClass(), "delegateMap", term29906);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "convertToMap", argTypes, term29485, args);
        assertTrue(recursiveEquals(term29485, term29905));
    }

};
