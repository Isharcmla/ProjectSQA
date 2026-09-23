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

public class Flat3Map_put_1944740725503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94241;
     Object term94517;
     Object term94910;
     Object term94913;

    public Flat3Map_put_1944740725503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94241 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term94333 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term94425 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term94241, term94241.getClass(), "delegateMap", null);
        setIntField(term94241, term94241.getClass(), "size", 3);
        setIntField(term94241, term94241.getClass(), "hash3", 0);
        setField(term94333, term94333.getClass(), "delegateMap", null);
        setIntField(term94333, term94333.getClass(), "size", 3);
        setField(term94425, term94425.getClass(), "delegateMap", null);
        setIntField(term94425, term94425.getClass(), "size", 0);
        setField(term94333, term94333.getClass(), "key3", term94425);
        setField(term94333, term94333.getClass(), "key2", null);
        setField(term94333, term94333.getClass(), "value2", null);
        setIntField(term94333, term94333.getClass(), "hash3", 0);
        setField(term94333, term94333.getClass(), "value3", null);
        setField(term94241, term94241.getClass(), "key3", term94333);
        term94517 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term94609 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term94701 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term94517, term94517.getClass(), "delegateMap", null);
        setIntField(term94517, term94517.getClass(), "size", 3);
        setIntField(term94517, term94517.getClass(), "hash3", 0);
        setField(term94517, term94517.getClass(), "value3", null);
        setIntField(term94517, term94517.getClass(), "hash2", 0);
        setField(term94517, term94517.getClass(), "value2", null);
        setIntField(term94517, term94517.getClass(), "hash1", 0);
        setField(term94517, term94517.getClass(), "value1", null);
        setField(term94517, term94517.getClass(), "key3", null);
        setField(term94609, term94609.getClass(), "delegateMap", null);
        setIntField(term94609, term94609.getClass(), "size", 0);
        setField(term94517, term94517.getClass(), "key2", term94609);
        setField(term94517, term94517.getClass(), "key1", term94701);
        term94910 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term94911 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term94912 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term94910, term94910.getClass(), "size", 3);
        setIntField(term94910, term94910.getClass(), "hash1", 0);
        setIntField(term94910, term94910.getClass(), "hash2", 0);
        setIntField(term94910, term94910.getClass(), "hash3", 0);
        setField(term94910, term94910.getClass(), "key1", null);
        setField(term94910, term94910.getClass(), "key2", null);
        setIntField(term94911, term94911.getClass(), "size", 3);
        setIntField(term94911, term94911.getClass(), "hash1", 0);
        setIntField(term94911, term94911.getClass(), "hash2", 0);
        setIntField(term94911, term94911.getClass(), "hash3", 0);
        setField(term94911, term94911.getClass(), "key1", null);
        setField(term94911, term94911.getClass(), "key2", null);
        setIntField(term94912, term94912.getClass(), "size", 0);
        setIntField(term94912, term94912.getClass(), "hash1", 0);
        setIntField(term94912, term94912.getClass(), "hash2", 0);
        setIntField(term94912, term94912.getClass(), "hash3", 0);
        setField(term94912, term94912.getClass(), "key1", null);
        setField(term94912, term94912.getClass(), "key2", null);
        setField(term94912, term94912.getClass(), "key3", null);
        setField(term94912, term94912.getClass(), "value1", null);
        setField(term94912, term94912.getClass(), "value2", null);
        setField(term94912, term94912.getClass(), "value3", null);
        setField(term94912, term94912.getClass(), "delegateMap", null);
        setField(term94911, term94911.getClass(), "key3", term94912);
        setField(term94911, term94911.getClass(), "value1", null);
        setField(term94911, term94911.getClass(), "value2", null);
        setField(term94911, term94911.getClass(), "value3", null);
        setField(term94911, term94911.getClass(), "delegateMap", null);
        setField(term94910, term94910.getClass(), "key3", term94911);
        setField(term94910, term94910.getClass(), "value1", null);
        setField(term94910, term94910.getClass(), "value2", null);
        setField(term94910, term94910.getClass(), "value3", null);
        setField(term94910, term94910.getClass(), "delegateMap", null);
        term94913 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term94914 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term94915 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term94913, term94913.getClass(), "size", 3);
        setIntField(term94913, term94913.getClass(), "hash1", 0);
        setIntField(term94913, term94913.getClass(), "hash2", 0);
        setIntField(term94913, term94913.getClass(), "hash3", 0);
        setIntField(term94914, term94914.getClass(), "size", 0);
        setIntField(term94914, term94914.getClass(), "hash1", 0);
        setIntField(term94914, term94914.getClass(), "hash2", 0);
        setIntField(term94914, term94914.getClass(), "hash3", 0);
        setField(term94914, term94914.getClass(), "key1", null);
        setField(term94914, term94914.getClass(), "key2", null);
        setField(term94914, term94914.getClass(), "key3", null);
        setField(term94914, term94914.getClass(), "value1", null);
        setField(term94914, term94914.getClass(), "value2", null);
        setField(term94914, term94914.getClass(), "value3", null);
        setField(term94914, term94914.getClass(), "delegateMap", null);
        setField(term94913, term94913.getClass(), "key1", term94914);
        setIntField(term94915, term94915.getClass(), "size", 0);
        setIntField(term94915, term94915.getClass(), "hash1", 0);
        setIntField(term94915, term94915.getClass(), "hash2", 0);
        setIntField(term94915, term94915.getClass(), "hash3", 0);
        setField(term94915, term94915.getClass(), "key1", null);
        setField(term94915, term94915.getClass(), "key2", null);
        setField(term94915, term94915.getClass(), "key3", null);
        setField(term94915, term94915.getClass(), "value1", null);
        setField(term94915, term94915.getClass(), "value2", null);
        setField(term94915, term94915.getClass(), "value3", null);
        setField(term94915, term94915.getClass(), "delegateMap", null);
        setField(term94913, term94913.getClass(), "key2", term94915);
        setField(term94913, term94913.getClass(), "key3", null);
        setField(term94913, term94913.getClass(), "value1", null);
        setField(term94913, term94913.getClass(), "value2", null);
        setField(term94913, term94913.getClass(), "value3", null);
        setField(term94913, term94913.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term94517;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term94241, args);
        assertTrue(recursiveEquals(term94241, term94910));
        assertTrue(recursiveEquals(term94517, term94913));
        assertTrue(recursiveEquals(retValue, null));
    }

};


