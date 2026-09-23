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

public class Flat3Map_put_1944740725427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76633;
     Object term76681;
     Object term76694;
     Object term76696;

    public Flat3Map_put_1944740725427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76633 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term76633, term76633.getClass(), "delegateMap", null);
        setIntField(term76633, term76633.getClass(), "size", 2);
        setIntField(term76633, term76633.getClass(), "hash2", 0);
        term76681 = newInstance(Class.forName("java.util.Collections"));
        term76694 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term76695 = newInstance(Class.forName("java.util.Collections"));
        setIntField(term76694, term76694.getClass(), "size", 3);
        setIntField(term76694, term76694.getClass(), "hash1", 0);
        setIntField(term76694, term76694.getClass(), "hash2", 0);
        setIntField(term76694, term76694.getClass(), "hash3", 510049984);
        setField(term76694, term76694.getClass(), "key1", null);
        setField(term76694, term76694.getClass(), "key2", null);
        setField(term76694, term76694.getClass(), "key3", term76695);
        setField(term76694, term76694.getClass(), "value1", null);
        setField(term76694, term76694.getClass(), "value2", null);
        setField(term76694, term76694.getClass(), "value3", null);
        setField(term76694, term76694.getClass(), "delegateMap", null);
        term76696 = newInstance(Class.forName("java.util.Collections"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term76681;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term76633, args);
        assertTrue(recursiveEquals(term76633, term76694));
        assertTrue(recursiveEquals(term76681, term76696));
        assertTrue(recursiveEquals(retValue, null));
    }

};


