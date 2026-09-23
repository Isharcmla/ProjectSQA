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

public class Flat3Map_put_19447407251074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term312144;
     Object term312438;
     Object term313225;
     Object term313234;

    public Flat3Map_put_19447407251074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term312144 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term312236 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term312346 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term312144, term312144.getClass(), "delegateMap", null);
        setIntField(term312144, term312144.getClass(), "size", 3);
        setIntField(term312144, term312144.getClass(), "hash3", 0);
        setField(term312236, term312236.getClass(), "delegateMap", null);
        setIntField(term312236, term312236.getClass(), "size", 3);
        setField(term312236, term312236.getClass(), "key3", term312346);
        setField(term312236, term312236.getClass(), "key2", null);
        setField(term312236, term312236.getClass(), "value2", null);
        setIntField(term312236, term312236.getClass(), "hash3", -1);
        setIntField(term312236, term312236.getClass(), "hash2", -1);
        setIntField(term312236, term312236.getClass(), "hash1", 0);
        setField(term312144, term312144.getClass(), "key3", term312236);
        term312438 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term312530 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term312438, term312438.getClass(), "delegateMap", null);
        setIntField(term312438, term312438.getClass(), "size", 3);
        setIntField(term312438, term312438.getClass(), "hash3", 0);
        setField(term312438, term312438.getClass(), "value3", null);
        setIntField(term312438, term312438.getClass(), "hash2", 0);
        setField(term312438, term312438.getClass(), "value2", null);
        setIntField(term312438, term312438.getClass(), "hash1", 0);
        setField(term312438, term312438.getClass(), "value1", null);
        setField(term312438, term312438.getClass(), "key3", null);
        setField(term312530, term312530.getClass(), "delegateMap", null);
        setIntField(term312530, term312530.getClass(), "size", 2);
        setIntField(term312530, term312530.getClass(), "hash2", 0);
        setField(term312530, term312530.getClass(), "value2", null);
        setIntField(term312530, term312530.getClass(), "hash1", 0);
        setField(term312530, term312530.getClass(), "value1", null);
        setField(term312438, term312438.getClass(), "key2", term312530);
        term313225 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term313226 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term313227 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term313228 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term313229 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term313230 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term313231 = newInstance(Class.forName("java.lang.Object"));
        Object term313232 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term313233 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term313225, term313225.getClass(), "size", 0);
        setIntField(term313225, term313225.getClass(), "hash1", 0);
        setIntField(term313225, term313225.getClass(), "hash2", 0);
        setIntField(term313225, term313225.getClass(), "hash3", 0);
        setField(term313225, term313225.getClass(), "key1", null);
        setField(term313225, term313225.getClass(), "key2", null);
        setField(term313225, term313225.getClass(), "key3", null);
        setField(term313225, term313225.getClass(), "value1", null);
        setField(term313225, term313225.getClass(), "value2", null);
        setField(term313225, term313225.getClass(), "value3", null);
        setFloatField(term313226, term313226.getClass(), "loadFactor", 0.75F);
        setIntField(term313226, term313226.getClass(), "size", 3);
        setField(term313228, term313228.getClass(), "next", null);
        setIntField(term313229, term313229.getClass(), "size", 3);
        setIntField(term313229, term313229.getClass(), "hash1", 0);
        setIntField(term313229, term313229.getClass(), "hash2", 0);
        setIntField(term313229, term313229.getClass(), "hash3", 0);
        setField(term313229, term313229.getClass(), "key1", null);
        setField(term313229, term313229.getClass(), "key2", null);
        setField(term313229, term313229.getClass(), "key3", null);
        setField(term313229, term313229.getClass(), "value1", null);
        setField(term313229, term313229.getClass(), "value2", null);
        setField(term313229, term313229.getClass(), "value3", null);
        setField(term313229, term313229.getClass(), "delegateMap", null);
        setField(term313228, term313228.getClass(), "key", term313229);
        setField(term313228, term313228.getClass(), "value", null);
        setElement(term313227, 0, term313228);
        setField(term313230, term313230.getClass(), "next", null);
        setField(term313230, term313230.getClass(), "key", term313231);
        setField(term313230, term313230.getClass(), "value", null);
        setElement(term313227, 6, term313230);
        setField(term313232, term313232.getClass(), "next", null);
        setIntField(term313233, term313233.getClass(), "size", 3);
        setIntField(term313233, term313233.getClass(), "hash1", 0);
        setIntField(term313233, term313233.getClass(), "hash2", -1);
        setIntField(term313233, term313233.getClass(), "hash3", -1);
        setField(term313233, term313233.getClass(), "key1", null);
        setField(term313233, term313233.getClass(), "key2", null);
        setField(term313233, term313233.getClass(), "key3", null);
        setField(term313233, term313233.getClass(), "value1", null);
        setField(term313233, term313233.getClass(), "value2", null);
        setField(term313233, term313233.getClass(), "value3", null);
        setField(term313233, term313233.getClass(), "delegateMap", null);
        setField(term313232, term313232.getClass(), "key", term313233);
        setField(term313232, term313232.getClass(), "value", null);
        setElement(term313227, 13, term313232);
        setField(term313226, term313226.getClass(), "data", term313227);
        setIntField(term313226, term313226.getClass(), "threshold", 12);
        setIntField(term313226, term313226.getClass(), "modCount", 3);
        setField(term313226, term313226.getClass(), "entrySet", null);
        setField(term313226, term313226.getClass(), "keySet", null);
        setField(term313226, term313226.getClass(), "values", null);
        setField(term313226, term313226.getClass(), "keySet", null);
        setField(term313226, term313226.getClass(), "values", null);
        setField(term313225, term313225.getClass(), "delegateMap", term313226);
        term313234 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term313234, term313234.getClass(), "size", 3);
        setIntField(term313234, term313234.getClass(), "hash1", 0);
        setIntField(term313234, term313234.getClass(), "hash2", 0);
        setIntField(term313234, term313234.getClass(), "hash3", 0);
        setField(term313234, term313234.getClass(), "key1", null);
        setField(term313234, term313234.getClass(), "key2", null);
        setField(term313234, term313234.getClass(), "key3", null);
        setField(term313234, term313234.getClass(), "value1", null);
        setField(term313234, term313234.getClass(), "value2", null);
        setField(term313234, term313234.getClass(), "value3", null);
        setField(term313234, term313234.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term312438;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term312144, args);
        assertTrue(recursiveEquals(term312144, term313225));
        assertTrue(recursiveEquals(term312438, term313234));
        assertTrue(recursiveEquals(retValue, null));
    }

};


