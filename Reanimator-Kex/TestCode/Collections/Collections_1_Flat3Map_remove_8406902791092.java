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

public class Flat3Map_remove_8406902791092 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216188;
     Object term216272;
     Object term216666;
     Object term216667;

    public Flat3Map_remove_8406902791092() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term216188 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term216188, term216188.getClass(), "delegateMap", null);
        setIntField(term216188, term216188.getClass(), "size", 2);
        term216272 = newInstance(Class.forName("java.io.ObjectInputFilter$Config$Global"));
        term216666 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term216666, term216666.getClass(), "size", 2);
        setIntField(term216666, term216666.getClass(), "hash1", 0);
        setIntField(term216666, term216666.getClass(), "hash2", 0);
        setIntField(term216666, term216666.getClass(), "hash3", 0);
        setField(term216666, term216666.getClass(), "key1", null);
        setField(term216666, term216666.getClass(), "key2", null);
        setField(term216666, term216666.getClass(), "key3", null);
        setField(term216666, term216666.getClass(), "value1", null);
        setField(term216666, term216666.getClass(), "value2", null);
        setField(term216666, term216666.getClass(), "value3", null);
        setField(term216666, term216666.getClass(), "delegateMap", null);
        term216667 = newInstance(Class.forName("java.io.ObjectInputFilter$Config$Global"));
        setField(term216667, term216667.getClass(), "pattern", null);
        setField(term216667, term216667.getClass(), "filters", null);
        setLongField(term216667, term216667.getClass(), "maxStreamBytes", 0L);
        setLongField(term216667, term216667.getClass(), "maxDepth", 0L);
        setLongField(term216667, term216667.getClass(), "maxReferences", 0L);
        setLongField(term216667, term216667.getClass(), "maxArrayLength", 0L);
        setBooleanField(term216667, term216667.getClass(), "checkComponentType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term216272;
        Object retValue = callMethod(klass, "remove", argTypes, term216188, args);
        assertTrue(recursiveEquals(term216188, term216666));
        assertTrue(recursiveEquals(term216272, term216667));
        assertTrue(recursiveEquals(retValue, null));
    }

};
