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

public class Flat3Map_put_1944740725853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222163;
     Object term222541;

    public Flat3Map_put_1944740725853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222163 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term222255 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term222349 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object term222449 = newInstance(Class.forName("org.apache.commons.collections.map.ReferenceMap"));
        setField(term222163, term222163.getClass(), "delegateMap", null);
        setIntField(term222163, term222163.getClass(), "size", 3);
        setIntField(term222163, term222163.getClass(), "hash3", 1042682126);
        setIntField(term222349, term222349.getClass(), "size", 0);
        setField(term222255, term222255.getClass(), "delegateMap", term222349);
        setIntField(term222255, term222255.getClass(), "size", 3);
        setField(term222255, term222255.getClass(), "key3", term222449);
        setField(term222255, term222255.getClass(), "key2", null);
        setField(term222255, term222255.getClass(), "value2", null);
        setField(term222163, term222163.getClass(), "key3", term222255);
        setIntField(term222163, term222163.getClass(), "hash2", 1042682126);
        setField(term222163, term222163.getClass(), "key2", null);
        setIntField(term222163, term222163.getClass(), "hash1", 1042682126);
        setField(term222163, term222163.getClass(), "key1", null);
        setField(term222163, term222163.getClass(), "value3", null);
        setField(term222163, term222163.getClass(), "value2", null);
        setField(term222163, term222163.getClass(), "value1", null);
        term222541 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term222651 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term222541, term222541.getClass(), "delegateMap", null);
        setIntField(term222541, term222541.getClass(), "size", 3);
        setIntField(term222541, term222541.getClass(), "hash3", 169872256);
        setField(term222541, term222541.getClass(), "value3", null);
        setIntField(term222541, term222541.getClass(), "hash2", 1294);
        setIntField(term222651, term222651.getClass(), "size", 0);
        setField(term222541, term222541.getClass(), "value2", term222651);
        setIntField(term222541, term222541.getClass(), "hash1", 872808576);
        setField(term222541, term222541.getClass(), "value1", null);
        setField(term222541, term222541.getClass(), "key3", null);
        setField(term222541, term222541.getClass(), "key2", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term222541;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term222163, args);
        assertTrue(recursiveEquals(term222541, 0L));
        assertTrue(recursiveEquals(retValue, null));
    }

};


