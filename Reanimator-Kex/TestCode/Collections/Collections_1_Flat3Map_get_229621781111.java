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

public class Flat3Map_get_229621781111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19425;
     Object term19517;
     Object term19566;
     Object term19567;

    public Flat3Map_get_229621781111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19425 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term19425, term19425.getClass(), "delegateMap", null);
        term19517 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        term19566 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term19566, term19566.getClass(), "size", 0);
        setIntField(term19566, term19566.getClass(), "hash1", 0);
        setIntField(term19566, term19566.getClass(), "hash2", 0);
        setIntField(term19566, term19566.getClass(), "hash3", 0);
        setField(term19566, term19566.getClass(), "key1", null);
        setField(term19566, term19566.getClass(), "key2", null);
        setField(term19566, term19566.getClass(), "key3", null);
        setField(term19566, term19566.getClass(), "value1", null);
        setField(term19566, term19566.getClass(), "value2", null);
        setField(term19566, term19566.getClass(), "value3", null);
        setField(term19566, term19566.getClass(), "delegateMap", null);
        term19567 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term19567, term19567.getClass(), "size", 0);
        setIntField(term19567, term19567.getClass(), "hash1", 0);
        setIntField(term19567, term19567.getClass(), "hash2", 0);
        setIntField(term19567, term19567.getClass(), "hash3", 0);
        setField(term19567, term19567.getClass(), "key1", null);
        setField(term19567, term19567.getClass(), "key2", null);
        setField(term19567, term19567.getClass(), "key3", null);
        setField(term19567, term19567.getClass(), "value1", null);
        setField(term19567, term19567.getClass(), "value2", null);
        setField(term19567, term19567.getClass(), "value3", null);
        setField(term19567, term19567.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term19517;
        Object retValue = callMethod(klass, "get", argTypes, term19425, args);
        assertTrue(recursiveEquals(term19425, term19566));
        assertTrue(recursiveEquals(term19517, term19567));
        assertTrue(recursiveEquals(retValue, null));
    }

};
