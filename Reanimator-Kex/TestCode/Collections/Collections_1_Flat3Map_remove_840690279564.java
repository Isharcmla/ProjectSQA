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

public class Flat3Map_remove_840690279564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108333;
     Object term108670;

    public Flat3Map_remove_840690279564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108333 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term108425 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term108333, term108333.getClass(), "delegateMap", null);
        setIntField(term108333, term108333.getClass(), "size", 2);
        setField(term108333, term108333.getClass(), "key2", term108425);
        term108670 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term108671 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term108670, term108670.getClass(), "size", 1);
        setIntField(term108670, term108670.getClass(), "hash1", 0);
        setIntField(term108670, term108670.getClass(), "hash2", 0);
        setIntField(term108670, term108670.getClass(), "hash3", 0);
        setIntField(term108671, term108671.getClass(), "size", 0);
        setIntField(term108671, term108671.getClass(), "hash1", 0);
        setIntField(term108671, term108671.getClass(), "hash2", 0);
        setIntField(term108671, term108671.getClass(), "hash3", 0);
        setField(term108671, term108671.getClass(), "key1", null);
        setField(term108671, term108671.getClass(), "key2", null);
        setField(term108671, term108671.getClass(), "key3", null);
        setField(term108671, term108671.getClass(), "value1", null);
        setField(term108671, term108671.getClass(), "value2", null);
        setField(term108671, term108671.getClass(), "value3", null);
        setField(term108671, term108671.getClass(), "delegateMap", null);
        setField(term108670, term108670.getClass(), "key1", term108671);
        setField(term108670, term108670.getClass(), "key2", null);
        setField(term108670, term108670.getClass(), "key3", null);
        setField(term108670, term108670.getClass(), "value1", null);
        setField(term108670, term108670.getClass(), "value2", null);
        setField(term108670, term108670.getClass(), "value3", null);
        setField(term108670, term108670.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "remove", argTypes, term108333, args);
        assertTrue(recursiveEquals(term108333, term108670));
        assertTrue(recursiveEquals(retValue, null));
    }

};
