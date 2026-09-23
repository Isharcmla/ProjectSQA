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

public class Flat3Map_containsValue_2053071372170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28145;
     Object term28237;
     Object term28497;
     Object term28498;

    public Flat3Map_containsValue_2053071372170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28145 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term28145, term28145.getClass(), "delegateMap", null);
        setIntField(term28145, term28145.getClass(), "size", 1);
        term28237 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        term28497 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term28497, term28497.getClass(), "size", 1);
        setIntField(term28497, term28497.getClass(), "hash1", 0);
        setIntField(term28497, term28497.getClass(), "hash2", 0);
        setIntField(term28497, term28497.getClass(), "hash3", 0);
        setField(term28497, term28497.getClass(), "key1", null);
        setField(term28497, term28497.getClass(), "key2", null);
        setField(term28497, term28497.getClass(), "key3", null);
        setField(term28497, term28497.getClass(), "value1", null);
        setField(term28497, term28497.getClass(), "value2", null);
        setField(term28497, term28497.getClass(), "value3", null);
        setField(term28497, term28497.getClass(), "delegateMap", null);
        term28498 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term28498, term28498.getClass(), "size", 0);
        setIntField(term28498, term28498.getClass(), "hash1", 0);
        setIntField(term28498, term28498.getClass(), "hash2", 0);
        setIntField(term28498, term28498.getClass(), "hash3", 0);
        setField(term28498, term28498.getClass(), "key1", null);
        setField(term28498, term28498.getClass(), "key2", null);
        setField(term28498, term28498.getClass(), "key3", null);
        setField(term28498, term28498.getClass(), "value1", null);
        setField(term28498, term28498.getClass(), "value2", null);
        setField(term28498, term28498.getClass(), "value3", null);
        setField(term28498, term28498.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term28237;
        callMethod(klass, "containsValue", argTypes, term28145, args);
        assertTrue(recursiveEquals(term28145, term28497));
        assertTrue(recursiveEquals(term28237, term28498));
    }

};


