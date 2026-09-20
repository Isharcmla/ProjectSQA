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

public class Flat3Map_remove_840690279946 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189353;
     Object term189746;
     Object term189747;

    public Flat3Map_remove_840690279946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term189353 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term189353, term189353.getClass(), "delegateMap", null);
        setIntField(term189353, term189353.getClass(), "size", 2);
        setIntField(term189353, term189353.getClass(), "hash2", 0);
        setField(term189353, term189353.getClass(), "value2", null);
        setIntField(term189353, term189353.getClass(), "hash1", 0);
        setField(term189353, term189353.getClass(), "value1", null);
        term189746 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term189746, term189746.getClass(), "size", 2);
        setIntField(term189746, term189746.getClass(), "hash1", 0);
        setIntField(term189746, term189746.getClass(), "hash2", 0);
        setIntField(term189746, term189746.getClass(), "hash3", 0);
        setField(term189746, term189746.getClass(), "key1", null);
        setField(term189746, term189746.getClass(), "key2", null);
        setField(term189746, term189746.getClass(), "key3", null);
        setField(term189746, term189746.getClass(), "value1", null);
        setField(term189746, term189746.getClass(), "value2", null);
        setField(term189746, term189746.getClass(), "value3", null);
        setField(term189746, term189746.getClass(), "delegateMap", null);
        term189747 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term189747, term189747.getClass(), "size", 2);
        setIntField(term189747, term189747.getClass(), "hash1", 0);
        setIntField(term189747, term189747.getClass(), "hash2", 0);
        setIntField(term189747, term189747.getClass(), "hash3", 0);
        setField(term189747, term189747.getClass(), "key1", null);
        setField(term189747, term189747.getClass(), "key2", null);
        setField(term189747, term189747.getClass(), "key3", null);
        setField(term189747, term189747.getClass(), "value1", null);
        setField(term189747, term189747.getClass(), "value2", null);
        setField(term189747, term189747.getClass(), "value3", null);
        setField(term189747, term189747.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term189353;
        Object retValue = callMethod(klass, "remove", argTypes, term189353, args);
        assertTrue(recursiveEquals(term189353, term189746));
        assertTrue(recursiveEquals(term189353, term189747));
        assertTrue(recursiveEquals(retValue, null));
    }

};
