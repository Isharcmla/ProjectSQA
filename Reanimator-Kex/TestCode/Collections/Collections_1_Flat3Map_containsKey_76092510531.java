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

public class Flat3Map_containsKey_76092510531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100978;
     Object term100988;
     Object term100989;

    public Flat3Map_containsKey_76092510531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100978 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term100978, term100978.getClass(), "delegateMap", null);
        setIntField(term100978, term100978.getClass(), "size", 0);
        setIntField(term100978, term100978.getClass(), "hash1", 0);
        setField(term100978, term100978.getClass(), "key1", term100978);
        term100988 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term100988, term100988.getClass(), "size", 0);
        setIntField(term100988, term100988.getClass(), "hash1", 0);
        setIntField(term100988, term100988.getClass(), "hash2", 0);
        setIntField(term100988, term100988.getClass(), "hash3", 0);
        setField(term100988, term100988.getClass(), "key1", term100988);
        setField(term100988, term100988.getClass(), "key2", null);
        setField(term100988, term100988.getClass(), "key3", null);
        setField(term100988, term100988.getClass(), "value1", null);
        setField(term100988, term100988.getClass(), "value2", null);
        setField(term100988, term100988.getClass(), "value3", null);
        setField(term100988, term100988.getClass(), "delegateMap", null);
        term100989 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term100989, term100989.getClass(), "size", 0);
        setIntField(term100989, term100989.getClass(), "hash1", 0);
        setIntField(term100989, term100989.getClass(), "hash2", 0);
        setIntField(term100989, term100989.getClass(), "hash3", 0);
        setField(term100989, term100989.getClass(), "key1", term100989);
        setField(term100989, term100989.getClass(), "key2", null);
        setField(term100989, term100989.getClass(), "key3", null);
        setField(term100989, term100989.getClass(), "value1", null);
        setField(term100989, term100989.getClass(), "value2", null);
        setField(term100989, term100989.getClass(), "value3", null);
        setField(term100989, term100989.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term100978;
        callMethod(klass, "containsKey", argTypes, term100978, args);
        assertTrue(recursiveEquals(term100978, term100988));
        assertTrue(recursiveEquals(term100978, term100989));
    }

};
