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
import java.util.HashMap;

public class Flat3Map_equals_1826922527780 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158346;
     Object term158486;
     Object term159068;
     Object term159071;

    public Flat3Map_equals_1826922527780() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term158394 = new HashMap();
        term158346 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term158346, term158346.getClass(), "delegateMap", null);
        setIntField(term158346, term158346.getClass(), "size", 3);
        setField(term158346, term158346.getClass(), "key3", null);
        setField(term158346, term158346.getClass(), "value3", term158394);
        HashMap term158534 = new HashMap();
        HashMap term158582 = new HashMap();
        term158486 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term158486, term158486.getClass(), "delegateMap", null);
        setIntField(term158486, term158486.getClass(), "size", 3);
        setField(term158486, term158486.getClass(), "key3", term158534);
        setField(term158486, term158486.getClass(), "key2", null);
        setField(term158486, term158486.getClass(), "value2", term158582);
        HashMap term159069 = new HashMap();
        term159068 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term159068, term159068.getClass(), "size", 3);
        setIntField(term159068, term159068.getClass(), "hash1", 0);
        setIntField(term159068, term159068.getClass(), "hash2", 0);
        setIntField(term159068, term159068.getClass(), "hash3", 0);
        setField(term159068, term159068.getClass(), "key1", null);
        setField(term159068, term159068.getClass(), "key2", null);
        setField(term159068, term159068.getClass(), "key3", null);
        setField(term159068, term159068.getClass(), "value1", null);
        setField(term159068, term159068.getClass(), "value2", null);
        setField(term159068, term159068.getClass(), "value3", term159069);
        setField(term159068, term159068.getClass(), "delegateMap", null);
        HashMap term159072 = new HashMap();
        HashMap term159073 = new HashMap();
        term159071 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term159071, term159071.getClass(), "size", 3);
        setIntField(term159071, term159071.getClass(), "hash1", 0);
        setIntField(term159071, term159071.getClass(), "hash2", 0);
        setIntField(term159071, term159071.getClass(), "hash3", 0);
        setField(term159071, term159071.getClass(), "key1", null);
        setField(term159071, term159071.getClass(), "key2", null);
        setField(term159071, term159071.getClass(), "key3", term159072);
        setField(term159071, term159071.getClass(), "value1", null);
        setField(term159071, term159071.getClass(), "value2", term159073);
        setField(term159071, term159071.getClass(), "value3", null);
        setField(term159071, term159071.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term158486;
        Object retValue = callMethod(klass, "equals", argTypes, term158346, args);
        assertTrue(recursiveEquals(term158346, term159068));
        assertTrue(recursiveEquals(term158486, term159071));
        assertTrue(recursiveEquals(retValue, false));
    }

};
