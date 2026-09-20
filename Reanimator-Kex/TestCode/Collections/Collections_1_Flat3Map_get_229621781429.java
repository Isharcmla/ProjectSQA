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

public class Flat3Map_get_229621781429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78938;
     Object term79018;
     Object term79030;
     Object term79031;

    public Flat3Map_get_229621781429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78938 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term78938, term78938.getClass(), "delegateMap", null);
        setIntField(term78938, term78938.getClass(), "size", 2);
        term79018 = newInstance(Class.forName("java.nio.channels.FileChannel$MapMode"));
        term79030 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term79030, term79030.getClass(), "size", 2);
        setIntField(term79030, term79030.getClass(), "hash1", 0);
        setIntField(term79030, term79030.getClass(), "hash2", 0);
        setIntField(term79030, term79030.getClass(), "hash3", 0);
        setField(term79030, term79030.getClass(), "key1", null);
        setField(term79030, term79030.getClass(), "key2", null);
        setField(term79030, term79030.getClass(), "key3", null);
        setField(term79030, term79030.getClass(), "value1", null);
        setField(term79030, term79030.getClass(), "value2", null);
        setField(term79030, term79030.getClass(), "value3", null);
        setField(term79030, term79030.getClass(), "delegateMap", null);
        term79031 = newInstance(Class.forName("java.nio.channels.FileChannel$MapMode"));
        setField(term79031, term79031.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term79018;
        Object retValue = callMethod(klass, "get", argTypes, term78938, args);
        assertTrue(recursiveEquals(term78938, term79030));
        assertTrue(recursiveEquals(term79018, term79031));
        assertTrue(recursiveEquals(retValue, null));
    }

};
