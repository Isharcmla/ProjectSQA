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

public class Flat3Map_hashCode_2019358094252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41575;
     Object term41872;

    public Flat3Map_hashCode_2019358094252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41575 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term41667 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term41575, term41575.getClass(), "delegateMap", null);
        setIntField(term41575, term41575.getClass(), "size", 3);
        setIntField(term41575, term41575.getClass(), "hash3", 0);
        setField(term41575, term41575.getClass(), "value3", null);
        setIntField(term41575, term41575.getClass(), "hash2", 0);
        setField(term41667, term41667.getClass(), "delegateMap", null);
        setIntField(term41667, term41667.getClass(), "size", 3);
        setField(term41575, term41575.getClass(), "value2", term41667);
        term41872 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term41873 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term41872, term41872.getClass(), "size", 3);
        setIntField(term41872, term41872.getClass(), "hash1", 0);
        setIntField(term41872, term41872.getClass(), "hash2", 0);
        setIntField(term41872, term41872.getClass(), "hash3", 0);
        setField(term41872, term41872.getClass(), "key1", null);
        setField(term41872, term41872.getClass(), "key2", null);
        setField(term41872, term41872.getClass(), "key3", null);
        setField(term41872, term41872.getClass(), "value1", null);
        setIntField(term41873, term41873.getClass(), "size", 3);
        setIntField(term41873, term41873.getClass(), "hash1", 0);
        setIntField(term41873, term41873.getClass(), "hash2", 0);
        setIntField(term41873, term41873.getClass(), "hash3", 0);
        setField(term41873, term41873.getClass(), "key1", null);
        setField(term41873, term41873.getClass(), "key2", null);
        setField(term41873, term41873.getClass(), "key3", null);
        setField(term41873, term41873.getClass(), "value1", null);
        setField(term41873, term41873.getClass(), "value2", null);
        setField(term41873, term41873.getClass(), "value3", null);
        setField(term41873, term41873.getClass(), "delegateMap", null);
        setField(term41872, term41872.getClass(), "value2", term41873);
        setField(term41872, term41872.getClass(), "value3", null);
        setField(term41872, term41872.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term41575, args);
        assertTrue(recursiveEquals(term41575, term41872));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


