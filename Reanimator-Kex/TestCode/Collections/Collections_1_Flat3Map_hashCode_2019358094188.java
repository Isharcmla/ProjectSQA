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

public class Flat3Map_hashCode_2019358094188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31416;
     Object term32211;

    public Flat3Map_hashCode_2019358094188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31416 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term31508 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term31416, term31416.getClass(), "delegateMap", null);
        setIntField(term31416, term31416.getClass(), "size", 3);
        setIntField(term31416, term31416.getClass(), "hash3", 0);
        setField(term31416, term31416.getClass(), "value3", term31508);
        term32211 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term32212 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term32211, term32211.getClass(), "size", 3);
        setIntField(term32211, term32211.getClass(), "hash1", 0);
        setIntField(term32211, term32211.getClass(), "hash2", 0);
        setIntField(term32211, term32211.getClass(), "hash3", 0);
        setField(term32211, term32211.getClass(), "key1", null);
        setField(term32211, term32211.getClass(), "key2", null);
        setField(term32211, term32211.getClass(), "key3", null);
        setField(term32211, term32211.getClass(), "value1", null);
        setField(term32211, term32211.getClass(), "value2", null);
        setIntField(term32212, term32212.getClass(), "size", 0);
        setIntField(term32212, term32212.getClass(), "hash1", 0);
        setIntField(term32212, term32212.getClass(), "hash2", 0);
        setIntField(term32212, term32212.getClass(), "hash3", 0);
        setField(term32212, term32212.getClass(), "key1", null);
        setField(term32212, term32212.getClass(), "key2", null);
        setField(term32212, term32212.getClass(), "key3", null);
        setField(term32212, term32212.getClass(), "value1", null);
        setField(term32212, term32212.getClass(), "value2", null);
        setField(term32212, term32212.getClass(), "value3", null);
        setField(term32212, term32212.getClass(), "delegateMap", null);
        setField(term32211, term32211.getClass(), "value3", term32212);
        setField(term32211, term32211.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term31416, args);
        assertTrue(recursiveEquals(term31416, term32211));
        assertTrue(recursiveEquals(retValue, 0));
    }

};
