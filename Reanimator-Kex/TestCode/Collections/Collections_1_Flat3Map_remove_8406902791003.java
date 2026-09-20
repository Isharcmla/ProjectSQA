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

public class Flat3Map_remove_8406902791003 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200508;
     Object term201023;
     Object term201024;

    public Flat3Map_remove_8406902791003() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term200508 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term200508, term200508.getClass(), "delegateMap", null);
        setIntField(term200508, term200508.getClass(), "size", 3);
        setIntField(term200508, term200508.getClass(), "hash3", 0);
        setField(term200508, term200508.getClass(), "value3", null);
        setIntField(term200508, term200508.getClass(), "hash2", 0);
        setField(term200508, term200508.getClass(), "value2", null);
        setIntField(term200508, term200508.getClass(), "hash1", 0);
        setField(term200508, term200508.getClass(), "value1", null);
        term201023 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term201023, term201023.getClass(), "size", 3);
        setIntField(term201023, term201023.getClass(), "hash1", 0);
        setIntField(term201023, term201023.getClass(), "hash2", 0);
        setIntField(term201023, term201023.getClass(), "hash3", 0);
        setField(term201023, term201023.getClass(), "key1", null);
        setField(term201023, term201023.getClass(), "key2", null);
        setField(term201023, term201023.getClass(), "key3", null);
        setField(term201023, term201023.getClass(), "value1", null);
        setField(term201023, term201023.getClass(), "value2", null);
        setField(term201023, term201023.getClass(), "value3", null);
        setField(term201023, term201023.getClass(), "delegateMap", null);
        term201024 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term201024, term201024.getClass(), "size", 3);
        setIntField(term201024, term201024.getClass(), "hash1", 0);
        setIntField(term201024, term201024.getClass(), "hash2", 0);
        setIntField(term201024, term201024.getClass(), "hash3", 0);
        setField(term201024, term201024.getClass(), "key1", null);
        setField(term201024, term201024.getClass(), "key2", null);
        setField(term201024, term201024.getClass(), "key3", null);
        setField(term201024, term201024.getClass(), "value1", null);
        setField(term201024, term201024.getClass(), "value2", null);
        setField(term201024, term201024.getClass(), "value3", null);
        setField(term201024, term201024.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term200508;
        Object retValue = callMethod(klass, "remove", argTypes, term200508, args);
        assertTrue(recursiveEquals(term200508, term201023));
        assertTrue(recursiveEquals(term200508, term201024));
        assertTrue(recursiveEquals(retValue, null));
    }

};
