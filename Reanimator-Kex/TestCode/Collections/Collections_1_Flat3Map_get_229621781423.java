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

public class Flat3Map_get_229621781423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77980;
     Object term78152;
     Object term78155;

    public Flat3Map_get_229621781423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77980 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term78026 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term78081 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term77980, term77980.getClass(), "delegateMap", null);
        setIntField(term77980, term77980.getClass(), "size", 3);
        setIntField(term77980, term77980.getClass(), "hash3", 0);
        setField(term77980, term77980.getClass(), "value3", null);
        setIntField(term77980, term77980.getClass(), "hash2", 0);
        setField(term77980, term77980.getClass(), "value2", null);
        setIntField(term77980, term77980.getClass(), "hash1", 0);
        setField(term77980, term77980.getClass(), "value1", null);
        setField(term78026, term78026.getClass(), "delegateMap", term78081);
        setField(term77980, term77980.getClass(), "key3", term78026);
        term78152 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term78153 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term78154 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term78152, term78152.getClass(), "size", 3);
        setIntField(term78152, term78152.getClass(), "hash1", 0);
        setIntField(term78152, term78152.getClass(), "hash2", 0);
        setIntField(term78152, term78152.getClass(), "hash3", 0);
        setField(term78152, term78152.getClass(), "key1", null);
        setField(term78152, term78152.getClass(), "key2", null);
        setIntField(term78153, term78153.getClass(), "size", 0);
        setIntField(term78153, term78153.getClass(), "hash1", 0);
        setIntField(term78153, term78153.getClass(), "hash2", 0);
        setIntField(term78153, term78153.getClass(), "hash3", 0);
        setField(term78153, term78153.getClass(), "key1", null);
        setField(term78153, term78153.getClass(), "key2", null);
        setField(term78153, term78153.getClass(), "key3", null);
        setField(term78153, term78153.getClass(), "value1", null);
        setField(term78153, term78153.getClass(), "value2", null);
        setField(term78153, term78153.getClass(), "value3", null);
        setFloatField(term78154, term78154.getClass(), "loadFactor", 0.0F);
        setIntField(term78154, term78154.getClass(), "size", 0);
        setField(term78154, term78154.getClass(), "data", null);
        setIntField(term78154, term78154.getClass(), "threshold", 0);
        setIntField(term78154, term78154.getClass(), "modCount", 0);
        setField(term78154, term78154.getClass(), "entrySet", null);
        setField(term78154, term78154.getClass(), "keySet", null);
        setField(term78154, term78154.getClass(), "values", null);
        setField(term78154, term78154.getClass(), "keySet", null);
        setField(term78154, term78154.getClass(), "values", null);
        setField(term78153, term78153.getClass(), "delegateMap", term78154);
        setField(term78152, term78152.getClass(), "key3", term78153);
        setField(term78152, term78152.getClass(), "value1", null);
        setField(term78152, term78152.getClass(), "value2", null);
        setField(term78152, term78152.getClass(), "value3", null);
        setField(term78152, term78152.getClass(), "delegateMap", null);
        term78155 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term78156 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term78157 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term78155, term78155.getClass(), "size", 3);
        setIntField(term78155, term78155.getClass(), "hash1", 0);
        setIntField(term78155, term78155.getClass(), "hash2", 0);
        setIntField(term78155, term78155.getClass(), "hash3", 0);
        setField(term78155, term78155.getClass(), "key1", null);
        setField(term78155, term78155.getClass(), "key2", null);
        setIntField(term78156, term78156.getClass(), "size", 0);
        setIntField(term78156, term78156.getClass(), "hash1", 0);
        setIntField(term78156, term78156.getClass(), "hash2", 0);
        setIntField(term78156, term78156.getClass(), "hash3", 0);
        setField(term78156, term78156.getClass(), "key1", null);
        setField(term78156, term78156.getClass(), "key2", null);
        setField(term78156, term78156.getClass(), "key3", null);
        setField(term78156, term78156.getClass(), "value1", null);
        setField(term78156, term78156.getClass(), "value2", null);
        setField(term78156, term78156.getClass(), "value3", null);
        setFloatField(term78157, term78157.getClass(), "loadFactor", 0.0F);
        setIntField(term78157, term78157.getClass(), "size", 0);
        setField(term78157, term78157.getClass(), "data", null);
        setIntField(term78157, term78157.getClass(), "threshold", 0);
        setIntField(term78157, term78157.getClass(), "modCount", 0);
        setField(term78157, term78157.getClass(), "entrySet", null);
        setField(term78157, term78157.getClass(), "keySet", null);
        setField(term78157, term78157.getClass(), "values", null);
        setField(term78157, term78157.getClass(), "keySet", null);
        setField(term78157, term78157.getClass(), "values", null);
        setField(term78156, term78156.getClass(), "delegateMap", term78157);
        setField(term78155, term78155.getClass(), "key3", term78156);
        setField(term78155, term78155.getClass(), "value1", null);
        setField(term78155, term78155.getClass(), "value2", null);
        setField(term78155, term78155.getClass(), "value3", null);
        setField(term78155, term78155.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term77980;
        Object retValue = callMethod(klass, "get", argTypes, term77980, args);
        assertTrue(recursiveEquals(term77980, term78152));
        assertTrue(recursiveEquals(term77980, term78155));
        assertTrue(recursiveEquals(retValue, null));
    }

};
