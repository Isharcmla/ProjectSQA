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
import java.util.HashMap;

public class Flat3Map_containsKey_76092510787 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160159;
     Object term160391;
     Object term160579;
     Object term160582;

    public Flat3Map_containsKey_76092510787() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term160299 = new HashMap();
        term160159 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term160251 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term160159, term160159.getClass(), "delegateMap", null);
        setIntField(term160159, term160159.getClass(), "size", 2);
        setIntField(term160159, term160159.getClass(), "hash2", 0);
        setField(term160251, term160251.getClass(), "delegateMap", null);
        setIntField(term160251, term160251.getClass(), "size", 2);
        setField(term160251, term160251.getClass(), "key2", term160299);
        setField(term160251, term160251.getClass(), "key1", null);
        setField(term160251, term160251.getClass(), "value1", null);
        setField(term160159, term160159.getClass(), "key2", term160251);
        HashMap term160439 = new HashMap();
        term160391 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term160391, term160391.getClass(), "delegateMap", null);
        setIntField(term160391, term160391.getClass(), "size", 2);
        setIntField(term160391, term160391.getClass(), "hash2", 0);
        setField(term160391, term160391.getClass(), "value2", null);
        setIntField(term160391, term160391.getClass(), "hash1", 0);
        setField(term160391, term160391.getClass(), "value1", null);
        setField(term160391, term160391.getClass(), "key2", null);
        setField(term160391, term160391.getClass(), "key1", term160439);
        HashMap term160581 = new HashMap();
        term160579 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term160580 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term160579, term160579.getClass(), "size", 2);
        setIntField(term160579, term160579.getClass(), "hash1", 0);
        setIntField(term160579, term160579.getClass(), "hash2", 0);
        setIntField(term160579, term160579.getClass(), "hash3", 0);
        setField(term160579, term160579.getClass(), "key1", null);
        setIntField(term160580, term160580.getClass(), "size", 2);
        setIntField(term160580, term160580.getClass(), "hash1", 0);
        setIntField(term160580, term160580.getClass(), "hash2", 0);
        setIntField(term160580, term160580.getClass(), "hash3", 0);
        setField(term160580, term160580.getClass(), "key1", null);
        setField(term160580, term160580.getClass(), "key2", term160581);
        setField(term160580, term160580.getClass(), "key3", null);
        setField(term160580, term160580.getClass(), "value1", null);
        setField(term160580, term160580.getClass(), "value2", null);
        setField(term160580, term160580.getClass(), "value3", null);
        setField(term160580, term160580.getClass(), "delegateMap", null);
        setField(term160579, term160579.getClass(), "key2", term160580);
        setField(term160579, term160579.getClass(), "key3", null);
        setField(term160579, term160579.getClass(), "value1", null);
        setField(term160579, term160579.getClass(), "value2", null);
        setField(term160579, term160579.getClass(), "value3", null);
        setField(term160579, term160579.getClass(), "delegateMap", null);
        HashMap term160583 = new HashMap();
        term160582 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term160582, term160582.getClass(), "size", 2);
        setIntField(term160582, term160582.getClass(), "hash1", 0);
        setIntField(term160582, term160582.getClass(), "hash2", 0);
        setIntField(term160582, term160582.getClass(), "hash3", 0);
        setField(term160582, term160582.getClass(), "key1", term160583);
        setField(term160582, term160582.getClass(), "key2", null);
        setField(term160582, term160582.getClass(), "key3", null);
        setField(term160582, term160582.getClass(), "value1", null);
        setField(term160582, term160582.getClass(), "value2", null);
        setField(term160582, term160582.getClass(), "value3", null);
        setField(term160582, term160582.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term160391;
        callMethod(klass, "containsKey", argTypes, term160159, args);
        assertTrue(recursiveEquals(term160159, term160579));
        assertTrue(recursiveEquals(term160391, term160582));
    }

};
