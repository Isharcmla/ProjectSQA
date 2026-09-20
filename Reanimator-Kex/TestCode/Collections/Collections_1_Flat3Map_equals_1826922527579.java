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

public class Flat3Map_equals_1826922527579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110705;
     Object term110883;
     Object term110932;
     Object term110934;

    public Flat3Map_equals_1826922527579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110705 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term110791 = newInstance(Class.forName("java.nio.file.CopyMoveHelper$CopyOptions"));
        setField(term110705, term110705.getClass(), "delegateMap", null);
        setIntField(term110705, term110705.getClass(), "size", 2);
        setField(term110705, term110705.getClass(), "key2", null);
        setField(term110705, term110705.getClass(), "value2", null);
        setField(term110705, term110705.getClass(), "key1", term110791);
        term110883 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term110883, term110883.getClass(), "delegateMap", null);
        setIntField(term110883, term110883.getClass(), "size", 2);
        setField(term110883, term110883.getClass(), "key2", null);
        setField(term110883, term110883.getClass(), "value2", null);
        setIntField(term110883, term110883.getClass(), "hash2", -1);
        setIntField(term110883, term110883.getClass(), "hash1", 0);
        term110932 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term110933 = newInstance(Class.forName("java.nio.file.CopyMoveHelper$CopyOptions"));
        setIntField(term110932, term110932.getClass(), "size", 2);
        setIntField(term110932, term110932.getClass(), "hash1", 0);
        setIntField(term110932, term110932.getClass(), "hash2", 0);
        setIntField(term110932, term110932.getClass(), "hash3", 0);
        setBooleanField(term110933, term110933.getClass(), "replaceExisting", false);
        setBooleanField(term110933, term110933.getClass(), "copyAttributes", false);
        setBooleanField(term110933, term110933.getClass(), "followLinks", false);
        setField(term110932, term110932.getClass(), "key1", term110933);
        setField(term110932, term110932.getClass(), "key2", null);
        setField(term110932, term110932.getClass(), "key3", null);
        setField(term110932, term110932.getClass(), "value1", null);
        setField(term110932, term110932.getClass(), "value2", null);
        setField(term110932, term110932.getClass(), "value3", null);
        setField(term110932, term110932.getClass(), "delegateMap", null);
        term110934 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term110934, term110934.getClass(), "size", 2);
        setIntField(term110934, term110934.getClass(), "hash1", 0);
        setIntField(term110934, term110934.getClass(), "hash2", -1);
        setIntField(term110934, term110934.getClass(), "hash3", 0);
        setField(term110934, term110934.getClass(), "key1", null);
        setField(term110934, term110934.getClass(), "key2", null);
        setField(term110934, term110934.getClass(), "key3", null);
        setField(term110934, term110934.getClass(), "value1", null);
        setField(term110934, term110934.getClass(), "value2", null);
        setField(term110934, term110934.getClass(), "value3", null);
        setField(term110934, term110934.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term110883;
        Object retValue = callMethod(klass, "equals", argTypes, term110705, args);
        assertTrue(recursiveEquals(term110705, term110932));
        assertTrue(recursiveEquals(term110883, term110934));
        assertTrue(recursiveEquals(retValue, false));
    }

};
