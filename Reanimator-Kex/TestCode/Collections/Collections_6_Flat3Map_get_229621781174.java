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

public class Flat3Map_get_229621781174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28865;
     Object term28976;

    public Flat3Map_get_229621781174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28865 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term28865, term28865.getClass(), "delegateMap", null);
        setIntField(term28865, term28865.getClass(), "size", 3);
        term28976 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term28976, term28976.getClass(), "size", 3);
        setIntField(term28976, term28976.getClass(), "hash1", 0);
        setIntField(term28976, term28976.getClass(), "hash2", 0);
        setIntField(term28976, term28976.getClass(), "hash3", 0);
        setField(term28976, term28976.getClass(), "key1", null);
        setField(term28976, term28976.getClass(), "key2", null);
        setField(term28976, term28976.getClass(), "key3", null);
        setField(term28976, term28976.getClass(), "value1", null);
        setField(term28976, term28976.getClass(), "value2", null);
        setField(term28976, term28976.getClass(), "value3", null);
        setField(term28976, term28976.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "get", argTypes, term28865, args);
        assertTrue(recursiveEquals(term28865, term28976));
        assertTrue(recursiveEquals(retValue, null));
    }

};


