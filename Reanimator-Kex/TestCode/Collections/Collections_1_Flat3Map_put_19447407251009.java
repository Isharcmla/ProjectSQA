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

public class Flat3Map_put_19447407251009 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201155;
     Object term203301;

    public Flat3Map_put_19447407251009() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term201155 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term201265 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object[] term201028 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 489);
        setField(term201265, term201265.getClass(), "data", term201028);
        setField(term201155, term201155.getClass(), "delegateMap", term201265);
        term203301 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term203302 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object[] term203303 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 978);
        Object term203304 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term203305 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term203301, term203301.getClass(), "size", 0);
        setIntField(term203301, term203301.getClass(), "hash1", 0);
        setIntField(term203301, term203301.getClass(), "hash2", 0);
        setIntField(term203301, term203301.getClass(), "hash3", 0);
        setField(term203301, term203301.getClass(), "key1", null);
        setField(term203301, term203301.getClass(), "key2", null);
        setField(term203301, term203301.getClass(), "key3", null);
        setField(term203301, term203301.getClass(), "value1", null);
        setField(term203301, term203301.getClass(), "value2", null);
        setField(term203301, term203301.getClass(), "value3", null);
        setFloatField(term203302, term203302.getClass(), "loadFactor", 0.0F);
        setIntField(term203302, term203302.getClass(), "size", 1);
        setField(term203304, term203304.getClass(), "next", null);
        setField(term203304, term203304.getClass(), "key", term203305);
        setField(term203304, term203304.getClass(), "value", null);
        setElement(term203303, 464, term203304);
        setField(term203302, term203302.getClass(), "data", term203303);
        setIntField(term203302, term203302.getClass(), "threshold", 0);
        setIntField(term203302, term203302.getClass(), "modCount", 2);
        setField(term203302, term203302.getClass(), "entrySet", null);
        setField(term203302, term203302.getClass(), "keySet", null);
        setField(term203302, term203302.getClass(), "values", null);
        setField(term203302, term203302.getClass(), "keySet", null);
        setField(term203302, term203302.getClass(), "values", null);
        setField(term203301, term203301.getClass(), "delegateMap", term203302);
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
        Object retValue = callMethod(klass, "put", argTypes, term201155, args);
        assertTrue(recursiveEquals(term201155, term203301));
        assertTrue(recursiveEquals(retValue, null));
    }

};
