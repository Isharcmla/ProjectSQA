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

public class Flat3Map_init_96314255323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6092;

    public Flat3Map_init_96314255323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6092 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term6092, term6092.getClass(), "size", 0);
        setIntField(term6092, term6092.getClass(), "hash1", 0);
        setIntField(term6092, term6092.getClass(), "hash2", 0);
        setIntField(term6092, term6092.getClass(), "hash3", 0);
        setField(term6092, term6092.getClass(), "key1", null);
        setField(term6092, term6092.getClass(), "key2", null);
        setField(term6092, term6092.getClass(), "key3", null);
        setField(term6092, term6092.getClass(), "value1", null);
        setField(term6092, term6092.getClass(), "value2", null);
        setField(term6092, term6092.getClass(), "value3", null);
        setField(term6092, term6092.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term6092));
    }

};
