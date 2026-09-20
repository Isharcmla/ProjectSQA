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

public class Flat3Map_get_229621781791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161387;
     Object term161551;
     Object term161553;

    public Flat3Map_get_229621781791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term161411 = new HashMap();
        term161387 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term161387, term161387.getClass(), "delegateMap", null);
        setIntField(term161387, term161387.getClass(), "size", 2);
        setIntField(term161387, term161387.getClass(), "hash2", 0);
        setField(term161387, term161387.getClass(), "value2", null);
        setIntField(term161387, term161387.getClass(), "hash1", 0);
        setField(term161387, term161387.getClass(), "value1", null);
        setField(term161387, term161387.getClass(), "key2", term161411);
        HashMap term161552 = new HashMap();
        term161551 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term161551, term161551.getClass(), "size", 2);
        setIntField(term161551, term161551.getClass(), "hash1", 0);
        setIntField(term161551, term161551.getClass(), "hash2", 0);
        setIntField(term161551, term161551.getClass(), "hash3", 0);
        setField(term161551, term161551.getClass(), "key1", null);
        setField(term161551, term161551.getClass(), "key2", term161552);
        setField(term161551, term161551.getClass(), "key3", null);
        setField(term161551, term161551.getClass(), "value1", null);
        setField(term161551, term161551.getClass(), "value2", null);
        setField(term161551, term161551.getClass(), "value3", null);
        setField(term161551, term161551.getClass(), "delegateMap", null);
        HashMap term161554 = new HashMap();
        term161553 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term161553, term161553.getClass(), "size", 2);
        setIntField(term161553, term161553.getClass(), "hash1", 0);
        setIntField(term161553, term161553.getClass(), "hash2", 0);
        setIntField(term161553, term161553.getClass(), "hash3", 0);
        setField(term161553, term161553.getClass(), "key1", null);
        setField(term161553, term161553.getClass(), "key2", term161554);
        setField(term161553, term161553.getClass(), "key3", null);
        setField(term161553, term161553.getClass(), "value1", null);
        setField(term161553, term161553.getClass(), "value2", null);
        setField(term161553, term161553.getClass(), "value3", null);
        setField(term161553, term161553.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term161387;
        Object retValue = callMethod(klass, "get", argTypes, term161387, args);
        assertTrue(recursiveEquals(term161387, term161551));
        assertTrue(recursiveEquals(term161387, term161553));
        assertTrue(recursiveEquals(retValue, null));
    }

};
