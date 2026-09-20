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

public class Flat3Map_get_229621781593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113327;
     Object term113731;
     Object term113890;
     Object term113894;

    public Flat3Map_get_229621781593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113327 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term113419 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term113529 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term113639 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term113327, term113327.getClass(), "delegateMap", null);
        setIntField(term113327, term113327.getClass(), "size", 2);
        setIntField(term113327, term113327.getClass(), "hash2", 0);
        setField(term113327, term113327.getClass(), "key2", null);
        setIntField(term113327, term113327.getClass(), "hash1", 0);
        setField(term113419, term113419.getClass(), "delegateMap", null);
        setIntField(term113419, term113419.getClass(), "size", 2);
        setField(term113419, term113419.getClass(), "key2", term113529);
        setField(term113419, term113419.getClass(), "key1", term113639);
        setField(term113327, term113327.getClass(), "key1", term113419);
        term113731 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term113731, term113731.getClass(), "delegateMap", null);
        setIntField(term113731, term113731.getClass(), "size", 2);
        setIntField(term113731, term113731.getClass(), "hash2", 0);
        setField(term113731, term113731.getClass(), "value2", null);
        setIntField(term113731, term113731.getClass(), "hash1", 0);
        setField(term113731, term113731.getClass(), "value1", null);
        setField(term113731, term113731.getClass(), "key2", null);
        term113890 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term113891 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term113892 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term113893 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term113890, term113890.getClass(), "size", 2);
        setIntField(term113890, term113890.getClass(), "hash1", 0);
        setIntField(term113890, term113890.getClass(), "hash2", 0);
        setIntField(term113890, term113890.getClass(), "hash3", 0);
        setIntField(term113891, term113891.getClass(), "size", 2);
        setIntField(term113891, term113891.getClass(), "hash1", 0);
        setIntField(term113891, term113891.getClass(), "hash2", 0);
        setIntField(term113891, term113891.getClass(), "hash3", 0);
        setFloatField(term113892, term113892.getClass(), "loadFactor", 0.0F);
        setIntField(term113892, term113892.getClass(), "size", 0);
        setField(term113892, term113892.getClass(), "data", null);
        setIntField(term113892, term113892.getClass(), "threshold", 0);
        setIntField(term113892, term113892.getClass(), "modCount", 0);
        setField(term113892, term113892.getClass(), "entrySet", null);
        setField(term113892, term113892.getClass(), "keySet", null);
        setField(term113892, term113892.getClass(), "values", null);
        setField(term113892, term113892.getClass(), "keySet", null);
        setField(term113892, term113892.getClass(), "values", null);
        setField(term113891, term113891.getClass(), "key1", term113892);
        setFloatField(term113893, term113893.getClass(), "loadFactor", 0.0F);
        setIntField(term113893, term113893.getClass(), "size", 0);
        setField(term113893, term113893.getClass(), "data", null);
        setIntField(term113893, term113893.getClass(), "threshold", 0);
        setIntField(term113893, term113893.getClass(), "modCount", 0);
        setField(term113893, term113893.getClass(), "entrySet", null);
        setField(term113893, term113893.getClass(), "keySet", null);
        setField(term113893, term113893.getClass(), "values", null);
        setField(term113893, term113893.getClass(), "keySet", null);
        setField(term113893, term113893.getClass(), "values", null);
        setField(term113891, term113891.getClass(), "key2", term113893);
        setField(term113891, term113891.getClass(), "key3", null);
        setField(term113891, term113891.getClass(), "value1", null);
        setField(term113891, term113891.getClass(), "value2", null);
        setField(term113891, term113891.getClass(), "value3", null);
        setField(term113891, term113891.getClass(), "delegateMap", null);
        setField(term113890, term113890.getClass(), "key1", term113891);
        setField(term113890, term113890.getClass(), "key2", null);
        setField(term113890, term113890.getClass(), "key3", null);
        setField(term113890, term113890.getClass(), "value1", null);
        setField(term113890, term113890.getClass(), "value2", null);
        setField(term113890, term113890.getClass(), "value3", null);
        setField(term113890, term113890.getClass(), "delegateMap", null);
        term113894 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term113894, term113894.getClass(), "size", 2);
        setIntField(term113894, term113894.getClass(), "hash1", 0);
        setIntField(term113894, term113894.getClass(), "hash2", 0);
        setIntField(term113894, term113894.getClass(), "hash3", 0);
        setField(term113894, term113894.getClass(), "key1", null);
        setField(term113894, term113894.getClass(), "key2", null);
        setField(term113894, term113894.getClass(), "key3", null);
        setField(term113894, term113894.getClass(), "value1", null);
        setField(term113894, term113894.getClass(), "value2", null);
        setField(term113894, term113894.getClass(), "value3", null);
        setField(term113894, term113894.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term113731;
        Object retValue = callMethod(klass, "get", argTypes, term113327, args);
        assertTrue(recursiveEquals(term113327, term113890));
        assertTrue(recursiveEquals(term113731, term113894));
        assertTrue(recursiveEquals(retValue, null));
    }

};
