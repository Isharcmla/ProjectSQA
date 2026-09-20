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

public class Flat3Map_toString_1508598404104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18455;
     Object term18756;

    public Flat3Map_toString_1508598404104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18455 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term18455, term18455.getClass(), "delegateMap", null);
        setIntField(term18455, term18455.getClass(), "size", -1);
        term18756 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term18756, term18756.getClass(), "size", -1);
        setIntField(term18756, term18756.getClass(), "hash1", 0);
        setIntField(term18756, term18756.getClass(), "hash2", 0);
        setIntField(term18756, term18756.getClass(), "hash3", 0);
        setField(term18756, term18756.getClass(), "key1", null);
        setField(term18756, term18756.getClass(), "key2", null);
        setField(term18756, term18756.getClass(), "key3", null);
        setField(term18756, term18756.getClass(), "value1", null);
        setField(term18756, term18756.getClass(), "value2", null);
        setField(term18756, term18756.getClass(), "value3", null);
        setField(term18756, term18756.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term18455, args);
        assertTrue(recursiveEquals(term18455, term18756));
        assertTrue(recursiveEquals(retValue, "{}"));
    }

};
