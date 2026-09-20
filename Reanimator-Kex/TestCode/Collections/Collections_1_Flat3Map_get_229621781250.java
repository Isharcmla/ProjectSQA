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

public class Flat3Map_get_229621781250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43863;
     Object term43943;
     Object term44332;
     Object term44333;

    public Flat3Map_get_229621781250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43863 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term43863, term43863.getClass(), "delegateMap", null);
        setIntField(term43863, term43863.getClass(), "size", 1);
        term43943 = newInstance(Class.forName("java.nio.channels.FileChannel$MapMode"));
        term44332 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term44332, term44332.getClass(), "size", 1);
        setIntField(term44332, term44332.getClass(), "hash1", 0);
        setIntField(term44332, term44332.getClass(), "hash2", 0);
        setIntField(term44332, term44332.getClass(), "hash3", 0);
        setField(term44332, term44332.getClass(), "key1", null);
        setField(term44332, term44332.getClass(), "key2", null);
        setField(term44332, term44332.getClass(), "key3", null);
        setField(term44332, term44332.getClass(), "value1", null);
        setField(term44332, term44332.getClass(), "value2", null);
        setField(term44332, term44332.getClass(), "value3", null);
        setField(term44332, term44332.getClass(), "delegateMap", null);
        term44333 = newInstance(Class.forName("java.nio.channels.FileChannel$MapMode"));
        setField(term44333, term44333.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term43943;
        Object retValue = callMethod(klass, "get", argTypes, term43863, args);
        assertTrue(recursiveEquals(term43863, term44332));
        assertTrue(recursiveEquals(term43943, term44333));
        assertTrue(recursiveEquals(retValue, null));
    }

};
