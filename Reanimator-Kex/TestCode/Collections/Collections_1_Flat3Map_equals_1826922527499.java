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

public class Flat3Map_equals_1826922527499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93932;
     Object term94170;
     Object term94224;
     Object term94226;

    public Flat3Map_equals_1826922527499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93932 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term94078 = newInstance(Class.forName("java.lang.invoke.StringConcatFactory$MethodHandleStringBuilderStrategy"));
        setField(term93932, term93932.getClass(), "delegateMap", null);
        setIntField(term93932, term93932.getClass(), "size", 3);
        setField(term93932, term93932.getClass(), "key3", null);
        setField(term93932, term93932.getClass(), "value3", null);
        setField(term93932, term93932.getClass(), "key2", null);
        setField(term93932, term93932.getClass(), "value2", null);
        setField(term93932, term93932.getClass(), "key1", term94078);
        term94170 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term94170, term94170.getClass(), "delegateMap", null);
        setIntField(term94170, term94170.getClass(), "size", 3);
        setField(term94170, term94170.getClass(), "key3", null);
        setField(term94170, term94170.getClass(), "value3", null);
        term94224 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term94225 = newInstance(Class.forName("java.lang.invoke.StringConcatFactory$MethodHandleStringBuilderStrategy"));
        setIntField(term94224, term94224.getClass(), "size", 3);
        setIntField(term94224, term94224.getClass(), "hash1", 0);
        setIntField(term94224, term94224.getClass(), "hash2", 0);
        setIntField(term94224, term94224.getClass(), "hash3", 0);
        setField(term94224, term94224.getClass(), "key1", term94225);
        setField(term94224, term94224.getClass(), "key2", null);
        setField(term94224, term94224.getClass(), "key3", null);
        setField(term94224, term94224.getClass(), "value1", null);
        setField(term94224, term94224.getClass(), "value2", null);
        setField(term94224, term94224.getClass(), "value3", null);
        setField(term94224, term94224.getClass(), "delegateMap", null);
        term94226 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term94226, term94226.getClass(), "size", 3);
        setIntField(term94226, term94226.getClass(), "hash1", 0);
        setIntField(term94226, term94226.getClass(), "hash2", 0);
        setIntField(term94226, term94226.getClass(), "hash3", 0);
        setField(term94226, term94226.getClass(), "key1", null);
        setField(term94226, term94226.getClass(), "key2", null);
        setField(term94226, term94226.getClass(), "key3", null);
        setField(term94226, term94226.getClass(), "value1", null);
        setField(term94226, term94226.getClass(), "value2", null);
        setField(term94226, term94226.getClass(), "value3", null);
        setField(term94226, term94226.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term94170;
        Object retValue = callMethod(klass, "equals", argTypes, term93932, args);
        assertTrue(recursiveEquals(term93932, term94224));
        assertTrue(recursiveEquals(term94170, term94226));
        assertTrue(recursiveEquals(retValue, false));
    }

};
