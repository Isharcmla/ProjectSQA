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

public class Flat3Map_containsKey_76092510395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72946;
     Object term73007;
     Object term73009;

    public Flat3Map_containsKey_76092510395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72946 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term72992 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term72946, term72946.getClass(), "delegateMap", null);
        setIntField(term72946, term72946.getClass(), "size", 0);
        setIntField(term72946, term72946.getClass(), "hash1", 0);
        setField(term72946, term72946.getClass(), "key1", term72992);
        term73007 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term73008 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term73007, term73007.getClass(), "size", 0);
        setIntField(term73007, term73007.getClass(), "hash1", 0);
        setIntField(term73007, term73007.getClass(), "hash2", 0);
        setIntField(term73007, term73007.getClass(), "hash3", 0);
        setIntField(term73008, term73008.getClass(), "size", 0);
        setIntField(term73008, term73008.getClass(), "hash1", 0);
        setIntField(term73008, term73008.getClass(), "hash2", 0);
        setIntField(term73008, term73008.getClass(), "hash3", 0);
        setField(term73008, term73008.getClass(), "key1", null);
        setField(term73008, term73008.getClass(), "key2", null);
        setField(term73008, term73008.getClass(), "key3", null);
        setField(term73008, term73008.getClass(), "value1", null);
        setField(term73008, term73008.getClass(), "value2", null);
        setField(term73008, term73008.getClass(), "value3", null);
        setField(term73008, term73008.getClass(), "delegateMap", null);
        setField(term73007, term73007.getClass(), "key1", term73008);
        setField(term73007, term73007.getClass(), "key2", null);
        setField(term73007, term73007.getClass(), "key3", null);
        setField(term73007, term73007.getClass(), "value1", null);
        setField(term73007, term73007.getClass(), "value2", null);
        setField(term73007, term73007.getClass(), "value3", null);
        setField(term73007, term73007.getClass(), "delegateMap", null);
        term73009 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term73010 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term73009, term73009.getClass(), "size", 0);
        setIntField(term73009, term73009.getClass(), "hash1", 0);
        setIntField(term73009, term73009.getClass(), "hash2", 0);
        setIntField(term73009, term73009.getClass(), "hash3", 0);
        setIntField(term73010, term73010.getClass(), "size", 0);
        setIntField(term73010, term73010.getClass(), "hash1", 0);
        setIntField(term73010, term73010.getClass(), "hash2", 0);
        setIntField(term73010, term73010.getClass(), "hash3", 0);
        setField(term73010, term73010.getClass(), "key1", null);
        setField(term73010, term73010.getClass(), "key2", null);
        setField(term73010, term73010.getClass(), "key3", null);
        setField(term73010, term73010.getClass(), "value1", null);
        setField(term73010, term73010.getClass(), "value2", null);
        setField(term73010, term73010.getClass(), "value3", null);
        setField(term73010, term73010.getClass(), "delegateMap", null);
        setField(term73009, term73009.getClass(), "key1", term73010);
        setField(term73009, term73009.getClass(), "key2", null);
        setField(term73009, term73009.getClass(), "key3", null);
        setField(term73009, term73009.getClass(), "value1", null);
        setField(term73009, term73009.getClass(), "value2", null);
        setField(term73009, term73009.getClass(), "value3", null);
        setField(term73009, term73009.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term72946;
        callMethod(klass, "containsKey", argTypes, term72946, args);
        assertTrue(recursiveEquals(term72946, term73007));
        assertTrue(recursiveEquals(term72946, term73009));
    }

};
