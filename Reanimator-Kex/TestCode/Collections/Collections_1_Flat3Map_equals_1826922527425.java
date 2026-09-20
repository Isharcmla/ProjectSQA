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

public class Flat3Map_equals_1826922527425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78275;
     Object term78367;
     Object term78501;
     Object term78502;

    public Flat3Map_equals_1826922527425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78275 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term78275, term78275.getClass(), "delegateMap", null);
        setIntField(term78275, term78275.getClass(), "size", 0);
        term78367 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term78455 = newInstance(Class.forName("org.apache.commons.collections.map.LRUMap"));
        setField(term78367, term78367.getClass(), "delegateMap", term78455);
        term78501 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term78501, term78501.getClass(), "size", 0);
        setIntField(term78501, term78501.getClass(), "hash1", 0);
        setIntField(term78501, term78501.getClass(), "hash2", 0);
        setIntField(term78501, term78501.getClass(), "hash3", 0);
        setField(term78501, term78501.getClass(), "key1", null);
        setField(term78501, term78501.getClass(), "key2", null);
        setField(term78501, term78501.getClass(), "key3", null);
        setField(term78501, term78501.getClass(), "value1", null);
        setField(term78501, term78501.getClass(), "value2", null);
        setField(term78501, term78501.getClass(), "value3", null);
        setField(term78501, term78501.getClass(), "delegateMap", null);
        term78502 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term78503 = newInstance(Class.forName("org.apache.commons.collections.map.LRUMap"));
        setIntField(term78502, term78502.getClass(), "size", 0);
        setIntField(term78502, term78502.getClass(), "hash1", 0);
        setIntField(term78502, term78502.getClass(), "hash2", 0);
        setIntField(term78502, term78502.getClass(), "hash3", 0);
        setField(term78502, term78502.getClass(), "key1", null);
        setField(term78502, term78502.getClass(), "key2", null);
        setField(term78502, term78502.getClass(), "key3", null);
        setField(term78502, term78502.getClass(), "value1", null);
        setField(term78502, term78502.getClass(), "value2", null);
        setField(term78502, term78502.getClass(), "value3", null);
        setIntField(term78503, term78503.getClass(), "maxSize", 0);
        setBooleanField(term78503, term78503.getClass(), "scanUntilRemovable", false);
        setField(term78503, term78503.getClass(), "header", null);
        setFloatField(term78503, term78503.getClass(), "loadFactor", 0.0F);
        setIntField(term78503, term78503.getClass(), "size", 0);
        setField(term78503, term78503.getClass(), "data", null);
        setIntField(term78503, term78503.getClass(), "threshold", 0);
        setIntField(term78503, term78503.getClass(), "modCount", 0);
        setField(term78503, term78503.getClass(), "entrySet", null);
        setField(term78503, term78503.getClass(), "keySet", null);
        setField(term78503, term78503.getClass(), "values", null);
        setField(term78503, term78503.getClass(), "keySet", null);
        setField(term78503, term78503.getClass(), "values", null);
        setField(term78502, term78502.getClass(), "delegateMap", term78503);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term78367;
        Object retValue = callMethod(klass, "equals", argTypes, term78275, args);
        assertTrue(recursiveEquals(term78275, term78501));
        assertTrue(recursiveEquals(term78367, term78502));
        assertTrue(recursiveEquals(retValue, true));
    }

};
