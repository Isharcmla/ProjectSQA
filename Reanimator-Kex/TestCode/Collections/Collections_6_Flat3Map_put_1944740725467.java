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

public class Flat3Map_put_1944740725467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85782;
     Object term85837;
     Object term85839;

    public Flat3Map_put_1944740725467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85782 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term85817 = newInstance(Class.forName("java.lang.reflect.ProxyGenerator"));
        setField(term85782, term85782.getClass(), "delegateMap", null);
        setIntField(term85782, term85782.getClass(), "size", 1);
        setIntField(term85782, term85782.getClass(), "hash1", 0);
        setField(term85782, term85782.getClass(), "value1", term85817);
        term85837 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term85838 = newInstance(Class.forName("java.lang.reflect.ProxyGenerator"));
        setIntField(term85837, term85837.getClass(), "size", 2);
        setIntField(term85837, term85837.getClass(), "hash1", 0);
        setIntField(term85837, term85837.getClass(), "hash2", 1224221232);
        setIntField(term85837, term85837.getClass(), "hash3", 0);
        setField(term85837, term85837.getClass(), "key1", null);
        setField(term85837, term85837.getClass(), "key2", term85837);
        setField(term85837, term85837.getClass(), "key3", null);
        setField(term85838, term85838.getClass(), "className", null);
        setField(term85838, term85838.getClass(), "interfaces", null);
        setIntField(term85838, term85838.getClass(), "accessFlags", 0);
        setField(term85838, term85838.getClass(), "cp", null);
        setField(term85838, term85838.getClass(), "fields", null);
        setField(term85838, term85838.getClass(), "methods", null);
        setField(term85838, term85838.getClass(), "proxyMethods", null);
        setIntField(term85838, term85838.getClass(), "proxyMethodCount", 0);
        setField(term85837, term85837.getClass(), "value1", term85838);
        setField(term85837, term85837.getClass(), "value2", null);
        setField(term85837, term85837.getClass(), "value3", null);
        setField(term85837, term85837.getClass(), "delegateMap", null);
        term85839 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term85840 = newInstance(Class.forName("java.lang.reflect.ProxyGenerator"));
        setIntField(term85839, term85839.getClass(), "size", 2);
        setIntField(term85839, term85839.getClass(), "hash1", 0);
        setIntField(term85839, term85839.getClass(), "hash2", 1224221232);
        setIntField(term85839, term85839.getClass(), "hash3", 0);
        setField(term85839, term85839.getClass(), "key1", null);
        setField(term85839, term85839.getClass(), "key2", term85839);
        setField(term85839, term85839.getClass(), "key3", null);
        setField(term85840, term85840.getClass(), "className", null);
        setField(term85840, term85840.getClass(), "interfaces", null);
        setIntField(term85840, term85840.getClass(), "accessFlags", 0);
        setField(term85840, term85840.getClass(), "cp", null);
        setField(term85840, term85840.getClass(), "fields", null);
        setField(term85840, term85840.getClass(), "methods", null);
        setField(term85840, term85840.getClass(), "proxyMethods", null);
        setIntField(term85840, term85840.getClass(), "proxyMethodCount", 0);
        setField(term85839, term85839.getClass(), "value1", term85840);
        setField(term85839, term85839.getClass(), "value2", null);
        setField(term85839, term85839.getClass(), "value3", null);
        setField(term85839, term85839.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term85782;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term85782, args);
        assertTrue(recursiveEquals(term85782, term85837));
        assertTrue(recursiveEquals(term85782, term85839));
        assertTrue(recursiveEquals(retValue, null));
    }

};


