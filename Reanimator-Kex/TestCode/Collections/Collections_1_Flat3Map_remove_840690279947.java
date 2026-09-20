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

public class Flat3Map_remove_840690279947 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189665;
     Object term189794;
     Object term189795;
     Object term189789;

    public Flat3Map_remove_840690279947() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term189665 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term189720 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term189665, term189665.getClass(), "delegateMap", null);
        setIntField(term189665, term189665.getClass(), "size", 3);
        setIntField(term189665, term189665.getClass(), "hash3", 0);
        setIntField(term189720, term189720.getClass(), "size", 0);
        setField(term189665, term189665.getClass(), "value3", term189720);
        setIntField(term189665, term189665.getClass(), "hash2", 0);
        setField(term189665, term189665.getClass(), "value2", null);
        setIntField(term189665, term189665.getClass(), "hash1", 0);
        setField(term189665, term189665.getClass(), "value1", null);
        setField(term189665, term189665.getClass(), "key3", term189665);
        term189794 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term189794, term189794.getClass(), "size", 2);
        setIntField(term189794, term189794.getClass(), "hash1", 0);
        setIntField(term189794, term189794.getClass(), "hash2", 0);
        setIntField(term189794, term189794.getClass(), "hash3", 0);
        setField(term189794, term189794.getClass(), "key1", null);
        setField(term189794, term189794.getClass(), "key2", null);
        setField(term189794, term189794.getClass(), "key3", null);
        setField(term189794, term189794.getClass(), "value1", null);
        setField(term189794, term189794.getClass(), "value2", null);
        setField(term189794, term189794.getClass(), "value3", null);
        setField(term189794, term189794.getClass(), "delegateMap", null);
        term189795 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term189795, term189795.getClass(), "size", 2);
        setIntField(term189795, term189795.getClass(), "hash1", 0);
        setIntField(term189795, term189795.getClass(), "hash2", 0);
        setIntField(term189795, term189795.getClass(), "hash3", 0);
        setField(term189795, term189795.getClass(), "key1", null);
        setField(term189795, term189795.getClass(), "key2", null);
        setField(term189795, term189795.getClass(), "key3", null);
        setField(term189795, term189795.getClass(), "value1", null);
        setField(term189795, term189795.getClass(), "value2", null);
        setField(term189795, term189795.getClass(), "value3", null);
        setField(term189795, term189795.getClass(), "delegateMap", null);
        term189789 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setFloatField(term189789, term189789.getClass(), "loadFactor", 0.0F);
        setIntField(term189789, term189789.getClass(), "size", 0);
        setField(term189789, term189789.getClass(), "data", null);
        setIntField(term189789, term189789.getClass(), "threshold", 0);
        setIntField(term189789, term189789.getClass(), "modCount", 0);
        setField(term189789, term189789.getClass(), "entrySet", null);
        setField(term189789, term189789.getClass(), "keySet", null);
        setField(term189789, term189789.getClass(), "values", null);
        setField(term189789, term189789.getClass(), "keySet", null);
        setField(term189789, term189789.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term189665;
        Object retValue = callMethod(klass, "remove", argTypes, term189665, args);
        assertTrue(recursiveEquals(term189665, term189794));
        assertTrue(recursiveEquals(term189665, term189795));
        assertTrue(recursiveEquals(retValue, term189789));
    }

};
