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

public class Flat3Map_get_229621781309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51776;
     Object term51840;
     Object term51841;

    public Flat3Map_get_229621781309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51776 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term51776, term51776.getClass(), "delegateMap", null);
        setIntField(term51776, term51776.getClass(), "size", 3);
        term51840 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term51840, term51840.getClass(), "size", 3);
        setIntField(term51840, term51840.getClass(), "hash1", 0);
        setIntField(term51840, term51840.getClass(), "hash2", 0);
        setIntField(term51840, term51840.getClass(), "hash3", 0);
        setField(term51840, term51840.getClass(), "key1", null);
        setField(term51840, term51840.getClass(), "key2", null);
        setField(term51840, term51840.getClass(), "key3", null);
        setField(term51840, term51840.getClass(), "value1", null);
        setField(term51840, term51840.getClass(), "value2", null);
        setField(term51840, term51840.getClass(), "value3", null);
        setField(term51840, term51840.getClass(), "delegateMap", null);
        term51841 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term51841, term51841.getClass(), "size", 3);
        setIntField(term51841, term51841.getClass(), "hash1", 0);
        setIntField(term51841, term51841.getClass(), "hash2", 0);
        setIntField(term51841, term51841.getClass(), "hash3", 0);
        setField(term51841, term51841.getClass(), "key1", null);
        setField(term51841, term51841.getClass(), "key2", null);
        setField(term51841, term51841.getClass(), "key3", null);
        setField(term51841, term51841.getClass(), "value1", null);
        setField(term51841, term51841.getClass(), "value2", null);
        setField(term51841, term51841.getClass(), "value3", null);
        setField(term51841, term51841.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term51776;
        Object retValue = callMethod(klass, "get", argTypes, term51776, args);
        assertTrue(recursiveEquals(term51776, term51840));
        assertTrue(recursiveEquals(term51776, term51841));
        assertTrue(recursiveEquals(retValue, null));
    }

};


