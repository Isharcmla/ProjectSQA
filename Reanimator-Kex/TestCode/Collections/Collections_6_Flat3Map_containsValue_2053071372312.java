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

public class Flat3Map_containsValue_2053071372312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51967;
     Object term52169;
     Object term52604;
     Object term52606;

    public Flat3Map_containsValue_2053071372312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51967 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term52077 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term51967, term51967.getClass(), "delegateMap", null);
        setIntField(term51967, term51967.getClass(), "size", 2);
        setIntField(term52077, term52077.getClass(), "size", -1);
        setField(term51967, term51967.getClass(), "value2", term52077);
        term52169 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term52279 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term52279, term52279.getClass(), "size", 0);
        setField(term52169, term52169.getClass(), "delegateMap", term52279);
        term52604 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term52605 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term52604, term52604.getClass(), "size", 2);
        setIntField(term52604, term52604.getClass(), "hash1", 0);
        setIntField(term52604, term52604.getClass(), "hash2", 0);
        setIntField(term52604, term52604.getClass(), "hash3", 0);
        setField(term52604, term52604.getClass(), "key1", null);
        setField(term52604, term52604.getClass(), "key2", null);
        setField(term52604, term52604.getClass(), "key3", null);
        setField(term52604, term52604.getClass(), "value1", null);
        setFloatField(term52605, term52605.getClass(), "loadFactor", 0.0F);
        setIntField(term52605, term52605.getClass(), "size", -1);
        setField(term52605, term52605.getClass(), "data", null);
        setIntField(term52605, term52605.getClass(), "threshold", 0);
        setIntField(term52605, term52605.getClass(), "modCount", 0);
        setField(term52605, term52605.getClass(), "entrySet", null);
        setField(term52605, term52605.getClass(), "keySet", null);
        setField(term52605, term52605.getClass(), "values", null);
        setField(term52605, term52605.getClass(), "keySet", null);
        setField(term52605, term52605.getClass(), "values", null);
        setField(term52604, term52604.getClass(), "value2", term52605);
        setField(term52604, term52604.getClass(), "value3", null);
        setField(term52604, term52604.getClass(), "delegateMap", null);
        term52606 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term52607 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term52606, term52606.getClass(), "size", 0);
        setIntField(term52606, term52606.getClass(), "hash1", 0);
        setIntField(term52606, term52606.getClass(), "hash2", 0);
        setIntField(term52606, term52606.getClass(), "hash3", 0);
        setField(term52606, term52606.getClass(), "key1", null);
        setField(term52606, term52606.getClass(), "key2", null);
        setField(term52606, term52606.getClass(), "key3", null);
        setField(term52606, term52606.getClass(), "value1", null);
        setField(term52606, term52606.getClass(), "value2", null);
        setField(term52606, term52606.getClass(), "value3", null);
        setFloatField(term52607, term52607.getClass(), "loadFactor", 0.0F);
        setIntField(term52607, term52607.getClass(), "size", 0);
        setField(term52607, term52607.getClass(), "data", null);
        setIntField(term52607, term52607.getClass(), "threshold", 0);
        setIntField(term52607, term52607.getClass(), "modCount", 0);
        setField(term52607, term52607.getClass(), "entrySet", null);
        setField(term52607, term52607.getClass(), "keySet", null);
        setField(term52607, term52607.getClass(), "values", null);
        setField(term52607, term52607.getClass(), "keySet", null);
        setField(term52607, term52607.getClass(), "values", null);
        setField(term52606, term52606.getClass(), "delegateMap", term52607);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term52169;
        callMethod(klass, "containsValue", argTypes, term51967, args);
        assertTrue(recursiveEquals(term51967, term52604));
        assertTrue(recursiveEquals(term52169, term52606));
    }

};


