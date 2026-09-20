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

public class Flat3Map_containsKey_76092510103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18351;
     Object term18744;

    public Flat3Map_containsKey_76092510103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18351 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term18351, term18351.getClass(), "delegateMap", null);
        setIntField(term18351, term18351.getClass(), "size", 2);
        term18744 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term18744, term18744.getClass(), "size", 2);
        setIntField(term18744, term18744.getClass(), "hash1", 0);
        setIntField(term18744, term18744.getClass(), "hash2", 0);
        setIntField(term18744, term18744.getClass(), "hash3", 0);
        setField(term18744, term18744.getClass(), "key1", null);
        setField(term18744, term18744.getClass(), "key2", null);
        setField(term18744, term18744.getClass(), "key3", null);
        setField(term18744, term18744.getClass(), "value1", null);
        setField(term18744, term18744.getClass(), "value2", null);
        setField(term18744, term18744.getClass(), "value3", null);
        setField(term18744, term18744.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "containsKey", argTypes, term18351, args);
        assertTrue(recursiveEquals(term18351, term18744));
    }

};
