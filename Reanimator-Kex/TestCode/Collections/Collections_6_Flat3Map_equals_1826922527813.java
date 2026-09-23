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

public class Flat3Map_equals_1826922527813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206152;
     Object term206292;

    public Flat3Map_equals_1826922527813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term206200 = new HashMap();
        term206152 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term206152, term206152.getClass(), "delegateMap", null);
        setIntField(term206152, term206152.getClass(), "size", 3);
        setField(term206152, term206152.getClass(), "key3", null);
        setField(term206152, term206152.getClass(), "value3", null);
        setField(term206152, term206152.getClass(), "key2", null);
        setField(term206152, term206152.getClass(), "value2", null);
        setField(term206152, term206152.getClass(), "key1", term206200);
        term206292 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term206292, term206292.getClass(), "delegateMap", null);
        setIntField(term206292, term206292.getClass(), "size", 3);
        setField(term206292, term206292.getClass(), "key3", null);
        setField(term206292, term206292.getClass(), "value3", null);
        setIntField(term206292, term206292.getClass(), "hash3", 0);
        setIntField(term206292, term206292.getClass(), "hash2", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term206292;
        callMethod(klass, "equals", argTypes, term206152, args);
        assertTrue(recursiveEquals(term206292, 0));
    }

};


