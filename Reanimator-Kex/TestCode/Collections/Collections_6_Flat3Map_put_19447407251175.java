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

public class Flat3Map_put_19447407251175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term363516;
     Object term365044;
     Object term365050;

    public Flat3Map_put_19447407251175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term363516 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term363568 = newInstance(Class.forName("java.io.ObjectInputStream$ValidationList$Callback"));
        setField(term363516, term363516.getClass(), "delegateMap", null);
        setIntField(term363516, term363516.getClass(), "size", 3);
        setIntField(term363516, term363516.getClass(), "hash3", 0);
        setField(term363516, term363516.getClass(), "value3", null);
        setIntField(term363516, term363516.getClass(), "hash2", 0);
        setField(term363516, term363516.getClass(), "value2", term363568);
        term365044 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term365045 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term365046 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term365047 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term365048 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term365049 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term365044, term365044.getClass(), "size", 0);
        setIntField(term365044, term365044.getClass(), "hash1", 0);
        setIntField(term365044, term365044.getClass(), "hash2", 0);
        setIntField(term365044, term365044.getClass(), "hash3", 0);
        setField(term365044, term365044.getClass(), "key1", null);
        setField(term365044, term365044.getClass(), "key2", null);
        setField(term365044, term365044.getClass(), "key3", null);
        setField(term365044, term365044.getClass(), "value1", null);
        setField(term365044, term365044.getClass(), "value2", null);
        setField(term365044, term365044.getClass(), "value3", null);
        setFloatField(term365045, term365045.getClass(), "loadFactor", 0.75F);
        setIntField(term365045, term365045.getClass(), "size", 2);
        setField(term365047, term365047.getClass(), "next", null);
        setField(term365047, term365047.getClass(), "key", term365044);
        setField(term365047, term365047.getClass(), "value", null);
        setElement(term365046, 0, term365047);
        setField(term365048, term365048.getClass(), "next", null);
        setField(term365048, term365048.getClass(), "key", term365049);
        setField(term365048, term365048.getClass(), "value", null);
        setElement(term365046, 6, term365048);
        setField(term365045, term365045.getClass(), "data", term365046);
        setIntField(term365045, term365045.getClass(), "threshold", 12);
        setIntField(term365045, term365045.getClass(), "modCount", 2);
        setField(term365045, term365045.getClass(), "entrySet", null);
        setField(term365045, term365045.getClass(), "keySet", null);
        setField(term365045, term365045.getClass(), "values", null);
        setField(term365045, term365045.getClass(), "keySet", null);
        setField(term365045, term365045.getClass(), "values", null);
        setField(term365044, term365044.getClass(), "delegateMap", term365045);
        term365050 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term365051 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term365052 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term365053 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term365054 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term365055 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term365050, term365050.getClass(), "size", 0);
        setIntField(term365050, term365050.getClass(), "hash1", 0);
        setIntField(term365050, term365050.getClass(), "hash2", 0);
        setIntField(term365050, term365050.getClass(), "hash3", 0);
        setField(term365050, term365050.getClass(), "key1", null);
        setField(term365050, term365050.getClass(), "key2", null);
        setField(term365050, term365050.getClass(), "key3", null);
        setField(term365050, term365050.getClass(), "value1", null);
        setField(term365050, term365050.getClass(), "value2", null);
        setField(term365050, term365050.getClass(), "value3", null);
        setFloatField(term365051, term365051.getClass(), "loadFactor", 0.75F);
        setIntField(term365051, term365051.getClass(), "size", 2);
        setField(term365053, term365053.getClass(), "next", null);
        setField(term365053, term365053.getClass(), "key", term365050);
        setField(term365053, term365053.getClass(), "value", null);
        setElement(term365052, 0, term365053);
        setField(term365054, term365054.getClass(), "next", null);
        setField(term365054, term365054.getClass(), "key", term365055);
        setField(term365054, term365054.getClass(), "value", null);
        setElement(term365052, 6, term365054);
        setField(term365051, term365051.getClass(), "data", term365052);
        setIntField(term365051, term365051.getClass(), "threshold", 12);
        setIntField(term365051, term365051.getClass(), "modCount", 2);
        setField(term365051, term365051.getClass(), "entrySet", null);
        setField(term365051, term365051.getClass(), "keySet", null);
        setField(term365051, term365051.getClass(), "values", null);
        setField(term365051, term365051.getClass(), "keySet", null);
        setField(term365051, term365051.getClass(), "values", null);
        setField(term365050, term365050.getClass(), "delegateMap", term365051);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term363516;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term363516, args);
        assertTrue(recursiveEquals(term363516, term365044));
        assertTrue(recursiveEquals(term363516, term365050));
        assertTrue(recursiveEquals(retValue, null));
    }

};


