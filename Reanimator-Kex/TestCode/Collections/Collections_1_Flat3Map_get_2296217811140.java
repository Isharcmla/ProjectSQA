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

public class Flat3Map_get_2296217811140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235625;
     Object term235755;
     Object term237212;
     Object term237214;

    public Flat3Map_get_2296217811140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term235625 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term235663 = newInstance(Class.forName("java.lang.Object"));
        setField(term235625, term235625.getClass(), "delegateMap", null);
        setIntField(term235625, term235625.getClass(), "size", 2);
        setIntField(term235625, term235625.getClass(), "hash2", 0);
        setField(term235625, term235625.getClass(), "key2", term235663);
        setIntField(term235625, term235625.getClass(), "hash1", 0);
        setField(term235625, term235625.getClass(), "key1", null);
        setField(term235625, term235625.getClass(), "value1", null);
        HashMap term235803 = new HashMap();
        term235755 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term235755, term235755.getClass(), "delegateMap", null);
        setIntField(term235755, term235755.getClass(), "size", 2);
        setIntField(term235755, term235755.getClass(), "hash2", 0);
        setField(term235755, term235755.getClass(), "value2", null);
        setIntField(term235755, term235755.getClass(), "hash1", 0);
        setField(term235755, term235755.getClass(), "value1", null);
        setField(term235755, term235755.getClass(), "key2", null);
        setField(term235755, term235755.getClass(), "key1", term235803);
        term237212 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term237213 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term237212, term237212.getClass(), "size", 2);
        setIntField(term237212, term237212.getClass(), "hash1", 0);
        setIntField(term237212, term237212.getClass(), "hash2", 0);
        setIntField(term237212, term237212.getClass(), "hash3", 0);
        setField(term237212, term237212.getClass(), "key1", null);
        setField(term237212, term237212.getClass(), "key2", term237213);
        setField(term237212, term237212.getClass(), "key3", null);
        setField(term237212, term237212.getClass(), "value1", null);
        setField(term237212, term237212.getClass(), "value2", null);
        setField(term237212, term237212.getClass(), "value3", null);
        setField(term237212, term237212.getClass(), "delegateMap", null);
        HashMap term237215 = new HashMap();
        term237214 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term237214, term237214.getClass(), "size", 2);
        setIntField(term237214, term237214.getClass(), "hash1", 0);
        setIntField(term237214, term237214.getClass(), "hash2", 0);
        setIntField(term237214, term237214.getClass(), "hash3", 0);
        setField(term237214, term237214.getClass(), "key1", term237215);
        setField(term237214, term237214.getClass(), "key2", null);
        setField(term237214, term237214.getClass(), "key3", null);
        setField(term237214, term237214.getClass(), "value1", null);
        setField(term237214, term237214.getClass(), "value2", null);
        setField(term237214, term237214.getClass(), "value3", null);
        setField(term237214, term237214.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term235755;
        Object retValue = callMethod(klass, "get", argTypes, term235625, args);
        assertTrue(recursiveEquals(term235625, term237212));
        assertTrue(recursiveEquals(term235755, term237214));
        assertTrue(recursiveEquals(retValue, null));
    }

};
