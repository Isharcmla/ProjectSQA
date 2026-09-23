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

public class Flat3Map_containsKey_76092510199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32989;
     Object term33585;

    public Flat3Map_containsKey_76092510199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32989 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term32989, term32989.getClass(), "delegateMap", null);
        setIntField(term32989, term32989.getClass(), "size", 1);
        term33585 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term33585, term33585.getClass(), "size", 1);
        setIntField(term33585, term33585.getClass(), "hash1", 0);
        setIntField(term33585, term33585.getClass(), "hash2", 0);
        setIntField(term33585, term33585.getClass(), "hash3", 0);
        setField(term33585, term33585.getClass(), "key1", null);
        setField(term33585, term33585.getClass(), "key2", null);
        setField(term33585, term33585.getClass(), "key3", null);
        setField(term33585, term33585.getClass(), "value1", null);
        setField(term33585, term33585.getClass(), "value2", null);
        setField(term33585, term33585.getClass(), "value3", null);
        setField(term33585, term33585.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "containsKey", argTypes, term32989, args);
        assertTrue(recursiveEquals(term32989, term33585));
    }

};


