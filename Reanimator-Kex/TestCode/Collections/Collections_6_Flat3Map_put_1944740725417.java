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

public class Flat3Map_put_1944740725417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73356;
     Object term73670;
     Object term74255;
     Object term74263;

    public Flat3Map_put_1944740725417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73356 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term73448 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term73486 = newInstance(Class.forName("java.lang.Object"));
        Object term73578 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term73356, term73356.getClass(), "delegateMap", null);
        setIntField(term73356, term73356.getClass(), "size", 3);
        setIntField(term73356, term73356.getClass(), "hash3", 0);
        setField(term73448, term73448.getClass(), "delegateMap", null);
        setIntField(term73448, term73448.getClass(), "size", -4);
        setField(term73356, term73356.getClass(), "key3", term73448);
        setIntField(term73356, term73356.getClass(), "hash2", 0);
        setField(term73356, term73356.getClass(), "key2", term73486);
        setIntField(term73356, term73356.getClass(), "hash1", 0);
        setField(term73356, term73356.getClass(), "key1", term73578);
        term73670 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term73670, term73670.getClass(), "delegateMap", null);
        setIntField(term73670, term73670.getClass(), "size", 3);
        setIntField(term73670, term73670.getClass(), "hash3", 0);
        setField(term73670, term73670.getClass(), "value3", null);
        setIntField(term73670, term73670.getClass(), "hash2", 0);
        setField(term73670, term73670.getClass(), "value2", null);
        setIntField(term73670, term73670.getClass(), "hash1", 0);
        setField(term73670, term73670.getClass(), "value1", null);
        term74255 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term74256 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term74257 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term74258 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term74259 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term74260 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term74261 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term74262 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term74255, term74255.getClass(), "size", 0);
        setIntField(term74255, term74255.getClass(), "hash1", 0);
        setIntField(term74255, term74255.getClass(), "hash2", 0);
        setIntField(term74255, term74255.getClass(), "hash3", 0);
        setField(term74255, term74255.getClass(), "key1", null);
        setField(term74255, term74255.getClass(), "key2", null);
        setField(term74255, term74255.getClass(), "key3", null);
        setField(term74255, term74255.getClass(), "value1", null);
        setField(term74255, term74255.getClass(), "value2", null);
        setField(term74255, term74255.getClass(), "value3", null);
        setFloatField(term74256, term74256.getClass(), "loadFactor", 0.75F);
        setIntField(term74256, term74256.getClass(), "size", 4);
        setField(term74259, term74259.getClass(), "next", null);
        setField(term74259, term74259.getClass(), "key", null);
        setField(term74259, term74259.getClass(), "value", null);
        setField(term74258, term74258.getClass(), "next", term74259);
        setIntField(term74260, term74260.getClass(), "size", 3);
        setIntField(term74260, term74260.getClass(), "hash1", 0);
        setIntField(term74260, term74260.getClass(), "hash2", 0);
        setIntField(term74260, term74260.getClass(), "hash3", 0);
        setField(term74260, term74260.getClass(), "key1", null);
        setField(term74260, term74260.getClass(), "key2", null);
        setField(term74260, term74260.getClass(), "key3", null);
        setField(term74260, term74260.getClass(), "value1", null);
        setField(term74260, term74260.getClass(), "value2", null);
        setField(term74260, term74260.getClass(), "value3", null);
        setField(term74260, term74260.getClass(), "delegateMap", null);
        setField(term74258, term74258.getClass(), "key", term74260);
        setField(term74258, term74258.getClass(), "value", null);
        setElement(term74257, 0, term74258);
        setField(term74261, term74261.getClass(), "next", null);
        setField(term74261, term74261.getClass(), "key", term74262);
        setField(term74261, term74261.getClass(), "value", null);
        setElement(term74257, 6, term74261);
        setField(term74256, term74256.getClass(), "data", term74257);
        setIntField(term74256, term74256.getClass(), "threshold", 12);
        setIntField(term74256, term74256.getClass(), "modCount", 4);
        setField(term74256, term74256.getClass(), "entrySet", null);
        setField(term74256, term74256.getClass(), "keySet", null);
        setField(term74256, term74256.getClass(), "values", null);
        setField(term74256, term74256.getClass(), "keySet", null);
        setField(term74256, term74256.getClass(), "values", null);
        setField(term74255, term74255.getClass(), "delegateMap", term74256);
        term74263 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term74263, term74263.getClass(), "size", 3);
        setIntField(term74263, term74263.getClass(), "hash1", 0);
        setIntField(term74263, term74263.getClass(), "hash2", 0);
        setIntField(term74263, term74263.getClass(), "hash3", 0);
        setField(term74263, term74263.getClass(), "key1", null);
        setField(term74263, term74263.getClass(), "key2", null);
        setField(term74263, term74263.getClass(), "key3", null);
        setField(term74263, term74263.getClass(), "value1", null);
        setField(term74263, term74263.getClass(), "value2", null);
        setField(term74263, term74263.getClass(), "value3", null);
        setField(term74263, term74263.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term73670;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term73356, args);
        assertTrue(recursiveEquals(term73356, term74255));
        assertTrue(recursiveEquals(term73670, term74263));
        assertTrue(recursiveEquals(retValue, null));
    }

};


