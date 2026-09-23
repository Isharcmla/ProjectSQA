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

public class Flat3Map_put_1944740725553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109380;
     Object term110435;
     Object term110442;

    public Flat3Map_put_1944740725553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109380 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term109435 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term109380, term109380.getClass(), "delegateMap", null);
        setIntField(term109380, term109380.getClass(), "size", 3);
        setIntField(term109380, term109380.getClass(), "hash3", -1);
        setField(term109380, term109380.getClass(), "value3", null);
        setIntField(term109380, term109380.getClass(), "hash2", 0);
        setField(term109380, term109380.getClass(), "value2", null);
        setIntField(term109380, term109380.getClass(), "hash1", 0);
        setIntField(term109435, term109435.getClass(), "size", 0);
        setField(term109380, term109380.getClass(), "value1", term109435);
        term110435 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term110436 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term110437 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term110438 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term110439 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term110440 = newInstance(Class.forName("java.lang.Object"));
        Object term110441 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term110435, term110435.getClass(), "size", 0);
        setIntField(term110435, term110435.getClass(), "hash1", 0);
        setIntField(term110435, term110435.getClass(), "hash2", 0);
        setIntField(term110435, term110435.getClass(), "hash3", 0);
        setField(term110435, term110435.getClass(), "key1", null);
        setField(term110435, term110435.getClass(), "key2", null);
        setField(term110435, term110435.getClass(), "key3", null);
        setField(term110435, term110435.getClass(), "value1", null);
        setField(term110435, term110435.getClass(), "value2", null);
        setField(term110435, term110435.getClass(), "value3", null);
        setFloatField(term110436, term110436.getClass(), "loadFactor", 0.75F);
        setIntField(term110436, term110436.getClass(), "size", 2);
        setField(term110438, term110438.getClass(), "next", null);
        setField(term110438, term110438.getClass(), "key", term110435);
        setField(term110438, term110438.getClass(), "value", null);
        setElement(term110437, 0, term110438);
        setField(term110439, term110439.getClass(), "next", null);
        setField(term110439, term110439.getClass(), "key", term110440);
        setFloatField(term110441, term110441.getClass(), "loadFactor", 0.0F);
        setIntField(term110441, term110441.getClass(), "size", 0);
        setField(term110441, term110441.getClass(), "data", null);
        setIntField(term110441, term110441.getClass(), "threshold", 0);
        setIntField(term110441, term110441.getClass(), "modCount", 0);
        setField(term110441, term110441.getClass(), "entrySet", null);
        setField(term110441, term110441.getClass(), "keySet", null);
        setField(term110441, term110441.getClass(), "values", null);
        setField(term110441, term110441.getClass(), "keySet", null);
        setField(term110441, term110441.getClass(), "values", null);
        setField(term110439, term110439.getClass(), "value", term110441);
        setElement(term110437, 5, term110439);
        setField(term110436, term110436.getClass(), "data", term110437);
        setIntField(term110436, term110436.getClass(), "threshold", 12);
        setIntField(term110436, term110436.getClass(), "modCount", 2);
        setField(term110436, term110436.getClass(), "entrySet", null);
        setField(term110436, term110436.getClass(), "keySet", null);
        setField(term110436, term110436.getClass(), "values", null);
        setField(term110436, term110436.getClass(), "keySet", null);
        setField(term110436, term110436.getClass(), "values", null);
        setField(term110435, term110435.getClass(), "delegateMap", term110436);
        term110442 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term110443 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term110444 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term110445 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term110446 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term110447 = newInstance(Class.forName("java.lang.Object"));
        Object term110448 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term110442, term110442.getClass(), "size", 0);
        setIntField(term110442, term110442.getClass(), "hash1", 0);
        setIntField(term110442, term110442.getClass(), "hash2", 0);
        setIntField(term110442, term110442.getClass(), "hash3", 0);
        setField(term110442, term110442.getClass(), "key1", null);
        setField(term110442, term110442.getClass(), "key2", null);
        setField(term110442, term110442.getClass(), "key3", null);
        setField(term110442, term110442.getClass(), "value1", null);
        setField(term110442, term110442.getClass(), "value2", null);
        setField(term110442, term110442.getClass(), "value3", null);
        setFloatField(term110443, term110443.getClass(), "loadFactor", 0.75F);
        setIntField(term110443, term110443.getClass(), "size", 2);
        setField(term110445, term110445.getClass(), "next", null);
        setField(term110445, term110445.getClass(), "key", term110442);
        setField(term110445, term110445.getClass(), "value", null);
        setElement(term110444, 0, term110445);
        setField(term110446, term110446.getClass(), "next", null);
        setField(term110446, term110446.getClass(), "key", term110447);
        setFloatField(term110448, term110448.getClass(), "loadFactor", 0.0F);
        setIntField(term110448, term110448.getClass(), "size", 0);
        setField(term110448, term110448.getClass(), "data", null);
        setIntField(term110448, term110448.getClass(), "threshold", 0);
        setIntField(term110448, term110448.getClass(), "modCount", 0);
        setField(term110448, term110448.getClass(), "entrySet", null);
        setField(term110448, term110448.getClass(), "keySet", null);
        setField(term110448, term110448.getClass(), "values", null);
        setField(term110448, term110448.getClass(), "keySet", null);
        setField(term110448, term110448.getClass(), "values", null);
        setField(term110446, term110446.getClass(), "value", term110448);
        setElement(term110444, 5, term110446);
        setField(term110443, term110443.getClass(), "data", term110444);
        setIntField(term110443, term110443.getClass(), "threshold", 12);
        setIntField(term110443, term110443.getClass(), "modCount", 2);
        setField(term110443, term110443.getClass(), "entrySet", null);
        setField(term110443, term110443.getClass(), "keySet", null);
        setField(term110443, term110443.getClass(), "values", null);
        setField(term110443, term110443.getClass(), "keySet", null);
        setField(term110443, term110443.getClass(), "values", null);
        setField(term110442, term110442.getClass(), "delegateMap", term110443);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term109380;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term109380, args);
        assertTrue(recursiveEquals(term109380, term110435));
        assertTrue(recursiveEquals(term109380, term110442));
        assertTrue(recursiveEquals(retValue, null));
    }

};


