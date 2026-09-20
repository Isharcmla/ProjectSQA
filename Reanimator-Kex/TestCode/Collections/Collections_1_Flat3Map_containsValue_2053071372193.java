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

public class Flat3Map_containsValue_2053071372193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32601;
     Object term32636;

    public Flat3Map_containsValue_2053071372193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32601 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term32601, term32601.getClass(), "delegateMap", null);
        setIntField(term32601, term32601.getClass(), "size", 1);
        term32636 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term32636, term32636.getClass(), "size", 1);
        setIntField(term32636, term32636.getClass(), "hash1", 0);
        setIntField(term32636, term32636.getClass(), "hash2", 0);
        setIntField(term32636, term32636.getClass(), "hash3", 0);
        setField(term32636, term32636.getClass(), "key1", null);
        setField(term32636, term32636.getClass(), "key2", null);
        setField(term32636, term32636.getClass(), "key3", null);
        setField(term32636, term32636.getClass(), "value1", null);
        setField(term32636, term32636.getClass(), "value2", null);
        setField(term32636, term32636.getClass(), "value3", null);
        setField(term32636, term32636.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "containsValue", argTypes, term32601, args);
        assertTrue(recursiveEquals(term32601, term32636));
    }

};
