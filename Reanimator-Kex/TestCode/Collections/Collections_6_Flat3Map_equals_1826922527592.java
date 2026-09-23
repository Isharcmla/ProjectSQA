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

public class Flat3Map_equals_1826922527592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123119;
     Object term123259;
     Object term124232;
     Object term124235;

    public Flat3Map_equals_1826922527592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term123283 = new HashMap();
        term123119 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term123119, term123119.getClass(), "delegateMap", null);
        setIntField(term123119, term123119.getClass(), "size", 3);
        setField(term123119, term123119.getClass(), "key3", null);
        setField(term123119, term123119.getClass(), "value3", null);
        setField(term123119, term123119.getClass(), "key2", null);
        setField(term123119, term123119.getClass(), "value2", null);
        setField(term123119, term123119.getClass(), "key1", term123283);
        term123259 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term123259, term123259.getClass(), "delegateMap", null);
        setIntField(term123259, term123259.getClass(), "size", 3);
        setField(term123259, term123259.getClass(), "key3", null);
        setField(term123259, term123259.getClass(), "value3", null);
        setIntField(term123259, term123259.getClass(), "hash3", 0);
        setIntField(term123259, term123259.getClass(), "hash2", 0);
        setField(term123259, term123259.getClass(), "key2", term123283);
        HashMap term124233 = new HashMap();
        term124232 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term124232, term124232.getClass(), "size", 3);
        setIntField(term124232, term124232.getClass(), "hash1", 0);
        setIntField(term124232, term124232.getClass(), "hash2", 0);
        setIntField(term124232, term124232.getClass(), "hash3", 0);
        setField(term124232, term124232.getClass(), "key1", term124233);
        setField(term124232, term124232.getClass(), "key2", null);
        setField(term124232, term124232.getClass(), "key3", null);
        setField(term124232, term124232.getClass(), "value1", null);
        setField(term124232, term124232.getClass(), "value2", null);
        setField(term124232, term124232.getClass(), "value3", null);
        setField(term124232, term124232.getClass(), "delegateMap", null);
        HashMap term124236 = new HashMap();
        term124235 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term124235, term124235.getClass(), "size", 3);
        setIntField(term124235, term124235.getClass(), "hash1", 0);
        setIntField(term124235, term124235.getClass(), "hash2", 0);
        setIntField(term124235, term124235.getClass(), "hash3", 0);
        setField(term124235, term124235.getClass(), "key1", null);
        setField(term124235, term124235.getClass(), "key2", term124236);
        setField(term124235, term124235.getClass(), "key3", null);
        setField(term124235, term124235.getClass(), "value1", null);
        setField(term124235, term124235.getClass(), "value2", null);
        setField(term124235, term124235.getClass(), "value3", null);
        setField(term124235, term124235.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term123259;
        Object retValue = callMethod(klass, "equals", argTypes, term123119, args);
        assertTrue(recursiveEquals(term123119, term124232));
        assertTrue(recursiveEquals(term123259, term124235));
        assertTrue(recursiveEquals(retValue, true));
    }

};


