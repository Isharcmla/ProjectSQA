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

public class Flat3Map_equals_1826922527167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28575;
     Object term28667;
     Object term28744;
     Object term28745;

    public Flat3Map_equals_1826922527167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28575 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term28575, term28575.getClass(), "delegateMap", null);
        setIntField(term28575, term28575.getClass(), "size", 1);
        term28667 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term28667, term28667.getClass(), "delegateMap", null);
        setIntField(term28667, term28667.getClass(), "size", 1);
        term28744 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term28744, term28744.getClass(), "size", 1);
        setIntField(term28744, term28744.getClass(), "hash1", 0);
        setIntField(term28744, term28744.getClass(), "hash2", 0);
        setIntField(term28744, term28744.getClass(), "hash3", 0);
        setField(term28744, term28744.getClass(), "key1", null);
        setField(term28744, term28744.getClass(), "key2", null);
        setField(term28744, term28744.getClass(), "key3", null);
        setField(term28744, term28744.getClass(), "value1", null);
        setField(term28744, term28744.getClass(), "value2", null);
        setField(term28744, term28744.getClass(), "value3", null);
        setField(term28744, term28744.getClass(), "delegateMap", null);
        term28745 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term28745, term28745.getClass(), "size", 1);
        setIntField(term28745, term28745.getClass(), "hash1", 0);
        setIntField(term28745, term28745.getClass(), "hash2", 0);
        setIntField(term28745, term28745.getClass(), "hash3", 0);
        setField(term28745, term28745.getClass(), "key1", null);
        setField(term28745, term28745.getClass(), "key2", null);
        setField(term28745, term28745.getClass(), "key3", null);
        setField(term28745, term28745.getClass(), "value1", null);
        setField(term28745, term28745.getClass(), "value2", null);
        setField(term28745, term28745.getClass(), "value3", null);
        setField(term28745, term28745.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term28667;
        Object retValue = callMethod(klass, "equals", argTypes, term28575, args);
        assertTrue(recursiveEquals(term28575, term28744));
        assertTrue(recursiveEquals(term28667, term28745));
        assertTrue(recursiveEquals(retValue, true));
    }

};
