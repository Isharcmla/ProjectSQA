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

public class Flat3Map_equals_1826922527109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19125;
     Object term19217;
     Object term19541;
     Object term19542;

    public Flat3Map_equals_1826922527109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19125 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term19125, term19125.getClass(), "delegateMap", null);
        term19217 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        term19541 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term19541, term19541.getClass(), "size", 0);
        setIntField(term19541, term19541.getClass(), "hash1", 0);
        setIntField(term19541, term19541.getClass(), "hash2", 0);
        setIntField(term19541, term19541.getClass(), "hash3", 0);
        setField(term19541, term19541.getClass(), "key1", null);
        setField(term19541, term19541.getClass(), "key2", null);
        setField(term19541, term19541.getClass(), "key3", null);
        setField(term19541, term19541.getClass(), "value1", null);
        setField(term19541, term19541.getClass(), "value2", null);
        setField(term19541, term19541.getClass(), "value3", null);
        setField(term19541, term19541.getClass(), "delegateMap", null);
        term19542 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term19542, term19542.getClass(), "size", 0);
        setIntField(term19542, term19542.getClass(), "hash1", 0);
        setIntField(term19542, term19542.getClass(), "hash2", 0);
        setIntField(term19542, term19542.getClass(), "hash3", 0);
        setField(term19542, term19542.getClass(), "key1", null);
        setField(term19542, term19542.getClass(), "key2", null);
        setField(term19542, term19542.getClass(), "key3", null);
        setField(term19542, term19542.getClass(), "value1", null);
        setField(term19542, term19542.getClass(), "value2", null);
        setField(term19542, term19542.getClass(), "value3", null);
        setField(term19542, term19542.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term19217;
        Object retValue = callMethod(klass, "equals", argTypes, term19125, args);
        assertTrue(recursiveEquals(term19125, term19541));
        assertTrue(recursiveEquals(term19217, term19542));
        assertTrue(recursiveEquals(retValue, true));
    }

};
