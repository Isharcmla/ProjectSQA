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

public class Flat3Map_get_229621781114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19672;
     Object term19876;

    public Flat3Map_get_229621781114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19672 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term19672, term19672.getClass(), "delegateMap", null);
        setIntField(term19672, term19672.getClass(), "size", 1);
        term19876 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term19876, term19876.getClass(), "size", 1);
        setIntField(term19876, term19876.getClass(), "hash1", 0);
        setIntField(term19876, term19876.getClass(), "hash2", 0);
        setIntField(term19876, term19876.getClass(), "hash3", 0);
        setField(term19876, term19876.getClass(), "key1", null);
        setField(term19876, term19876.getClass(), "key2", null);
        setField(term19876, term19876.getClass(), "key3", null);
        setField(term19876, term19876.getClass(), "value1", null);
        setField(term19876, term19876.getClass(), "value2", null);
        setField(term19876, term19876.getClass(), "value3", null);
        setField(term19876, term19876.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "get", argTypes, term19672, args);
        assertTrue(recursiveEquals(term19672, term19876));
        assertTrue(recursiveEquals(retValue, null));
    }

};
