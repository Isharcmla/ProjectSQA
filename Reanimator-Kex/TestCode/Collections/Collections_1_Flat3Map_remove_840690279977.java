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

public class Flat3Map_remove_840690279977 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196318;
     Object term196448;
     Object term196450;
     Object term196423;

    public Flat3Map_remove_840690279977() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term196318 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term196373 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term196318, term196318.getClass(), "delegateMap", null);
        setIntField(term196318, term196318.getClass(), "size", 3);
        setIntField(term196318, term196318.getClass(), "hash3", 0);
        setIntField(term196373, term196373.getClass(), "size", 0);
        setField(term196318, term196318.getClass(), "value3", term196373);
        setIntField(term196318, term196318.getClass(), "hash2", 0);
        setField(term196318, term196318.getClass(), "value2", null);
        setIntField(term196318, term196318.getClass(), "hash1", 0);
        setField(term196318, term196318.getClass(), "value1", null);
        setField(term196318, term196318.getClass(), "key3", null);
        setField(term196318, term196318.getClass(), "key2", term196318);
        term196448 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term196449 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term196448, term196448.getClass(), "size", 2);
        setIntField(term196448, term196448.getClass(), "hash1", 0);
        setIntField(term196448, term196448.getClass(), "hash2", 0);
        setIntField(term196448, term196448.getClass(), "hash3", 0);
        setField(term196448, term196448.getClass(), "key1", null);
        setField(term196448, term196448.getClass(), "key2", null);
        setField(term196448, term196448.getClass(), "key3", null);
        setField(term196448, term196448.getClass(), "value1", null);
        setFloatField(term196449, term196449.getClass(), "loadFactor", 0.0F);
        setIntField(term196449, term196449.getClass(), "size", 0);
        setField(term196449, term196449.getClass(), "data", null);
        setIntField(term196449, term196449.getClass(), "threshold", 0);
        setIntField(term196449, term196449.getClass(), "modCount", 0);
        setField(term196449, term196449.getClass(), "entrySet", null);
        setField(term196449, term196449.getClass(), "keySet", null);
        setField(term196449, term196449.getClass(), "values", null);
        setField(term196449, term196449.getClass(), "keySet", null);
        setField(term196449, term196449.getClass(), "values", null);
        setField(term196448, term196448.getClass(), "value2", term196449);
        setField(term196448, term196448.getClass(), "value3", null);
        setField(term196448, term196448.getClass(), "delegateMap", null);
        term196450 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term196451 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term196450, term196450.getClass(), "size", 2);
        setIntField(term196450, term196450.getClass(), "hash1", 0);
        setIntField(term196450, term196450.getClass(), "hash2", 0);
        setIntField(term196450, term196450.getClass(), "hash3", 0);
        setField(term196450, term196450.getClass(), "key1", null);
        setField(term196450, term196450.getClass(), "key2", null);
        setField(term196450, term196450.getClass(), "key3", null);
        setField(term196450, term196450.getClass(), "value1", null);
        setFloatField(term196451, term196451.getClass(), "loadFactor", 0.0F);
        setIntField(term196451, term196451.getClass(), "size", 0);
        setField(term196451, term196451.getClass(), "data", null);
        setIntField(term196451, term196451.getClass(), "threshold", 0);
        setIntField(term196451, term196451.getClass(), "modCount", 0);
        setField(term196451, term196451.getClass(), "entrySet", null);
        setField(term196451, term196451.getClass(), "keySet", null);
        setField(term196451, term196451.getClass(), "values", null);
        setField(term196451, term196451.getClass(), "keySet", null);
        setField(term196451, term196451.getClass(), "values", null);
        setField(term196450, term196450.getClass(), "value2", term196451);
        setField(term196450, term196450.getClass(), "value3", null);
        setField(term196450, term196450.getClass(), "delegateMap", null);
        term196423 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setFloatField(term196423, term196423.getClass(), "loadFactor", 0.0F);
        setIntField(term196423, term196423.getClass(), "size", 0);
        setField(term196423, term196423.getClass(), "data", null);
        setIntField(term196423, term196423.getClass(), "threshold", 0);
        setIntField(term196423, term196423.getClass(), "modCount", 0);
        setField(term196423, term196423.getClass(), "entrySet", null);
        setField(term196423, term196423.getClass(), "keySet", null);
        setField(term196423, term196423.getClass(), "values", null);
        setField(term196423, term196423.getClass(), "keySet", null);
        setField(term196423, term196423.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term196318;
        Object retValue = callMethod(klass, "remove", argTypes, term196318, args);
        assertTrue(recursiveEquals(term196318, term196448));
        assertTrue(recursiveEquals(term196318, term196450));
        assertTrue(recursiveEquals(retValue, term196423));
    }

};
