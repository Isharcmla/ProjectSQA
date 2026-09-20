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

public class Flat3Map_containsValue_205307137269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15181;
     Object term15198;

    public Flat3Map_containsValue_205307137269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15181 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term15181, term15181.getClass(), "delegateMap", null);
        term15198 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term15198, term15198.getClass(), "size", 0);
        setIntField(term15198, term15198.getClass(), "hash1", 0);
        setIntField(term15198, term15198.getClass(), "hash2", 0);
        setIntField(term15198, term15198.getClass(), "hash3", 0);
        setField(term15198, term15198.getClass(), "key1", null);
        setField(term15198, term15198.getClass(), "key2", null);
        setField(term15198, term15198.getClass(), "key3", null);
        setField(term15198, term15198.getClass(), "value1", null);
        setField(term15198, term15198.getClass(), "value2", null);
        setField(term15198, term15198.getClass(), "value3", null);
        setField(term15198, term15198.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "containsValue", argTypes, term15181, args);
        assertTrue(recursiveEquals(term15181, term15198));
    }

};
