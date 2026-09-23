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

public class Flat3Map_put_1944740725494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91909;
     Object term91957;
     Object term92549;
     Object term92551;

    public Flat3Map_put_1944740725494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91909 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term91909, term91909.getClass(), "delegateMap", null);
        setIntField(term91909, term91909.getClass(), "size", 1);
        setIntField(term91909, term91909.getClass(), "hash1", 0);
        term91957 = newInstance(Class.forName("java.util.Collections"));
        term92549 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term92550 = newInstance(Class.forName("java.util.Collections"));
        setIntField(term92549, term92549.getClass(), "size", 2);
        setIntField(term92549, term92549.getClass(), "hash1", 0);
        setIntField(term92549, term92549.getClass(), "hash2", 71962430);
        setIntField(term92549, term92549.getClass(), "hash3", 0);
        setField(term92549, term92549.getClass(), "key1", null);
        setField(term92549, term92549.getClass(), "key2", term92550);
        setField(term92549, term92549.getClass(), "key3", null);
        setField(term92549, term92549.getClass(), "value1", null);
        setField(term92549, term92549.getClass(), "value2", null);
        setField(term92549, term92549.getClass(), "value3", null);
        setField(term92549, term92549.getClass(), "delegateMap", null);
        term92551 = newInstance(Class.forName("java.util.Collections"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term91957;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term91909, args);
        assertTrue(recursiveEquals(term91909, term92549));
        assertTrue(recursiveEquals(term91957, term92551));
        assertTrue(recursiveEquals(retValue, null));
    }

};


