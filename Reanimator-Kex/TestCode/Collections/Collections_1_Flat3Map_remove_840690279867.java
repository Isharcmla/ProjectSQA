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

public class Flat3Map_remove_840690279867 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174427;
     Object term175147;
     Object term175148;

    public Flat3Map_remove_840690279867() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174427 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term174427, term174427.getClass(), "delegateMap", null);
        setIntField(term174427, term174427.getClass(), "size", 3);
        setIntField(term174427, term174427.getClass(), "hash3", 0);
        setField(term174427, term174427.getClass(), "value3", null);
        setIntField(term174427, term174427.getClass(), "hash2", 0);
        setField(term174427, term174427.getClass(), "value2", null);
        setIntField(term174427, term174427.getClass(), "hash1", 0);
        setField(term174427, term174427.getClass(), "value1", null);
        term175147 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term175147, term175147.getClass(), "size", 3);
        setIntField(term175147, term175147.getClass(), "hash1", 0);
        setIntField(term175147, term175147.getClass(), "hash2", 0);
        setIntField(term175147, term175147.getClass(), "hash3", 0);
        setField(term175147, term175147.getClass(), "key1", null);
        setField(term175147, term175147.getClass(), "key2", null);
        setField(term175147, term175147.getClass(), "key3", null);
        setField(term175147, term175147.getClass(), "value1", null);
        setField(term175147, term175147.getClass(), "value2", null);
        setField(term175147, term175147.getClass(), "value3", null);
        setField(term175147, term175147.getClass(), "delegateMap", null);
        term175148 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term175148, term175148.getClass(), "size", 3);
        setIntField(term175148, term175148.getClass(), "hash1", 0);
        setIntField(term175148, term175148.getClass(), "hash2", 0);
        setIntField(term175148, term175148.getClass(), "hash3", 0);
        setField(term175148, term175148.getClass(), "key1", null);
        setField(term175148, term175148.getClass(), "key2", null);
        setField(term175148, term175148.getClass(), "key3", null);
        setField(term175148, term175148.getClass(), "value1", null);
        setField(term175148, term175148.getClass(), "value2", null);
        setField(term175148, term175148.getClass(), "value3", null);
        setField(term175148, term175148.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term174427;
        Object retValue = callMethod(klass, "remove", argTypes, term174427, args);
        assertTrue(recursiveEquals(term174427, term175147));
        assertTrue(recursiveEquals(term174427, term175148));
        assertTrue(recursiveEquals(retValue, null));
    }

};
