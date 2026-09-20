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

public class Flat3Map_put_19447407251114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222346;
     Object term222826;
     Object term223773;
     Object term223781;

    public Flat3Map_put_19447407251114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222346 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term222456 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object[] term221383 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 382);
        Object term222586 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term222716 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setElement(term221383, 227, term222586);
        setField(term222716, term222716.getClass(), "next", null);
        setIntField(term222716, term222716.getClass(), "hashCode", 632);
        setElement(term221383, 341, term222716);
        setField(term222456, term222456.getClass(), "data", term221383);
        setIntField(term222456, term222456.getClass(), "modCount", 0);
        setIntField(term222456, term222456.getClass(), "size", 0);
        setIntField(term222456, term222456.getClass(), "threshold", 1);
        setField(term222346, term222346.getClass(), "delegateMap", term222456);
        term222826 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        term223773 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term223774 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object[] term223775 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 764);
        Object term223776 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term223777 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term223778 = newInstance(Class.forName("java.lang.Object"));
        Object term223779 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term223780 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setIntField(term223773, term223773.getClass(), "size", 0);
        setIntField(term223773, term223773.getClass(), "hash1", 0);
        setIntField(term223773, term223773.getClass(), "hash2", 0);
        setIntField(term223773, term223773.getClass(), "hash3", 0);
        setField(term223773, term223773.getClass(), "key1", null);
        setField(term223773, term223773.getClass(), "key2", null);
        setField(term223773, term223773.getClass(), "key3", null);
        setField(term223773, term223773.getClass(), "value1", null);
        setField(term223773, term223773.getClass(), "value2", null);
        setField(term223773, term223773.getClass(), "value3", null);
        setFloatField(term223774, term223774.getClass(), "loadFactor", 0.0F);
        setIntField(term223774, term223774.getClass(), "size", 1);
        setField(term223776, term223776.getClass(), "next", null);
        setField(term223776, term223776.getClass(), "key", null);
        setField(term223776, term223776.getClass(), "value", null);
        setElement(term223775, 0, term223776);
        setField(term223777, term223777.getClass(), "next", null);
        setField(term223777, term223777.getClass(), "key", term223778);
        setFloatField(term223779, term223779.getClass(), "loadFactor", 0.0F);
        setIntField(term223779, term223779.getClass(), "size", 0);
        setField(term223779, term223779.getClass(), "data", null);
        setIntField(term223779, term223779.getClass(), "threshold", 0);
        setIntField(term223779, term223779.getClass(), "modCount", 0);
        setField(term223779, term223779.getClass(), "entrySet", null);
        setField(term223779, term223779.getClass(), "keySet", null);
        setField(term223779, term223779.getClass(), "values", null);
        setField(term223779, term223779.getClass(), "keySet", null);
        setField(term223779, term223779.getClass(), "values", null);
        setField(term223777, term223777.getClass(), "value", term223779);
        setElement(term223775, 208, term223777);
        setField(term223780, term223780.getClass(), "next", null);
        setField(term223780, term223780.getClass(), "key", null);
        setField(term223780, term223780.getClass(), "value", null);
        setElement(term223775, 632, term223780);
        setField(term223774, term223774.getClass(), "data", term223775);
        setIntField(term223774, term223774.getClass(), "threshold", 0);
        setIntField(term223774, term223774.getClass(), "modCount", 2);
        setField(term223774, term223774.getClass(), "entrySet", null);
        setField(term223774, term223774.getClass(), "keySet", null);
        setField(term223774, term223774.getClass(), "values", null);
        setField(term223774, term223774.getClass(), "keySet", null);
        setField(term223774, term223774.getClass(), "values", null);
        setField(term223773, term223773.getClass(), "delegateMap", term223774);
        term223781 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setFloatField(term223781, term223781.getClass(), "loadFactor", 0.0F);
        setIntField(term223781, term223781.getClass(), "size", 0);
        setField(term223781, term223781.getClass(), "data", null);
        setIntField(term223781, term223781.getClass(), "threshold", 0);
        setIntField(term223781, term223781.getClass(), "modCount", 0);
        setField(term223781, term223781.getClass(), "entrySet", null);
        setField(term223781, term223781.getClass(), "keySet", null);
        setField(term223781, term223781.getClass(), "values", null);
        setField(term223781, term223781.getClass(), "keySet", null);
        setField(term223781, term223781.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term222826;
        Object retValue = callMethod(klass, "put", argTypes, term222346, args);
        assertTrue(recursiveEquals(term222346, term223773));
        assertTrue(recursiveEquals(term222826, term223781));
        assertTrue(recursiveEquals(retValue, null));
    }

};
