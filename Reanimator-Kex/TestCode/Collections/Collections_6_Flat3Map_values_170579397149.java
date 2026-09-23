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

public class Flat3Map_values_170579397149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14266;
     Object term14280;
     Object term14279;

    public Flat3Map_values_170579397149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14266 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term14266, term14266.getClass(), "delegateMap", null);
        term14280 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term14280, term14280.getClass(), "size", 0);
        setIntField(term14280, term14280.getClass(), "hash1", 0);
        setIntField(term14280, term14280.getClass(), "hash2", 0);
        setIntField(term14280, term14280.getClass(), "hash3", 0);
        setField(term14280, term14280.getClass(), "key1", null);
        setField(term14280, term14280.getClass(), "key2", null);
        setField(term14280, term14280.getClass(), "key3", null);
        setField(term14280, term14280.getClass(), "value1", null);
        setField(term14280, term14280.getClass(), "value2", null);
        setField(term14280, term14280.getClass(), "value3", null);
        setField(term14280, term14280.getClass(), "delegateMap", null);
        term14279 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map$Values"));
        Object term14274 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term14274, term14274.getClass(), "size", 0);
        setIntField(term14274, term14274.getClass(), "hash1", 0);
        setIntField(term14274, term14274.getClass(), "hash2", 0);
        setIntField(term14274, term14274.getClass(), "hash3", 0);
        setField(term14274, term14274.getClass(), "key1", null);
        setField(term14274, term14274.getClass(), "key2", null);
        setField(term14274, term14274.getClass(), "key3", null);
        setField(term14274, term14274.getClass(), "value1", null);
        setField(term14274, term14274.getClass(), "value2", null);
        setField(term14274, term14274.getClass(), "value3", null);
        setField(term14274, term14274.getClass(), "delegateMap", null);
        setField(term14279, term14279.getClass(), "parent", term14274);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, term14266, args);
        assertTrue(recursiveEquals(term14266, term14280));
        assertTrue(recursiveEquals(retValue, term14279));
    }

};


