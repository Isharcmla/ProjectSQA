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

public class Flat3Map_get_229621781291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51875;
     Object term52051;
     Object term52086;
     Object term52089;

    public Flat3Map_get_229621781291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51875 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term51913 = newInstance(Class.forName("java.lang.Object"));
        term52051 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term51875, term51875.getClass(), "delegateMap", null);
        setIntField(term51875, term51875.getClass(), "size", 2);
        setIntField(term51875, term51875.getClass(), "hash2", 0);
        setField(term51875, term51875.getClass(), "key2", term51913);
        setIntField(term51875, term51875.getClass(), "hash1", 0);
        setField(term52051, term52051.getClass(), "delegateMap", null);
        setIntField(term52051, term52051.getClass(), "size", 2);
        setIntField(term52051, term52051.getClass(), "hash2", 0);
        setField(term52051, term52051.getClass(), "value2", null);
        setIntField(term52051, term52051.getClass(), "hash1", 0);
        setField(term52051, term52051.getClass(), "value1", null);
        setField(term51875, term51875.getClass(), "key1", term52051);
        term52086 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term52087 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term52088 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term52086, term52086.getClass(), "size", 2);
        setIntField(term52086, term52086.getClass(), "hash1", 0);
        setIntField(term52086, term52086.getClass(), "hash2", 0);
        setIntField(term52086, term52086.getClass(), "hash3", 0);
        setIntField(term52087, term52087.getClass(), "size", 2);
        setIntField(term52087, term52087.getClass(), "hash1", 0);
        setIntField(term52087, term52087.getClass(), "hash2", 0);
        setIntField(term52087, term52087.getClass(), "hash3", 0);
        setField(term52087, term52087.getClass(), "key1", null);
        setField(term52087, term52087.getClass(), "key2", null);
        setField(term52087, term52087.getClass(), "key3", null);
        setField(term52087, term52087.getClass(), "value1", null);
        setField(term52087, term52087.getClass(), "value2", null);
        setField(term52087, term52087.getClass(), "value3", null);
        setField(term52087, term52087.getClass(), "delegateMap", null);
        setField(term52086, term52086.getClass(), "key1", term52087);
        setField(term52086, term52086.getClass(), "key2", term52088);
        setField(term52086, term52086.getClass(), "key3", null);
        setField(term52086, term52086.getClass(), "value1", null);
        setField(term52086, term52086.getClass(), "value2", null);
        setField(term52086, term52086.getClass(), "value3", null);
        setField(term52086, term52086.getClass(), "delegateMap", null);
        term52089 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term52089, term52089.getClass(), "size", 2);
        setIntField(term52089, term52089.getClass(), "hash1", 0);
        setIntField(term52089, term52089.getClass(), "hash2", 0);
        setIntField(term52089, term52089.getClass(), "hash3", 0);
        setField(term52089, term52089.getClass(), "key1", null);
        setField(term52089, term52089.getClass(), "key2", null);
        setField(term52089, term52089.getClass(), "key3", null);
        setField(term52089, term52089.getClass(), "value1", null);
        setField(term52089, term52089.getClass(), "value2", null);
        setField(term52089, term52089.getClass(), "value3", null);
        setField(term52089, term52089.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term52051;
        Object retValue = callMethod(klass, "get", argTypes, term51875, args);
        assertTrue(recursiveEquals(term51875, term52086));
        assertTrue(recursiveEquals(term52051, term52089));
        assertTrue(recursiveEquals(retValue, null));
    }

};
