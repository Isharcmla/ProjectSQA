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

public class Flat3Map_remove_840690279937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188336;
     Object term188483;
     Object term188485;

    public Flat3Map_remove_840690279937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188336 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term188391 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term188336, term188336.getClass(), "delegateMap", null);
        setIntField(term188336, term188336.getClass(), "size", 1);
        setIntField(term188336, term188336.getClass(), "hash1", 0);
        setField(term188336, term188336.getClass(), "value1", term188391);
        term188483 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term188484 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term188483, term188483.getClass(), "size", 1);
        setIntField(term188483, term188483.getClass(), "hash1", 0);
        setIntField(term188483, term188483.getClass(), "hash2", 0);
        setIntField(term188483, term188483.getClass(), "hash3", 0);
        setField(term188483, term188483.getClass(), "key1", null);
        setField(term188483, term188483.getClass(), "key2", null);
        setField(term188483, term188483.getClass(), "key3", null);
        setFloatField(term188484, term188484.getClass(), "loadFactor", 0.0F);
        setIntField(term188484, term188484.getClass(), "size", 0);
        setField(term188484, term188484.getClass(), "data", null);
        setIntField(term188484, term188484.getClass(), "threshold", 0);
        setIntField(term188484, term188484.getClass(), "modCount", 0);
        setField(term188484, term188484.getClass(), "entrySet", null);
        setField(term188484, term188484.getClass(), "keySet", null);
        setField(term188484, term188484.getClass(), "values", null);
        setField(term188484, term188484.getClass(), "keySet", null);
        setField(term188484, term188484.getClass(), "values", null);
        setField(term188483, term188483.getClass(), "value1", term188484);
        setField(term188483, term188483.getClass(), "value2", null);
        setField(term188483, term188483.getClass(), "value3", null);
        setField(term188483, term188483.getClass(), "delegateMap", null);
        term188485 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term188486 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term188485, term188485.getClass(), "size", 1);
        setIntField(term188485, term188485.getClass(), "hash1", 0);
        setIntField(term188485, term188485.getClass(), "hash2", 0);
        setIntField(term188485, term188485.getClass(), "hash3", 0);
        setField(term188485, term188485.getClass(), "key1", null);
        setField(term188485, term188485.getClass(), "key2", null);
        setField(term188485, term188485.getClass(), "key3", null);
        setFloatField(term188486, term188486.getClass(), "loadFactor", 0.0F);
        setIntField(term188486, term188486.getClass(), "size", 0);
        setField(term188486, term188486.getClass(), "data", null);
        setIntField(term188486, term188486.getClass(), "threshold", 0);
        setIntField(term188486, term188486.getClass(), "modCount", 0);
        setField(term188486, term188486.getClass(), "entrySet", null);
        setField(term188486, term188486.getClass(), "keySet", null);
        setField(term188486, term188486.getClass(), "values", null);
        setField(term188486, term188486.getClass(), "keySet", null);
        setField(term188486, term188486.getClass(), "values", null);
        setField(term188485, term188485.getClass(), "value1", term188486);
        setField(term188485, term188485.getClass(), "value2", null);
        setField(term188485, term188485.getClass(), "value3", null);
        setField(term188485, term188485.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term188336;
        Object retValue = callMethod(klass, "remove", argTypes, term188336, args);
        assertTrue(recursiveEquals(term188336, term188483));
        assertTrue(recursiveEquals(term188336, term188485));
        assertTrue(recursiveEquals(retValue, null));
    }

};
