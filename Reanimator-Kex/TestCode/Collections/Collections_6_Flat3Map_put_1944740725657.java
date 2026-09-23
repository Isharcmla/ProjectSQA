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

public class Flat3Map_put_1944740725657 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147437;
     Object term147719;
     Object term148207;
     Object term148215;

    public Flat3Map_put_1944740725657() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147437 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term147529 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term147627 = newInstance(Class.forName("org.apache.commons.collections.map.IdentityMap"));
        setField(term147437, term147437.getClass(), "delegateMap", null);
        setIntField(term147437, term147437.getClass(), "size", 3);
        setIntField(term147437, term147437.getClass(), "hash3", 0);
        setField(term147437, term147437.getClass(), "key3", null);
        setIntField(term147437, term147437.getClass(), "hash2", 0);
        setField(term147437, term147437.getClass(), "key2", null);
        setIntField(term147437, term147437.getClass(), "hash1", 0);
        setField(term147529, term147529.getClass(), "delegateMap", term147627);
        setField(term147437, term147437.getClass(), "key1", term147529);
        term147719 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term147829 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term147719, term147719.getClass(), "delegateMap", null);
        setIntField(term147719, term147719.getClass(), "size", 3);
        setIntField(term147719, term147719.getClass(), "hash3", 0);
        setField(term147719, term147719.getClass(), "value3", null);
        setIntField(term147719, term147719.getClass(), "hash2", 0);
        setField(term147719, term147719.getClass(), "value2", null);
        setIntField(term147719, term147719.getClass(), "hash1", 0);
        setIntField(term147829, term147829.getClass(), "size", 0);
        setField(term147719, term147719.getClass(), "value1", term147829);
        term148207 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term148208 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term148209 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term148210 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term148211 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term148212 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term148213 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term148214 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term148207, term148207.getClass(), "size", 0);
        setIntField(term148207, term148207.getClass(), "hash1", 0);
        setIntField(term148207, term148207.getClass(), "hash2", 0);
        setIntField(term148207, term148207.getClass(), "hash3", 0);
        setField(term148207, term148207.getClass(), "key1", null);
        setField(term148207, term148207.getClass(), "key2", null);
        setField(term148207, term148207.getClass(), "key3", null);
        setField(term148207, term148207.getClass(), "value1", null);
        setField(term148207, term148207.getClass(), "value2", null);
        setField(term148207, term148207.getClass(), "value3", null);
        setFloatField(term148208, term148208.getClass(), "loadFactor", 0.75F);
        setIntField(term148208, term148208.getClass(), "size", 3);
        setField(term148211, term148211.getClass(), "next", null);
        setField(term148211, term148211.getClass(), "key", null);
        setField(term148211, term148211.getClass(), "value", null);
        setField(term148210, term148210.getClass(), "next", term148211);
        setIntField(term148212, term148212.getClass(), "size", 3);
        setIntField(term148212, term148212.getClass(), "hash1", 0);
        setIntField(term148212, term148212.getClass(), "hash2", 0);
        setIntField(term148212, term148212.getClass(), "hash3", 0);
        setField(term148212, term148212.getClass(), "key1", null);
        setField(term148212, term148212.getClass(), "key2", null);
        setField(term148212, term148212.getClass(), "key3", null);
        setField(term148212, term148212.getClass(), "value1", null);
        setField(term148212, term148212.getClass(), "value2", null);
        setField(term148212, term148212.getClass(), "value3", null);
        setField(term148212, term148212.getClass(), "delegateMap", null);
        setField(term148210, term148210.getClass(), "key", term148212);
        setField(term148210, term148210.getClass(), "value", null);
        setElement(term148209, 0, term148210);
        setField(term148213, term148213.getClass(), "next", null);
        setField(term148213, term148213.getClass(), "key", term148214);
        setField(term148213, term148213.getClass(), "value", null);
        setElement(term148209, 5, term148213);
        setField(term148208, term148208.getClass(), "data", term148209);
        setIntField(term148208, term148208.getClass(), "threshold", 12);
        setIntField(term148208, term148208.getClass(), "modCount", 3);
        setField(term148208, term148208.getClass(), "entrySet", null);
        setField(term148208, term148208.getClass(), "keySet", null);
        setField(term148208, term148208.getClass(), "values", null);
        setField(term148208, term148208.getClass(), "keySet", null);
        setField(term148208, term148208.getClass(), "values", null);
        setField(term148207, term148207.getClass(), "delegateMap", term148208);
        term148215 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term148215, term148215.getClass(), "size", 3);
        setIntField(term148215, term148215.getClass(), "hash1", 0);
        setIntField(term148215, term148215.getClass(), "hash2", 0);
        setIntField(term148215, term148215.getClass(), "hash3", 0);
        setField(term148215, term148215.getClass(), "key1", null);
        setField(term148215, term148215.getClass(), "key2", null);
        setField(term148215, term148215.getClass(), "key3", null);
        setField(term148215, term148215.getClass(), "value1", null);
        setField(term148215, term148215.getClass(), "value2", null);
        setField(term148215, term148215.getClass(), "value3", null);
        setField(term148215, term148215.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term147719;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term147437, args);
        assertTrue(recursiveEquals(term147437, term148207));
        assertTrue(recursiveEquals(term147719, term148215));
        assertTrue(recursiveEquals(retValue, null));
    }

};


