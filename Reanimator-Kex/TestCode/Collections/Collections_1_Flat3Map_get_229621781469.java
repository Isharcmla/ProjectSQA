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

public class Flat3Map_get_229621781469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87623;
     Object term87753;
     Object term87914;
     Object term87916;

    public Flat3Map_get_229621781469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87623 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term87661 = newInstance(Class.forName("java.lang.Object"));
        setField(term87623, term87623.getClass(), "delegateMap", null);
        setIntField(term87623, term87623.getClass(), "size", 2);
        setIntField(term87623, term87623.getClass(), "hash2", 0);
        setField(term87623, term87623.getClass(), "key2", term87661);
        setField(term87623, term87623.getClass(), "key1", term87661);
        term87753 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term87863 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term87753, term87753.getClass(), "delegateMap", null);
        setIntField(term87753, term87753.getClass(), "size", 2);
        setIntField(term87753, term87753.getClass(), "hash2", 0);
        setIntField(term87863, term87863.getClass(), "size", 0);
        setField(term87753, term87753.getClass(), "value2", term87863);
        setIntField(term87753, term87753.getClass(), "hash1", 0);
        setField(term87753, term87753.getClass(), "value1", null);
        setField(term87753, term87753.getClass(), "key2", null);
        term87914 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term87915 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term87914, term87914.getClass(), "size", 2);
        setIntField(term87914, term87914.getClass(), "hash1", 0);
        setIntField(term87914, term87914.getClass(), "hash2", 0);
        setIntField(term87914, term87914.getClass(), "hash3", 0);
        setField(term87914, term87914.getClass(), "key1", term87915);
        setField(term87914, term87914.getClass(), "key2", term87915);
        setField(term87914, term87914.getClass(), "key3", null);
        setField(term87914, term87914.getClass(), "value1", null);
        setField(term87914, term87914.getClass(), "value2", null);
        setField(term87914, term87914.getClass(), "value3", null);
        setField(term87914, term87914.getClass(), "delegateMap", null);
        term87916 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term87917 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term87916, term87916.getClass(), "size", 2);
        setIntField(term87916, term87916.getClass(), "hash1", 0);
        setIntField(term87916, term87916.getClass(), "hash2", 0);
        setIntField(term87916, term87916.getClass(), "hash3", 0);
        setField(term87916, term87916.getClass(), "key1", null);
        setField(term87916, term87916.getClass(), "key2", null);
        setField(term87916, term87916.getClass(), "key3", null);
        setField(term87916, term87916.getClass(), "value1", null);
        setFloatField(term87917, term87917.getClass(), "loadFactor", 0.0F);
        setIntField(term87917, term87917.getClass(), "size", 0);
        setField(term87917, term87917.getClass(), "data", null);
        setIntField(term87917, term87917.getClass(), "threshold", 0);
        setIntField(term87917, term87917.getClass(), "modCount", 0);
        setField(term87917, term87917.getClass(), "entrySet", null);
        setField(term87917, term87917.getClass(), "keySet", null);
        setField(term87917, term87917.getClass(), "values", null);
        setField(term87917, term87917.getClass(), "keySet", null);
        setField(term87917, term87917.getClass(), "values", null);
        setField(term87916, term87916.getClass(), "value2", term87917);
        setField(term87916, term87916.getClass(), "value3", null);
        setField(term87916, term87916.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term87753;
        Object retValue = callMethod(klass, "get", argTypes, term87623, args);
        assertTrue(recursiveEquals(term87623, term87914));
        assertTrue(recursiveEquals(term87753, term87916));
        assertTrue(recursiveEquals(retValue, null));
    }

};
