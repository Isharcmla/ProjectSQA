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

public class Flat3Map_put_1944740725447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81069;
     Object term81444;
     Object term81450;

    public Flat3Map_put_1944740725447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81069 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term81124 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term81069, term81069.getClass(), "delegateMap", null);
        setIntField(term81069, term81069.getClass(), "size", 3);
        setIntField(term81069, term81069.getClass(), "hash3", 0);
        setField(term81069, term81069.getClass(), "value3", null);
        setIntField(term81069, term81069.getClass(), "hash2", -1);
        setIntField(term81124, term81124.getClass(), "size", 0);
        setField(term81069, term81069.getClass(), "value2", term81124);
        setIntField(term81069, term81069.getClass(), "hash1", 0);
        setField(term81069, term81069.getClass(), "value1", null);
        setField(term81069, term81069.getClass(), "key3", null);
        term81444 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term81445 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term81446 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term81447 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term81448 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term81449 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term81444, term81444.getClass(), "size", 0);
        setIntField(term81444, term81444.getClass(), "hash1", 0);
        setIntField(term81444, term81444.getClass(), "hash2", 0);
        setIntField(term81444, term81444.getClass(), "hash3", 0);
        setField(term81444, term81444.getClass(), "key1", null);
        setField(term81444, term81444.getClass(), "key2", null);
        setField(term81444, term81444.getClass(), "key3", null);
        setField(term81444, term81444.getClass(), "value1", null);
        setField(term81444, term81444.getClass(), "value2", null);
        setField(term81444, term81444.getClass(), "value3", null);
        setFloatField(term81445, term81445.getClass(), "loadFactor", 0.75F);
        setIntField(term81445, term81445.getClass(), "size", 2);
        setField(term81447, term81447.getClass(), "next", null);
        setField(term81447, term81447.getClass(), "key", term81444);
        setField(term81447, term81447.getClass(), "value", null);
        setElement(term81446, 0, term81447);
        setField(term81448, term81448.getClass(), "next", null);
        setField(term81448, term81448.getClass(), "key", term81449);
        setField(term81448, term81448.getClass(), "value", null);
        setElement(term81446, 5, term81448);
        setField(term81445, term81445.getClass(), "data", term81446);
        setIntField(term81445, term81445.getClass(), "threshold", 12);
        setIntField(term81445, term81445.getClass(), "modCount", 2);
        setField(term81445, term81445.getClass(), "entrySet", null);
        setField(term81445, term81445.getClass(), "keySet", null);
        setField(term81445, term81445.getClass(), "values", null);
        setField(term81445, term81445.getClass(), "keySet", null);
        setField(term81445, term81445.getClass(), "values", null);
        setField(term81444, term81444.getClass(), "delegateMap", term81445);
        term81450 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term81451 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term81452 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term81453 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term81454 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term81455 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term81450, term81450.getClass(), "size", 0);
        setIntField(term81450, term81450.getClass(), "hash1", 0);
        setIntField(term81450, term81450.getClass(), "hash2", 0);
        setIntField(term81450, term81450.getClass(), "hash3", 0);
        setField(term81450, term81450.getClass(), "key1", null);
        setField(term81450, term81450.getClass(), "key2", null);
        setField(term81450, term81450.getClass(), "key3", null);
        setField(term81450, term81450.getClass(), "value1", null);
        setField(term81450, term81450.getClass(), "value2", null);
        setField(term81450, term81450.getClass(), "value3", null);
        setFloatField(term81451, term81451.getClass(), "loadFactor", 0.75F);
        setIntField(term81451, term81451.getClass(), "size", 2);
        setField(term81453, term81453.getClass(), "next", null);
        setField(term81453, term81453.getClass(), "key", term81450);
        setField(term81453, term81453.getClass(), "value", null);
        setElement(term81452, 0, term81453);
        setField(term81454, term81454.getClass(), "next", null);
        setField(term81454, term81454.getClass(), "key", term81455);
        setField(term81454, term81454.getClass(), "value", null);
        setElement(term81452, 5, term81454);
        setField(term81451, term81451.getClass(), "data", term81452);
        setIntField(term81451, term81451.getClass(), "threshold", 12);
        setIntField(term81451, term81451.getClass(), "modCount", 2);
        setField(term81451, term81451.getClass(), "entrySet", null);
        setField(term81451, term81451.getClass(), "keySet", null);
        setField(term81451, term81451.getClass(), "values", null);
        setField(term81451, term81451.getClass(), "keySet", null);
        setField(term81451, term81451.getClass(), "values", null);
        setField(term81450, term81450.getClass(), "delegateMap", term81451);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term81069;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term81069, args);
        assertTrue(recursiveEquals(term81069, term81444));
        assertTrue(recursiveEquals(term81069, term81450));
        assertTrue(recursiveEquals(retValue, null));
    }

};


