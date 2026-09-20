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

public class Flat3Map_equals_1826922527143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24972;
     Object term25064;
     Object term25347;
     Object term25348;

    public Flat3Map_equals_1826922527143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24972 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term24972, term24972.getClass(), "delegateMap", null);
        setIntField(term24972, term24972.getClass(), "size", -1);
        term25064 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term25064, term25064.getClass(), "delegateMap", null);
        setIntField(term25064, term25064.getClass(), "size", 0);
        term25347 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term25347, term25347.getClass(), "size", -1);
        setIntField(term25347, term25347.getClass(), "hash1", 0);
        setIntField(term25347, term25347.getClass(), "hash2", 0);
        setIntField(term25347, term25347.getClass(), "hash3", 0);
        setField(term25347, term25347.getClass(), "key1", null);
        setField(term25347, term25347.getClass(), "key2", null);
        setField(term25347, term25347.getClass(), "key3", null);
        setField(term25347, term25347.getClass(), "value1", null);
        setField(term25347, term25347.getClass(), "value2", null);
        setField(term25347, term25347.getClass(), "value3", null);
        setField(term25347, term25347.getClass(), "delegateMap", null);
        term25348 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term25348, term25348.getClass(), "size", 0);
        setIntField(term25348, term25348.getClass(), "hash1", 0);
        setIntField(term25348, term25348.getClass(), "hash2", 0);
        setIntField(term25348, term25348.getClass(), "hash3", 0);
        setField(term25348, term25348.getClass(), "key1", null);
        setField(term25348, term25348.getClass(), "key2", null);
        setField(term25348, term25348.getClass(), "key3", null);
        setField(term25348, term25348.getClass(), "value1", null);
        setField(term25348, term25348.getClass(), "value2", null);
        setField(term25348, term25348.getClass(), "value3", null);
        setField(term25348, term25348.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term25064;
        Object retValue = callMethod(klass, "equals", argTypes, term24972, args);
        assertTrue(recursiveEquals(term24972, term25347));
        assertTrue(recursiveEquals(term25064, term25348));
        assertTrue(recursiveEquals(retValue, false));
    }

};
