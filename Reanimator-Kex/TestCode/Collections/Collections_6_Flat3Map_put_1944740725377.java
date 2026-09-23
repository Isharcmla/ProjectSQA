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

public class Flat3Map_put_1944740725377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64831;
     Object term65107;
     Object term65178;
     Object term65182;

    public Flat3Map_put_1944740725377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64831 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term64923 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term65015 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term64831, term64831.getClass(), "delegateMap", null);
        setIntField(term64831, term64831.getClass(), "size", 2);
        setIntField(term64831, term64831.getClass(), "hash2", 0);
        setField(term64923, term64923.getClass(), "delegateMap", null);
        setIntField(term64923, term64923.getClass(), "size", -3);
        setField(term64831, term64831.getClass(), "key2", term64923);
        setIntField(term64831, term64831.getClass(), "hash1", 0);
        setField(term64831, term64831.getClass(), "key1", term65015);
        term65107 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term65107, term65107.getClass(), "delegateMap", null);
        setIntField(term65107, term65107.getClass(), "size", 2);
        setIntField(term65107, term65107.getClass(), "hash2", 0);
        setField(term65107, term65107.getClass(), "value2", null);
        setIntField(term65107, term65107.getClass(), "hash1", 0);
        setField(term65107, term65107.getClass(), "value1", null);
        term65178 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term65179 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term65180 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term65181 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term65178, term65178.getClass(), "size", 3);
        setIntField(term65178, term65178.getClass(), "hash1", 0);
        setIntField(term65178, term65178.getClass(), "hash2", 0);
        setIntField(term65178, term65178.getClass(), "hash3", 0);
        setIntField(term65179, term65179.getClass(), "size", 0);
        setIntField(term65179, term65179.getClass(), "hash1", 0);
        setIntField(term65179, term65179.getClass(), "hash2", 0);
        setIntField(term65179, term65179.getClass(), "hash3", 0);
        setField(term65179, term65179.getClass(), "key1", null);
        setField(term65179, term65179.getClass(), "key2", null);
        setField(term65179, term65179.getClass(), "key3", null);
        setField(term65179, term65179.getClass(), "value1", null);
        setField(term65179, term65179.getClass(), "value2", null);
        setField(term65179, term65179.getClass(), "value3", null);
        setField(term65179, term65179.getClass(), "delegateMap", null);
        setField(term65178, term65178.getClass(), "key1", term65179);
        setIntField(term65180, term65180.getClass(), "size", -3);
        setIntField(term65180, term65180.getClass(), "hash1", 0);
        setIntField(term65180, term65180.getClass(), "hash2", 0);
        setIntField(term65180, term65180.getClass(), "hash3", 0);
        setField(term65180, term65180.getClass(), "key1", null);
        setField(term65180, term65180.getClass(), "key2", null);
        setField(term65180, term65180.getClass(), "key3", null);
        setField(term65180, term65180.getClass(), "value1", null);
        setField(term65180, term65180.getClass(), "value2", null);
        setField(term65180, term65180.getClass(), "value3", null);
        setField(term65180, term65180.getClass(), "delegateMap", null);
        setField(term65178, term65178.getClass(), "key2", term65180);
        setIntField(term65181, term65181.getClass(), "size", 2);
        setIntField(term65181, term65181.getClass(), "hash1", 0);
        setIntField(term65181, term65181.getClass(), "hash2", 0);
        setIntField(term65181, term65181.getClass(), "hash3", 0);
        setField(term65181, term65181.getClass(), "key1", null);
        setField(term65181, term65181.getClass(), "key2", null);
        setField(term65181, term65181.getClass(), "key3", null);
        setField(term65181, term65181.getClass(), "value1", null);
        setField(term65181, term65181.getClass(), "value2", null);
        setField(term65181, term65181.getClass(), "value3", null);
        setField(term65181, term65181.getClass(), "delegateMap", null);
        setField(term65178, term65178.getClass(), "key3", term65181);
        setField(term65178, term65178.getClass(), "value1", null);
        setField(term65178, term65178.getClass(), "value2", null);
        setField(term65178, term65178.getClass(), "value3", null);
        setField(term65178, term65178.getClass(), "delegateMap", null);
        term65182 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term65182, term65182.getClass(), "size", 2);
        setIntField(term65182, term65182.getClass(), "hash1", 0);
        setIntField(term65182, term65182.getClass(), "hash2", 0);
        setIntField(term65182, term65182.getClass(), "hash3", 0);
        setField(term65182, term65182.getClass(), "key1", null);
        setField(term65182, term65182.getClass(), "key2", null);
        setField(term65182, term65182.getClass(), "key3", null);
        setField(term65182, term65182.getClass(), "value1", null);
        setField(term65182, term65182.getClass(), "value2", null);
        setField(term65182, term65182.getClass(), "value3", null);
        setField(term65182, term65182.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term65107;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term64831, args);
        assertTrue(recursiveEquals(term64831, term65178));
        assertTrue(recursiveEquals(term65107, term65182));
        assertTrue(recursiveEquals(retValue, null));
    }

};


