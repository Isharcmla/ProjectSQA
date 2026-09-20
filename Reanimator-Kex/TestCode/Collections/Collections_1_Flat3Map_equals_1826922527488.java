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
import java.util.HashMap;

public class Flat3Map_equals_1826922527488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91967;
     Object term92107;
     Object term92425;
     Object term92428;

    public Flat3Map_equals_1826922527488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term92015 = new HashMap();
        term91967 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term91967, term91967.getClass(), "delegateMap", null);
        setIntField(term91967, term91967.getClass(), "size", 2);
        setField(term91967, term91967.getClass(), "key2", null);
        setField(term91967, term91967.getClass(), "value2", null);
        setField(term91967, term91967.getClass(), "key1", term92015);
        term92107 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term92107, term92107.getClass(), "delegateMap", null);
        setIntField(term92107, term92107.getClass(), "size", 2);
        setField(term92107, term92107.getClass(), "key2", null);
        setField(term92107, term92107.getClass(), "value2", null);
        setIntField(term92107, term92107.getClass(), "hash2", 0);
        setIntField(term92107, term92107.getClass(), "hash1", -1);
        HashMap term92426 = new HashMap();
        term92425 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term92425, term92425.getClass(), "size", 2);
        setIntField(term92425, term92425.getClass(), "hash1", 0);
        setIntField(term92425, term92425.getClass(), "hash2", 0);
        setIntField(term92425, term92425.getClass(), "hash3", 0);
        setField(term92425, term92425.getClass(), "key1", term92426);
        setField(term92425, term92425.getClass(), "key2", null);
        setField(term92425, term92425.getClass(), "key3", null);
        setField(term92425, term92425.getClass(), "value1", null);
        setField(term92425, term92425.getClass(), "value2", null);
        setField(term92425, term92425.getClass(), "value3", null);
        setField(term92425, term92425.getClass(), "delegateMap", null);
        term92428 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term92428, term92428.getClass(), "size", 2);
        setIntField(term92428, term92428.getClass(), "hash1", -1);
        setIntField(term92428, term92428.getClass(), "hash2", 0);
        setIntField(term92428, term92428.getClass(), "hash3", 0);
        setField(term92428, term92428.getClass(), "key1", null);
        setField(term92428, term92428.getClass(), "key2", null);
        setField(term92428, term92428.getClass(), "key3", null);
        setField(term92428, term92428.getClass(), "value1", null);
        setField(term92428, term92428.getClass(), "value2", null);
        setField(term92428, term92428.getClass(), "value3", null);
        setField(term92428, term92428.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term92107;
        Object retValue = callMethod(klass, "equals", argTypes, term91967, args);
        assertTrue(recursiveEquals(term91967, term92425));
        assertTrue(recursiveEquals(term92107, term92428));
        assertTrue(recursiveEquals(retValue, false));
    }

};
