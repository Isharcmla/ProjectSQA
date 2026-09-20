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

public class Flat3Map_containsValue_2053071372361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65633;
     Object term65811;
     Object term65941;
     Object term65944;

    public Flat3Map_containsValue_2053071372361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term65719 = new HashMap();
        term65633 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term65671 = newInstance(Class.forName("java.lang.Object"));
        setField(term65633, term65633.getClass(), "delegateMap", null);
        setIntField(term65633, term65633.getClass(), "size", 2);
        setField(term65633, term65633.getClass(), "value2", term65671);
        setField(term65633, term65633.getClass(), "value1", term65719);
        term65811 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term65811, term65811.getClass(), "delegateMap", null);
        HashMap term65942 = new HashMap();
        term65941 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term65943 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term65941, term65941.getClass(), "size", 2);
        setIntField(term65941, term65941.getClass(), "hash1", 0);
        setIntField(term65941, term65941.getClass(), "hash2", 0);
        setIntField(term65941, term65941.getClass(), "hash3", 0);
        setField(term65941, term65941.getClass(), "key1", null);
        setField(term65941, term65941.getClass(), "key2", null);
        setField(term65941, term65941.getClass(), "key3", null);
        setField(term65941, term65941.getClass(), "value1", term65942);
        setField(term65941, term65941.getClass(), "value2", term65943);
        setField(term65941, term65941.getClass(), "value3", null);
        setField(term65941, term65941.getClass(), "delegateMap", null);
        term65944 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term65944, term65944.getClass(), "size", 0);
        setIntField(term65944, term65944.getClass(), "hash1", 0);
        setIntField(term65944, term65944.getClass(), "hash2", 0);
        setIntField(term65944, term65944.getClass(), "hash3", 0);
        setField(term65944, term65944.getClass(), "key1", null);
        setField(term65944, term65944.getClass(), "key2", null);
        setField(term65944, term65944.getClass(), "key3", null);
        setField(term65944, term65944.getClass(), "value1", null);
        setField(term65944, term65944.getClass(), "value2", null);
        setField(term65944, term65944.getClass(), "value3", null);
        setField(term65944, term65944.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term65811;
        callMethod(klass, "containsValue", argTypes, term65633, args);
        assertTrue(recursiveEquals(term65633, term65941));
        assertTrue(recursiveEquals(term65811, term65944));
    }

};
