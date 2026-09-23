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

public class Flat3Map_toString_1508598404112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20948;
     Object term21174;

    public Flat3Map_toString_1508598404112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20948 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term20948, term20948.getClass(), "delegateMap", null);
        setIntField(term20948, term20948.getClass(), "size", -1);
        term21174 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term21174, term21174.getClass(), "size", -1);
        setIntField(term21174, term21174.getClass(), "hash1", 0);
        setIntField(term21174, term21174.getClass(), "hash2", 0);
        setIntField(term21174, term21174.getClass(), "hash3", 0);
        setField(term21174, term21174.getClass(), "key1", null);
        setField(term21174, term21174.getClass(), "key2", null);
        setField(term21174, term21174.getClass(), "key3", null);
        setField(term21174, term21174.getClass(), "value1", null);
        setField(term21174, term21174.getClass(), "value2", null);
        setField(term21174, term21174.getClass(), "value3", null);
        setField(term21174, term21174.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term20948, args);
        assertTrue(recursiveEquals(term20948, term21174));
        assertTrue(recursiveEquals(retValue, "{}"));
    }

};


