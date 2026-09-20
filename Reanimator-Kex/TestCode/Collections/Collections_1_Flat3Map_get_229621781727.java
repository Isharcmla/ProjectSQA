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

public class Flat3Map_get_229621781727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145493;
     Object term146007;
     Object term146109;
     Object term146114;

    public Flat3Map_get_229621781727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145493 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term145585 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term145695 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term145805 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term145915 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term145493, term145493.getClass(), "delegateMap", null);
        setIntField(term145493, term145493.getClass(), "size", 2);
        setIntField(term145493, term145493.getClass(), "hash2", 0);
        setField(term145585, term145585.getClass(), "delegateMap", null);
        setIntField(term145585, term145585.getClass(), "size", 2);
        setField(term145585, term145585.getClass(), "key2", term145695);
        setField(term145585, term145585.getClass(), "key1", term145805);
        setField(term145493, term145493.getClass(), "key2", term145585);
        setIntField(term145493, term145493.getClass(), "hash1", 0);
        setField(term145493, term145493.getClass(), "key1", term145915);
        term146007 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term146007, term146007.getClass(), "delegateMap", null);
        setIntField(term146007, term146007.getClass(), "size", 2);
        setIntField(term146007, term146007.getClass(), "hash2", 0);
        setField(term146007, term146007.getClass(), "value2", null);
        setIntField(term146007, term146007.getClass(), "hash1", 0);
        setField(term146007, term146007.getClass(), "value1", null);
        setField(term146007, term146007.getClass(), "key2", null);
        term146109 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term146110 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term146111 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term146112 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term146113 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term146109, term146109.getClass(), "size", 2);
        setIntField(term146109, term146109.getClass(), "hash1", 0);
        setIntField(term146109, term146109.getClass(), "hash2", 0);
        setIntField(term146109, term146109.getClass(), "hash3", 0);
        setFloatField(term146110, term146110.getClass(), "loadFactor", 0.0F);
        setIntField(term146110, term146110.getClass(), "size", 0);
        setField(term146110, term146110.getClass(), "data", null);
        setIntField(term146110, term146110.getClass(), "threshold", 0);
        setIntField(term146110, term146110.getClass(), "modCount", 0);
        setField(term146110, term146110.getClass(), "entrySet", null);
        setField(term146110, term146110.getClass(), "keySet", null);
        setField(term146110, term146110.getClass(), "values", null);
        setField(term146110, term146110.getClass(), "keySet", null);
        setField(term146110, term146110.getClass(), "values", null);
        setField(term146109, term146109.getClass(), "key1", term146110);
        setIntField(term146111, term146111.getClass(), "size", 2);
        setIntField(term146111, term146111.getClass(), "hash1", 0);
        setIntField(term146111, term146111.getClass(), "hash2", 0);
        setIntField(term146111, term146111.getClass(), "hash3", 0);
        setFloatField(term146112, term146112.getClass(), "loadFactor", 0.0F);
        setIntField(term146112, term146112.getClass(), "size", 0);
        setField(term146112, term146112.getClass(), "data", null);
        setIntField(term146112, term146112.getClass(), "threshold", 0);
        setIntField(term146112, term146112.getClass(), "modCount", 0);
        setField(term146112, term146112.getClass(), "entrySet", null);
        setField(term146112, term146112.getClass(), "keySet", null);
        setField(term146112, term146112.getClass(), "values", null);
        setField(term146112, term146112.getClass(), "keySet", null);
        setField(term146112, term146112.getClass(), "values", null);
        setField(term146111, term146111.getClass(), "key1", term146112);
        setFloatField(term146113, term146113.getClass(), "loadFactor", 0.0F);
        setIntField(term146113, term146113.getClass(), "size", 0);
        setField(term146113, term146113.getClass(), "data", null);
        setIntField(term146113, term146113.getClass(), "threshold", 0);
        setIntField(term146113, term146113.getClass(), "modCount", 0);
        setField(term146113, term146113.getClass(), "entrySet", null);
        setField(term146113, term146113.getClass(), "keySet", null);
        setField(term146113, term146113.getClass(), "values", null);
        setField(term146113, term146113.getClass(), "keySet", null);
        setField(term146113, term146113.getClass(), "values", null);
        setField(term146111, term146111.getClass(), "key2", term146113);
        setField(term146111, term146111.getClass(), "key3", null);
        setField(term146111, term146111.getClass(), "value1", null);
        setField(term146111, term146111.getClass(), "value2", null);
        setField(term146111, term146111.getClass(), "value3", null);
        setField(term146111, term146111.getClass(), "delegateMap", null);
        setField(term146109, term146109.getClass(), "key2", term146111);
        setField(term146109, term146109.getClass(), "key3", null);
        setField(term146109, term146109.getClass(), "value1", null);
        setField(term146109, term146109.getClass(), "value2", null);
        setField(term146109, term146109.getClass(), "value3", null);
        setField(term146109, term146109.getClass(), "delegateMap", null);
        term146114 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term146114, term146114.getClass(), "size", 2);
        setIntField(term146114, term146114.getClass(), "hash1", 0);
        setIntField(term146114, term146114.getClass(), "hash2", 0);
        setIntField(term146114, term146114.getClass(), "hash3", 0);
        setField(term146114, term146114.getClass(), "key1", null);
        setField(term146114, term146114.getClass(), "key2", null);
        setField(term146114, term146114.getClass(), "key3", null);
        setField(term146114, term146114.getClass(), "value1", null);
        setField(term146114, term146114.getClass(), "value2", null);
        setField(term146114, term146114.getClass(), "value3", null);
        setField(term146114, term146114.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term146007;
        Object retValue = callMethod(klass, "get", argTypes, term145493, args);
        assertTrue(recursiveEquals(term145493, term146109));
        assertTrue(recursiveEquals(term146007, term146114));
        assertTrue(recursiveEquals(retValue, null));
    }

};
