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

public class Flat3Map_remove_8406902791033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207243;
     Object term207318;
     Object term207320;

    public Flat3Map_remove_8406902791033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term207243 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term207303 = newInstance(Class.forName("org.apache.commons.collections.MultiHashMap$ValueIterator"));
        setField(term207243, term207243.getClass(), "delegateMap", null);
        setIntField(term207243, term207243.getClass(), "size", 1);
        setIntField(term207243, term207243.getClass(), "hash1", 0);
        setField(term207243, term207243.getClass(), "value1", term207303);
        term207318 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term207319 = newInstance(Class.forName("org.apache.commons.collections.MultiHashMap$ValueIterator"));
        setIntField(term207318, term207318.getClass(), "size", 1);
        setIntField(term207318, term207318.getClass(), "hash1", 0);
        setIntField(term207318, term207318.getClass(), "hash2", 0);
        setIntField(term207318, term207318.getClass(), "hash3", 0);
        setField(term207318, term207318.getClass(), "key1", null);
        setField(term207318, term207318.getClass(), "key2", null);
        setField(term207318, term207318.getClass(), "key3", null);
        setField(term207319, term207319.getClass(), "backedIterator", null);
        setField(term207319, term207319.getClass(), "tempIterator", null);
        setField(term207319, term207319.getClass(), "this$0", null);
        setField(term207318, term207318.getClass(), "value1", term207319);
        setField(term207318, term207318.getClass(), "value2", null);
        setField(term207318, term207318.getClass(), "value3", null);
        setField(term207318, term207318.getClass(), "delegateMap", null);
        term207320 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term207321 = newInstance(Class.forName("org.apache.commons.collections.MultiHashMap$ValueIterator"));
        setIntField(term207320, term207320.getClass(), "size", 1);
        setIntField(term207320, term207320.getClass(), "hash1", 0);
        setIntField(term207320, term207320.getClass(), "hash2", 0);
        setIntField(term207320, term207320.getClass(), "hash3", 0);
        setField(term207320, term207320.getClass(), "key1", null);
        setField(term207320, term207320.getClass(), "key2", null);
        setField(term207320, term207320.getClass(), "key3", null);
        setField(term207321, term207321.getClass(), "backedIterator", null);
        setField(term207321, term207321.getClass(), "tempIterator", null);
        setField(term207321, term207321.getClass(), "this$0", null);
        setField(term207320, term207320.getClass(), "value1", term207321);
        setField(term207320, term207320.getClass(), "value2", null);
        setField(term207320, term207320.getClass(), "value3", null);
        setField(term207320, term207320.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term207243;
        Object retValue = callMethod(klass, "remove", argTypes, term207243, args);
        assertTrue(recursiveEquals(term207243, term207318));
        assertTrue(recursiveEquals(term207243, term207320));
        assertTrue(recursiveEquals(retValue, null));
    }

};
