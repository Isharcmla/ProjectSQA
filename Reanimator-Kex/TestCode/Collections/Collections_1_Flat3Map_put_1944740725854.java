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

public class Flat3Map_put_1944740725854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172508;
     Object term172590;
     Object term172809;
     Object term172811;

    public Flat3Map_put_1944740725854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172508 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term172508, term172508.getClass(), "delegateMap", null);
        setIntField(term172508, term172508.getClass(), "size", 1);
        term172590 = newInstance(Class.forName("java.lang.reflect.Proxy$ProxyBuilder$1"));
        term172809 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term172810 = newInstance(Class.forName("java.lang.reflect.Proxy$ProxyBuilder$1"));
        setIntField(term172809, term172809.getClass(), "size", 2);
        setIntField(term172809, term172809.getClass(), "hash1", 0);
        setIntField(term172809, term172809.getClass(), "hash2", 967414376);
        setIntField(term172809, term172809.getClass(), "hash3", 0);
        setField(term172809, term172809.getClass(), "key1", null);
        setField(term172810, term172810.getClass(), "val$cons", null);
        setField(term172810, term172810.getClass(), "this$0", null);
        setField(term172809, term172809.getClass(), "key2", term172810);
        setField(term172809, term172809.getClass(), "key3", null);
        setField(term172809, term172809.getClass(), "value1", null);
        setField(term172809, term172809.getClass(), "value2", null);
        setField(term172809, term172809.getClass(), "value3", null);
        setField(term172809, term172809.getClass(), "delegateMap", null);
        term172811 = newInstance(Class.forName("java.lang.reflect.Proxy$ProxyBuilder$1"));
        setField(term172811, term172811.getClass(), "val$cons", null);
        setField(term172811, term172811.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term172590;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term172508, args);
        assertTrue(recursiveEquals(term172508, term172809));
        assertTrue(recursiveEquals(term172590, term172811));
        assertTrue(recursiveEquals(retValue, null));
    }

};
