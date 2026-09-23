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

public class Flat3Map_containsKey_76092510816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207492;
     Object term214687;
     Object term214688;

    public Flat3Map_containsKey_76092510816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term207492 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term207538 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term207492, term207492.getClass(), "delegateMap", null);
        setIntField(term207492, term207492.getClass(), "size", 2);
        setIntField(term207492, term207492.getClass(), "hash2", 0);
        setField(term207492, term207492.getClass(), "value2", null);
        setIntField(term207492, term207492.getClass(), "hash1", 0);
        setField(term207492, term207492.getClass(), "value1", null);
        setField(term207492, term207492.getClass(), "key2", term207538);
        term214687 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term214687, term214687.getClass(), "size", 0);
        setIntField(term214687, term214687.getClass(), "hash1", 0);
        setIntField(term214687, term214687.getClass(), "hash2", 0);
        setIntField(term214687, term214687.getClass(), "hash3", 0);
        setField(term214687, term214687.getClass(), "key1", null);
        setField(term214687, term214687.getClass(), "key2", null);
        setField(term214687, term214687.getClass(), "key3", null);
        setField(term214687, term214687.getClass(), "value1", null);
        setField(term214687, term214687.getClass(), "value2", null);
        setField(term214687, term214687.getClass(), "value3", null);
        setField(term214687, term214687.getClass(), "delegateMap", null);
        term214688 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term214688, term214688.getClass(), "size", 0);
        setIntField(term214688, term214688.getClass(), "hash1", 0);
        setIntField(term214688, term214688.getClass(), "hash2", 0);
        setIntField(term214688, term214688.getClass(), "hash3", 0);
        setField(term214688, term214688.getClass(), "key1", null);
        setField(term214688, term214688.getClass(), "key2", null);
        setField(term214688, term214688.getClass(), "key3", null);
        setField(term214688, term214688.getClass(), "value1", null);
        setField(term214688, term214688.getClass(), "value2", null);
        setField(term214688, term214688.getClass(), "value3", null);
        setField(term214688, term214688.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term207492;
        callMethod(klass, "containsKey", argTypes, term207492, args);
        assertTrue(recursiveEquals(term207492, term214687));
        assertTrue(recursiveEquals(term207492, term214688));
    }

};


