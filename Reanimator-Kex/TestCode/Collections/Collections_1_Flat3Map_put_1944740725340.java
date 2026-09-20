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

public class Flat3Map_put_1944740725340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61299;
     Object term61704;

    public Flat3Map_put_1944740725340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61299 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term61391 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term61483 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term61299, term61299.getClass(), "delegateMap", null);
        setIntField(term61299, term61299.getClass(), "size", 2);
        setField(term61299, term61299.getClass(), "key2", term61391);
        setField(term61299, term61299.getClass(), "key1", term61483);
        term61704 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term61705 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term61706 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term61704, term61704.getClass(), "size", 3);
        setIntField(term61704, term61704.getClass(), "hash1", 0);
        setIntField(term61704, term61704.getClass(), "hash2", 0);
        setIntField(term61704, term61704.getClass(), "hash3", 0);
        setIntField(term61705, term61705.getClass(), "size", 0);
        setIntField(term61705, term61705.getClass(), "hash1", 0);
        setIntField(term61705, term61705.getClass(), "hash2", 0);
        setIntField(term61705, term61705.getClass(), "hash3", 0);
        setField(term61705, term61705.getClass(), "key1", null);
        setField(term61705, term61705.getClass(), "key2", null);
        setField(term61705, term61705.getClass(), "key3", null);
        setField(term61705, term61705.getClass(), "value1", null);
        setField(term61705, term61705.getClass(), "value2", null);
        setField(term61705, term61705.getClass(), "value3", null);
        setField(term61705, term61705.getClass(), "delegateMap", null);
        setField(term61704, term61704.getClass(), "key1", term61705);
        setIntField(term61706, term61706.getClass(), "size", 0);
        setIntField(term61706, term61706.getClass(), "hash1", 0);
        setIntField(term61706, term61706.getClass(), "hash2", 0);
        setIntField(term61706, term61706.getClass(), "hash3", 0);
        setField(term61706, term61706.getClass(), "key1", null);
        setField(term61706, term61706.getClass(), "key2", null);
        setField(term61706, term61706.getClass(), "key3", null);
        setField(term61706, term61706.getClass(), "value1", null);
        setField(term61706, term61706.getClass(), "value2", null);
        setField(term61706, term61706.getClass(), "value3", null);
        setField(term61706, term61706.getClass(), "delegateMap", null);
        setField(term61704, term61704.getClass(), "key2", term61706);
        setField(term61704, term61704.getClass(), "key3", null);
        setField(term61704, term61704.getClass(), "value1", null);
        setField(term61704, term61704.getClass(), "value2", null);
        setField(term61704, term61704.getClass(), "value3", null);
        setField(term61704, term61704.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term61299, args);
        assertTrue(recursiveEquals(term61299, term61704));
        assertTrue(recursiveEquals(retValue, null));
    }

};
