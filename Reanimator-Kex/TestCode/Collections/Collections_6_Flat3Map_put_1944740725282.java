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

public class Flat3Map_put_1944740725282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46338;
     Object term46606;
     Object term46828;
     Object term46832;

    public Flat3Map_put_1944740725282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46338 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term46430 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term46468 = newInstance(Class.forName("java.lang.Object"));
        term46606 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term46338, term46338.getClass(), "delegateMap", null);
        setIntField(term46338, term46338.getClass(), "size", 3);
        setIntField(term46338, term46338.getClass(), "hash3", 0);
        setField(term46430, term46430.getClass(), "delegateMap", null);
        setIntField(term46430, term46430.getClass(), "size", -4);
        setField(term46338, term46338.getClass(), "key3", term46430);
        setIntField(term46338, term46338.getClass(), "hash2", 0);
        setField(term46338, term46338.getClass(), "key2", term46468);
        setIntField(term46338, term46338.getClass(), "hash1", 0);
        setField(term46606, term46606.getClass(), "delegateMap", null);
        setIntField(term46606, term46606.getClass(), "size", 3);
        setIntField(term46606, term46606.getClass(), "hash3", 0);
        setField(term46606, term46606.getClass(), "value3", null);
        setIntField(term46606, term46606.getClass(), "hash2", 0);
        setField(term46606, term46606.getClass(), "value2", null);
        setIntField(term46606, term46606.getClass(), "hash1", 0);
        setField(term46606, term46606.getClass(), "value1", null);
        setField(term46338, term46338.getClass(), "key1", term46606);
        term46828 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term46829 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term46830 = newInstance(Class.forName("java.lang.Object"));
        Object term46831 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term46828, term46828.getClass(), "size", 3);
        setIntField(term46828, term46828.getClass(), "hash1", 0);
        setIntField(term46828, term46828.getClass(), "hash2", 0);
        setIntField(term46828, term46828.getClass(), "hash3", 0);
        setIntField(term46829, term46829.getClass(), "size", 3);
        setIntField(term46829, term46829.getClass(), "hash1", 0);
        setIntField(term46829, term46829.getClass(), "hash2", 0);
        setIntField(term46829, term46829.getClass(), "hash3", 0);
        setField(term46829, term46829.getClass(), "key1", null);
        setField(term46829, term46829.getClass(), "key2", null);
        setField(term46829, term46829.getClass(), "key3", null);
        setField(term46829, term46829.getClass(), "value1", null);
        setField(term46829, term46829.getClass(), "value2", null);
        setField(term46829, term46829.getClass(), "value3", null);
        setField(term46829, term46829.getClass(), "delegateMap", null);
        setField(term46828, term46828.getClass(), "key1", term46829);
        setField(term46828, term46828.getClass(), "key2", term46830);
        setIntField(term46831, term46831.getClass(), "size", -4);
        setIntField(term46831, term46831.getClass(), "hash1", 0);
        setIntField(term46831, term46831.getClass(), "hash2", 0);
        setIntField(term46831, term46831.getClass(), "hash3", 0);
        setField(term46831, term46831.getClass(), "key1", null);
        setField(term46831, term46831.getClass(), "key2", null);
        setField(term46831, term46831.getClass(), "key3", null);
        setField(term46831, term46831.getClass(), "value1", null);
        setField(term46831, term46831.getClass(), "value2", null);
        setField(term46831, term46831.getClass(), "value3", null);
        setField(term46831, term46831.getClass(), "delegateMap", null);
        setField(term46828, term46828.getClass(), "key3", term46831);
        setField(term46828, term46828.getClass(), "value1", null);
        setField(term46828, term46828.getClass(), "value2", null);
        setField(term46828, term46828.getClass(), "value3", null);
        setField(term46828, term46828.getClass(), "delegateMap", null);
        term46832 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term46832, term46832.getClass(), "size", 3);
        setIntField(term46832, term46832.getClass(), "hash1", 0);
        setIntField(term46832, term46832.getClass(), "hash2", 0);
        setIntField(term46832, term46832.getClass(), "hash3", 0);
        setField(term46832, term46832.getClass(), "key1", null);
        setField(term46832, term46832.getClass(), "key2", null);
        setField(term46832, term46832.getClass(), "key3", null);
        setField(term46832, term46832.getClass(), "value1", null);
        setField(term46832, term46832.getClass(), "value2", null);
        setField(term46832, term46832.getClass(), "value3", null);
        setField(term46832, term46832.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term46606;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term46338, args);
        assertTrue(recursiveEquals(term46338, term46828));
        assertTrue(recursiveEquals(term46606, term46832));
        assertTrue(recursiveEquals(retValue, null));
    }

};


