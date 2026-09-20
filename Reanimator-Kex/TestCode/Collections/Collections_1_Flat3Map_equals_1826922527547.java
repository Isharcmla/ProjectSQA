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

public class Flat3Map_equals_1826922527547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103984;
     Object term104076;
     Object term104220;
     Object term104221;

    public Flat3Map_equals_1826922527547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103984 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term103984, term103984.getClass(), "delegateMap", null);
        setIntField(term103984, term103984.getClass(), "size", 2);
        setField(term103984, term103984.getClass(), "key2", null);
        HashMap term104124 = new HashMap();
        term104076 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term104076, term104076.getClass(), "delegateMap", null);
        setIntField(term104076, term104076.getClass(), "size", 2);
        setField(term104076, term104076.getClass(), "key2", term104124);
        term104220 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term104220, term104220.getClass(), "size", 2);
        setIntField(term104220, term104220.getClass(), "hash1", 0);
        setIntField(term104220, term104220.getClass(), "hash2", 0);
        setIntField(term104220, term104220.getClass(), "hash3", 0);
        setField(term104220, term104220.getClass(), "key1", null);
        setField(term104220, term104220.getClass(), "key2", null);
        setField(term104220, term104220.getClass(), "key3", null);
        setField(term104220, term104220.getClass(), "value1", null);
        setField(term104220, term104220.getClass(), "value2", null);
        setField(term104220, term104220.getClass(), "value3", null);
        setField(term104220, term104220.getClass(), "delegateMap", null);
        HashMap term104222 = new HashMap();
        term104221 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term104221, term104221.getClass(), "size", 2);
        setIntField(term104221, term104221.getClass(), "hash1", 0);
        setIntField(term104221, term104221.getClass(), "hash2", 0);
        setIntField(term104221, term104221.getClass(), "hash3", 0);
        setField(term104221, term104221.getClass(), "key1", null);
        setField(term104221, term104221.getClass(), "key2", term104222);
        setField(term104221, term104221.getClass(), "key3", null);
        setField(term104221, term104221.getClass(), "value1", null);
        setField(term104221, term104221.getClass(), "value2", null);
        setField(term104221, term104221.getClass(), "value3", null);
        setField(term104221, term104221.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term104076;
        Object retValue = callMethod(klass, "equals", argTypes, term103984, args);
        assertTrue(recursiveEquals(term103984, term104220));
        assertTrue(recursiveEquals(term104076, term104221));
        assertTrue(recursiveEquals(retValue, true));
    }

};
