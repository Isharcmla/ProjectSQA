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

public class Flat3Map_equals_1826922527459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83636;
     Object term83776;
     Object term83914;
     Object term83917;

    public Flat3Map_equals_1826922527459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term83684 = new HashMap();
        term83636 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term83636, term83636.getClass(), "delegateMap", null);
        setIntField(term83636, term83636.getClass(), "size", 3);
        setField(term83636, term83636.getClass(), "key3", null);
        setField(term83636, term83636.getClass(), "value3", null);
        setField(term83636, term83636.getClass(), "key2", null);
        setField(term83636, term83636.getClass(), "value2", null);
        setField(term83636, term83636.getClass(), "key1", term83684);
        HashMap term83824 = new HashMap();
        term83776 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term83776, term83776.getClass(), "delegateMap", null);
        setIntField(term83776, term83776.getClass(), "size", 3);
        setField(term83776, term83776.getClass(), "key3", null);
        setField(term83776, term83776.getClass(), "value3", null);
        setIntField(term83776, term83776.getClass(), "hash3", 0);
        setIntField(term83776, term83776.getClass(), "hash2", 0);
        setField(term83776, term83776.getClass(), "key2", term83824);
        setIntField(term83776, term83776.getClass(), "hash1", -1);
        HashMap term83915 = new HashMap();
        term83914 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term83914, term83914.getClass(), "size", 3);
        setIntField(term83914, term83914.getClass(), "hash1", 0);
        setIntField(term83914, term83914.getClass(), "hash2", 0);
        setIntField(term83914, term83914.getClass(), "hash3", 0);
        setField(term83914, term83914.getClass(), "key1", term83915);
        setField(term83914, term83914.getClass(), "key2", null);
        setField(term83914, term83914.getClass(), "key3", null);
        setField(term83914, term83914.getClass(), "value1", null);
        setField(term83914, term83914.getClass(), "value2", null);
        setField(term83914, term83914.getClass(), "value3", null);
        setField(term83914, term83914.getClass(), "delegateMap", null);
        HashMap term83918 = new HashMap();
        term83917 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term83917, term83917.getClass(), "size", 3);
        setIntField(term83917, term83917.getClass(), "hash1", -1);
        setIntField(term83917, term83917.getClass(), "hash2", 0);
        setIntField(term83917, term83917.getClass(), "hash3", 0);
        setField(term83917, term83917.getClass(), "key1", null);
        setField(term83917, term83917.getClass(), "key2", term83918);
        setField(term83917, term83917.getClass(), "key3", null);
        setField(term83917, term83917.getClass(), "value1", null);
        setField(term83917, term83917.getClass(), "value2", null);
        setField(term83917, term83917.getClass(), "value3", null);
        setField(term83917, term83917.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term83776;
        Object retValue = callMethod(klass, "equals", argTypes, term83636, args);
        assertTrue(recursiveEquals(term83636, term83914));
        assertTrue(recursiveEquals(term83776, term83917));
        assertTrue(recursiveEquals(retValue, true));
    }

};


