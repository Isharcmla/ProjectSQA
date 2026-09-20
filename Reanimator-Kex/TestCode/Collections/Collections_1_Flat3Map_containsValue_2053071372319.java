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

public class Flat3Map_containsValue_2053071372319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57269;
     Object term57471;
     Object term57726;
     Object term57728;

    public Flat3Map_containsValue_2053071372319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57269 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term57379 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term57269, term57269.getClass(), "delegateMap", null);
        setIntField(term57269, term57269.getClass(), "size", 2);
        setField(term57269, term57269.getClass(), "value2", term57379);
        term57471 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term57581 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term57471, term57471.getClass(), "delegateMap", term57581);
        term57726 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term57727 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term57726, term57726.getClass(), "size", 2);
        setIntField(term57726, term57726.getClass(), "hash1", 0);
        setIntField(term57726, term57726.getClass(), "hash2", 0);
        setIntField(term57726, term57726.getClass(), "hash3", 0);
        setField(term57726, term57726.getClass(), "key1", null);
        setField(term57726, term57726.getClass(), "key2", null);
        setField(term57726, term57726.getClass(), "key3", null);
        setField(term57726, term57726.getClass(), "value1", null);
        setFloatField(term57727, term57727.getClass(), "loadFactor", 0.0F);
        setIntField(term57727, term57727.getClass(), "size", 0);
        setField(term57727, term57727.getClass(), "data", null);
        setIntField(term57727, term57727.getClass(), "threshold", 0);
        setIntField(term57727, term57727.getClass(), "modCount", 0);
        setField(term57727, term57727.getClass(), "entrySet", null);
        setField(term57727, term57727.getClass(), "keySet", null);
        setField(term57727, term57727.getClass(), "values", null);
        setField(term57727, term57727.getClass(), "keySet", null);
        setField(term57727, term57727.getClass(), "values", null);
        setField(term57726, term57726.getClass(), "value2", term57727);
        setField(term57726, term57726.getClass(), "value3", null);
        setField(term57726, term57726.getClass(), "delegateMap", null);
        term57728 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term57729 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term57728, term57728.getClass(), "size", 0);
        setIntField(term57728, term57728.getClass(), "hash1", 0);
        setIntField(term57728, term57728.getClass(), "hash2", 0);
        setIntField(term57728, term57728.getClass(), "hash3", 0);
        setField(term57728, term57728.getClass(), "key1", null);
        setField(term57728, term57728.getClass(), "key2", null);
        setField(term57728, term57728.getClass(), "key3", null);
        setField(term57728, term57728.getClass(), "value1", null);
        setField(term57728, term57728.getClass(), "value2", null);
        setField(term57728, term57728.getClass(), "value3", null);
        setFloatField(term57729, term57729.getClass(), "loadFactor", 0.0F);
        setIntField(term57729, term57729.getClass(), "size", 0);
        setField(term57729, term57729.getClass(), "data", null);
        setIntField(term57729, term57729.getClass(), "threshold", 0);
        setIntField(term57729, term57729.getClass(), "modCount", 0);
        setField(term57729, term57729.getClass(), "entrySet", null);
        setField(term57729, term57729.getClass(), "keySet", null);
        setField(term57729, term57729.getClass(), "values", null);
        setField(term57729, term57729.getClass(), "keySet", null);
        setField(term57729, term57729.getClass(), "values", null);
        setField(term57728, term57728.getClass(), "delegateMap", term57729);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term57471;
        callMethod(klass, "containsValue", argTypes, term57269, args);
        assertTrue(recursiveEquals(term57269, term57726));
        assertTrue(recursiveEquals(term57471, term57728));
    }

};
