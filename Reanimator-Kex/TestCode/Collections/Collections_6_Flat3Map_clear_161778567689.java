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

public class Flat3Map_clear_161778567689 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18068;
     Object term18075;

    public Flat3Map_clear_161778567689() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18068 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term18068, term18068.getClass(), "delegateMap", null);
        term18075 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term18075, term18075.getClass(), "size", 0);
        setIntField(term18075, term18075.getClass(), "hash1", 0);
        setIntField(term18075, term18075.getClass(), "hash2", 0);
        setIntField(term18075, term18075.getClass(), "hash3", 0);
        setField(term18075, term18075.getClass(), "key1", null);
        setField(term18075, term18075.getClass(), "key2", null);
        setField(term18075, term18075.getClass(), "key3", null);
        setField(term18075, term18075.getClass(), "value1", null);
        setField(term18075, term18075.getClass(), "value2", null);
        setField(term18075, term18075.getClass(), "value3", null);
        setField(term18075, term18075.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clear", argTypes, term18068, args);
        assertTrue(recursiveEquals(term18068, term18075));
    }

};


