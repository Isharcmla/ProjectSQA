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

public class Flat3Map_put_19447407251076 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term312697;
     Object term312789;
     Object term314469;
     Object term314476;

    public Flat3Map_put_19447407251076() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term312697 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term312697, term312697.getClass(), "delegateMap", null);
        setIntField(term312697, term312697.getClass(), "size", 3);
        setIntField(term312697, term312697.getClass(), "hash3", 0);
        setField(term312697, term312697.getClass(), "key3", null);
        setIntField(term312697, term312697.getClass(), "hash2", 0);
        setField(term312697, term312697.getClass(), "key2", null);
        setIntField(term312697, term312697.getClass(), "hash1", -1);
        term312789 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term312883 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        setField(term312789, term312789.getClass(), "delegateMap", null);
        setIntField(term312789, term312789.getClass(), "size", 3);
        setIntField(term312789, term312789.getClass(), "hash3", 0);
        setField(term312789, term312789.getClass(), "value3", null);
        setIntField(term312789, term312789.getClass(), "hash2", 0);
        setField(term312789, term312789.getClass(), "value2", null);
        setIntField(term312789, term312789.getClass(), "hash1", 0);
        setIntField(term312883, term312883.getClass(), "size", 0);
        setField(term312789, term312789.getClass(), "value1", term312883);
        term314469 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term314470 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term314471 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term314472 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term314473 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term314474 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term314475 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term314469, term314469.getClass(), "size", 0);
        setIntField(term314469, term314469.getClass(), "hash1", 0);
        setIntField(term314469, term314469.getClass(), "hash2", 0);
        setIntField(term314469, term314469.getClass(), "hash3", 0);
        setField(term314469, term314469.getClass(), "key1", null);
        setField(term314469, term314469.getClass(), "key2", null);
        setField(term314469, term314469.getClass(), "key3", null);
        setField(term314469, term314469.getClass(), "value1", null);
        setField(term314469, term314469.getClass(), "value2", null);
        setField(term314469, term314469.getClass(), "value3", null);
        setFloatField(term314470, term314470.getClass(), "loadFactor", 0.75F);
        setIntField(term314470, term314470.getClass(), "size", 2);
        setField(term314472, term314472.getClass(), "next", null);
        setIntField(term314473, term314473.getClass(), "size", 3);
        setIntField(term314473, term314473.getClass(), "hash1", 0);
        setIntField(term314473, term314473.getClass(), "hash2", 0);
        setIntField(term314473, term314473.getClass(), "hash3", 0);
        setField(term314473, term314473.getClass(), "key1", null);
        setField(term314473, term314473.getClass(), "key2", null);
        setField(term314473, term314473.getClass(), "key3", null);
        setField(term314473, term314473.getClass(), "value1", null);
        setField(term314473, term314473.getClass(), "value2", null);
        setField(term314473, term314473.getClass(), "value3", null);
        setField(term314473, term314473.getClass(), "delegateMap", null);
        setField(term314472, term314472.getClass(), "key", term314473);
        setField(term314472, term314472.getClass(), "value", null);
        setElement(term314471, 0, term314472);
        setField(term314474, term314474.getClass(), "next", null);
        setField(term314474, term314474.getClass(), "key", term314475);
        setField(term314474, term314474.getClass(), "value", null);
        setElement(term314471, 6, term314474);
        setField(term314470, term314470.getClass(), "data", term314471);
        setIntField(term314470, term314470.getClass(), "threshold", 12);
        setIntField(term314470, term314470.getClass(), "modCount", 2);
        setField(term314470, term314470.getClass(), "entrySet", null);
        setField(term314470, term314470.getClass(), "keySet", null);
        setField(term314470, term314470.getClass(), "values", null);
        setField(term314470, term314470.getClass(), "keySet", null);
        setField(term314470, term314470.getClass(), "values", null);
        setField(term314469, term314469.getClass(), "delegateMap", term314470);
        term314476 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term314476, term314476.getClass(), "size", 3);
        setIntField(term314476, term314476.getClass(), "hash1", 0);
        setIntField(term314476, term314476.getClass(), "hash2", 0);
        setIntField(term314476, term314476.getClass(), "hash3", 0);
        setField(term314476, term314476.getClass(), "key1", null);
        setField(term314476, term314476.getClass(), "key2", null);
        setField(term314476, term314476.getClass(), "key3", null);
        setField(term314476, term314476.getClass(), "value1", null);
        setField(term314476, term314476.getClass(), "value2", null);
        setField(term314476, term314476.getClass(), "value3", null);
        setField(term314476, term314476.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term312789;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term312697, args);
        assertTrue(recursiveEquals(term312697, term314469));
        assertTrue(recursiveEquals(term312789, term314476));
        assertTrue(recursiveEquals(retValue, null));
    }

};


