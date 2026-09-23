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

public class Flat3Map_put_1944740725420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74539;
     Object term75210;
     Object term75216;

    public Flat3Map_put_1944740725420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74539 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term74594 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term74539, term74539.getClass(), "delegateMap", null);
        setIntField(term74539, term74539.getClass(), "size", 3);
        setIntField(term74539, term74539.getClass(), "hash3", 0);
        setField(term74539, term74539.getClass(), "value3", null);
        setIntField(term74539, term74539.getClass(), "hash2", 0);
        setField(term74539, term74539.getClass(), "value2", term74594);
        term75210 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term75211 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term75212 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term75213 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term75214 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term75215 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term75210, term75210.getClass(), "size", 0);
        setIntField(term75210, term75210.getClass(), "hash1", 0);
        setIntField(term75210, term75210.getClass(), "hash2", 0);
        setIntField(term75210, term75210.getClass(), "hash3", 0);
        setField(term75210, term75210.getClass(), "key1", null);
        setField(term75210, term75210.getClass(), "key2", null);
        setField(term75210, term75210.getClass(), "key3", null);
        setField(term75210, term75210.getClass(), "value1", null);
        setField(term75210, term75210.getClass(), "value2", null);
        setField(term75210, term75210.getClass(), "value3", null);
        setFloatField(term75211, term75211.getClass(), "loadFactor", 0.75F);
        setIntField(term75211, term75211.getClass(), "size", 2);
        setField(term75213, term75213.getClass(), "next", null);
        setField(term75213, term75213.getClass(), "key", term75210);
        setField(term75213, term75213.getClass(), "value", null);
        setElement(term75212, 0, term75213);
        setField(term75214, term75214.getClass(), "next", null);
        setField(term75214, term75214.getClass(), "key", term75215);
        setField(term75214, term75214.getClass(), "value", null);
        setElement(term75212, 5, term75214);
        setField(term75211, term75211.getClass(), "data", term75212);
        setIntField(term75211, term75211.getClass(), "threshold", 12);
        setIntField(term75211, term75211.getClass(), "modCount", 2);
        setField(term75211, term75211.getClass(), "entrySet", null);
        setField(term75211, term75211.getClass(), "keySet", null);
        setField(term75211, term75211.getClass(), "values", null);
        setField(term75211, term75211.getClass(), "keySet", null);
        setField(term75211, term75211.getClass(), "values", null);
        setField(term75210, term75210.getClass(), "delegateMap", term75211);
        term75216 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term75217 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term75218 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term75219 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term75220 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term75221 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term75216, term75216.getClass(), "size", 0);
        setIntField(term75216, term75216.getClass(), "hash1", 0);
        setIntField(term75216, term75216.getClass(), "hash2", 0);
        setIntField(term75216, term75216.getClass(), "hash3", 0);
        setField(term75216, term75216.getClass(), "key1", null);
        setField(term75216, term75216.getClass(), "key2", null);
        setField(term75216, term75216.getClass(), "key3", null);
        setField(term75216, term75216.getClass(), "value1", null);
        setField(term75216, term75216.getClass(), "value2", null);
        setField(term75216, term75216.getClass(), "value3", null);
        setFloatField(term75217, term75217.getClass(), "loadFactor", 0.75F);
        setIntField(term75217, term75217.getClass(), "size", 2);
        setField(term75219, term75219.getClass(), "next", null);
        setField(term75219, term75219.getClass(), "key", term75216);
        setField(term75219, term75219.getClass(), "value", null);
        setElement(term75218, 0, term75219);
        setField(term75220, term75220.getClass(), "next", null);
        setField(term75220, term75220.getClass(), "key", term75221);
        setField(term75220, term75220.getClass(), "value", null);
        setElement(term75218, 5, term75220);
        setField(term75217, term75217.getClass(), "data", term75218);
        setIntField(term75217, term75217.getClass(), "threshold", 12);
        setIntField(term75217, term75217.getClass(), "modCount", 2);
        setField(term75217, term75217.getClass(), "entrySet", null);
        setField(term75217, term75217.getClass(), "keySet", null);
        setField(term75217, term75217.getClass(), "values", null);
        setField(term75217, term75217.getClass(), "keySet", null);
        setField(term75217, term75217.getClass(), "values", null);
        setField(term75216, term75216.getClass(), "delegateMap", term75217);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term74539;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term74539, args);
        assertTrue(recursiveEquals(term74539, term75210));
        assertTrue(recursiveEquals(term74539, term75216));
        assertTrue(recursiveEquals(retValue, null));
    }

};


