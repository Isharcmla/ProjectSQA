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
import java.util.HashMap;

public class Flat3Map_equals_1826922527841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term218390;
     Object term218578;
     Object term218686;
     Object term218691;

    public Flat3Map_equals_1826922527841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term218602 = new HashMap();
        HashMap term218486 = new HashMap();
        term218390 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term218390, term218390.getClass(), "delegateMap", null);
        setIntField(term218390, term218390.getClass(), "size", 3);
        setField(term218390, term218390.getClass(), "key3", term218602);
        setField(term218390, term218390.getClass(), "value3", null);
        setField(term218390, term218390.getClass(), "key2", term218486);
        term218578 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term218578, term218578.getClass(), "delegateMap", null);
        setIntField(term218578, term218578.getClass(), "size", 3);
        setIntField(term218578, term218578.getClass(), "hash3", 0);
        setField(term218578, term218578.getClass(), "key3", term218602);
        setField(term218578, term218578.getClass(), "value3", null);
        HashMap term218687 = new HashMap();
        HashMap term218689 = new HashMap();
        term218686 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term218686, term218686.getClass(), "size", 3);
        setIntField(term218686, term218686.getClass(), "hash1", 0);
        setIntField(term218686, term218686.getClass(), "hash2", 0);
        setIntField(term218686, term218686.getClass(), "hash3", 0);
        setField(term218686, term218686.getClass(), "key1", null);
        setField(term218686, term218686.getClass(), "key2", term218687);
        setField(term218686, term218686.getClass(), "key3", term218689);
        setField(term218686, term218686.getClass(), "value1", null);
        setField(term218686, term218686.getClass(), "value2", null);
        setField(term218686, term218686.getClass(), "value3", null);
        setField(term218686, term218686.getClass(), "delegateMap", null);
        HashMap term218692 = new HashMap();
        term218691 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term218691, term218691.getClass(), "size", 3);
        setIntField(term218691, term218691.getClass(), "hash1", 0);
        setIntField(term218691, term218691.getClass(), "hash2", 0);
        setIntField(term218691, term218691.getClass(), "hash3", 0);
        setField(term218691, term218691.getClass(), "key1", null);
        setField(term218691, term218691.getClass(), "key2", null);
        setField(term218691, term218691.getClass(), "key3", term218692);
        setField(term218691, term218691.getClass(), "value1", null);
        setField(term218691, term218691.getClass(), "value2", null);
        setField(term218691, term218691.getClass(), "value3", null);
        setField(term218691, term218691.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term218578;
        Object retValue = callMethod(klass, "equals", argTypes, term218390, args);
        assertTrue(recursiveEquals(term218390, term218686));
        assertTrue(recursiveEquals(term218578, term218691));
        assertTrue(recursiveEquals(retValue, true));
    }

};


