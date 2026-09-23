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

public class Flat3Map_equals_1826922527262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42745;
     Object term42837;
     Object term43128;
     Object term43129;

    public Flat3Map_equals_1826922527262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42745 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term42745, term42745.getClass(), "delegateMap", null);
        setIntField(term42745, term42745.getClass(), "size", 3);
        term42837 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term42837, term42837.getClass(), "delegateMap", null);
        setIntField(term42837, term42837.getClass(), "size", 3);
        term43128 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term43128, term43128.getClass(), "size", 3);
        setIntField(term43128, term43128.getClass(), "hash1", 0);
        setIntField(term43128, term43128.getClass(), "hash2", 0);
        setIntField(term43128, term43128.getClass(), "hash3", 0);
        setField(term43128, term43128.getClass(), "key1", null);
        setField(term43128, term43128.getClass(), "key2", null);
        setField(term43128, term43128.getClass(), "key3", null);
        setField(term43128, term43128.getClass(), "value1", null);
        setField(term43128, term43128.getClass(), "value2", null);
        setField(term43128, term43128.getClass(), "value3", null);
        setField(term43128, term43128.getClass(), "delegateMap", null);
        term43129 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term43129, term43129.getClass(), "size", 3);
        setIntField(term43129, term43129.getClass(), "hash1", 0);
        setIntField(term43129, term43129.getClass(), "hash2", 0);
        setIntField(term43129, term43129.getClass(), "hash3", 0);
        setField(term43129, term43129.getClass(), "key1", null);
        setField(term43129, term43129.getClass(), "key2", null);
        setField(term43129, term43129.getClass(), "key3", null);
        setField(term43129, term43129.getClass(), "value1", null);
        setField(term43129, term43129.getClass(), "value2", null);
        setField(term43129, term43129.getClass(), "value3", null);
        setField(term43129, term43129.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term42837;
        Object retValue = callMethod(klass, "equals", argTypes, term42745, args);
        assertTrue(recursiveEquals(term42745, term43128));
        assertTrue(recursiveEquals(term42837, term43129));
        assertTrue(recursiveEquals(retValue, true));
    }

};


