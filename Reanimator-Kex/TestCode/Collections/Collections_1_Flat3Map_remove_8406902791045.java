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

public class Flat3Map_remove_8406902791045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209094;
     Object term209238;
     Object term209240;

    public Flat3Map_remove_8406902791045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term209094 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term209140 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term209094, term209094.getClass(), "delegateMap", null);
        setIntField(term209094, term209094.getClass(), "size", 2);
        setIntField(term209094, term209094.getClass(), "hash2", 0);
        setField(term209094, term209094.getClass(), "value2", null);
        setIntField(term209094, term209094.getClass(), "hash1", 0);
        setField(term209094, term209094.getClass(), "value1", null);
        setField(term209094, term209094.getClass(), "key2", term209140);
        term209238 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term209239 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term209238, term209238.getClass(), "size", 2);
        setIntField(term209238, term209238.getClass(), "hash1", 0);
        setIntField(term209238, term209238.getClass(), "hash2", 0);
        setIntField(term209238, term209238.getClass(), "hash3", 0);
        setField(term209238, term209238.getClass(), "key1", null);
        setIntField(term209239, term209239.getClass(), "size", 0);
        setIntField(term209239, term209239.getClass(), "hash1", 0);
        setIntField(term209239, term209239.getClass(), "hash2", 0);
        setIntField(term209239, term209239.getClass(), "hash3", 0);
        setField(term209239, term209239.getClass(), "key1", null);
        setField(term209239, term209239.getClass(), "key2", null);
        setField(term209239, term209239.getClass(), "key3", null);
        setField(term209239, term209239.getClass(), "value1", null);
        setField(term209239, term209239.getClass(), "value2", null);
        setField(term209239, term209239.getClass(), "value3", null);
        setField(term209239, term209239.getClass(), "delegateMap", null);
        setField(term209238, term209238.getClass(), "key2", term209239);
        setField(term209238, term209238.getClass(), "key3", null);
        setField(term209238, term209238.getClass(), "value1", null);
        setField(term209238, term209238.getClass(), "value2", null);
        setField(term209238, term209238.getClass(), "value3", null);
        setField(term209238, term209238.getClass(), "delegateMap", null);
        term209240 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term209241 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term209240, term209240.getClass(), "size", 2);
        setIntField(term209240, term209240.getClass(), "hash1", 0);
        setIntField(term209240, term209240.getClass(), "hash2", 0);
        setIntField(term209240, term209240.getClass(), "hash3", 0);
        setField(term209240, term209240.getClass(), "key1", null);
        setIntField(term209241, term209241.getClass(), "size", 0);
        setIntField(term209241, term209241.getClass(), "hash1", 0);
        setIntField(term209241, term209241.getClass(), "hash2", 0);
        setIntField(term209241, term209241.getClass(), "hash3", 0);
        setField(term209241, term209241.getClass(), "key1", null);
        setField(term209241, term209241.getClass(), "key2", null);
        setField(term209241, term209241.getClass(), "key3", null);
        setField(term209241, term209241.getClass(), "value1", null);
        setField(term209241, term209241.getClass(), "value2", null);
        setField(term209241, term209241.getClass(), "value3", null);
        setField(term209241, term209241.getClass(), "delegateMap", null);
        setField(term209240, term209240.getClass(), "key2", term209241);
        setField(term209240, term209240.getClass(), "key3", null);
        setField(term209240, term209240.getClass(), "value1", null);
        setField(term209240, term209240.getClass(), "value2", null);
        setField(term209240, term209240.getClass(), "value3", null);
        setField(term209240, term209240.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term209094;
        Object retValue = callMethod(klass, "remove", argTypes, term209094, args);
        assertTrue(recursiveEquals(term209094, term209238));
        assertTrue(recursiveEquals(term209094, term209240));
        assertTrue(recursiveEquals(retValue, null));
    }

};
