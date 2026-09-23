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

public class Flat3Map_containsKey_76092510227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37332;
     Object term37424;
     Object term37457;
     Object term37458;

    public Flat3Map_containsKey_76092510227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37332 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term37332, term37332.getClass(), "delegateMap", null);
        setIntField(term37332, term37332.getClass(), "size", 1);
        term37424 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        term37457 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term37457, term37457.getClass(), "size", 1);
        setIntField(term37457, term37457.getClass(), "hash1", 0);
        setIntField(term37457, term37457.getClass(), "hash2", 0);
        setIntField(term37457, term37457.getClass(), "hash3", 0);
        setField(term37457, term37457.getClass(), "key1", null);
        setField(term37457, term37457.getClass(), "key2", null);
        setField(term37457, term37457.getClass(), "key3", null);
        setField(term37457, term37457.getClass(), "value1", null);
        setField(term37457, term37457.getClass(), "value2", null);
        setField(term37457, term37457.getClass(), "value3", null);
        setField(term37457, term37457.getClass(), "delegateMap", null);
        term37458 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term37458, term37458.getClass(), "size", 0);
        setIntField(term37458, term37458.getClass(), "hash1", 0);
        setIntField(term37458, term37458.getClass(), "hash2", 0);
        setIntField(term37458, term37458.getClass(), "hash3", 0);
        setField(term37458, term37458.getClass(), "key1", null);
        setField(term37458, term37458.getClass(), "key2", null);
        setField(term37458, term37458.getClass(), "key3", null);
        setField(term37458, term37458.getClass(), "value1", null);
        setField(term37458, term37458.getClass(), "value2", null);
        setField(term37458, term37458.getClass(), "value3", null);
        setField(term37458, term37458.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term37424;
        callMethod(klass, "containsKey", argTypes, term37332, args);
        assertTrue(recursiveEquals(term37332, term37457));
        assertTrue(recursiveEquals(term37424, term37458));
    }

};


