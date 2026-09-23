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

public class Flat3Map_hashCode_2019358094195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32459;
     Object term32883;

    public Flat3Map_hashCode_2019358094195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32459 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term32551 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term32459, term32459.getClass(), "delegateMap", null);
        setIntField(term32459, term32459.getClass(), "size", 2);
        setIntField(term32459, term32459.getClass(), "hash2", 0);
        setField(term32459, term32459.getClass(), "value2", null);
        setIntField(term32459, term32459.getClass(), "hash1", 0);
        setField(term32551, term32551.getClass(), "delegateMap", null);
        setIntField(term32551, term32551.getClass(), "size", 1);
        setField(term32459, term32459.getClass(), "value1", term32551);
        term32883 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term32884 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term32883, term32883.getClass(), "size", 2);
        setIntField(term32883, term32883.getClass(), "hash1", 0);
        setIntField(term32883, term32883.getClass(), "hash2", 0);
        setIntField(term32883, term32883.getClass(), "hash3", 0);
        setField(term32883, term32883.getClass(), "key1", null);
        setField(term32883, term32883.getClass(), "key2", null);
        setField(term32883, term32883.getClass(), "key3", null);
        setIntField(term32884, term32884.getClass(), "size", 1);
        setIntField(term32884, term32884.getClass(), "hash1", 0);
        setIntField(term32884, term32884.getClass(), "hash2", 0);
        setIntField(term32884, term32884.getClass(), "hash3", 0);
        setField(term32884, term32884.getClass(), "key1", null);
        setField(term32884, term32884.getClass(), "key2", null);
        setField(term32884, term32884.getClass(), "key3", null);
        setField(term32884, term32884.getClass(), "value1", null);
        setField(term32884, term32884.getClass(), "value2", null);
        setField(term32884, term32884.getClass(), "value3", null);
        setField(term32884, term32884.getClass(), "delegateMap", null);
        setField(term32883, term32883.getClass(), "value1", term32884);
        setField(term32883, term32883.getClass(), "value2", null);
        setField(term32883, term32883.getClass(), "value3", null);
        setField(term32883, term32883.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term32459, args);
        assertTrue(recursiveEquals(term32459, term32883));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


