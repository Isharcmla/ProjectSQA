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

public class Flat3Map_put_1944740725645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142818;
     Object term143186;
     Object term143704;
     Object term143712;

    public Flat3Map_put_1944740725645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142818 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term142910 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term143002 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term143094 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term142818, term142818.getClass(), "delegateMap", null);
        setIntField(term142818, term142818.getClass(), "size", 3);
        setIntField(term142818, term142818.getClass(), "hash3", 0);
        setField(term142910, term142910.getClass(), "delegateMap", null);
        setIntField(term142910, term142910.getClass(), "size", 3);
        setField(term142910, term142910.getClass(), "key3", term142910);
        setField(term142910, term142910.getClass(), "key2", null);
        setField(term142910, term142910.getClass(), "value2", term143002);
        setField(term142818, term142818.getClass(), "key3", term142910);
        setIntField(term142818, term142818.getClass(), "hash2", 0);
        setField(term143094, term143094.getClass(), "delegateMap", null);
        setIntField(term143094, term143094.getClass(), "size", -4);
        setField(term142818, term142818.getClass(), "key2", term143094);
        setIntField(term142818, term142818.getClass(), "hash1", -1);
        term143186 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term143186, term143186.getClass(), "delegateMap", null);
        setIntField(term143186, term143186.getClass(), "size", 3);
        setIntField(term143186, term143186.getClass(), "hash3", 0);
        setField(term143186, term143186.getClass(), "value3", null);
        setIntField(term143186, term143186.getClass(), "hash2", 0);
        setField(term143186, term143186.getClass(), "value2", null);
        setIntField(term143186, term143186.getClass(), "hash1", 0);
        setField(term143186, term143186.getClass(), "value1", null);
        setField(term143186, term143186.getClass(), "key3", null);
        term143704 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term143705 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term143706 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term143707 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term143708 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term143709 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term143710 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term143711 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term143704, term143704.getClass(), "size", 0);
        setIntField(term143704, term143704.getClass(), "hash1", 0);
        setIntField(term143704, term143704.getClass(), "hash2", 0);
        setIntField(term143704, term143704.getClass(), "hash3", 0);
        setField(term143704, term143704.getClass(), "key1", null);
        setField(term143704, term143704.getClass(), "key2", null);
        setField(term143704, term143704.getClass(), "key3", null);
        setField(term143704, term143704.getClass(), "value1", null);
        setField(term143704, term143704.getClass(), "value2", null);
        setField(term143704, term143704.getClass(), "value3", null);
        setFloatField(term143705, term143705.getClass(), "loadFactor", 0.75F);
        setIntField(term143705, term143705.getClass(), "size", 4);
        setField(term143708, term143708.getClass(), "next", null);
        setField(term143708, term143708.getClass(), "key", null);
        setField(term143708, term143708.getClass(), "value", null);
        setField(term143707, term143707.getClass(), "next", term143708);
        setIntField(term143709, term143709.getClass(), "size", 3);
        setIntField(term143709, term143709.getClass(), "hash1", 0);
        setIntField(term143709, term143709.getClass(), "hash2", 0);
        setIntField(term143709, term143709.getClass(), "hash3", 0);
        setField(term143709, term143709.getClass(), "key1", null);
        setField(term143709, term143709.getClass(), "key2", null);
        setField(term143709, term143709.getClass(), "key3", null);
        setField(term143709, term143709.getClass(), "value1", null);
        setField(term143709, term143709.getClass(), "value2", null);
        setField(term143709, term143709.getClass(), "value3", null);
        setField(term143709, term143709.getClass(), "delegateMap", null);
        setField(term143707, term143707.getClass(), "key", term143709);
        setField(term143707, term143707.getClass(), "value", null);
        setElement(term143706, 0, term143707);
        setField(term143710, term143710.getClass(), "next", null);
        setField(term143710, term143710.getClass(), "key", term143711);
        setField(term143710, term143710.getClass(), "value", null);
        setElement(term143706, 5, term143710);
        setField(term143705, term143705.getClass(), "data", term143706);
        setIntField(term143705, term143705.getClass(), "threshold", 12);
        setIntField(term143705, term143705.getClass(), "modCount", 4);
        setField(term143705, term143705.getClass(), "entrySet", null);
        setField(term143705, term143705.getClass(), "keySet", null);
        setField(term143705, term143705.getClass(), "values", null);
        setField(term143705, term143705.getClass(), "keySet", null);
        setField(term143705, term143705.getClass(), "values", null);
        setField(term143704, term143704.getClass(), "delegateMap", term143705);
        term143712 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term143712, term143712.getClass(), "size", 3);
        setIntField(term143712, term143712.getClass(), "hash1", 0);
        setIntField(term143712, term143712.getClass(), "hash2", 0);
        setIntField(term143712, term143712.getClass(), "hash3", 0);
        setField(term143712, term143712.getClass(), "key1", null);
        setField(term143712, term143712.getClass(), "key2", null);
        setField(term143712, term143712.getClass(), "key3", null);
        setField(term143712, term143712.getClass(), "value1", null);
        setField(term143712, term143712.getClass(), "value2", null);
        setField(term143712, term143712.getClass(), "value3", null);
        setField(term143712, term143712.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term143186;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term142818, args);
        assertTrue(recursiveEquals(term142818, term143704));
        assertTrue(recursiveEquals(term143186, term143712));
        assertTrue(recursiveEquals(retValue, null));
    }

};


