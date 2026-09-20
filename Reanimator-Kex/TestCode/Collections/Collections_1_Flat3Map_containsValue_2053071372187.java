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

public class Flat3Map_containsValue_2053071372187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31216;
     Object term31308;
     Object term32187;
     Object term32188;

    public Flat3Map_containsValue_2053071372187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31216 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term31216, term31216.getClass(), "delegateMap", null);
        setIntField(term31216, term31216.getClass(), "size", 1);
        term31308 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        term32187 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term32187, term32187.getClass(), "size", 1);
        setIntField(term32187, term32187.getClass(), "hash1", 0);
        setIntField(term32187, term32187.getClass(), "hash2", 0);
        setIntField(term32187, term32187.getClass(), "hash3", 0);
        setField(term32187, term32187.getClass(), "key1", null);
        setField(term32187, term32187.getClass(), "key2", null);
        setField(term32187, term32187.getClass(), "key3", null);
        setField(term32187, term32187.getClass(), "value1", null);
        setField(term32187, term32187.getClass(), "value2", null);
        setField(term32187, term32187.getClass(), "value3", null);
        setField(term32187, term32187.getClass(), "delegateMap", null);
        term32188 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term32188, term32188.getClass(), "size", 0);
        setIntField(term32188, term32188.getClass(), "hash1", 0);
        setIntField(term32188, term32188.getClass(), "hash2", 0);
        setIntField(term32188, term32188.getClass(), "hash3", 0);
        setField(term32188, term32188.getClass(), "key1", null);
        setField(term32188, term32188.getClass(), "key2", null);
        setField(term32188, term32188.getClass(), "key3", null);
        setField(term32188, term32188.getClass(), "value1", null);
        setField(term32188, term32188.getClass(), "value2", null);
        setField(term32188, term32188.getClass(), "value3", null);
        setField(term32188, term32188.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term31308;
        callMethod(klass, "containsValue", argTypes, term31216, args);
        assertTrue(recursiveEquals(term31216, term32187));
        assertTrue(recursiveEquals(term31308, term32188));
    }

};
