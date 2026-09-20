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

public class Flat3Map_equals_182692252754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14167;
     Object term14281;
     Object term14282;

    public Flat3Map_equals_182692252754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14167 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        term14281 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term14281, term14281.getClass(), "size", 0);
        setIntField(term14281, term14281.getClass(), "hash1", 0);
        setIntField(term14281, term14281.getClass(), "hash2", 0);
        setIntField(term14281, term14281.getClass(), "hash3", 0);
        setField(term14281, term14281.getClass(), "key1", null);
        setField(term14281, term14281.getClass(), "key2", null);
        setField(term14281, term14281.getClass(), "key3", null);
        setField(term14281, term14281.getClass(), "value1", null);
        setField(term14281, term14281.getClass(), "value2", null);
        setField(term14281, term14281.getClass(), "value3", null);
        setField(term14281, term14281.getClass(), "delegateMap", null);
        term14282 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term14282, term14282.getClass(), "size", 0);
        setIntField(term14282, term14282.getClass(), "hash1", 0);
        setIntField(term14282, term14282.getClass(), "hash2", 0);
        setIntField(term14282, term14282.getClass(), "hash3", 0);
        setField(term14282, term14282.getClass(), "key1", null);
        setField(term14282, term14282.getClass(), "key2", null);
        setField(term14282, term14282.getClass(), "key3", null);
        setField(term14282, term14282.getClass(), "value1", null);
        setField(term14282, term14282.getClass(), "value2", null);
        setField(term14282, term14282.getClass(), "value3", null);
        setField(term14282, term14282.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term14167;
        Object retValue = callMethod(klass, "equals", argTypes, term14167, args);
        assertTrue(recursiveEquals(term14167, term14281));
        assertTrue(recursiveEquals(term14167, term14282));
        assertTrue(recursiveEquals(retValue, true));
    }

};
