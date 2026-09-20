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

public class Flat3Map_get_229621781229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40075;
     Object term40153;
     Object term40154;

    public Flat3Map_get_229621781229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40075 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term40075, term40075.getClass(), "delegateMap", null);
        setIntField(term40075, term40075.getClass(), "size", 2);
        setIntField(term40075, term40075.getClass(), "hash2", 0);
        setField(term40075, term40075.getClass(), "value2", null);
        setIntField(term40075, term40075.getClass(), "hash1", 0);
        setField(term40075, term40075.getClass(), "value1", null);
        term40153 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term40153, term40153.getClass(), "size", 2);
        setIntField(term40153, term40153.getClass(), "hash1", 0);
        setIntField(term40153, term40153.getClass(), "hash2", 0);
        setIntField(term40153, term40153.getClass(), "hash3", 0);
        setField(term40153, term40153.getClass(), "key1", null);
        setField(term40153, term40153.getClass(), "key2", null);
        setField(term40153, term40153.getClass(), "key3", null);
        setField(term40153, term40153.getClass(), "value1", null);
        setField(term40153, term40153.getClass(), "value2", null);
        setField(term40153, term40153.getClass(), "value3", null);
        setField(term40153, term40153.getClass(), "delegateMap", null);
        term40154 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term40154, term40154.getClass(), "size", 2);
        setIntField(term40154, term40154.getClass(), "hash1", 0);
        setIntField(term40154, term40154.getClass(), "hash2", 0);
        setIntField(term40154, term40154.getClass(), "hash3", 0);
        setField(term40154, term40154.getClass(), "key1", null);
        setField(term40154, term40154.getClass(), "key2", null);
        setField(term40154, term40154.getClass(), "key3", null);
        setField(term40154, term40154.getClass(), "value1", null);
        setField(term40154, term40154.getClass(), "value2", null);
        setField(term40154, term40154.getClass(), "value3", null);
        setField(term40154, term40154.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term40075;
        Object retValue = callMethod(klass, "get", argTypes, term40075, args);
        assertTrue(recursiveEquals(term40075, term40153));
        assertTrue(recursiveEquals(term40075, term40154));
        assertTrue(recursiveEquals(retValue, null));
    }

};
