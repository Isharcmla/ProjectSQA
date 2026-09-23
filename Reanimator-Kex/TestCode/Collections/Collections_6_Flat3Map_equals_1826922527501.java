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

public class Flat3Map_equals_1826922527501 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93825;
     Object term93965;
     Object term94008;
     Object term94011;

    public Flat3Map_equals_1826922527501() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term93873 = new HashMap();
        term93825 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term93825, term93825.getClass(), "delegateMap", null);
        setIntField(term93825, term93825.getClass(), "size", 1);
        setField(term93825, term93825.getClass(), "key1", term93873);
        term93965 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term93965, term93965.getClass(), "delegateMap", null);
        setIntField(term93965, term93965.getClass(), "size", 1);
        HashMap term94009 = new HashMap();
        term94008 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term94008, term94008.getClass(), "size", 1);
        setIntField(term94008, term94008.getClass(), "hash1", 0);
        setIntField(term94008, term94008.getClass(), "hash2", 0);
        setIntField(term94008, term94008.getClass(), "hash3", 0);
        setField(term94008, term94008.getClass(), "key1", term94009);
        setField(term94008, term94008.getClass(), "key2", null);
        setField(term94008, term94008.getClass(), "key3", null);
        setField(term94008, term94008.getClass(), "value1", null);
        setField(term94008, term94008.getClass(), "value2", null);
        setField(term94008, term94008.getClass(), "value3", null);
        setField(term94008, term94008.getClass(), "delegateMap", null);
        term94011 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term94011, term94011.getClass(), "size", 1);
        setIntField(term94011, term94011.getClass(), "hash1", 0);
        setIntField(term94011, term94011.getClass(), "hash2", 0);
        setIntField(term94011, term94011.getClass(), "hash3", 0);
        setField(term94011, term94011.getClass(), "key1", null);
        setField(term94011, term94011.getClass(), "key2", null);
        setField(term94011, term94011.getClass(), "key3", null);
        setField(term94011, term94011.getClass(), "value1", null);
        setField(term94011, term94011.getClass(), "value2", null);
        setField(term94011, term94011.getClass(), "value3", null);
        setField(term94011, term94011.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term93965;
        Object retValue = callMethod(klass, "equals", argTypes, term93825, args);
        assertTrue(recursiveEquals(term93825, term94008));
        assertTrue(recursiveEquals(term93965, term94011));
        assertTrue(recursiveEquals(retValue, false));
    }

};


