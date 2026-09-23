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

public class Flat3Map_get_229621781265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43390;
     Object term43622;
     Object term43624;

    public Flat3Map_get_229621781265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43390 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term43436 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term43390, term43390.getClass(), "delegateMap", null);
        setIntField(term43390, term43390.getClass(), "size", 0);
        setIntField(term43390, term43390.getClass(), "hash1", 0);
        setField(term43390, term43390.getClass(), "key1", term43436);
        term43622 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term43623 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term43622, term43622.getClass(), "size", 0);
        setIntField(term43622, term43622.getClass(), "hash1", 0);
        setIntField(term43622, term43622.getClass(), "hash2", 0);
        setIntField(term43622, term43622.getClass(), "hash3", 0);
        setIntField(term43623, term43623.getClass(), "size", 0);
        setIntField(term43623, term43623.getClass(), "hash1", 0);
        setIntField(term43623, term43623.getClass(), "hash2", 0);
        setIntField(term43623, term43623.getClass(), "hash3", 0);
        setField(term43623, term43623.getClass(), "key1", null);
        setField(term43623, term43623.getClass(), "key2", null);
        setField(term43623, term43623.getClass(), "key3", null);
        setField(term43623, term43623.getClass(), "value1", null);
        setField(term43623, term43623.getClass(), "value2", null);
        setField(term43623, term43623.getClass(), "value3", null);
        setField(term43623, term43623.getClass(), "delegateMap", null);
        setField(term43622, term43622.getClass(), "key1", term43623);
        setField(term43622, term43622.getClass(), "key2", null);
        setField(term43622, term43622.getClass(), "key3", null);
        setField(term43622, term43622.getClass(), "value1", null);
        setField(term43622, term43622.getClass(), "value2", null);
        setField(term43622, term43622.getClass(), "value3", null);
        setField(term43622, term43622.getClass(), "delegateMap", null);
        term43624 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term43625 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term43624, term43624.getClass(), "size", 0);
        setIntField(term43624, term43624.getClass(), "hash1", 0);
        setIntField(term43624, term43624.getClass(), "hash2", 0);
        setIntField(term43624, term43624.getClass(), "hash3", 0);
        setIntField(term43625, term43625.getClass(), "size", 0);
        setIntField(term43625, term43625.getClass(), "hash1", 0);
        setIntField(term43625, term43625.getClass(), "hash2", 0);
        setIntField(term43625, term43625.getClass(), "hash3", 0);
        setField(term43625, term43625.getClass(), "key1", null);
        setField(term43625, term43625.getClass(), "key2", null);
        setField(term43625, term43625.getClass(), "key3", null);
        setField(term43625, term43625.getClass(), "value1", null);
        setField(term43625, term43625.getClass(), "value2", null);
        setField(term43625, term43625.getClass(), "value3", null);
        setField(term43625, term43625.getClass(), "delegateMap", null);
        setField(term43624, term43624.getClass(), "key1", term43625);
        setField(term43624, term43624.getClass(), "key2", null);
        setField(term43624, term43624.getClass(), "key3", null);
        setField(term43624, term43624.getClass(), "value1", null);
        setField(term43624, term43624.getClass(), "value2", null);
        setField(term43624, term43624.getClass(), "value3", null);
        setField(term43624, term43624.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term43390;
        Object retValue = callMethod(klass, "get", argTypes, term43390, args);
        assertTrue(recursiveEquals(term43390, term43622));
        assertTrue(recursiveEquals(term43390, term43624));
        assertTrue(recursiveEquals(retValue, null));
    }

};


