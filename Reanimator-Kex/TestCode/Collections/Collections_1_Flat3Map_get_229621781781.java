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

public class Flat3Map_get_229621781781 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158759;
     Object term158943;
     Object term159129;
     Object term159131;

    public Flat3Map_get_229621781781() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term158759 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term158989 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term158759, term158759.getClass(), "delegateMap", null);
        setIntField(term158759, term158759.getClass(), "size", 3);
        setIntField(term158759, term158759.getClass(), "hash3", 0);
        setField(term158989, term158989.getClass(), "delegateMap", null);
        setIntField(term158989, term158989.getClass(), "size", 0);
        setField(term158989, term158989.getClass(), "key3", term158989);
        setField(term158989, term158989.getClass(), "key2", null);
        setField(term158989, term158989.getClass(), "value2", null);
        setIntField(term158989, term158989.getClass(), "hash3", 0);
        setField(term158759, term158759.getClass(), "key3", term158989);
        term158943 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term158943, term158943.getClass(), "delegateMap", null);
        setIntField(term158943, term158943.getClass(), "size", 3);
        setIntField(term158943, term158943.getClass(), "hash3", 0);
        setField(term158943, term158943.getClass(), "value3", null);
        setIntField(term158943, term158943.getClass(), "hash2", 0);
        setField(term158943, term158943.getClass(), "value2", null);
        setIntField(term158943, term158943.getClass(), "hash1", 0);
        setField(term158943, term158943.getClass(), "value1", null);
        setField(term158943, term158943.getClass(), "key3", null);
        setField(term158943, term158943.getClass(), "key2", term158989);
        term159129 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term159130 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term159129, term159129.getClass(), "size", 3);
        setIntField(term159129, term159129.getClass(), "hash1", 0);
        setIntField(term159129, term159129.getClass(), "hash2", 0);
        setIntField(term159129, term159129.getClass(), "hash3", 0);
        setField(term159129, term159129.getClass(), "key1", null);
        setField(term159129, term159129.getClass(), "key2", null);
        setIntField(term159130, term159130.getClass(), "size", 0);
        setIntField(term159130, term159130.getClass(), "hash1", 0);
        setIntField(term159130, term159130.getClass(), "hash2", 0);
        setIntField(term159130, term159130.getClass(), "hash3", 0);
        setField(term159130, term159130.getClass(), "key1", null);
        setField(term159130, term159130.getClass(), "key2", null);
        setField(term159130, term159130.getClass(), "key3", term159130);
        setField(term159130, term159130.getClass(), "value1", null);
        setField(term159130, term159130.getClass(), "value2", null);
        setField(term159130, term159130.getClass(), "value3", null);
        setField(term159130, term159130.getClass(), "delegateMap", null);
        setField(term159129, term159129.getClass(), "key3", term159130);
        setField(term159129, term159129.getClass(), "value1", null);
        setField(term159129, term159129.getClass(), "value2", null);
        setField(term159129, term159129.getClass(), "value3", null);
        setField(term159129, term159129.getClass(), "delegateMap", null);
        term159131 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term159132 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term159131, term159131.getClass(), "size", 3);
        setIntField(term159131, term159131.getClass(), "hash1", 0);
        setIntField(term159131, term159131.getClass(), "hash2", 0);
        setIntField(term159131, term159131.getClass(), "hash3", 0);
        setField(term159131, term159131.getClass(), "key1", null);
        setIntField(term159132, term159132.getClass(), "size", 0);
        setIntField(term159132, term159132.getClass(), "hash1", 0);
        setIntField(term159132, term159132.getClass(), "hash2", 0);
        setIntField(term159132, term159132.getClass(), "hash3", 0);
        setField(term159132, term159132.getClass(), "key1", null);
        setField(term159132, term159132.getClass(), "key2", null);
        setField(term159132, term159132.getClass(), "key3", term159132);
        setField(term159132, term159132.getClass(), "value1", null);
        setField(term159132, term159132.getClass(), "value2", null);
        setField(term159132, term159132.getClass(), "value3", null);
        setField(term159132, term159132.getClass(), "delegateMap", null);
        setField(term159131, term159131.getClass(), "key2", term159132);
        setField(term159131, term159131.getClass(), "key3", null);
        setField(term159131, term159131.getClass(), "value1", null);
        setField(term159131, term159131.getClass(), "value2", null);
        setField(term159131, term159131.getClass(), "value3", null);
        setField(term159131, term159131.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term158943;
        Object retValue = callMethod(klass, "get", argTypes, term158759, args);
        assertTrue(recursiveEquals(term158759, term159129));
        assertTrue(recursiveEquals(term158943, term159131));
        assertTrue(recursiveEquals(retValue, null));
    }

};
