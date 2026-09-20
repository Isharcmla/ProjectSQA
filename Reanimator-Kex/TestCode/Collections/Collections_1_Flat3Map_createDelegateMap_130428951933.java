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

public class Flat3Map_createDelegateMap_130428951933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165;
     Object term7289;
     Object term7264;

    public Flat3Map_createDelegateMap_130428951933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term170 = newInstance(Class.forName("java.lang.Object"));
        Object term171 = newInstance(Class.forName("java.lang.Object"));
        Object term172 = newInstance(Class.forName("java.lang.Object"));
        Object term173 = newInstance(Class.forName("java.lang.Object"));
        Object term174 = newInstance(Class.forName("java.lang.Object"));
        Object term175 = newInstance(Class.forName("java.lang.Object"));
        Object term176 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term165, term165.getClass(), "size", -376422566);
        setIntField(term165, term165.getClass(), "hash1", 306847454);
        setIntField(term165, term165.getClass(), "hash2", 1745276158);
        setIntField(term165, term165.getClass(), "hash3", 2009020256);
        setField(term165, term165.getClass(), "key1", term170);
        setField(term165, term165.getClass(), "key2", term171);
        setField(term165, term165.getClass(), "key3", term172);
        setField(term165, term165.getClass(), "value1", term173);
        setField(term165, term165.getClass(), "value2", term174);
        setField(term165, term165.getClass(), "value3", term175);
        setFloatField(term176, term176.getClass(), "loadFactor", 0.0F);
        setIntField(term176, term176.getClass(), "size", 0);
        setField(term176, term176.getClass(), "data", null);
        setIntField(term176, term176.getClass(), "threshold", 0);
        setIntField(term176, term176.getClass(), "modCount", 0);
        setField(term176, term176.getClass(), "entrySet", null);
        setField(term176, term176.getClass(), "keySet", null);
        setField(term176, term176.getClass(), "values", null);
        setField(term176, term176.getClass(), "keySet", null);
        setField(term176, term176.getClass(), "values", null);
        setField(term165, term165.getClass(), "delegateMap", term176);
        term7289 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term7290 = newInstance(Class.forName("java.lang.Object"));
        Object term7291 = newInstance(Class.forName("java.lang.Object"));
        Object term7292 = newInstance(Class.forName("java.lang.Object"));
        Object term7293 = newInstance(Class.forName("java.lang.Object"));
        Object term7294 = newInstance(Class.forName("java.lang.Object"));
        Object term7295 = newInstance(Class.forName("java.lang.Object"));
        Object term7296 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term7289, term7289.getClass(), "size", -376422566);
        setIntField(term7289, term7289.getClass(), "hash1", 306847454);
        setIntField(term7289, term7289.getClass(), "hash2", 1745276158);
        setIntField(term7289, term7289.getClass(), "hash3", 2009020256);
        setField(term7289, term7289.getClass(), "key1", term7290);
        setField(term7289, term7289.getClass(), "key2", term7291);
        setField(term7289, term7289.getClass(), "key3", term7292);
        setField(term7289, term7289.getClass(), "value1", term7293);
        setField(term7289, term7289.getClass(), "value2", term7294);
        setField(term7289, term7289.getClass(), "value3", term7295);
        setFloatField(term7296, term7296.getClass(), "loadFactor", 0.0F);
        setIntField(term7296, term7296.getClass(), "size", 0);
        setField(term7296, term7296.getClass(), "data", null);
        setIntField(term7296, term7296.getClass(), "threshold", 0);
        setIntField(term7296, term7296.getClass(), "modCount", 0);
        setField(term7296, term7296.getClass(), "entrySet", null);
        setField(term7296, term7296.getClass(), "keySet", null);
        setField(term7296, term7296.getClass(), "values", null);
        setField(term7296, term7296.getClass(), "keySet", null);
        setField(term7296, term7296.getClass(), "values", null);
        setField(term7289, term7289.getClass(), "delegateMap", term7296);
        term7264 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term7267 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        setFloatField(term7264, term7264.getClass(), "loadFactor", 0.75F);
        setIntField(term7264, term7264.getClass(), "size", 0);
        setField(term7264, term7264.getClass(), "data", term7267);
        setIntField(term7264, term7264.getClass(), "threshold", 12);
        setIntField(term7264, term7264.getClass(), "modCount", 0);
        setField(term7264, term7264.getClass(), "entrySet", null);
        setField(term7264, term7264.getClass(), "keySet", null);
        setField(term7264, term7264.getClass(), "values", null);
        setField(term7264, term7264.getClass(), "keySet", null);
        setField(term7264, term7264.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "createDelegateMap", argTypes, term165, args);
        assertTrue(recursiveEquals(term165, term7289));
        assertTrue(recursiveEquals(retValue, term7264));
    }

};
