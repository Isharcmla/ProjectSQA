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

public class Flat3Map_put_1944740725893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234972;
     Object term235266;
     Object term237075;

    public Flat3Map_put_1944740725893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term234972 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term235064 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term235174 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term234972, term234972.getClass(), "delegateMap", null);
        setIntField(term234972, term234972.getClass(), "size", 3);
        setIntField(term234972, term234972.getClass(), "hash3", 0);
        setField(term235064, term235064.getClass(), "delegateMap", null);
        setIntField(term235064, term235064.getClass(), "size", 3);
        setField(term235064, term235064.getClass(), "key3", term235174);
        setField(term235064, term235064.getClass(), "key2", null);
        setField(term235064, term235064.getClass(), "value2", null);
        setIntField(term235064, term235064.getClass(), "hash3", -1);
        setIntField(term235064, term235064.getClass(), "hash2", 0);
        setIntField(term235064, term235064.getClass(), "hash1", -1);
        setField(term234972, term234972.getClass(), "key3", term235064);
        term235266 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term235358 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term235266, term235266.getClass(), "delegateMap", null);
        setIntField(term235266, term235266.getClass(), "size", 3);
        setIntField(term235266, term235266.getClass(), "hash3", 0);
        setField(term235266, term235266.getClass(), "value3", null);
        setIntField(term235266, term235266.getClass(), "hash2", 0);
        setField(term235266, term235266.getClass(), "value2", null);
        setIntField(term235266, term235266.getClass(), "hash1", 0);
        setField(term235266, term235266.getClass(), "value1", null);
        setField(term235266, term235266.getClass(), "key3", null);
        setField(term235358, term235358.getClass(), "delegateMap", null);
        setIntField(term235358, term235358.getClass(), "size", 0);
        setField(term235266, term235266.getClass(), "key2", term235358);
        term237075 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term237075, term237075.getClass(), "size", 3);
        setIntField(term237075, term237075.getClass(), "hash1", 0);
        setIntField(term237075, term237075.getClass(), "hash2", 0);
        setIntField(term237075, term237075.getClass(), "hash3", 0);
        setField(term237075, term237075.getClass(), "key1", null);
        setField(term237075, term237075.getClass(), "key2", null);
        setField(term237075, term237075.getClass(), "key3", null);
        setField(term237075, term237075.getClass(), "value1", null);
        setField(term237075, term237075.getClass(), "value2", null);
        setField(term237075, term237075.getClass(), "value3", null);
        setField(term237075, term237075.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term235266;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term234972, args);
        assertTrue(recursiveEquals(term235266, term237075));
        assertTrue(recursiveEquals(retValue, null));
    }

};


