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

public class Flat3Map_remove_840690279855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172705;
     Object term172797;
     Object term172830;
     Object term172831;

    public Flat3Map_remove_840690279855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172705 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term172705, term172705.getClass(), "delegateMap", null);
        setIntField(term172705, term172705.getClass(), "size", 1073741824);
        term172797 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term172797, term172797.getClass(), "delegateMap", null);
        setIntField(term172797, term172797.getClass(), "size", 2);
        term172830 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term172830, term172830.getClass(), "size", 1073741824);
        setIntField(term172830, term172830.getClass(), "hash1", 0);
        setIntField(term172830, term172830.getClass(), "hash2", 0);
        setIntField(term172830, term172830.getClass(), "hash3", 0);
        setField(term172830, term172830.getClass(), "key1", null);
        setField(term172830, term172830.getClass(), "key2", null);
        setField(term172830, term172830.getClass(), "key3", null);
        setField(term172830, term172830.getClass(), "value1", null);
        setField(term172830, term172830.getClass(), "value2", null);
        setField(term172830, term172830.getClass(), "value3", null);
        setField(term172830, term172830.getClass(), "delegateMap", null);
        term172831 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term172831, term172831.getClass(), "size", 2);
        setIntField(term172831, term172831.getClass(), "hash1", 0);
        setIntField(term172831, term172831.getClass(), "hash2", 0);
        setIntField(term172831, term172831.getClass(), "hash3", 0);
        setField(term172831, term172831.getClass(), "key1", null);
        setField(term172831, term172831.getClass(), "key2", null);
        setField(term172831, term172831.getClass(), "key3", null);
        setField(term172831, term172831.getClass(), "value1", null);
        setField(term172831, term172831.getClass(), "value2", null);
        setField(term172831, term172831.getClass(), "value3", null);
        setField(term172831, term172831.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term172797;
        Object retValue = callMethod(klass, "remove", argTypes, term172705, args);
        assertTrue(recursiveEquals(term172705, term172830));
        assertTrue(recursiveEquals(term172797, term172831));
        assertTrue(recursiveEquals(retValue, null));
    }

};
