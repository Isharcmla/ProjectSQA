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

public class Flat3Map_put_19447407251128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230412;
     Object term231658;

    public Flat3Map_put_19447407251128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term230412 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term230522 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object[] term229908 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 256);
        Object term230652 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setField(term230652, term230652.getClass(), "next", null);
        setIntField(term230652, term230652.getClass(), "hashCode", 106);
        setElement(term229908, 192, term230652);
        setElement(term229908, 215, term230652);
        setField(term230522, term230522.getClass(), "data", term229908);
        setIntField(term230522, term230522.getClass(), "modCount", 0);
        setIntField(term230522, term230522.getClass(), "size", 0);
        setIntField(term230522, term230522.getClass(), "threshold", 1);
        setField(term230412, term230412.getClass(), "delegateMap", term230522);
        term231658 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term231659 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object[] term231660 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 512);
        Object term231661 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term231662 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term231663 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term231658, term231658.getClass(), "size", 0);
        setIntField(term231658, term231658.getClass(), "hash1", 0);
        setIntField(term231658, term231658.getClass(), "hash2", 0);
        setIntField(term231658, term231658.getClass(), "hash3", 0);
        setField(term231658, term231658.getClass(), "key1", null);
        setField(term231658, term231658.getClass(), "key2", null);
        setField(term231658, term231658.getClass(), "key3", null);
        setField(term231658, term231658.getClass(), "value1", null);
        setField(term231658, term231658.getClass(), "value2", null);
        setField(term231658, term231658.getClass(), "value3", null);
        setFloatField(term231659, term231659.getClass(), "loadFactor", 0.0F);
        setIntField(term231659, term231659.getClass(), "size", 1);
        setField(term231661, term231661.getClass(), "next", term231661);
        setField(term231661, term231661.getClass(), "key", null);
        setField(term231661, term231661.getClass(), "value", null);
        setElement(term231660, 106, term231661);
        setField(term231662, term231662.getClass(), "next", null);
        setField(term231662, term231662.getClass(), "key", term231663);
        setField(term231662, term231662.getClass(), "value", null);
        setElement(term231660, 464, term231662);
        setField(term231659, term231659.getClass(), "data", term231660);
        setIntField(term231659, term231659.getClass(), "threshold", 0);
        setIntField(term231659, term231659.getClass(), "modCount", 2);
        setField(term231659, term231659.getClass(), "entrySet", null);
        setField(term231659, term231659.getClass(), "keySet", null);
        setField(term231659, term231659.getClass(), "values", null);
        setField(term231659, term231659.getClass(), "keySet", null);
        setField(term231659, term231659.getClass(), "values", null);
        setField(term231658, term231658.getClass(), "delegateMap", term231659);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term230412, args);
        assertTrue(recursiveEquals(term230412, term231658));
        assertTrue(recursiveEquals(retValue, null));
    }

};
