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

public class Flat3Map_equals_1826922527549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104345;
     Object term104485;
     Object term104532;
     Object term104535;

    public Flat3Map_equals_1826922527549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term104393 = new HashMap();
        term104345 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term104345, term104345.getClass(), "delegateMap", null);
        setIntField(term104345, term104345.getClass(), "size", 3);
        setField(term104345, term104345.getClass(), "key3", term104393);
        term104485 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term104485, term104485.getClass(), "delegateMap", null);
        setIntField(term104485, term104485.getClass(), "size", 3);
        HashMap term104533 = new HashMap();
        term104532 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term104532, term104532.getClass(), "size", 3);
        setIntField(term104532, term104532.getClass(), "hash1", 0);
        setIntField(term104532, term104532.getClass(), "hash2", 0);
        setIntField(term104532, term104532.getClass(), "hash3", 0);
        setField(term104532, term104532.getClass(), "key1", null);
        setField(term104532, term104532.getClass(), "key2", null);
        setField(term104532, term104532.getClass(), "key3", term104533);
        setField(term104532, term104532.getClass(), "value1", null);
        setField(term104532, term104532.getClass(), "value2", null);
        setField(term104532, term104532.getClass(), "value3", null);
        setField(term104532, term104532.getClass(), "delegateMap", null);
        term104535 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term104535, term104535.getClass(), "size", 3);
        setIntField(term104535, term104535.getClass(), "hash1", 0);
        setIntField(term104535, term104535.getClass(), "hash2", 0);
        setIntField(term104535, term104535.getClass(), "hash3", 0);
        setField(term104535, term104535.getClass(), "key1", null);
        setField(term104535, term104535.getClass(), "key2", null);
        setField(term104535, term104535.getClass(), "key3", null);
        setField(term104535, term104535.getClass(), "value1", null);
        setField(term104535, term104535.getClass(), "value2", null);
        setField(term104535, term104535.getClass(), "value3", null);
        setField(term104535, term104535.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term104485;
        Object retValue = callMethod(klass, "equals", argTypes, term104345, args);
        assertTrue(recursiveEquals(term104345, term104532));
        assertTrue(recursiveEquals(term104485, term104535));
        assertTrue(recursiveEquals(retValue, false));
    }

};
