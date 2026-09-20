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

public class Flat3Map_remove_840690279994 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198322;
     Object term198414;
     Object term198796;
     Object term198797;

    public Flat3Map_remove_840690279994() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198322 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term198322, term198322.getClass(), "delegateMap", null);
        setIntField(term198322, term198322.getClass(), "size", 3);
        setIntField(term198322, term198322.getClass(), "hash3", 0);
        setField(term198322, term198322.getClass(), "key3", null);
        setIntField(term198322, term198322.getClass(), "hash2", 0);
        setField(term198322, term198322.getClass(), "key2", null);
        setIntField(term198322, term198322.getClass(), "hash1", 0);
        setField(term198322, term198322.getClass(), "key1", term198322);
        term198414 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term198524 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term198414, term198414.getClass(), "delegateMap", null);
        setIntField(term198414, term198414.getClass(), "size", 3);
        setIntField(term198414, term198414.getClass(), "hash3", 0);
        setIntField(term198524, term198524.getClass(), "size", 0);
        setField(term198414, term198414.getClass(), "value3", term198524);
        setIntField(term198414, term198414.getClass(), "hash2", 0);
        setField(term198414, term198414.getClass(), "value2", null);
        setIntField(term198414, term198414.getClass(), "hash1", 0);
        setField(term198414, term198414.getClass(), "value1", null);
        term198796 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term198796, term198796.getClass(), "size", 3);
        setIntField(term198796, term198796.getClass(), "hash1", 0);
        setIntField(term198796, term198796.getClass(), "hash2", 0);
        setIntField(term198796, term198796.getClass(), "hash3", 0);
        setField(term198796, term198796.getClass(), "key1", term198796);
        setField(term198796, term198796.getClass(), "key2", null);
        setField(term198796, term198796.getClass(), "key3", null);
        setField(term198796, term198796.getClass(), "value1", null);
        setField(term198796, term198796.getClass(), "value2", null);
        setField(term198796, term198796.getClass(), "value3", null);
        setField(term198796, term198796.getClass(), "delegateMap", null);
        term198797 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term198798 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term198797, term198797.getClass(), "size", 3);
        setIntField(term198797, term198797.getClass(), "hash1", 0);
        setIntField(term198797, term198797.getClass(), "hash2", 0);
        setIntField(term198797, term198797.getClass(), "hash3", 0);
        setField(term198797, term198797.getClass(), "key1", null);
        setField(term198797, term198797.getClass(), "key2", null);
        setField(term198797, term198797.getClass(), "key3", null);
        setField(term198797, term198797.getClass(), "value1", null);
        setField(term198797, term198797.getClass(), "value2", null);
        setFloatField(term198798, term198798.getClass(), "loadFactor", 0.0F);
        setIntField(term198798, term198798.getClass(), "size", 0);
        setField(term198798, term198798.getClass(), "data", null);
        setIntField(term198798, term198798.getClass(), "threshold", 0);
        setIntField(term198798, term198798.getClass(), "modCount", 0);
        setField(term198798, term198798.getClass(), "entrySet", null);
        setField(term198798, term198798.getClass(), "keySet", null);
        setField(term198798, term198798.getClass(), "values", null);
        setField(term198798, term198798.getClass(), "keySet", null);
        setField(term198798, term198798.getClass(), "values", null);
        setField(term198797, term198797.getClass(), "value3", term198798);
        setField(term198797, term198797.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term198414;
        Object retValue = callMethod(klass, "remove", argTypes, term198322, args);
        assertTrue(recursiveEquals(term198322, term198796));
        assertTrue(recursiveEquals(term198414, term198797));
        assertTrue(recursiveEquals(retValue, null));
    }

};
