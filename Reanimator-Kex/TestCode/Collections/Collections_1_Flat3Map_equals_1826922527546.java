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

public class Flat3Map_equals_1826922527546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103636;
     Object term103860;
     Object term104159;
     Object term104161;

    public Flat3Map_equals_1826922527546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103636 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term103768 = newInstance(Class.forName("java.util.zip.Deflater$DeflaterZStreamRef$FinalizableZStreamRef"));
        setField(term103636, term103636.getClass(), "delegateMap", null);
        setIntField(term103636, term103636.getClass(), "size", 2);
        setField(term103636, term103636.getClass(), "key2", term103768);
        term103860 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term103860, term103860.getClass(), "delegateMap", null);
        setIntField(term103860, term103860.getClass(), "size", 2);
        setIntField(term103860, term103860.getClass(), "hash2", 0);
        term104159 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term104160 = newInstance(Class.forName("java.util.zip.Deflater$DeflaterZStreamRef$FinalizableZStreamRef"));
        setIntField(term104159, term104159.getClass(), "size", 2);
        setIntField(term104159, term104159.getClass(), "hash1", 0);
        setIntField(term104159, term104159.getClass(), "hash2", 0);
        setIntField(term104159, term104159.getClass(), "hash3", 0);
        setField(term104159, term104159.getClass(), "key1", null);
        setField(term104160, term104160.getClass(), "owner", null);
        setLongField(term104160, term104160.getClass(), "address", 0L);
        setField(term104160, term104160.getClass(), "cleanable", null);
        setField(term104159, term104159.getClass(), "key2", term104160);
        setField(term104159, term104159.getClass(), "key3", null);
        setField(term104159, term104159.getClass(), "value1", null);
        setField(term104159, term104159.getClass(), "value2", null);
        setField(term104159, term104159.getClass(), "value3", null);
        setField(term104159, term104159.getClass(), "delegateMap", null);
        term104161 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term104161, term104161.getClass(), "size", 2);
        setIntField(term104161, term104161.getClass(), "hash1", 0);
        setIntField(term104161, term104161.getClass(), "hash2", 0);
        setIntField(term104161, term104161.getClass(), "hash3", 0);
        setField(term104161, term104161.getClass(), "key1", null);
        setField(term104161, term104161.getClass(), "key2", null);
        setField(term104161, term104161.getClass(), "key3", null);
        setField(term104161, term104161.getClass(), "value1", null);
        setField(term104161, term104161.getClass(), "value2", null);
        setField(term104161, term104161.getClass(), "value3", null);
        setField(term104161, term104161.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term103860;
        Object retValue = callMethod(klass, "equals", argTypes, term103636, args);
        assertTrue(recursiveEquals(term103636, term104159));
        assertTrue(recursiveEquals(term103860, term104161));
        assertTrue(recursiveEquals(retValue, false));
    }

};
