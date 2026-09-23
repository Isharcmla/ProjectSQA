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

public class Flat3Map_put_1944740725567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114579;
     Object term115002;
     Object term115004;

    public Flat3Map_put_1944740725567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114579 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term114634 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term114579, term114579.getClass(), "delegateMap", null);
        setIntField(term114579, term114579.getClass(), "size", 2);
        setIntField(term114579, term114579.getClass(), "hash2", 0);
        setField(term114579, term114579.getClass(), "value2", null);
        setIntField(term114579, term114579.getClass(), "hash1", 0);
        setIntField(term114634, term114634.getClass(), "size", 0);
        setField(term114579, term114579.getClass(), "value1", term114634);
        term115002 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term115003 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term115002, term115002.getClass(), "size", 3);
        setIntField(term115002, term115002.getClass(), "hash1", 0);
        setIntField(term115002, term115002.getClass(), "hash2", 0);
        setIntField(term115002, term115002.getClass(), "hash3", 0);
        setField(term115002, term115002.getClass(), "key1", null);
        setField(term115002, term115002.getClass(), "key2", null);
        setField(term115002, term115002.getClass(), "key3", term115002);
        setFloatField(term115003, term115003.getClass(), "loadFactor", 0.0F);
        setIntField(term115003, term115003.getClass(), "size", 0);
        setField(term115003, term115003.getClass(), "data", null);
        setIntField(term115003, term115003.getClass(), "threshold", 0);
        setIntField(term115003, term115003.getClass(), "modCount", 0);
        setField(term115003, term115003.getClass(), "entrySet", null);
        setField(term115003, term115003.getClass(), "keySet", null);
        setField(term115003, term115003.getClass(), "values", null);
        setField(term115003, term115003.getClass(), "keySet", null);
        setField(term115003, term115003.getClass(), "values", null);
        setField(term115002, term115002.getClass(), "value1", term115003);
        setField(term115002, term115002.getClass(), "value2", null);
        setField(term115002, term115002.getClass(), "value3", null);
        setField(term115002, term115002.getClass(), "delegateMap", null);
        term115004 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term115005 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term115004, term115004.getClass(), "size", 3);
        setIntField(term115004, term115004.getClass(), "hash1", 0);
        setIntField(term115004, term115004.getClass(), "hash2", 0);
        setIntField(term115004, term115004.getClass(), "hash3", 0);
        setField(term115004, term115004.getClass(), "key1", null);
        setField(term115004, term115004.getClass(), "key2", null);
        setField(term115004, term115004.getClass(), "key3", term115004);
        setFloatField(term115005, term115005.getClass(), "loadFactor", 0.0F);
        setIntField(term115005, term115005.getClass(), "size", 0);
        setField(term115005, term115005.getClass(), "data", null);
        setIntField(term115005, term115005.getClass(), "threshold", 0);
        setIntField(term115005, term115005.getClass(), "modCount", 0);
        setField(term115005, term115005.getClass(), "entrySet", null);
        setField(term115005, term115005.getClass(), "keySet", null);
        setField(term115005, term115005.getClass(), "values", null);
        setField(term115005, term115005.getClass(), "keySet", null);
        setField(term115005, term115005.getClass(), "values", null);
        setField(term115004, term115004.getClass(), "value1", term115005);
        setField(term115004, term115004.getClass(), "value2", null);
        setField(term115004, term115004.getClass(), "value3", null);
        setField(term115004, term115004.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term114579;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term114579, args);
        assertTrue(recursiveEquals(term114579, term115002));
        assertTrue(recursiveEquals(term114579, term115004));
        assertTrue(recursiveEquals(retValue, null));
    }

};


