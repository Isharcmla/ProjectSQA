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

public class Flat3Map_equals_1826922527725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145096;
     Object term145274;
     Object term145323;
     Object term145325;

    public Flat3Map_equals_1826922527725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145096 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term145182 = newInstance(Class.forName("java.nio.file.CopyMoveHelper$CopyOptions"));
        setField(term145096, term145096.getClass(), "delegateMap", null);
        setIntField(term145096, term145096.getClass(), "size", 2);
        setField(term145096, term145096.getClass(), "key2", null);
        setField(term145096, term145096.getClass(), "value2", null);
        setField(term145096, term145096.getClass(), "key1", term145182);
        term145274 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term145274, term145274.getClass(), "delegateMap", null);
        setIntField(term145274, term145274.getClass(), "size", 2);
        setField(term145274, term145274.getClass(), "key2", null);
        setField(term145274, term145274.getClass(), "value2", null);
        setIntField(term145274, term145274.getClass(), "hash2", 0);
        term145323 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term145324 = newInstance(Class.forName("java.nio.file.CopyMoveHelper$CopyOptions"));
        setIntField(term145323, term145323.getClass(), "size", 2);
        setIntField(term145323, term145323.getClass(), "hash1", 0);
        setIntField(term145323, term145323.getClass(), "hash2", 0);
        setIntField(term145323, term145323.getClass(), "hash3", 0);
        setBooleanField(term145324, term145324.getClass(), "replaceExisting", false);
        setBooleanField(term145324, term145324.getClass(), "copyAttributes", false);
        setBooleanField(term145324, term145324.getClass(), "followLinks", false);
        setField(term145323, term145323.getClass(), "key1", term145324);
        setField(term145323, term145323.getClass(), "key2", null);
        setField(term145323, term145323.getClass(), "key3", null);
        setField(term145323, term145323.getClass(), "value1", null);
        setField(term145323, term145323.getClass(), "value2", null);
        setField(term145323, term145323.getClass(), "value3", null);
        setField(term145323, term145323.getClass(), "delegateMap", null);
        term145325 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term145325, term145325.getClass(), "size", 2);
        setIntField(term145325, term145325.getClass(), "hash1", 0);
        setIntField(term145325, term145325.getClass(), "hash2", 0);
        setIntField(term145325, term145325.getClass(), "hash3", 0);
        setField(term145325, term145325.getClass(), "key1", null);
        setField(term145325, term145325.getClass(), "key2", null);
        setField(term145325, term145325.getClass(), "key3", null);
        setField(term145325, term145325.getClass(), "value1", null);
        setField(term145325, term145325.getClass(), "value2", null);
        setField(term145325, term145325.getClass(), "value3", null);
        setField(term145325, term145325.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term145274;
        Object retValue = callMethod(klass, "equals", argTypes, term145096, args);
        assertTrue(recursiveEquals(term145096, term145323));
        assertTrue(recursiveEquals(term145274, term145325));
        assertTrue(recursiveEquals(retValue, false));
    }

};
