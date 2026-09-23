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

public class Flat3Map_put_1944740725829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214024;
     Object term214208;

    public Flat3Map_put_1944740725829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term214024 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term214116 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term214024, term214024.getClass(), "delegateMap", null);
        setIntField(term214024, term214024.getClass(), "size", 3);
        setIntField(term214024, term214024.getClass(), "hash3", 0);
        setField(term214024, term214024.getClass(), "key3", null);
        setIntField(term214024, term214024.getClass(), "hash2", 0);
        setField(term214116, term214116.getClass(), "delegateMap", null);
        setIntField(term214116, term214116.getClass(), "size", 3);
        setField(term214116, term214116.getClass(), "key3", null);
        setField(term214116, term214116.getClass(), "value3", null);
        setField(term214024, term214024.getClass(), "key2", term214116);
        term214208 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term214302 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        Object term214430 = newInstance(Class.forName("org.apache.commons.collections.iterators.EmptyOrderedIterator"));
        setField(term214208, term214208.getClass(), "delegateMap", null);
        setIntField(term214208, term214208.getClass(), "size", 3);
        setIntField(term214208, term214208.getClass(), "hash3", 0);
        setField(term214208, term214208.getClass(), "value3", null);
        setIntField(term214208, term214208.getClass(), "hash2", 0);
        setField(term214208, term214208.getClass(), "value2", null);
        setIntField(term214208, term214208.getClass(), "hash1", 0);
        setIntField(term214302, term214302.getClass(), "size", 0);
        setField(term214208, term214208.getClass(), "value1", term214302);
        setField(term214208, term214208.getClass(), "key3", null);
        setField(term214208, term214208.getClass(), "key2", null);
        setField(term214208, term214208.getClass(), "key1", term214430);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term214208;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term214024, args);
        assertTrue(recursiveEquals(term214208, false));
        assertTrue(recursiveEquals(retValue, null));
    }

};


