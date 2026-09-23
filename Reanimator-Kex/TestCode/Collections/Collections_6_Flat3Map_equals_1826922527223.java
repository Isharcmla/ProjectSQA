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

public class Flat3Map_equals_1826922527223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36670;
     Object term36872;
     Object term37058;
     Object term37060;

    public Flat3Map_equals_1826922527223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36670 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term36780 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term36670, term36670.getClass(), "delegateMap", null);
        setIntField(term36670, term36670.getClass(), "size", 1);
        setField(term36670, term36670.getClass(), "key1", null);
        setField(term36670, term36670.getClass(), "value1", term36780);
        term36872 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term36982 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term36872, term36872.getClass(), "delegateMap", null);
        setIntField(term36872, term36872.getClass(), "size", 1);
        setField(term36872, term36872.getClass(), "key1", null);
        setField(term36872, term36872.getClass(), "value1", term36982);
        term37058 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term37059 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term37058, term37058.getClass(), "size", 1);
        setIntField(term37058, term37058.getClass(), "hash1", 0);
        setIntField(term37058, term37058.getClass(), "hash2", 0);
        setIntField(term37058, term37058.getClass(), "hash3", 0);
        setField(term37058, term37058.getClass(), "key1", null);
        setField(term37058, term37058.getClass(), "key2", null);
        setField(term37058, term37058.getClass(), "key3", null);
        setFloatField(term37059, term37059.getClass(), "loadFactor", 0.0F);
        setIntField(term37059, term37059.getClass(), "size", 0);
        setField(term37059, term37059.getClass(), "data", null);
        setIntField(term37059, term37059.getClass(), "threshold", 0);
        setIntField(term37059, term37059.getClass(), "modCount", 0);
        setField(term37059, term37059.getClass(), "entrySet", null);
        setField(term37059, term37059.getClass(), "keySet", null);
        setField(term37059, term37059.getClass(), "values", null);
        setField(term37059, term37059.getClass(), "keySet", null);
        setField(term37059, term37059.getClass(), "values", null);
        setField(term37058, term37058.getClass(), "value1", term37059);
        setField(term37058, term37058.getClass(), "value2", null);
        setField(term37058, term37058.getClass(), "value3", null);
        setField(term37058, term37058.getClass(), "delegateMap", null);
        term37060 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term37061 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term37060, term37060.getClass(), "size", 1);
        setIntField(term37060, term37060.getClass(), "hash1", 0);
        setIntField(term37060, term37060.getClass(), "hash2", 0);
        setIntField(term37060, term37060.getClass(), "hash3", 0);
        setField(term37060, term37060.getClass(), "key1", null);
        setField(term37060, term37060.getClass(), "key2", null);
        setField(term37060, term37060.getClass(), "key3", null);
        setFloatField(term37061, term37061.getClass(), "loadFactor", 0.0F);
        setIntField(term37061, term37061.getClass(), "size", 0);
        setField(term37061, term37061.getClass(), "data", null);
        setIntField(term37061, term37061.getClass(), "threshold", 0);
        setIntField(term37061, term37061.getClass(), "modCount", 0);
        setField(term37061, term37061.getClass(), "entrySet", null);
        setField(term37061, term37061.getClass(), "keySet", null);
        setField(term37061, term37061.getClass(), "values", null);
        setField(term37061, term37061.getClass(), "keySet", null);
        setField(term37061, term37061.getClass(), "values", null);
        setField(term37060, term37060.getClass(), "value1", term37061);
        setField(term37060, term37060.getClass(), "value2", null);
        setField(term37060, term37060.getClass(), "value3", null);
        setField(term37060, term37060.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term36872;
        Object retValue = callMethod(klass, "equals", argTypes, term36670, args);
        assertTrue(recursiveEquals(term36670, term37058));
        assertTrue(recursiveEquals(term36872, term37060));
        assertTrue(recursiveEquals(retValue, true));
    }

};


