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

public class Flat3Map_put_1944740725868 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174703;
     Object term175479;
     Object term175484;

    public Flat3Map_put_1944740725868() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174703 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term174758 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term174703, term174703.getClass(), "delegateMap", null);
        setIntField(term174703, term174703.getClass(), "size", 3);
        setIntField(term174703, term174703.getClass(), "hash3", 0);
        setField(term174703, term174703.getClass(), "value3", null);
        setIntField(term174703, term174703.getClass(), "hash2", 0);
        setField(term174703, term174703.getClass(), "value2", term174758);
        term175479 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term175480 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term175481 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term175482 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term175483 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setIntField(term175479, term175479.getClass(), "size", 0);
        setIntField(term175479, term175479.getClass(), "hash1", 0);
        setIntField(term175479, term175479.getClass(), "hash2", 0);
        setIntField(term175479, term175479.getClass(), "hash3", 0);
        setField(term175479, term175479.getClass(), "key1", null);
        setField(term175479, term175479.getClass(), "key2", null);
        setField(term175479, term175479.getClass(), "key3", null);
        setField(term175479, term175479.getClass(), "value1", null);
        setField(term175479, term175479.getClass(), "value2", null);
        setField(term175479, term175479.getClass(), "value3", null);
        setFloatField(term175480, term175480.getClass(), "loadFactor", 0.75F);
        setIntField(term175480, term175480.getClass(), "size", 2);
        setField(term175483, term175483.getClass(), "next", null);
        setField(term175483, term175483.getClass(), "key", null);
        setField(term175483, term175483.getClass(), "value", null);
        setField(term175482, term175482.getClass(), "next", term175483);
        setField(term175482, term175482.getClass(), "key", term175479);
        setField(term175482, term175482.getClass(), "value", null);
        setElement(term175481, 0, term175482);
        setField(term175480, term175480.getClass(), "data", term175481);
        setIntField(term175480, term175480.getClass(), "threshold", 12);
        setIntField(term175480, term175480.getClass(), "modCount", 2);
        setField(term175480, term175480.getClass(), "entrySet", null);
        setField(term175480, term175480.getClass(), "keySet", null);
        setField(term175480, term175480.getClass(), "values", null);
        setField(term175480, term175480.getClass(), "keySet", null);
        setField(term175480, term175480.getClass(), "values", null);
        setField(term175479, term175479.getClass(), "delegateMap", term175480);
        term175484 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term175485 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term175486 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term175487 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term175488 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setIntField(term175484, term175484.getClass(), "size", 0);
        setIntField(term175484, term175484.getClass(), "hash1", 0);
        setIntField(term175484, term175484.getClass(), "hash2", 0);
        setIntField(term175484, term175484.getClass(), "hash3", 0);
        setField(term175484, term175484.getClass(), "key1", null);
        setField(term175484, term175484.getClass(), "key2", null);
        setField(term175484, term175484.getClass(), "key3", null);
        setField(term175484, term175484.getClass(), "value1", null);
        setField(term175484, term175484.getClass(), "value2", null);
        setField(term175484, term175484.getClass(), "value3", null);
        setFloatField(term175485, term175485.getClass(), "loadFactor", 0.75F);
        setIntField(term175485, term175485.getClass(), "size", 2);
        setField(term175488, term175488.getClass(), "next", null);
        setField(term175488, term175488.getClass(), "key", null);
        setField(term175488, term175488.getClass(), "value", null);
        setField(term175487, term175487.getClass(), "next", term175488);
        setField(term175487, term175487.getClass(), "key", term175484);
        setField(term175487, term175487.getClass(), "value", null);
        setElement(term175486, 0, term175487);
        setField(term175485, term175485.getClass(), "data", term175486);
        setIntField(term175485, term175485.getClass(), "threshold", 12);
        setIntField(term175485, term175485.getClass(), "modCount", 2);
        setField(term175485, term175485.getClass(), "entrySet", null);
        setField(term175485, term175485.getClass(), "keySet", null);
        setField(term175485, term175485.getClass(), "values", null);
        setField(term175485, term175485.getClass(), "keySet", null);
        setField(term175485, term175485.getClass(), "values", null);
        setField(term175484, term175484.getClass(), "delegateMap", term175485);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term174703;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term174703, args);
        assertTrue(recursiveEquals(term174703, term175479));
        assertTrue(recursiveEquals(term174703, term175484));
        assertTrue(recursiveEquals(retValue, null));
    }

};
